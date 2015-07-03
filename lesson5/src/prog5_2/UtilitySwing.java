package prog5_2;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UtilitySwing extends JFrame {
	JButton button1;
	JButton button2;
	JButton button3;

	JTextField inputField;
	JTextField outputField;
	JLabel input;
	JLabel output;

	JButton button;

	public UtilitySwing() {
		initializeWindow();
		addComponents();
		addListeners();
	}

	private void addListeners() {

		ActionListener actionListener = new StringUtilities(inputField,
				outputField);
		button1.addActionListener(actionListener);
		button2.addActionListener(actionListener);
		button3.addActionListener(actionListener);

	}

	private void addComponents() {

		JPanel leftPanel = new JPanel();
		leftPanel.setPreferredSize(new Dimension(200, 200));

		JPanel rightPanel = new JPanel();
		rightPanel.setPreferredSize(new Dimension(150, 200));

		input = new JLabel("Input");
		output = new JLabel("Output");
		inputField = new JTextField(10);
		outputField = new JTextField(10);

		button1 = new JButton("     Count Letters   ");
		button2 = new JButton("   Reverse Letters  ");
		button3 = new JButton("Remove Duplicants");

		// JPanel emptyPanel = new JPanel();
		leftPanel.add(Box.createHorizontalStrut(2000));
		leftPanel.add(Box.createHorizontalStrut(2000));
		leftPanel.add(Box.createHorizontalStrut(2000));

		leftPanel.add(button1);
		leftPanel.add(Box.createHorizontalStrut(2000));
		leftPanel.add(button2);
		leftPanel.add(Box.createHorizontalStrut(2000));
		leftPanel.add(button3);

		rightPanel.add(Box.createHorizontalStrut(2000));
		rightPanel.add(Box.createHorizontalStrut(2000));
		rightPanel.add(Box.createHorizontalStrut(2000));

		rightPanel.add(input);
		rightPanel.add(inputField);
		rightPanel.add(Box.createHorizontalStrut(2000));
		rightPanel.add(output);
		rightPanel.add(outputField);
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(leftPanel, BorderLayout.LINE_START);
		mainPanel.add(rightPanel, BorderLayout.LINE_END);
		getContentPane().add(mainPanel);

	}

	private void initializeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Swing Utility");
		setSize(500, 200); // see NOTE below
		centerFrameOnDesktop(this);
		setResizable(false);
	}

	public static void centerFrameOnDesktop(Component f) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		f.setLocation(((width - frameWidth) / 2), (height - frameHeight) / 3);
	}
}
