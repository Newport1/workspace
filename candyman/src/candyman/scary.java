package candyman;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class scary implements ActionListener {
	int t = 0;
	public static void main(String[] args) {
scary s = new scary();
	s.gui();
	}
public void gui(){
	JFrame j = new JFrame();
	JButton b = new JButton();
	JPanel p = new JPanel();
	
	j.add(p);
	p.add(b);
	b.addActionListener(this);
	b.setText("Candyman");
	j.show(true);
	
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	t++; 
	System.out.println(t);
	if (t == 5) {
		showPictureFromTheInternet("http://cdn1.smosh.com/sites/default/files/legacy.images/smosh-pit/092010/scary-motivators-thumb.jpg");
		playSound(0);
	}
	
}
private void showPictureFromTheInternet(String imageUrl) {
	try {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		JFrame frame = new JFrame();
		frame.add(imageLabel);
		frame.setVisible(true);
		frame.pack();
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
}


static final int CREEPY = 0;
static final int SCREAM = 1;

public static void playSound(int whichSound) {
	String soundURL = "";
	if(whichSound == CREEPY) 
		soundURL = "http://school.wintrisstech.org/sounds/creepynoise.wav";
	else if(whichSound == SCREAM) 
		soundURL = "http://school.wintrisstech.org/sounds/scream.wav";

 	try { 
AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new URL(soundURL)); 
Clip clip = AudioSystem.getClip(); clip.open(audioInputStream); 
clip.start(); 
} catch (Exception ex) { 
ex.printStackTrace(); 
} 
}
}
