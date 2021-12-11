package com.kodilla.firstgamegui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MainFrame extends JFrame implements ActionListener {

    final private int a = 150, b = 310, c = 470; // Squares positions
    private int yourScore, compScore, randomNumber, temporaryValue, compMove;
    private Random random;
    private StartButton startBttn;
    private Button bttn1, bttn2, bttn3, bttn4, bttn5, bttn6, bttn7, bttn8, bttn9;
    private LinkedList<Button> buttonList;
    private LinkedList<Button> secondButtonList;
    private Score label1, label2;
    private JLabel label3, info;
    private JRadioButton level1, level2;
    private ButtonGroup choseLevel;
    //    private Line line1, line2, line3, line4, line5, line6, line7, line8;
//    private LinkedList<Line> allLines;
    private LinkedList<LinkedList<Button>> allLines;
    private LinkedList<Button> line1, line2, line3, line4, line5, line6, line7, line8;


    public void createAllNeseseryObjects() {
        secondButtonList = new LinkedList<>();
        buttonList = new LinkedList<>();
        label1 = new Score();
        label2 = new Score();
        label3 = new JLabel();
        info = new JLabel();
        random = new Random();
        startBttn = new StartButton();
        level1 = new JRadioButton("level 1", true);
        level2 = new JRadioButton("level 2", false);
        choseLevel = new ButtonGroup();

        bttn1 = new Button("1x1", a, a);
        bttn2 = new Button("1x2", b, a);
        bttn3 = new Button("1x3", c, a);
        bttn4 = new Button("2x1", a, b);
        bttn5 = new Button("2x2", b, b);
        bttn6 = new Button("2x3", c, b);
        bttn7 = new Button("3x1", a, c);
        bttn8 = new Button("3x2", b, c);
        bttn9 = new Button("3x3", c, c);
        allLines = new LinkedList<LinkedList<Button>>();

//        line1 = new Line("line123", bttn1, bttn2, bttn3);
//        line2 = new Line("line456", bttn4, bttn5, bttn6);
//        line3 = new Line("line789", bttn7, bttn8, bttn9);
//        line4 = new Line("line147", bttn1, bttn4, bttn7);
//        line5 = new Line("line258", bttn2, bttn5, bttn8);
//        line6 = new Line("line369", bttn3, bttn6, bttn9);
//        line7 = new Line("line159", bttn1, bttn5, bttn9);
//        line8 = new Line("line357", bttn3, bttn5, bttn7);

        line1 = new LinkedList<Button>();
        line2 = new LinkedList<Button>();
        line3 = new LinkedList<Button>();
        line4 = new LinkedList<Button>();
        line5 = new LinkedList<Button>();
        line6 = new LinkedList<Button>();
        line7 = new LinkedList<Button>();
        line8 = new LinkedList<Button>();

        line1.add(bttn1);
        line1.add(bttn2);
        line1.add(bttn3);

        line2.add(bttn4);
        line2.add(bttn5);
        line2.add(bttn6);

        line3.add(bttn7);
        line3.add(bttn8);
        line3.add(bttn9);

        line4.add(bttn1);
        line4.add(bttn4);
        line4.add(bttn7);

        line5.add(bttn2);
        line5.add(bttn5);
        line5.add(bttn8);

        line6.add(bttn3);
        line6.add(bttn6);
        line6.add(bttn9);

        line7.add(bttn1);
        line7.add(bttn5);
        line7.add(bttn9);

        line8.add(bttn3);
        line8.add(bttn5);
        line8.add(bttn7);

        allLines.add(line1);
        allLines.add(line2);
        allLines.add(line3);
        allLines.add(line4);
        allLines.add(line5);
        allLines.add(line6);
        allLines.add(line7);
        allLines.add(line8);
    }

    public void customizeAllObjects() {
        label3.setText("POWODZENIA");
        label3.setFont(new Font("tralala", Font.BOLD, 40));
        label3.setBounds(250, 30, 300, 130);
        info.setBounds(900, 400, 300, 140);
        info.setVisible(false);
        info.setFont(new Font("tralala", Font.BOLD, 20));
        level1.setBounds(870, 500, 100, 25);
        level1.setVisible(true);
        level1.addActionListener(this);
        level2.addActionListener(this);
        level2.setBounds(970, 500, 100, 25);
        level2.setVisible(true);
        choseLevel.add(level1);
        choseLevel.add(level2);
        yourScore = 0;
        compScore = 0;
        label1.setText("Your Score: " + yourScore);
        label1.setBounds(870, 200, 300, 100);
        label2.setText("Comp Score: " + compScore);
        label2.setBounds(870, 250, 300, 100);
        startBttn.addActionListener(this);
    }

    public void addAllneseseryObjects() {
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
        choseLevel.add(level1);
        choseLevel.add(level2);
        add(label1);
        add(label2);
        add(label3);
        add(startBttn);
        startBttn.addActionListener(this);
        add(level1);
        add(level2);
        add(info);
    }

    public MainFrame() {
        setTitle("Tic Tac Toe by Jakub Panienski");
        setSize(1300, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setResizable(true);
        createAllNeseseryObjects();
        customizeAllObjects();

        secondButtonList = new LinkedList<>();
        buttonList = new LinkedList<>();
        label1 = new Score();
        label2 = new Score();
        info = new JLabel();
        label3 = new JLabel();
        random = new Random();
        startBttn = new StartButton();
        level1 = new JRadioButton("level 1", true);
        level2 = new JRadioButton("level 2", false);
        choseLevel = new ButtonGroup();
        yourScore = 0;
        compScore = 0;

        createAllNeseseryObjects();
        customizeAllObjects();
        addAllneseseryObjects();
    }

    public void whatToDoAfterCheckAmIWin() {
        info.setText("CONGRATULATIONS");
        info.setVisible(true);
        yourScore++;
        label1.setText("Your Score: " + yourScore);
        for (Button elem : buttonList) {
            elem.setEnabled(false);
        }
        System.out.println("You Won");
    }

    public void whatToDoAfterCheckAmILost() {
        info.setText("UNFORTUNETLY...");
        info.setVisible(true);
        compScore++;
        label2.setText("Comp Score: " + compScore);
        for (Button elem : buttonList) {
            elem.setEnabled(false);
        }
        System.out.println("You Lost");
    }


    public void actionEasyLevel() {
        if (comparator(allLines) == 1) {
            whatToDoAfterCheckAmIWin();
        }
        int bound = secondButtonList.size();
        if (bound == 0) {
            return;
        }
        randomNumber = random.nextInt(bound);
        secondButtonList.get(randomNumber);
        secondButtonList.get(randomNumber).setText("0");
        secondButtonList.get(randomNumber).tempValue = 2;
        secondButtonList.get(randomNumber).setEnabled(false);
        secondButtonList.remove(randomNumber);

        if (comparator(allLines) == 2) {
            whatToDoAfterCheckAmILost();
        }
    }

    public void actionDifficultLevel() {
        if (bttn5.isEnabled() == true) {
            bttn5.setText("0");
            bttn5.setEnabled(false);
            bttn5.setTempValue(0);
            secondButtonList.remove(bttn5);
        } else {
            for (LinkedList<Button> line : allLines)
                if (line.get(0).getTempValue() == 1 && line.get(1).getTempValue() == 1 && line.get(2).getTempValue() == 0) {
                    line.get(2).setTempValue(2);
                    line.get(2).setText("2");
                    line.get(2).setEnabled(false);
                    secondButtonList.remove(line.get(2));
                } else if (line.get(0).getTempValue() == 1 && line.get(1).getTempValue() == 0 && line.get(2).getTempValue() == 1) {
                    line.get(1).setTempValue(2);
                    line.get(1).setText("2");
                    line.get(1).setEnabled(false);
                    secondButtonList.remove(line.get(1));

                } else if (line.get(0).getTempValue() == 0 && line.get(1).getTempValue() == 1 && line.get(2).getTempValue() == 1) {
                    line.get(0).setTempValue(2);
                    line.get(0).setText("2");
                    line.get(0).setEnabled(false);
                    secondButtonList.remove(line.get(0));
                } else {
                    actionEasyLevel();
                }

        }
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
        } else {
            for (Button elem : buttonList)
                if (source == elem) {
                    elem.setText("X");
                    elem.tempValue = 1;
                    secondButtonList.remove(elem);

                    if (level1.isSelected()) {
                        actionEasyLevel();
                    } else if (level2.isSelected()) {
                        actionDifficultLevel();
                    }
                }
        }
    }


    public int comparator(LinkedList<LinkedList<Button>> allLines) {
        for (LinkedList<Button> line : allLines)
            if (line.get(0).getTempValue() == 1 && line.get(1).getTempValue() == 1 && line.get(2).getTempValue() == 1) {
                for (Button elements : line)
                    elements.setBackground(Color.RED);
                return 1;
            } else if (line.get(0).getTempValue() == 2 && line.get(1).getTempValue() == 2 && line.get(2).getTempValue() == 2) {
                for (Button elements : line)
                    elements.setBackground(Color.RED);
                return 2;
            } else if ((line.get(0).getTempValue() == 0 && line.get(1).getTempValue() == 2 && line.get(2).getTempValue() == 2)
                    || (line.get(0).getTempValue() == 2 && line.get(1).getTempValue() == 0 && line.get(2).getTempValue() == 2)
                    || (line.get(0).getTempValue() == 2 && line.get(1).getTempValue() == 2 && line.get(2).getTempValue() == 0)) {
            }
        return 3;
    }

    public int lineChecker1(LinkedList<Button> Lines) {
        for (LinkedList<Button> line : allLines)
            if (line.get(0).getTempValue() == 0) {
                return 1;
            } else if (line.get(1).getTempValue() == 0) {
                return 2;
            } else if (line.get(2).getTempValue() == 0) {
                return 3;
            } else {
            }
        return 0;
    }
}


//        if (line.getFirstButton().getTempValue() == 0 && line.getSecondButton().getTempValue() == 2 && line.getThirdButton().getTempValue() == 2) {
//            return 0;
//        } else if (line.getFirstButton().getTempValue() == 2 && line.getSecondButton().getTempValue() == 0 && line.getThirdButton().getTempValue() == 2) {
//            return 1;
//        } else if (line.getFirstButton().getTempValue() == 2 && line.getSecondButton().getTempValue() == 2 && line.getThirdButton().getTempValue() == 0) {
//        }
//        return 2;
//        }
