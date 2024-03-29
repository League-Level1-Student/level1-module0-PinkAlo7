package _03_gui_with_help._5_duelling_buttons;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuellingButtons implements ActionListener {

	JButton leftButton = new JButton();
	JButton rightButton = new JButton();

	Dimension BIG = new Dimension(400, 400);
	Dimension SMALL = new Dimension(200, 200);

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	public void run() {

		// 1. Add the panel to the frame
            frame.add(panel);
		// 2. Make the frame visible
           frame.setVisible(true);;
		// 3. Set the text of the leftButton to "Click me!"
         leftButton.setText("Click me!");
		// 4. Set the text of the rightButton to "Click me!"
           rightButton.setText("Click me!");
		// 5. Add an action listener to the leftButton
          leftButton.addActionListener(this);
		// 6. Add an action listener to the rightButton
            rightButton.addActionListener(this);
		// 7. Add the leftButton to the panel
            panel.add(leftButton);
		// 8. Add the rightButton to the panel
            panel.add(rightButton);
		// 9. Pack the frame\
           
           frame.pack();
		// 10. Set the title of the frame to "Demanding Buttons"
            frame.setTitle("Demanding Buttons");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();

		/* If the buttonPressed was the leftButton.... */
		if(buttonPressed == leftButton) {
			rightButton.setText("No, click ME!");
		
		// Set the text of the rightButton to "No, click Me!"
		// Set the PREFERRED size of the rightButton to BIG
		rightButton.setPreferredSize(BIG);
		rightButton.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		// Set the text of the leftButton to "Click Me!"
		leftButton.setText("Click me!");
		// Set the PREFERRED size of the leftButton to SMALL
        leftButton.setPreferredSize(SMALL);
        leftButton.setFont(new Font("Comic Sana MS", Font.BOLD, 10));
		}
		
		
		
		
		/* If the buttonPressed was the rightButton, do the opposite. */
         if(buttonPressed == rightButton)  {
        	 leftButton.setText("No, click ME!");
         leftButton.setPreferredSize(BIG);
         leftButton.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
         rightButton.setText("Click me!");
         rightButton.setPreferredSize(SMALL);
         rightButton.setFont(new Font("Comic Sana MS", Font.BOLD, 10));
         }
		frame.pack();
	}
}
