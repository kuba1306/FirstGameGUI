package com.kodilla.firstgamegui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class FirstGameGuiApplication extends JButton {

    public static void main(String[] args) {

        MainFrame frame = new MainFrame();
    }
}