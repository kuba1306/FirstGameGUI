package com.kodilla.firstgamegui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class MainFrame extends JFrame implements ActionListener {
    int bound1 = 150, bound2 = 310, bound3 = 470;
    int yourScore, compScore, randomNumber, bound;
    private static final Random random = new Random();
    private final StartButton startBttn = new StartButton();
    private final Button bttn1 = new Button("1x1", bound1, bound1);
    private final Button bttn2 = new Button("1x2", bound2, bound1);
    private final Button bttn3 = new Button("1x3", bound3, bound1);
    private final Button bttn4 = new Button("2x1", bound1, bound2);
    private final Button bttn5 = new Button("2x2", bound2, bound2);
    private final Button bttn6 = new Button("2x3", bound3, bound2);
    private final Button bttn7 = new Button("3x1", bound1, bound3);
    private final Button bttn8 = new Button("3x2", bound2, bound3);
    private final Button bttn9 = new Button("3x3", bound3, bound3);
    private static final LinkedList<Button> secondButtonList = new LinkedList<>();
    private static final Score label1 = new Score();
    private static final Score label2 = new Score();
    private final static JLabel label3 = new JLabel();
    private final static JLabel info = new JLabel();
    private final static JRadioButton level1 = new JRadioButton("level 1", true);
    private final static JRadioButton level2 = new JRadioButton("level 2", false);
    private final static ButtonGroup choseLevel = new ButtonGroup();
    private final Button[] linea1 = {bttn1, bttn2, bttn3};
    private final Button[] linea2 = {bttn4, bttn5, bttn6};
    private final Button[] linea3 = {bttn7, bttn8, bttn9};
    private final Button[] linea4 = {bttn1, bttn4, bttn7};
    private final Button[] linea5 = {bttn2, bttn5, bttn8};
    private final Button[] linea6 = {bttn3, bttn6, bttn9};
    private final Button[] linea7 = {bttn1, bttn5, bttn9};
    private final Button[] linea8 = {bttn3, bttn5, bttn7};
    private final Button[][] allLineas = {linea1, linea2, linea3, linea4, linea5, linea6, linea7, linea8};
    private final Button[] buttonListea = {bttn1, bttn2, bttn3, bttn4, bttn5, bttn6, bttn7, bttn8, bttn9};
    List<Button> buttonList = Arrays.asList(buttonListea);

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
        customizeAllObjects();
        yourScore = 0;
        compScore = 0;
        customizeAllObjects();
        addAllneseseryObjects();
    }

    public void whatToDoAfterCheckAmIWin() {
        info.setText("CONGRATULATIONS");
        info.setVisible(true);
        yourScore++;
        label1.setText("Your Score: " + yourScore);
        for (Button elem : secondButtonList) {
            elem.setEnabled(false);
        }
        System.out.println("You Won");
    }

    public void whatToDoAfterCheckAmILost() {
        info.setText("UNFORTUNETLY...");
        info.setVisible(true);
        compScore++;
        label2.setText("Comp Score: " + compScore);
        for (Button elem : secondButtonList) {
            elem.setEnabled(false);
        }
        System.out.println("You Lost");
    }

    public void chosingRandomButton() {
        bound = secondButtonList.size();
        if (bound == 0) {
            return;
        }
        randomNumber = random.nextInt(bound);
        secondButtonList.get(randomNumber).setText("0");
        secondButtonList.get(randomNumber).tempValue = 2;
        secondButtonList.get(randomNumber).setEnabled(false);
        secondButtonList.remove(randomNumber);
    }

    public void buttonAction(int a, Button[] line, LinkedList<Button> secondButtonList) {
        line[a].setText("0");
        line[a].setEnabled(false);
        line[a].setTempValue(2);
        secondButtonList.remove(line[a]);
        if (comparator(allLineas)==2) {
            return;
        }
    }

    public void compActionEasyLevel() {
        if (comparator(allLineas) == 1) {
            return;
        }
        chosingRandomButton();
        if (comparator(allLineas) == 2) {
            return;
        }
    }

    public void compActionDifficultLevel() {
        if (comparator(allLineas) == 1) {
            return;
        }

        if (bttn5.isEnabled()) {
            bttn5.setEnabled(false);
            bttn5.setText("0");
            bttn5.setTempValue(2);
            secondButtonList.remove(bttn5);

        } else {
            for (Button[] line : allLineas) {
                if (line[0].getTempValue() == 2 && line[1].getTempValue() == 2 && line[2].isEnabled()) {
                    buttonAction(2, line, secondButtonList);
                    return;
                } else if (line[0].getTempValue() == 2 && line[2].getTempValue() == 2 && line[1].isEnabled()) {
                    buttonAction(1, line, secondButtonList);
                    return;
                } else if (line[1].getTempValue() == 2 && line[2].getTempValue() == 2 && line[0].isEnabled()) {
                    buttonAction(0, line, secondButtonList);
                    return;
                } else if (line[0].getTempValue() == 1 && line[1].getTempValue() == 1 && line[2].isEnabled()) {
                    buttonAction(2, line, secondButtonList);
                    return;
                } else if (line[0].getTempValue() == 1 && line[2].getTempValue() == 1 && line[1].isEnabled()) {
                    buttonAction(1, line, secondButtonList);
                    return;
                } else if (line[1].getTempValue() == 1 && line[2].getTempValue() == 1 && line[0].isEnabled()) {
                    buttonAction(0, line, secondButtonList);
                    return;
                }
            }
            if (comparator(allLineas) == 3) {
                chosingRandomButton();
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
                elem.setTempValue(0);
                elem.setBackground(Color.WHITE);
            }
        }

        for (Button elem : buttonList) {
            if (source == elem) {
                elem.setText("X");
                elem.setTempValue(1);
                elem.setEnabled(false);
                secondButtonList.remove(elem);

                if (level1.isSelected()) {
                    compActionEasyLevel();
                }
                if (level2.isSelected()) {
                    compActionDifficultLevel();
                }
            }
        }
    }

    public int comparator(Button[][] allLineas) {
        for (int i = 0; i < allLineas.length; i++) {
            if (allLineas[i][0].getTempValue() == 1 && allLineas[i][1].getTempValue() == 1 && allLineas[i][2].getTempValue() == 1) {
                for (Button elements : allLineas[i]) {
                    elements.setBackground(Color.RED);
                }
                whatToDoAfterCheckAmIWin();
                return 1;
            } else if (allLineas[i][0].getTempValue() == 2 && allLineas[i][1].getTempValue() == 2 && allLineas[i][2].getTempValue() == 2) {
                for (Button elements : allLineas[i]) {
                    elements.setBackground(Color.RED);
                }
                whatToDoAfterCheckAmILost();
                return 2;
            } else {
            }
        }
        return 3;
    }
}