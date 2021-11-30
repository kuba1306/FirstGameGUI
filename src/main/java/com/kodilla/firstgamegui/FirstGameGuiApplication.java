package com.kodilla.firstgamegui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class FirstGameGuiApplication extends JButton {

    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        Score label1 = new Score();
        Score label2 = new Score();
        frame.add(label1);
        label1.setBounds(870, 200, 70, 100);
        frame.add(label2);
        label2.setBounds(1020, 200, 70, 100);
    }
}