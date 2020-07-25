package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Happy {
	public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog(null,"Are you happy?");
	if (answer.equals ("yes")){
		JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
		System.exit(0);
	}
	else if (answer.equals ("no")) {
		String answer2 = JOptionPane.showInputDialog("Do you want to be happy?");
		if (answer2.equals ("yes")) {
			JOptionPane.showMessageDialog(null, "Change something.");
		}
		else if (answer2.equals ("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
		}
	}
		
		
	}

}
