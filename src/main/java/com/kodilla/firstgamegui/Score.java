package com.kodilla.firstgamegui;
import javax.swing.*;
import java.awt.*;

public class Score extends JTextField {

    int r = 0;

    public Score() {
        setSize(200, 250);
        setBackground(Color.BLUE);
        setVisible(true);
        setText(""+r);
        setFont(new Font("Ala", Font.BOLD, 30));
    }
}