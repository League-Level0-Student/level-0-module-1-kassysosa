import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
 
		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer = JOptionPane.showInputDialog(null, "What belongs to you, but is used by everyone else");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
String riddle = "your name";
if(answer.equals(riddle)) {
	//pop up 
	JOptionPane.showMessageDialog(null, "Correct!");
	score= score +1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Wrong, the answer is your name");
}
	// 6. Add some more riddles

//make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Congrats your score is "+ score);
	
	
	}
}

