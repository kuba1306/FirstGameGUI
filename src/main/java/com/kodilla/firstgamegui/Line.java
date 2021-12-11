package com.kodilla.firstgamegui;

public class Line {

    String name;
    Button firstButton;
    Button secondButton;
    Button thirdButton;

    public Line(String name, Button firstButton, Button secondButton, Button thirdButton) {
        this.name = name;
        this.firstButton = firstButton;
        this.secondButton = secondButton;
        this.thirdButton = thirdButton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Button getFirstButton() {
        return firstButton;
    }

    public void setFirstButton(Button firstButton) {
        this.firstButton = firstButton;
    }

    public Button getSecondButton() {
        return secondButton;
    }

    public void setSecondButton(Button secondButton) {
        this.secondButton = secondButton;
    }

    public Button getThirdButton() {
        return thirdButton;
    }

    public void setThirdButton(Button thirdButton) {
        this.thirdButton = thirdButton;
    }
}