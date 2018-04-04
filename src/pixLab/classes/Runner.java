package pixLab.classes;

import java.awt.Color;

public class Runner {

	public static void main(String[] args) {
		String file = "src/pixLab/images/BabySloth.jpg";
		Picture p = new Picture (file);
		p.explore();
		
		Picture noBlue = new Picture (file);
		noBlue.zeroBlue(); // mutates picture
		noBlue.setTitle("No Blue");
		noBlue.explore(); // display mutated picture
		
		Picture blue = new Picture (file);
		blue.addBlue(64); // mutates picture
		blue.setTitle("More Blue");
		blue.explore(); // display mutated picture
		
		Picture tint = new Picture (file);
		tint.addTint (new Color(128, 64, 0));
		tint.setTitle ("Tinted");
		tint.explore();

		
		Picture bw = new Picture (file);
		bw.makeBW(); // mutates picture
		bw.setTitle("Gray");
		bw.explore(); // display mutated picture
		
	}

}
