
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "February 14th";
		String dadsBirthday = "October 31st";
		String myBirthday = "March 17th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String response=JOptionPane.showInputDialog(null, "Who's birthday do you want: mine, Dad's, or Mom's?");
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, "You askes for " + response + "'s birthday. Here it is.");
		// 4. if user asked for "mom"
			//print mom's birthday
		if (response.equals("mom")) {
			JOptionPane.showMessageDialog(null, "momsBirthday");
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if (response.equals("dad")) {
			JOptionPane.showMessageDialog(null, "dadsBirthday");
		}
		// 6. if user asked for your name
			// print myBirthday
		else if (response.equals("yours")) {
			JOptionPane.showMessageDialog(null, "myBirthday");
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday.");
		}

	} 
}
