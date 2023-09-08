package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        
    }

    @Override
    public void draw() {
   int birdx= 400;
   int birdy= 300;
    	background(50,100,255);   
     fill(255,255,0);
     stroke(0,0,0);
     ellipse(birdx,birdy,40 ,40);
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
