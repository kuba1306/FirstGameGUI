package com.kodilla.firstgamegui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class MainFrame extends JFrame implements ActionListener {
    int bound1 = 150, bound2 = 310, bound3 = 470;
    int yourScore, compScore, randomNumber, randomNumber2, bound, bound9;
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
    private static final ArrayList<Button> buttonList = new ArrayList<>();
    private static final LinkedList<Button> secondButtonList = new LinkedList<>();
    private static final Score label1 = new Score();
    private static final Score label2 = new Score();
    private final static JLabel label3 = new JLabel();
    private final static JLabel info = new JLabel();
    private final static JRadioButton level1 = new JRadioButton("level 1",true);
    private final static JRadioButton level2 = new JRadioButton("level 2",false);
    private final static ButtonGroup choseLevel = new ButtonGroup();
    private final static ArrayList<ArrayList<Button>> allLines = new ArrayList<>();
    private final static ArrayList<Button> line1 = new ArrayList<>();
    private final static ArrayList<Button> line2 = new ArrayList<>();
    private final static ArrayList<Button> line3 = new ArrayList<>();
    private final static ArrayList<Button> line4 = new ArrayList<>();
    private final static ArrayList<Button> line5 = new ArrayList<>();
    private final static ArrayList<Button> line6 = new ArrayList<>();
    private final static ArrayList<Button> line7 = new ArrayList<>();
    private final static ArrayList<Button> line8 = new ArrayList<>();


    public void createAllNeseseryObjects() {
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

    public void compActionEasyLevel() {
        if (comparator(allLines)!=1) {
          chosingRandomButton();
            return;
        }
    }

    public void compActionDifficultLevel() {
        if (comparator(allLines)==1) {
            return;
        }

        if (bttn5.isEnabled()) {
            bttn5.setEnabled(false);
            bttn5.setText("0");
            bttn5.setTempValue(2);
            secondButtonList.remove(bttn5);

        } else {
            for (ArrayList<Button> line : allLines) {
                if (line.get(0).getTempValue() == 1 && line.get(1).getTempValue() == 1 && line.get(2).isEnabled()) {
                    line.get(2).setText("0");
                    line.get(2).setEnabled(false);
                    line.get(2).setTempValue(2);
                    secondButtonList.remove(line.get(2));
                    comparator(allLines);
                    return;
                } else if (line.get(0).getTempValue() == 1 && line.get(2).getTempValue()== 1 && line.get(1).isEnabled()) {
                    line.get(1).setText("0");
                    line.get(1).setEnabled(false);
                    line.get(1).setTempValue(2);
                    secondButtonList.remove(line.get(1));
                    comparator(allLines);
                    return;
                } else if (line.get(1).getTempValue() == 1 && line.get(2).getTempValue()==1 && line.get(0).isEnabled()) {
                    line.get(0).setText("0");
                    line.get(0).setEnabled(false);
                    line.get(0).setTempValue(2);
                    secondButtonList.remove(line.get(0));
                    comparator(allLines);
                    return;
                } else if (line.get(0).getTempValue() == 2 && line.get(1).getTempValue() ==2 && line.get(2).isEnabled()) {
                    line.get(2).setText("0");
                    line.get(2).setEnabled(false);
                    line.get(2).setTempValue(2);
                    secondButtonList.remove(line.get(2));
                    comparator(allLines);
                    return;
                } else if (line.get(0).getTempValue() == 2 && line.get(2).getTempValue() ==2 && line.get(1).isEnabled()) {
                    line.get(1).setText("0");
                    line.get(1).setEnabled(false);
                    line.get(1).setTempValue(2);
                    secondButtonList.remove(line.get(1));
                    comparator(allLines);
                    return;
                } else if (line.get(1).getTempValue() == 2 && line.get(2).getTempValue() == 2 && line.get(0).isEnabled()) {
                    line.get(0).setText("0");
                    line.get(0).setEnabled(false);
                    line.get(0).setTempValue(2);
                    secondButtonList.remove(line.get(0));
                    comparator(allLines);
                    return;
                }
            }
            if (comparator(allLines) == 6) {
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
                elem.tempValue = 0;
                elem.setBackground(Color.WHITE);
            }
        } else {
            for (Button elem : buttonList)
                if (source == elem) {
                    elem.setText("X");
                    elem.tempValue = 1;
                    elem.setEnabled(false);
                    secondButtonList.remove(elem);

                    if (level1.isSelected())
                        compActionEasyLevel();
                    if (level2.isSelected())
                        compActionDifficultLevel();
                }
        }
    }

    public int comparator(ArrayList<ArrayList<Button>> allLines) {
        for (ArrayList<Button> line : allLines)
            if (line.get(0).getTempValue() == 1 && line.get(1).getTempValue() == 1 && line.get(2).getTempValue() == 1) {
                for (Button elements : line)
                    elements.setBackground(Color.RED);
                whatToDoAfterCheckAmIWin();
                return 1;
            } else if (line.get(0).getTempValue() == 2 && line.get(1).getTempValue() == 2 && line.get(2).getTempValue() == 2) {
                for (Button elements : line)
                    elements.setBackground(Color.RED);
                whatToDoAfterCheckAmILost();
                return 2;
            } else if (line.get(0).getTempValue() == 0 && line.get(1).getTempValue() == 1 && line.get(2).getTempValue() == 1)  {
                return 3;
            } else if (line.get(0).getTempValue() == 1 && line.get(1).getTempValue() == 0 && line.get(2).getTempValue() == 1) {
                return 4;
            } else if (line.get(0).getTempValue() == 1 && line.get(1).getTempValue() == 1 && line.get(2).getTempValue() == 0) {
                return 5;
            }
        return 6;
    }
}