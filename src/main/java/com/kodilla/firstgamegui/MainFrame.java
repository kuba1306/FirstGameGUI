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
    LinkedList<Button> secondButtonList = new LinkedList<>();
    Score label1 = new Score();
    Score label2 = new Score();
    int randomNumber;
    Random random = new Random();
    JLabel info = new JLabel();
    int yourScore;
    int compScore;

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
        add(info);
        info.setBounds(900,400,300,140);
        info.setVisible(false);
        info.setFont(new Font("tralala", Font.BOLD, 20));

        yourScore = 0;
        compScore = 0;

        label1.setText("Your Score: "+yourScore);
        label2.setText("Comp Score: "+compScore);
        add(label1);
        add(label2);
        label1.setBounds(870, 200, 300, 100);
        label2.setBounds(870, 250, 300, 100);

        buttonList.add(bttn1);
        buttonList.add(bttn2);
        buttonList.add(bttn3);
        buttonList.add(bttn4);
        buttonList.add(bttn5);
        buttonList.add(bttn6);
        buttonList.add(bttn7);
        buttonList.add(bttn8);
        buttonList.add(bttn9);

        for (Button element : buttonList) {
            add(element);
            element.addActionListener(this);
        }
    }

    public void AmIWin() {
        if (bttn1.getTempValue() == 1 && bttn2.getTempValue() == 1 && bttn3.getTempValue() == 1) {
            bttn1.setBackground(Color.RED);
            bttn2.setBackground(Color.RED);
            bttn3.setBackground(Color.RED);
            info.setText("CONGRATULATIONS");
            info.setVisible(true);
            yourScore++;
            label1.setText("Your Score: "+yourScore);
            for (Button elem : buttonList) {
                elem.setEnabled(false);
            }
            System.out.println("You Win");
        } else if (bttn4.getTempValue() == 1 && bttn5.getTempValue() == 1 && bttn6.getTempValue() == 1) {
            bttn4.setBackground(Color.RED);
            bttn5.setBackground(Color.RED);
            bttn6.setBackground(Color.RED);
            info.setText("CONGRATULATIONS");
            info.setVisible(true);
            yourScore++;
            label1.setText("Your Score: "+yourScore);
            for (Button elem : buttonList) {
                elem.setEnabled(false);
            }
            System.out.println("You Win");
        } else if (bttn7.getTempValue() == 1 && bttn8.getTempValue() == 1 && bttn9.getTempValue() == 1) {
            bttn7.setBackground(Color.RED);
            bttn8.setBackground(Color.RED);
            bttn9.setBackground(Color.RED);
            info.setText("CONGRATULATIONS");
            info.setVisible(true);
            yourScore++;
            label1.setText("Your Score: "+yourScore);
            for (Button elem : buttonList) {
                elem.setEnabled(false);
            }
            System.out.println("You Win");
        } else if (bttn1.getTempValue() == 1 && bttn4.getTempValue() == 1 && bttn7.getTempValue() == 1) {
            bttn1.setBackground(Color.RED);
            bttn4.setBackground(Color.RED);
            bttn7.setBackground(Color.RED);
            info.setText("CONGRATULATIONS");
            info.setVisible(true);
            yourScore++;
            label1.setText("Your Score: "+yourScore);
            for (Button elem : buttonList) {
                elem.setEnabled(false);
            }
            System.out.println("You Win");
        } else if (bttn2.getTempValue() == 1 && bttn5.getTempValue() == 1 && bttn8.getTempValue() == 1) {
            bttn2.setBackground(Color.RED);
            bttn5.setBackground(Color.RED);
            bttn8.setBackground(Color.RED);
            info.setText("CONGRATULATIONS");
            info.setVisible(true);
            yourScore++;
            label1.setText("Your Score: "+yourScore);
            for (Button elem : buttonList) {
                elem.setEnabled(false);
            }
            System.out.println("You Win");
        } else if (bttn3.getTempValue() == 1 && bttn6.getTempValue() == 1 && bttn9.getTempValue() == 1) {
            bttn3.setBackground(Color.RED);
            bttn6.setBackground(Color.RED);
            bttn9.setBackground(Color.RED);
            info.setText("CONGRATULATIONS");
            info.setVisible(true);
            yourScore++;
            label1.setText("Your Score: "+yourScore);
            for (Button elem : buttonList) {
                elem.setEnabled(false);
            }
            System.out.println("You Win");
        } else if (bttn1.getTempValue() == 1 && bttn5.getTempValue() == 1 && bttn9.getTempValue() == 1) {
            bttn1.setBackground(Color.RED);
            bttn5.setBackground(Color.RED);
            bttn9.setBackground(Color.RED);
            info.setText("CONGRATULATIONS");
            info.setVisible(true);
            yourScore++;
            label1.setText("Your Score: "+yourScore);
            for (Button elem : buttonList) {
                elem.setEnabled(false);
            }
            System.out.println("You Win");
        } else if (bttn3.getTempValue() == 1 && bttn5.getTempValue() == 1 && bttn7.getTempValue() == 1) {
            bttn3.setBackground(Color.RED);
            bttn5.setBackground(Color.RED);
            bttn7.setBackground(Color.RED);
            info.setText("CONGRATULATIONS");
            info.setVisible(true);
            for (Button elem : buttonList) {
                elem.setEnabled(false);
            }
            System.out.println("You Win");
        }
    }

    public void action() {
        AmIWin();
        int bound = secondButtonList.size();
        randomNumber = random.nextInt(bound);
        secondButtonList.get(randomNumber);
        secondButtonList.get(randomNumber).setText("0");
        secondButtonList.get(randomNumber).tempValue = 2;
        secondButtonList.get(randomNumber).setEnabled(false);
        secondButtonList.remove(randomNumber);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == startBttn) {
            secondButtonList.clear();
            secondButtonList.addAll(buttonList);

            for (Button elem : buttonList) {
                elem.setText("");
                elem.setEnabled(true);
                elem.tempValue = 0;
                elem.setBackground(Color.WHITE);
            }
        } else if (source == bttn1) {
            bttn1.tempValue = 1;
            secondButtonList.remove(bttn1);
            action();

        } else if (source == bttn2) {
            bttn2.tempValue = 1;
            secondButtonList.remove(bttn2);
            action();

        } else if (source == bttn3) {
            bttn3.tempValue = 1;
            secondButtonList.remove(bttn3);
            action();

        } else if (source == bttn4) {
            bttn4.tempValue = 1;
            secondButtonList.remove(bttn4);
            action();

        } else if (source == bttn5) {
            bttn5.tempValue = 1;
            secondButtonList.remove(bttn5);
            action();

        } else if (source == bttn6) {
            bttn6.tempValue = 1;
            secondButtonList.remove(bttn6);
            action();

        } else if (source == bttn7) {
            bttn7.tempValue = 1;
            secondButtonList.remove(bttn7);
            action();

        } else if (source == bttn8) {
            bttn8.tempValue = 1;
            secondButtonList.remove(bttn8);
            action();

        } else if (source == bttn9) {
            bttn9.tempValue = 1;
            secondButtonList.remove(bttn9);
            action();
        }
    }
}