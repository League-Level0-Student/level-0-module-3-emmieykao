
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot robot = new Robot();
		robot.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		for (int i = 0; i < 6; i++) {
			
		
		robot.setSpeed(50);
		robot.penDown();
		for (int x = 0; x < 20; x++) {
		robot.move(100);
		robot.turn(60);
		}
		
		//3. Set the pen width to 10
	
		//4. Ask the user what color pen they would like the robot to draw with
	String colorchoice = JOptionPane.showInputDialog(null, "What color would you like to draw with? Red, blue, green, or black?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (colorchoice.equals("red")) {
			robot.setPenColor(255, 0, 0);
		}
		else if (colorchoice.equals("blue")) {
			robot.setPenColor(0, 0, 255);
		}
		else if (colorchoice.equals("green")) {
			robot.setPenColor(0, 255, 0);
		}
		else if (colorchoice.equals("black")) {
			robot.setPenColor(0, 0, 0);
		}
        //6. If the user doesn't enter anything, choose a random color
		else {
			robot.setRandomPenColor();
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		}

		



	}
}
