import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class type implements KeyListener {

	JFrame f = new JFrame();
	JLabel l = new JLabel();
	
	char currentLetter = generateRandomLetter();
	int i = 0;
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	public static void main(String[] args) {

		type t = new type();
		t.Window();
	}

	public void Window() {
		System.out.println("" + currentLetter);
		f.add(l);
		l.setText("" + currentLetter);
		f.addKeyListener(this);
		f.setSize(500, 500);
		l.setFont(l.getFont().deriveFont(500.0f));
		l.setHorizontalAlignment(JLabel.CENTER);

		f.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		
		char keypress = arg0.getKeyChar();
System.out.println(arg0.getKeyChar());
if (keypress == currentLetter) {
	System.out.print("CORRECT");
	f.setBackground(Color.green);
	i = i + 1;
}
else {
	f.setBackground(Color.RED);
	JOptionPane.showMessageDialog(null, "YOU GOT ONE WRONG");
	showTypingSpeed(i);
}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		l.setText("" + currentLetter);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}
	Date timeAtStart = new Date();

}
