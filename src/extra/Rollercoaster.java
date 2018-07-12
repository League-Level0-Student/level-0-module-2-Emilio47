package extra;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("How tall are you?");
	int height = Integer.parseInt(answer);
	if(height>=48) {
		JOptionPane.showMessageDialog(null, "Enjoy the ride");
	}
	else {
		JOptionPane.showMessageDialog(null, "Sorry too short");
	}
}
}
