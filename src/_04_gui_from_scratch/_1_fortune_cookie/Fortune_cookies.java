package _04_gui_from_scratch._1_fortune_cookie;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortune_cookies implements ActionListener {
	 public void showButton() {
		 JFrame frame = new JFrame();
		 frame.setVisible(true);
		 JButton button = new JButton();
		 button.setText("Fortune Cookie");
		 frame.add(button);
		    
		 frame.pack();
		    button.addActionListener(this);
		   
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 JOptionPane.showMessageDialog(null, "WooHoo!");
		  int rand = new Random().nextInt(5);
		 
		   if(rand == 2) {
			  JOptionPane.showMessageDialog(null, "You will be very smart a job you love");
		  }
		  else if(rand== 3 ) {
			  JOptionPane.showMessageDialog(null, "You won't wake up tommorow");
		  }
		  else if(rand==4) {
			  JOptionPane.showMessageDialog(null, "You are worth nothing. You should give some of your O2 to someone who actually needs it. You serve no purpose. You should reset character now!");
		  }
		  else if(rand == 1) {
			  JOptionPane.showMessageDialog(null, "You are MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM-ID");
		  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		}
	
	
	
}


	        


