//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {
	// 0. Make a main method and put steps 1-5 inside it
	
	public static void main(String[] args) {
		
	
	// 1. Set a password in a String variable
	String thisisThePassword = "xo";

	// 2. Using a pop-up, ask the first person for a secret message and store it in a variable
	
String SecretMessage = JOptionPane.showInputDialog("What is the secret message?");

	// 3. Now use a pop-up to tell the NEXT user that they can only see the secret message 
	//    if they can guess the passcode
JOptionPane.showMessageDialog(null, "You can only see the secret message if you guess the password");
String guess = JOptionPane.showInputDialog("Enter password");

if(guess.equals(thisisThePassword)) {
	//show secret message 
	JOptionPane.showMessageDialog(null, SecretMessage);
}
	// 4. If their guess matches the password, show them the secret message



	// 5. If the password does not match, pop-up "INTRUDER!!"
else {
// do not show secret message 
JOptionPane.showMessageDialog(null, "Intruder!");

}
}
}
