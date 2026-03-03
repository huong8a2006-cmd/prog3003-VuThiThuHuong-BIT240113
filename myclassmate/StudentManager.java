/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myclassmate;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
class StudentManager<T> {
    private final List<T> data = new ArrayList<>();

    public void add(T item) {
        data.add(item);
    }

    public List<T> getAll() {
        return data;
    }
}