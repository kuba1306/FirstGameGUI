package com.kodilla.firstgamegui;

public class elementOfLine {

    String name;
    Button buttn;
    int verticalNumber;
    int hotizontalNumber;

    public elementOfLine(String name, Button buttn, int verticalNumber, int hotizontalNumber) {
        this.name = name;
        this.buttn = buttn;
        this.verticalNumber = verticalNumber;
        this.hotizontalNumber = hotizontalNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Button getButtn() {
        return buttn;
    }

    public void setButtn(Button buttn) {
        this.buttn = buttn;
    }

    public int getVerticalNumber() {
        return verticalNumber;
    }

    public void setVerticalNumber(int verticalNumber) {
        this.verticalNumber = verticalNumber;
    }

    public int getHotizontalNumber() {
        return hotizontalNumber;
    }

    public void setHotizontalNumber(int hotizontalNumber) {
        this.hotizontalNumber = hotizontalNumber;
    }
}

