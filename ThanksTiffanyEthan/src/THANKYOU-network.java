import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class THANKYOU implements ActionListener {
	//JStuff
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton();
	JButton b1 = new JButton();
JTextField t = new JTextField();
	//VARIABLES
String q1;
String q2;


	//main method
public static void main(String[] args) {
	THANKYOU T = new THANKYOU();
}

//GUI
public THANKYOU()
{
f.add(p);
p.add(b);
p.add(t);
p.add(b1);
b.addActionListener(this);
b1.addActionListener(this);
t.setText("OR");
f.pack();
f.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent arg0) {

	
}






}
