package extra;

import javax.swing.JOptionPane;

public class Grade {
public static void main(String[] args) {
	String grade = JOptionPane.showInputDialog("What's your grade");
	int percent  = Integer.parseInt(grade);
	if(percent>=70) {
		JOptionPane.showMessageDialog(null, "You Pass!");
	}
	else {
		JOptionPane.showMessageDialog(null, "You Fail");
	}
}
}
