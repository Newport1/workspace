import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class spamthing implements ActionListener {
	static final String FAKE_USERNAME = "YouSearch9@gmail.com";
	static final String FAKE_PASSWORD = "alphadeltamayonnaise";
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JTextField t = new JTextField(20);
	JButton b = new JButton();
	JButton b1 = new JButton();
	JTextField t1 = new JTextField(20);
	JTextField t2 = new JTextField(20);

	static String sub;
	static String cont;
	static String email;
	static String provider;
	static String number;

	public spamthing() {
		f.add(p);
		p.add(t);
		p.add(b1);
		p.add(b);
		b1.addActionListener(this);
		b.addActionListener(this);
		//p.add(t1);
		//p.add(t2);
		t.setText("Phone number");
		//t2.setText("Provider");
		b.setText("GOOD");
		b1.setText("BAD");
		//t1.setText("Times");
		f.pack();
		f.setVisible(true);
	}

	public static void main(String[] args) {
		spamthing s = new spamthing();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b) {
			email = t.getText();

			System.err.println("GOOD");
			sub = "This Is Not Spam";
			cont = "See I Told you this isnt spam :)";

			// System.out.println(sendSpam(email,sub,cont));

		} else {
			email = t.getText();
			sub = "Please Open Immediately";
			cont = "http://truestorieswithgill.com/wp-content/uploads/2013/09/20130915-190539.jpg";
			System.err.println("BAD");

			// System.out.println(sendSpam(email,sub,cont));
		}
		String times = t1.getText();
		int numberOfTimes = Integer.parseInt(times);
		
		String number = t.getText();
	
		
	//	String carrier = t2.getText();
	//if (carrier.equalsIgnoreCase("Verizon"))
//	{
//		 email = number + "@Vtext.com";
//	}
//	if (carrier.equalsIgnoreCase("att"))
	//{
	///	 email = number + "@txt.att.net";
	//}
	

		for (int i = 0; i < numberOfTimes; i++) {
			sendSpam(email, sub, cont);
			System.out.println("SENT");
		}
	}

	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
						return new javax.mail.PasswordAuthentication(
								FAKE_USERNAME, FAKE_PASSWORD);
					}
				});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

}
