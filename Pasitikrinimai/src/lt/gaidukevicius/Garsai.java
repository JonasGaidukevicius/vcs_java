package lt.gaidukevicius;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Garsai {

	public static void main(String[] args) {
	
		File valgau = new File("sounds/pacman_chomp.wav");
		playSound(valgau);
		
	}
	
	
	static void playSound(File garsas) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(garsas));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength() / 15000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}





