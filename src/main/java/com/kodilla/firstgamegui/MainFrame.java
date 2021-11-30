package com.kodilla.firstgamegui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class MainFrame extends JFrame implements ActionListener {

    ArrayList<Button> buttonList = new ArrayList<Button>();
    LinkedList<Button> secondButtonList = new LinkedList<Button>();

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

        for (Button element : buttonList) {
            add(element);
            element.addActionListener(this);
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Button getBttn1() {
        return bttn1;
    }

    public void setBttn1(Button bttn1) {
        this.bttn1 = bttn1;
    }

    public Button getBttn2() {
        return bttn2;
    }

    public void setBttn2(Button bttn2) {
        this.bttn2 = bttn2;
    }

    public Button getBttn3() {
        return bttn3;
    }

    public void setBttn3(Button bttn3) {
        this.bttn3 = bttn3;
    }

    public Button getBttn4() {
        return bttn4;
    }

    public void setBttn4(Button bttn4) {
        this.bttn4 = bttn4;
    }

    public Button getBttn5() {
        return bttn5;
    }

    public void setBttn5(Button bttn5) {
        this.bttn5 = bttn5;
    }

    public Button getBttn6() {
        return bttn6;
    }

    public void setBttn6(Button bttn6) {
        this.bttn6 = bttn6;
    }

    public Button getBttn7() {
        return bttn7;
    }

    public void setBttn7(Button bttn7) {
        this.bttn7 = bttn7;
    }

    public Button getBttn8() {
        return bttn8;
    }

    public void setBttn8(Button bttn8) {
        this.bttn8 = bttn8;
    }

    public Button getBttn9() {
        return bttn9;
    }

    public void setBttn9(Button bttn9) {
        this.bttn9 = bttn9;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        Random random = new Random();
        int randomNumber = random.nextInt(9);

        if (source == startBttn) {
            for (Button elem : buttonList) {
                elem.setText("");
                elem.setEnabled(true);
                elem.tempValue = 0;
            }
        } else if (source == bttn1) {
            bttn1.tempValue = 1;
            buttonList.get(randomNumber);
            buttonList.get(randomNumber).setText("0");

        } else if (source == bttn2) {
            bttn2.tempValue = 1;
            buttonList.get(randomNumber).setEnabled(false);
            buttonList.get(randomNumber).setText("0");

        } else if (source == bttn3) {
            bttn3.tempValue = 1;
            buttonList.get(randomNumber).setEnabled(false);
            buttonList.get(randomNumber).setText("0");

        } else if (source == bttn4) {
            bttn4.tempValue = 1;
            buttonList.get(randomNumber).setEnabled(false);
            buttonList.get(randomNumber).setText("0");

        } else if (source == bttn5) {
            bttn5.tempValue = 1;
            buttonList.get(randomNumber).setEnabled(false);
            buttonList.get(randomNumber).setText("0");

        } else if (source == bttn6) {
            bttn6.tempValue = 1;
            buttonList.get(randomNumber).setEnabled(false);
            buttonList.get(randomNumber).setText("0");

        } else if (source == bttn7) {
            bttn7.tempValue = 1;
            buttonList.get(randomNumber).setEnabled(false);
            buttonList.get(randomNumber).setText("0");

        } else if (source == bttn8) {
            bttn8.tempValue = 1;
            buttonList.get(randomNumber).setEnabled(false);
            buttonList.get(randomNumber).setText("0");

        } else if (source == bttn9) {
            bttn9.tempValue = 1;
        } else {
        }
    }
}