import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

	// Copyright Wintriss Technical Schools 2013
	/**
	 * Kata: The Tea Party
	 * 
	 * Description
	 * 
	 * You are dead – but that doesn’t mean you can’t throw a social event. In heaven you are famous for your
	 * extraordinary tea parties. This time the guest list is quite astonishing – 8 famous British people
	   * announced their visit. So don’t mess up!
	 * 
	 * Your task is to welcome your guests properly: Some are female and some were knighted by the queen. So greet
	 * them correctly – or this will be your last hosting.
	 * 
	 * For example: -Jane Austen is a women, so say Hello Ms. Austen -George Orwell is a man, so say Hello Mr.
	 * Orwell -Isaac Newton was knighted, so say Hello Sir Newton
	 * 
	 * Good luck with your party!
	 **/
	
	public class TeaParty implements ActionListener {
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		JButton b = new JButton();
		JButton b1 = new JButton();
		JButton b2 = new JButton("Tommy Flowers");
		JButton b3 = new JButton("");
		JButton b4 = new JButton();
		JButton b5 = new JButton();
		JButton b6 = new JButton();
		JButton b6 = new JButton();
		JButton b7 = new JButton();
		
		public TeaParty(){
			f.add(p);
			p.add(b);
			p.add(b1);
			p.add(b2);
			p.add(b3);
			p.add(b4);
			p.add(b5);
			p.add(b6);
			p.add(b7);
			b.setText("Steve Jobs");
			b1.setText("Bill Gates KBE");
			b.addActionListener(this);
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			b6.addActionListener(this);
			b7.addActionListener(this);
			f.pack();
			
			f.setVisible(true);
			
		}
		public static void main(String[] args) {
			TeaParty tp =new TeaParty();
		}
		
		public String welcome(String lastName, boolean isWoman, boolean isSir)
	    {
	        throw new UnsupportedOperationException();
	    }

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JButton source = ((JButton)arg0.getSource());
			System.err.println(source.getText());
			
			if (arg0.getSource()==b){
				
			}
if (arg0.getSource()==b1){
				
			}
if (arg0.getSource()==b2){
	
}
if (arg0.getSource()==b3){
	
}
if (arg0.getSource()==b4){
	
}
if (arg0.getSource()==b5){
	
}
if (arg0.getSource()==b6){
	
}
if (arg0.getSource()==b7){
	
}
			}
			
		}



