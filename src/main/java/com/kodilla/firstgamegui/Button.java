package com.kodilla.firstgamegui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Button extends JButton implements ActionListener {

    private String name;
    private int xPosition;
    private int yPosition;
    int tempValue;
    private ArrayList<Button> buttonList = new ArrayList<>();

    public Button(String name, int xPosition, int yPosition) {
        setBackground(Color.WHITE);
        setVisible(true);
        setBounds(xPosition, yPosition, 150, 150);
        setFocusable(true);
        setEnabled(false);
        addActionListener(this);
        setFont(new Font("Ala", Font.BOLD, 30));
        this.tempValue = 0;
        buttonList.add(this);
    }

    public int getTempValue() {
        return tempValue;
    }


    public int compare(Button b1, Button b2, Button b3) {
        if (b1.getTempValue() == 1 && b1.getTempValue() == b2.getTempValue() && b2.getTempValue() == b3.getTempValue())
            return 1;
        if (b1.getTempValue() == 2 && b1.getTempValue() == b2.getTempValue() && b2.getTempValue() == b3.getTempValue())
            return 2;
        else {
            return 3;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == this) {
            setEnabled(false);
        }
    }
}