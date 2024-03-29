package _04_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectMachine implements ActionListener {
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

button.setText("homer-woohoo");	
button2.setText("sawing-wood");
button3.setText("awesomeTrack");

button.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
frame.pack();
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) arg0.getSource();
	if(buttonPressed==button) {
		playSound("homer-woohoo.wav");
	}
	else if(buttonPressed==button2) {
		playSound("sawing-wood-daniel_simon.wav");
	}
	else if(buttonPressed==button3) {
		playSound("awesomeTrack.mp3");
	}

}

private void playSound(String soundFile) {
	String path = "src/_04_gui_from_scratch/_3_sound_effects_machine/";
		File sound = new File(path+soundFile);
		if (sound.exists()) {
			new Thread(() -> {
			try {
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(sound));
				clip.start();
				Thread.sleep(clip.getMicrosecondLength()/1000);
			}
			catch (Exception e) {
				System.out.println("Could not play this sound");
			}}).start();
 		}
		else {
			System.out.println("File does not exist");
		}
	
}






































}
