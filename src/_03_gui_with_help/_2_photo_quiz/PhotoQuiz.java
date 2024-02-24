package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
        String CB = "https://www.crackerbarrel.com/-/jssmedia/CrackerBarrel/Newsroom/Articles/2020/Copy-of-NEW_CB_Logo.png?rev=506a8a949fbd4cfd85ae8cb68cad7e6d";
		// 2. create a variable of type "Component" that will hold your image
        Component crackBar;
		// 3. use the "createImage()" method below to initialize your Component
          crackBar = createImage(CB);
		// 4. add the image to the quiz window
		// 5. call the pack() method on the quiz window
        quizWindow.pack();
		// 6. ask a question that relates to the image
        String biscuits = JOptionPane.showInputDialog("Which resteraunt can you find the best biscuits in the world?");
		// 7. print "CORRECT" if the user gave the right answer
        if(biscuits.equalsIgnoreCase( "Cracker barrel")) {
        	 System.out.println("CORRECT");
        }
        else {
        	System.out.println("INCORRECT");
        }
		// 8. print "INCORRECT" if the answer is wrong
        
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
        
		// 10. find lanother image and create it (might take more than one line
		// of code)
         String J = "https://www.citypng.com/public/uploads/preview/-11599507037yjn7fbu05s.png";
		// 11. add the second image to the quiz window
        Component Joker;
        Joker = createImage(J);
     
		// 12. pack the quiz window
        quizWindow.pack();
		// 13. ask another question
        String human = JOptionPane.showInputDialog("I walk with 4 legs at morning, 2 legs in the middly of the day, and 3 legs at night. What am I?");
		// 14+ check answer, say if correct or incorrect, etc.
     if(human.equalsIgnoreCase(human)) {
    	 System.out.println("CORRECT");
    	 JOptionPane.showMessageDialog(null, "Yes! You got it right! A human walks with 4 legs when they are a baby(they crawl on their knees and legs,) "
    	 		                           + "\nand 2 legs when they are strong and young(they are able to walk on their 2 feet) "
    	 		                           + "\nand 3 legs when they are old(old people walk with their two feet and a cane).");
    	   quizWindow.add(Joker);
     }
     else {
    	 System.out.println("INCORRECT");
    	 JOptionPane.showMessageDialog(null, "No. The answer was a human. A human walks with 4 legs when they are a baby(they crawl on their knees and legs,) "
    	 		                           + "\nand 2 legs when they are strong and young(they are able to walk on their 2 feet) "
    	 		                           + "\nand 3 legs when they are old(old people walk with their two feet and a cane).");
    	 
    	 quizWindow.add(Joker);
     }
	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
