/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author admin
 */
import java.io.*;
import java.net.*;
import java.util.function.Consumer;

public class SocketManager {
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    public void connect(Socket socket, Consumer<String> onMessageReceived) {
        this.socket = socket;
        try {
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Luồng đọc tin nhắn liên tục mà không làm treo UI
            new Thread(() -> {
                try {
                    String message;
                    while ((message = in.readLine()) != null) {
                        onMessageReceived.accept(message);
                    }
                } catch (IOException e) {
                    onMessageReceived.accept("Hệ thống: Mất kết nối.");
                }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void send(String msg) {
        if (out != null) out.println(msg);
    }

    public void close() throws IOException {
        if (socket != null) socket.close();
    }
}