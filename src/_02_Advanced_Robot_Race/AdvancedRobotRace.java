package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		Random random = new Random();
		
		Robot timmy = new Robot(500, 400);
		Robot tammy = new Robot(700, 400);
		Robot sammy = new Robot(800, 600);
		Robot simmy = new Robot(600, 600);
		Robot tommy = new Robot(900, 400);
		
		timmy.setX(200);
		timmy.setY(600);
		tammy.setX(300);
		tammy.setY(600);
		sammy.setX(400);
		sammy.setY(600);
		simmy.setX(500);
		simmy.setY(600);
		tommy.setX(600);
		tommy.setY(600);

		timmy.setSpeed(10);
		tammy.setSpeed(10);
		sammy.setSpeed(10);
		simmy.setSpeed(10);
		tommy.setSpeed(10);
		for(int i=0; i<6; i++) {

		Thread r1 = new Thread(()->timmy.move(random.nextInt(400)));
		r1.start();
		if (timmy.getY()<=0) {
			System.out.println("The winner is: Robot " +timmy);
		}
		Thread r2 = new Thread(()->tammy.move(random.nextInt(400)));
		r2.start();
		if (timmy.getY()<=0) {
			System.out.println("The winner is: Robot " +tammy);
			
		}
		Thread r3 = new Thread(()->sammy.move(random.nextInt(400)));
		r3.start();
		if (timmy.getY()<=0) {
			System.out.println("The winner is: Robot " +sammy);
			
		}
		Thread r4 = new Thread(()->simmy.move(random.nextInt(400)));
		r4.start();
		if (timmy.getY()<=0) {
			System.out.println("The winner is: Robot " +simmy);
				
		}
		Thread r5 = new Thread(()->tommy.move(random.nextInt(400)));
		r5.start();

		if (timmy.getY()<=0) {
			System.out.println("The winner is: Robot " +tommy);
				
		}
	}
	
}
