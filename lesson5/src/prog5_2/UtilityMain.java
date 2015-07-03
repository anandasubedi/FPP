package prog5_2;

import java.awt.EventQueue;

public class UtilityMain {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				UtilitySwing utilitySwing = new UtilitySwing();
				utilitySwing.setVisible(true);
			}
		});
	}

}
