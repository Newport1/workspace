import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class buttonTw0 {
	
public static void main(String[] args) {
	JFrame f = new JFrame();	
	JPanel p = new JPanel();
	JButton b = new JButton();
	JButton b2 = new JButton();
	
	
	
	f.setVisible(true);
	f.add(p);
	p.add(b);
	p.add(b2);
	b.setText("Ding");
	b2.setText("Dong");
	f.setTitle("Doorbell");
	f.setSize(500,500);
}
}
