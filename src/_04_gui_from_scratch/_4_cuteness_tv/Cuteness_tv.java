package _04_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cuteness_tv implements ActionListener {

	JFrame frame = new JFrame();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JPanel panel = new JPanel();
	public void showButton(){
		frame.setVisible(true);
		
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		frame.add(panel);
		button.setText("Cute Duck");
		button2.setText("Cute Frog");
		button3.setText("Cute Fluffy Unicorns");
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		
		
		frame.pack();
		
	
	
	
	
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed == button) {
			playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
		}
	
	if(buttonPressed == button2) {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}
	if(buttonPressed == button3) {
		playVideo("https://www.youtube.com/watch?v=qRC4Vk6kisY");
	}
	
	
	
	
	
	
	}

	
	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
	     //work on some Linux implementations
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}





}