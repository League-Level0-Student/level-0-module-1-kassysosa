import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String birthday = JOptionPane.showInputDialog("When is your birthday?");     
	if(birthday.equals("05/17")){
	//wish them happy birthday
		JOptionPane.showMessageDialog(null, "Happy Birthday");
	}	
	else {
		//wish them a happy UN birthday 
		JOptionPane.showMessageDialog(null, "Happy UN Birthday");
		
	}
}
}
