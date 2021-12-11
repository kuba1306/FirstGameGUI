package com.kodilla.firstgamegui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

public class Button extends JButton implements ActionListener {

    private String name;
    private int xPosition;
    private int yPosition;
    int tempValue;
    private LinkedList<Button> buttonList = new LinkedList<>();

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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public void setTempValue(int tempValue) {
        this.tempValue = tempValue;
    }

    public LinkedList<Button> getButtonList() {
        return buttonList;
    }

    public void setButtonList(LinkedList<Button> buttonList) {
        this.buttonList = buttonList;
    }

    public int getTempValue() {
        return tempValue;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == this) {
            setEnabled(false);
        }
    }
}