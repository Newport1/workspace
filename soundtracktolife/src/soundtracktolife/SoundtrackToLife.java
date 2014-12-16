package soundtracktolife;

import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {
		// 1. Find out what mood the user is in. Store their answer in a variable.
	String m =	JOptionPane.showInputDialog("how are you feeling? (Hint either happy sad bored or idk)");
		// 2. If they are in a happy mood, use the playVideo method to play a happy song from YouTube
		if (m.equalsIgnoreCase("happy")) {
			playVideo("https://www.youtube.com/watch?v=5zVVKXT8Vi0");
		}
		
		if (m.equalsIgnoreCase("sad")) {
			playVideo("https://www.youtube.com/watch?v=Mnhr7wn0noE");
		}
		if (m.equalsIgnoreCase("bored")) {
			playVideo("https://www.youtube.com/watch?v=FbYtASAakAI&list=PL4F6FB1A731B89744");
		}
		if (m.equalsIgnoreCase("idk")) {
			playVideo("https://www.youtube.com/watch?v=oavMtUWDBTM&");
		}
		// 3. Play different songs for other moods
		
		
	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

