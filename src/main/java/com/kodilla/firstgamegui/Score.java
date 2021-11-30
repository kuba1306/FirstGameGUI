package com.kodilla.firstgamegui;
import javax.swing.*;
import java.awt.*;

public class Score extends JTextField {

    public Score() {
        setSize(200, 250);
        setBackground(Color.BLUE);
        setVisible(true);
        setText("0");
        setFont(new Font("Ala", Font.BOLD, 30));
    }
}