import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JTime implements ActionListener{
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JTextField t = new JTextField(30);
	JButton b = new JButton();
	JTextField t1 = new JTextField(30);
	

public static void main(String[] args) {
	
	
	new JTime();
	
}
public JTime() {
	f.setTitle("Binary converter");
	f.add(p);
	p.add( t);
	p.add(b);
	p.add(t1);
b.setText("Convert!");	
	b.addActionListener(this);
	f.pack();
	f.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	String a = t.getText();
	
}
}
