import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class BADIPHONEGAME implements ActionListener{
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton();
	
public static void main(String[] args) {
BADIPHONEGAME b = new BADIPHONEGAME();
}

public BADIPHONEGAME()
{
	
	f.add(p);
	p.add(b);
	b.setSize(100, 100);
	b.setText("CLICK");
	f.setTitle("FROM ETHAN");
	f.setSize(500, 500);
	b.setPreferredSize(new Dimension(500, 500));
	b.addActionListener(this);
	
	
	f.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
	playSound("clap.wav");
	JOptionPane.showMessageDialog(null, "CONGRATULATIONS YOU HAVE PRESSED A BUTTON");
	JOptionPane.showMessageDialog(null, "THANK YOU FOR TEACHING US TIFFANY");
}




private void playSound(String fileName) {
	AudioClip sound = JApplet
			.newAudioClip(getClass().getResource(fileName));
	sound.play();
}

}
