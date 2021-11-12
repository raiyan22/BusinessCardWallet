package it.units.businesscardwallet.activities;
import java.io.*;


public class MyClassOne {
    private int x = 0;
    private int y = 9;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public MyClassOne() {
        System.out.println("Constructor called\n");
    }

}
