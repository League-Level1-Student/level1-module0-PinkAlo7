package _03_gui_with_help._4_body_part_quiz;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// You can use the celebrity photos we have placed in the recipe java
	// package,or if you prefer, get celebrity photos from the Internet,
	// place them in the recipe package(body_part_quiz), and change the names below.

	String firstImage = "src/_03_gui_with_help/_4_body_part_quiz/Wednesday.jpeg";
	String secondImage = "src/_03_gui_with_help/_4_body_part_quiz/Wednesday-full.jpeg";
	String thirdImage = "src/_03_gui_with_help/_4_body_part_quiz/Mario.png";
	String fourthImage = "src/_03_gui_with_help/_4_body_part_quiz/Mario-full.png";
	String fifthImage = "src/_03_gui_with_help/_4_body_part_quiz/Sofia.png";
	String sixthImage = "src/_03_gui_with_help/_4_body_part_quiz/Sofia-full.png";
	String seventhImage = "src/_03_gui_with_help/_4_body_part_quiz/TMNT.png";
	String eighthImage = "src/_03_gui_with_help/_4_body_part_quiz/TMNT-full.png";
	JFrame window = new JFrame();
	JPanel panel = new JPanel();
	int score = 0;

	public void run() {
		initializeGui();
		startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		window.setSize(500, 500);

		// 3. Change the size of the window so that you can only see part of the
		// image.
		window.setSize(200, 150);

		showNextImage();

	}

	private void startQuiz() {

		// 1. Make an int variable to hold the score.

		// 2. Set the size of the window in the initializeGui() method 

		// 4. Ask the user who this person is and store their answer
		String guessWednesday = JOptionPane.showInputDialog("Who is this person?");

		// 5. Check their answer. If they guessed correctly:
		// -- Tell them they are right and increase the score by 1
		if(guessWednesday.equalsIgnoreCase("Wednesday")) {
			JOptionPane.showMessageDialog(null, "Good job! That was a correct answer!");
			score+=1;
		    showNextImage();
			scoreBoard();
		}
		// 6. Otherwise:
		// -- Tell them they are wrong and who the person is
		else {
			JOptionPane.showMessageDialog(null, "Nope. Sorry, that is not the correct answer.");
			scoreBoard();
			showNextImage();
		}
		// 7. Use the showNextImage() method below to get the next image
		showNextImage();

		// 8. .... repeat 4-7 for all your images.....
		String guessMario = JOptionPane.showInputDialog("Who is this person?");
		if(guessMario.equalsIgnoreCase("Mario")) {
			JOptionPane.showMessageDialog(null,"Good job! That was the correct answer");
			score+=1;
			showNextImage();
			scoreBoard();
		}
		else {
			JOptionPane.showMessageDialog(null,"Nope. Sorry, that was not the correct answer.");
			scoreBoard();
			showNextImage();
		}
		showNextImage();
		String guessSofia = JOptionPane.showInputDialog("Who is this person?");
		if(guessSofia.equalsIgnoreCase("sofia")) {
			JOptionPane.showMessageDialog(null, "Good job! That was the correct answer!");
			score+=1;
			showNextImage();
			scoreBoard();
		}
		else {
			JOptionPane.showMessageDialog(null, "Nope. Sorry, that was not the correct answer.");
			scoreBoard();
			showNextImage();
		}

		showNextImage();
		String guessMikey = JOptionPane.showInputDialog("Who is this person?");
		if(guessMikey.equalsIgnoreCase("Michelangelo")|| guessMikey.equalsIgnoreCase("Mikey")) {
			JOptionPane.showMessageDialog(null,"Good job! That was the correct answer!");
			showNextImage();
			scoreBoard();
		}
		else {
			JOptionPane.showMessageDialog(null, "Nope. Sorry, that was not the correct answer. The person's name was Michelangel/Mikey.");
		
			scoreBoard();//showNextImage();
		}
//		showNextImage();



	}
	void scoreBoard() {
		JOptionPane.showMessageDialog(null, "Your score is currently " + score + "." );
	}


	// 9. Show them their current score

	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());
		window.pack();
		window.setVisible(true);
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourthImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fifthImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(sixthImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(seventhImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(eighthImage);
		imageList.add(imageLabel);

	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();

		return new JLabel("No more images");
	}
}