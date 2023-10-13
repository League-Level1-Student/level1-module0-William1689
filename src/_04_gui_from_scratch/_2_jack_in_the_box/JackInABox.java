package _04_gui_from_scratch._2_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JackInABox implements ActionListener {
	public void showButton() {
       JFrame frame = new JFrame();
       frame.setVisible(true);
       JButton button = new JButton();
       frame.add(button);
       button.setText("Suprise!");
       frame.pack();
       button.addActionListener(this);
       
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

