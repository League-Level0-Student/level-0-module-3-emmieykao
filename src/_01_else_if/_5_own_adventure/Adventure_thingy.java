package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Adventure_thingy {
public static void main(String[] args) {
	String pet = JOptionPane.showInputDialog(null, "What pet would you like to get?");
	String name = JOptionPane.showInputDialog(null, "What would you like to name your " + pet + "?");
	String color = JOptionPane.showInputDialog(null, "What color is your " + pet + "?");
	String breed = JOptionPane.showInputDialog(null, "What breed/type is your " + pet + "?");
	JOptionPane.showMessageDialog(null, "Your " + color + " " + breed + " " + pet + " named " + name + " just ate your toilet paper stash.");
}
}
