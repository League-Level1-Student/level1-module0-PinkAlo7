package _04_gui_from_scratch._1_fortune_cookie;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JFrame cookieWindow = new JFrame();
	JButton button = new JButton("Click me for a fortune");

	
	public void showButton() {
		System.out.println("Button clicked");
		cookieWindow.setVisible(true);
		cookieWindow.add(button);
		cookieWindow.pack();
		button.addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		

		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You will smell very bad and you will have no friends");
		}
		if(rand == 1) {
			JOptionPane.showMessageDialog(null, "You will be very ugly");
		}
		if(rand == 2) {
			JOptionPane.showMessageDialog(null, "You will be very smart and intelligent");
		}
		if(rand == 3) {
			JOptionPane.showMessageDialog(null, "You will be very kind and you will have many friends");
		}
		if(rand ==4) {
			JOptionPane.showMessageDialog(null, "You will be skilled at many different things");
		}
	}
}





