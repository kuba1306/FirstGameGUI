package com.kodilla.firstgamegui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartButton extends JButton {

    public StartButton() {
        setBackground(Color.BLUE);
        setForeground(Color.WHITE);
        setBounds(800, 100, 350, 70);
        setFocusable(false);
        setText("START");
        setEnabled(true);
        setFont(new Font("Ala", Font.BOLD, 30));
        setBorderPainted(true);
    }
}
