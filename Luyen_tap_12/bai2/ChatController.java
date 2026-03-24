/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author admin
 */
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ChatController {
    @FXML private TextArea txtHistory;
    @FXML private TextField txtMessage;
    @FXML private Label lblStatus;

    private SocketManager socketManager = new SocketManager();

    // Hàm dùng cho phía Server
    public void setupServer(int port) {
        new Thread(() -> {
            try (java.net.ServerSocket server = new java.net.ServerSocket(port)) {
                updateStatus("Đang chờ kết nối tại cổng " + port + "...");
                java.net.Socket s = server.accept();
                updateStatus("Đã kết nối với Client!");
                socketManager.connect(s, this::displayMessage);
            } catch (Exception e) { e.printStackTrace(); }
        }).start();
    }

    // Hàm dùng cho phía Client
    public void setupClient(String host, int port) {
        new Thread(() -> {
            try {
                java.net.Socket s = new java.net.Socket(host, port);
                updateStatus("Đã kết nối tới Server!");
                socketManager.connect(s, this::displayMessage);
            } catch (Exception e) { updateStatus("Lỗi kết nối!"); }
        }).start();
    }

    private void displayMessage(String msg) {
        Platform.runLater(() -> txtHistory.appendText("Đối phương: " + msg + "\n"));
    }

    private void updateStatus(String status) {
        Platform.runLater(() -> lblStatus.setText(status));
    }

    @FXML
    private void handleSend() {
        String msg = txtMessage.getText();
        if (!msg.isEmpty()) {
            socketManager.send(msg);
            txtHistory.appendText("Tôi: " + msg + "\n");
            txtMessage.clear();
        }
    }

}
