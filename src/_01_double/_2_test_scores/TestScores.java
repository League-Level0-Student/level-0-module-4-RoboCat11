package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("What is your test score?");
		double input1 = Double.parseDouble(input);
		if (input1>90) {
			JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
		}
		else	if (input1<50) {
			JOptionPane.showMessageDialog(null, "Oh. sorry about that.");
		}
		else	if (input1<90) {
			JOptionPane.showMessageDialog(null, "Whoa! That's a good score!");
		}
		
	}
}
