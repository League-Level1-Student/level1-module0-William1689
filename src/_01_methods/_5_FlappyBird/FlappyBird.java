package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	int birdX= 400;
	int birdValocity=-10;
	int birdY=200;
	int gravity=1;
	int pipeX = WIDTH;
	int upperPipeHeight = (int) random(100, 400);
	int pipeGap= 150;
	int lowerY = upperPipeHeight + pipeGap;
	int pipeWidth= 70;
	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
		teleportPipes();
	}

	@Override
	public void draw() {
		if(intersectsPipes()) {
			System.out.println("you die");
			background(0,0,0);
			textSize(100);
			text("YOU DIE",WIDTH/2,HEIGHT/2);
		}else{
			background(50,100,255);  

			fill(255,255,0);
			stroke(0,0,0);
			ellipse(birdX,birdY,40 ,40);
			birdY+=birdValocity;
			birdValocity+=gravity;
			fill(0,255,0);
			rect(pipeX,0,70, upperPipeHeight);
			rect(pipeX,lowerY,70,HEIGHT-pipeGap-upperPipeHeight);
			pipeX-=5;
			teleportPipes();
		}
	}

	public void mousePressed() {
		birdValocity=-10;
	}

	public void teleportPipes() {
		if(pipeX<-70) {
			pipeX=WIDTH;
			upperPipeHeight = (int) random(100, 400);
			lowerY = upperPipeHeight + pipeGap;

		}

	}
	boolean intersectsPipes() { 
		if (birdY < upperPipeHeight && birdX > pipeX && birdX < (pipeX+pipeWidth)){
			System.out.println("1");
			return true; }
		else if (birdY>lowerY && birdX > pipeX && birdX < (pipeX+pipeWidth)) {
			System.out.println("2");
			return true; }
		else { return false; }
	}  

	static public void main(String[] args) {
		PApplet.main(FlappyBird.class.getName());
	}
}
