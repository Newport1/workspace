import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Test implements ActionListener{
	JFrame f = new JFrame();	
	JPanel p = new JPanel();
	JButton b = new JButton();


	public static void main(String[] args) {
		Test t = new Test();
		t.Makebutton();
		
}
	private void Makebutton(){
		f.setVisible(true);
	f.add(p);
	p.add(b);
	b.addActionListener(this);
	b.setText("Easy");
}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == b){
			JOptionPane.showMessageDialog(null, "That was easy");
			
		}
		
	}
}
