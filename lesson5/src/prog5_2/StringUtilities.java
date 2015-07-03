package prog5_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class StringUtilities implements ActionListener {

	JTextField input, output;

	public StringUtilities(JTextField jt1, JTextField jt2) {
		this.input = jt1;
		this.output = jt2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object object = e.getSource();
		if ("     Count Letters   ".equals(((JButton) object).getText())) {

			output.setText(input.getText().toString().length() + "");

		} else if ("   Reverse Letters  ".equals(((JButton) object).getText())) {

			String word = input.getText();
			StringBuilder stringBuilder = new StringBuilder();
			for (int i = word.length() - 1; i >= 0; i--) {
				stringBuilder.append(word.charAt(i));
			}
			output.setText(stringBuilder.toString());

		} else if ("Remove Duplicants".equals(((JButton) object).getText())) {

			StringBuilder stringBuilder = new StringBuilder();
			String word = input.getText();
			char[] tempArrray = word.toCharArray();

			for (int i = 0; i < tempArrray.length; i++) {
				boolean isDuplicate = false;
				for (int j = 0; j < i; j++) {
					if (tempArrray[i] == tempArrray[j]) {
						isDuplicate = true;
						break;
					}
				}
				if (!isDuplicate)
					stringBuilder.append(tempArrray[i]);
			}
			output.setText(stringBuilder.toString());
		}

		else
			System.out.println("invalid command");
	}
}
