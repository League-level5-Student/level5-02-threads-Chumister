package _01_Olympic_Rings;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded{
	public static void main(String[] args) {
		Robot timmy = new Robot(500, 400);
		Robot tammy = new Robot(700, 400);
		Robot sammy = new Robot(800, 600);
		Robot simmy = new Robot(600, 600);
		Robot tommy = new Robot(900, 400);
		timmy.setPenColor(Color.blue);
		tammy.setPenColor(Color.black);
		sammy.setPenColor(Color.red);
		simmy.setPenColor(Color.yellow);
		tommy.setPenColor(Color.green);
		timmy.penDown();
		tammy.penDown();
		sammy.penDown();
		simmy.penDown();
		tommy.penDown();
		timmy.setSpeed(10);
		tammy.setSpeed(10);
		sammy.setSpeed(10);
		simmy.setSpeed(10);
		tommy.setSpeed(10);
		for(int i =0; i<100; i++) {
			Thread r1 = new Thread(()->timmy.move(10));
			Thread r2 = new Thread(()->tammy.move(10));
			Thread r3 = new Thread(()->sammy.move(10));
			Thread r4 = new Thread(()->simmy.move(10));
			Thread r5 = new Thread(()->tommy.move(10));
			Thread r6 = new Thread(()->timmy.turn(36));
			Thread r7 = new Thread(()->tammy.turn(36));
			Thread r8 = new Thread(()->sammy.turn(36));
			Thread r9 = new Thread(()->simmy.turn(36));
			Thread r10 = new Thread(()->tommy.turn(36));
			r1.start();
			r2.start();
			r3.start();
			r4.start();
			r5.start();
			r6.start();
			r7.start();
			r8.start();
			r9.start();
			r10.start();
		}	
		
	}
}

