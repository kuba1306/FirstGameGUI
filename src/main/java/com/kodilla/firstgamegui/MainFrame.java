package com.kodilla.firstgamegui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class MainFrame extends JFrame implements ActionListener {

    ArrayList<Button> buttonList = new ArrayList<>();
    LinkedList<Button> secondButtonList = new LinkedList<Button>();
    int randomNumber;

    int a = 150; // Squares positions
    int b = 310;
    int c = 470;

    StartButton startBttn = new StartButton();

    Button bttn1 = new Button("1x1", a, a);
    Button bttn2 = new Button("1x2", b, a);
    Button bttn3 = new Button("1x3", c, a);
    Button bttn4 = new Button("2x1", a, b);
    Button bttn5 = new Button("2x2", b, b);
    Button bttn6 = new Button("2x3", c, b);
    Button bttn7 = new Button("3x1", a, c);
    Button bttn8 = new Button("3x2", b, c);
    Button bttn9 = new Button("3x3", c, c);

//    Button[] buttons = {bttn1, bttn2, bttn3, bttn4, bttn5, bttn6, bttn7, bttn8, bttn9};

    public MainFrame() {
        setTitle("Tic Tac Toe by Jakub Panienski");
        setSize(1300, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setResizable(true);
        JLabel label3 = new JLabel();
        label3.setText("POWODZENIA");
        label3.setFont(new Font("tralala", Font.BOLD, 40));
        label3.setBounds(250, 30, 300, 130);
        add(label3);
        add(startBttn);
        startBttn.addActionListener(this);

        buttonList.add(bttn1);
        buttonList.add(bttn2);
        buttonList.add(bttn3);
        buttonList.add(bttn4);
        buttonList.add(bttn5);
        buttonList.add(bttn6);
        buttonList.add(bttn7);
        buttonList.add(bttn8);
        buttonList.add(bttn9);

        secondButtonList.addAll(buttonList);
        Random random = new Random();
        randomNumber = random.nextInt(secondButtonList.size() - 1);

        for (Button element : secondButtonList) {
            add(element);
            element.addActionListener(this);
        }
    }
    public void action() {
        secondButtonList.get(randomNumber);
        secondButtonList.get(randomNumber).setText("0");
        secondButtonList.get(randomNumber).setEnabled(false);
        secondButtonList.remove(randomNumber);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == startBttn) {
            secondButtonList.addAll(buttonList);
            for (Button elem : secondButtonList) {
                elem.setText("");
                elem.setEnabled(true);
                elem.tempValue = 0;
            }

        } else if (source == bttn1) {
            action();

        } else if (source == bttn2) {
            action();

        } else if (source == bttn3) {
            action();

        } else if (source == bttn4) {
            action();

        } else if (source == bttn5) {
            action();

        } else if (source == bttn6) {
            action();

        } else if (source == bttn7) {
            action();

        } else if (source == bttn8) {
            action();

        } else if (source == bttn9) {
            action();
        } else {
        }
    }
}