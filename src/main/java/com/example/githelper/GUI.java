package com.example.githelper;

import java.awt.*;

public class GUI {
    private final TrayIcon trayIcon;
    public GUI() {
        SystemTray tray=SystemTray.getSystemTray();
        Image image=Toolkit.getDefaultToolkit().createImage(getClass().
                getResource("/logo.png"));
       trayIcon = new TrayIcon(image,"GitHub helper");
        trayIcon.setImageAutoSize(true);
        trayIcon.setToolTip("GitHub helper");
        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    public void showNotification(String title,String text)
    {
        System.setProperty("java.awt.headless", "false");
        trayIcon.displayMessage(title,text,TrayIcon.MessageType.INFO);
    }
}
