//package com.kodilla.firstgamegui;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.*;
//import java.util.List;
//
//public class Creator implements ActionListener {
//
//    private final int a = 150, b = 310, c = 470; // Squares positions
//    private int yourScore, compScore, randomNumber;
//    private Random random;
//    private StartButton startBttn;
//    private Button bttn1, bttn2, bttn3, bttn4, bttn5, bttn6, bttn7, bttn8, bttn9;
//    private ArrayList<Button> buttonList, line1, line2, line3, line4, line5, line6, line7, line8;
//    private ArrayList<List<Button>> allLines;
//    private LinkedList<Button> secondButtonList;
//    private Score label1, label2;
//    private JLabel label3, info;
//    private JRadioButton level1, level2;
//    private ButtonGroup choseLevel;
//    private MainFrame newFrame;
//
//    public Creator() {
//        secondButtonList = new LinkedList<>();
//        buttonList = new ArrayList<>();
//        label1 = new Score();
//        label2 = new Score();
//        label3 = new JLabel();
//        info = new JLabel();
//        random = new Random();
//        startBttn = new StartButton();
//        level1 = new JRadioButton("level 1", true);
//        level2 = new JRadioButton("level 2", false);
//        choseLevel = new ButtonGroup();
//
//        bttn1 = new Button("1x1", a, a);
//        bttn2 = new Button("1x2", b, a);
//        bttn3 = new Button("1x3", c, a);
//        bttn4 = new Button("2x1", a, b);
//        bttn5 = new Button("2x2", b, b);
//        bttn6 = new Button("2x3", c, b);
//        bttn7 = new Button("3x1", a, c);
//        bttn8 = new Button("3x2", b, c);
//        bttn9 = new Button("3x3", c, c);
//
//        newFrame = new MainFrame();
//    }
//
//    public void customizeAllObjects() {
//        label3.setText("POWODZENIA");
//        label3.setFont(new Font("tralala", Font.BOLD, 40));
//        label3.setBounds(250, 30, 300, 130);
//        info.setBounds(900, 400, 300, 140);
//        info.setVisible(false);
//        info.setFont(new Font("tralala", Font.BOLD, 20));
//        level1.setBounds(870, 500, 100, 25);
//        level2.setBounds(970, 500, 100, 25);
//        choseLevel.add(level1);
//        choseLevel.add(level2);
//        yourScore = 0;
//        compScore = 0;
//        label1.setText("Your Score: " + yourScore);
//        label2.setText("Comp Score: " + compScore);
//        label1.setBounds(870, 200, 300, 100);
//        label2.setBounds(870, 250, 300, 100);
//    }
//
//    public void addAllneseseryObjects() {
//        customizeAllObjects();
//        buttonList = (ArrayList<Button>) Arrays.asList(bttn1,bttn2,bttn3,bttn4,bttn5,bttn6,bttn7,bttn8,bttn9);
//        line1 = (ArrayList<Button>) Arrays.asList(bttn1,bttn2,bttn3);
//        line2 = (ArrayList<Button>) Arrays.asList(bttn4,bttn5,bttn6);
//        line3 = (ArrayList<Button>) Arrays.asList(bttn7,bttn8,bttn9);
//        line4 = (ArrayList<Button>) Arrays.asList(bttn1,bttn4,bttn7);
//        line5 = (ArrayList<Button>) Arrays.asList(bttn2,bttn5,bttn8);
//        line6 = (ArrayList<Button>) Arrays.asList(bttn3,bttn6,bttn9);
//        line7 = (ArrayList<Button>) Arrays.asList(bttn1,bttn5,bttn9);
//        line8 = (ArrayList<Button>) Arrays.asList(bttn3,bttn5,bttn7);
//        allLines = new ArrayList<List<Button>>();
//
//        allLines.add(line1);
//        allLines.add(line2);
//        allLines.add(line3);
//        allLines.add(line4);
//        allLines.add(line5);
//        allLines.add(line6);
//        allLines.add(line7);
//        allLines.add(line8);
//
//        for (Button element : buttonList) {
//            newFrame.add(element);
//            element.addActionListener(this);
//        }
//        choseLevel.add(level1);
//        choseLevel.add(level2);
//
//        newFrame.add(label1);
//        newFrame.add(label2);
//        newFrame.add(label3);
//        newFrame.add(startBttn);
//        newFrame.add(level1);
//        newFrame.add(level2);
//    }
//
//    public void whatToDoAfterCheckAmIWin() {
//        info.setText("CONGRATULATIONS");
//        info.setVisible(true);
//        yourScore++;
//        label1.setText("Your Score: " + yourScore);
//        for (Button elem : buttonList) {
//            elem.setEnabled(false);
//        }
//        System.out.println("You Won");
//    }
//
//    public void whatToDoAfterCheckAmILost() {
//        info.setText("UNFORTUNETLY you lost");
//        info.setVisible(true);
//        compScore++;
//        label2.setText("Comp Score: " + compScore);
//        for (Button elem : buttonList) {
//            elem.setEnabled(false);
//        }
//        System.out.println("You Lost");
//    }
//
//    public void AmIWin() {
//
//        for (List<Button> line : allLines) {
//            for (Button elem : line) {
//                if (elem.getTempValue() == 1) {
//                    elem.setBackground(Color.RED);
//                    whatToDoAfterCheckAmIWin();
//                }
//            }
//        }
//    }
//
//    public void AmILost() {
//        for (List<Button> line : allLines) {
//            for (Button elem : line) {
//                if (elem.getTempValue() == 2) {
//                    elem.setBackground(Color.RED);
//                    whatToDoAfterCheckAmILost();
//                }
//            }
//        }
//    }
//
//    public void action() {
//        AmIWin();
//        int bound = secondButtonList.size();
//        if (bound == 0) {
//            return;
//        }
//        System.out.println("Comp turn");
//        randomNumber = random.nextInt(bound);
//        secondButtonList.get(randomNumber);
//        secondButtonList.get(randomNumber).setText("0");
//        secondButtonList.get(randomNumber).tempValue = 2;
//        secondButtonList.get(randomNumber).setEnabled(false);
//        secondButtonList.remove(randomNumber);
//        AmILost();
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        Object source = e.getSource();
//
//        if (source == startBttn) {
//            secondButtonList.clear();
//            secondButtonList.addAll(buttonList);
//
//            for (Button elem : buttonList) {
//                elem.setText("");
//                elem.setEnabled(true);
//                elem.tempValue = 0;
//                elem.setBackground(Color.WHITE);
//            }
//        } else if (source == this) for (Button elem : buttonList) {
//            System.out.println("yourn turn");
//            elem.setText("X");
//            elem.tempValue = 1;
//            secondButtonList.remove(elem);
//            action();
//        }
//    }
//}
