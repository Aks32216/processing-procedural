package org.example;

import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int HEIGHT = 1000;
    int i=0;

    public static void main(String[] args) {
        PApplet.main("org.example.FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(1800,1000);
    }

    @Override
    public void setup() {
        ellipse(i, (HEIGHT/5),100,100);
        ellipse(i, (HEIGHT/5)*2,100,100);
        ellipse(i, (HEIGHT/5)*3,100,100);
        ellipse(i, (HEIGHT/5)*4,100,100);
    }

    @Override
    public void draw() {
        ellipse(i, (HEIGHT/5),100,100);
        ellipse(i*2, (HEIGHT/5)*2,100,100);
        ellipse(i*3, (HEIGHT/5)*3,100,100);
        ellipse(i*4, (HEIGHT/5)*4,100,100);
        i++;

    }
}
