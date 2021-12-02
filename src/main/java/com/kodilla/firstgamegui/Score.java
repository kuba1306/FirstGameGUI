package com.kodilla.firstgamegui;
import javax.swing.*;
import java.awt.*;

public class Score extends JLabel {

    int r = 0;

    public Score() {
        setSize(200, 250);
        setBackground(Color.BLUE);
        setVisible(true);
        setFont(new Font("Ala", Font.BOLD, 30));
    }
}