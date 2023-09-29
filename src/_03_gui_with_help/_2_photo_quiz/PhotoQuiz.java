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
		String imageURL = "https://www.usatoday.com/gcdn/-mm-/1e5dd9101f0a86af199c71b833cce7224a5d31a3/c=0-172-320-353/local/-/media/USATODAY/USATODAY/2014/02/03//1391441789000-flappy.jpeg";
		// 2. create a variable of type "Component" that will hold your image
		Component image; 
		// 3. use the "createImage()" method below to initialize your Component
		image = createImage(imageURL);
		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String question1 = JOptionPane.showInputDialog("What is this video game?");
		// 7. print "CORRECT" if the user gave the right answer
if(question1.equalsIgnoreCase("flappy bird")) {
	JOptionPane.showMessageDialog(null,"Good job you got it correct");
}

		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null,"Bad job you got it incorrect");
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
	quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line
		// of code)
	image = createLabelImage("chad.jpeg");
		// 11. add the second image to the quiz window
	quizWindow.add(image);
		// 12. pack the quiz window
	quizWindow.pack();
		// 13. ask another question
	String question2 = JOptionPane.showInputDialog("What country's flag is this?");
		// 14+ check answer, say if correct or incorrect, etc.
	if(question2.equalsIgnoreCase("chad")) {
		JOptionPane.showMessageDialog(null,"Wow, you are very smart for getting that correct");
	}
	
	else if(question2.equalsIgnoreCase("romania")) {
		JOptionPane.showMessageDialog(null, "Ha ha, imagine thinking it was Romania, it was obviously Chad because the blue is darker");
	}
	
	else {
		
		JOptionPane.showMessageDialog(null, "U GOT IT WRONG L");
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
    private JLabel createLabelImage(String fileName) {
        JLabel imageLabel = new JLabel();
        URL imageURL = getClass().getResource(fileName);
        if (imageURL == null) {
            imageLabel.setText("Could not find image " + fileName);
        } else {
            Icon icon = new ImageIcon(imageURL);
            imageLabel.setIcon(icon);
        }
        return imageLabel;
    }

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
