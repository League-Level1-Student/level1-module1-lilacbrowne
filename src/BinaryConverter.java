import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame("Convert 8 bits of binary to ASCII");
	JPanel panel = new JPanel();
	JLabel label = new JLabel("A");
	JTextField textfield = new JTextField(20);
	JButton button = new JButton("Convert");

	BinaryConverter() {
		frame.add(panel);
		frame.setVisible(true);
		panel.add(textfield);
		panel.add(button);
		panel.add(label);
		frame.pack();
		button.addActionListener(this);

	}

	public static void main(String[] args) {
		BinaryConverter Cat = new BinaryConverter();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			label.setText(convert(textfield.getText()));
		}
		frame.pack();
	}
	// TODO Auto-generated method stub

	String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+"; // must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}

}
