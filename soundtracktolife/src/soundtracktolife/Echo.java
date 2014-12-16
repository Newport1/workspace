package soundtracktolife;

import javax.swing.JOptionPane;

public class Echo {
public static void main(String[] args) {
	String blah = JOptionPane.showInputDialog("What u want repeated");
	 Echo e  = new Echo();
	e.echo(blah);
}

public   void echo(String repeat){

 for (int i = 0; i < 9999999; i++) {
	System.out.println(repeat);
	JOptionPane.showMessageDialog(null, repeat);
}
}
}
