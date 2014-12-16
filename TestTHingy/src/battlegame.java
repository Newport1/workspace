import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class battlegame implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JTextField t = new JTextField(30);
	JButton b = new JButton();
	JTextField t1 = new JTextField(30);
	
public static void main(String[] args) {
new	battlegame();
	
	}

public  battlegame(){
	f.setTitle("Battle!!");
	f.add(p);
	p.add( t);
	p.add(b);
	p.add(t1);
b.setText("battle");	

	b.addActionListener(this);
	f.pack();
f.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	String l = t.getText();
	String q = t1.getText();
	int a = new Random().nextInt(2);
	if (a == 1) {
		JOptionPane.showMessageDialog(null, l + " WON!!!!!");
	}
	else {
		JOptionPane.showMessageDialog(null, q + " WON!!!!!");
	}
}
}
