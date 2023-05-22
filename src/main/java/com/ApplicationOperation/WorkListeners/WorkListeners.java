package com.ApplicationOperation.WorkListeners;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WorkListeners implements ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        String pattern = "HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = new Date();
        String time = simpleDateFormat.format(date);
        System.out.println("Начальное время работы запроса: " + time);
    }
}
