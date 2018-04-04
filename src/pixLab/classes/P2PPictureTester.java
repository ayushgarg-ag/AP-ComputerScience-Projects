package pixLab.classes;

public class P2PPictureTester {

	public static void main(String[] args) {

		String file = "src/pixLab/images/beach.jpg";		// set to whatever image you want to use
		Picture p = new Picture (file);
		p.setTitle ("original");
		p.explore();
		
		Picture noBlue = new Picture (file);
		noBlue.setTitle ("No Blue");
		noBlue.zeroBlue();
		noBlue.explore ();
	    
	    // Part A5 Exercises
	    
/*
		Picture onlyBlue = new Picture (file);
		onlyBlue.setTitle ("Only Blue");
		onlyBlue.keepOnlyBlue();
		onlyBlue.explore ();
		
		Picture onlyRed = new Picture (file);
		onlyRed.setTitle ("Only Red");
		onlyRed.keepOnlyRed();
		onlyRed.explore ();
		
		Picture onlyGreen = new Picture (file);
		onlyGreen.setTitle ("Only Green");
		onlyGreen.keepOnlyGreen();
		onlyGreen.explore ();
		
		Picture neg = new Picture (file);
		neg.setTitle ("Negate");
		neg.negate();
		neg.explore ();
		
		Picture bw = new Picture (file);
		bw.setTitle ("Grayscale");
		bw.grayscale();
		bw.explore ();

		Picture water = new Picture ("water.jpg");
		water.setTitle ("Original Water Image");
		water.explore();
		water.setTitle ("Fixed Water Image");
		water.fixUnderwater();
		water.explore ();
			    
	    // Part A6 Exercises
	     
		Picture vMirror = new Picture (file);
		vMirror.setTitle ("Mirrored Vertically L to R");
		vMirror.mirrorVertical();
		vMirror.explore ();
	    
		Picture vMirror2 = new Picture (file);
		vMirror2.setTitle ("Mirrored Vertically R to L");
		vMirror2.mirrorVerticalRightToLeft();
		vMirror2.explore ();
	    
		Picture hMirror = new Picture (file);
		hMirror.setTitle ("Mirrored Horizontally T to B");
		hMirror.mirrorHorizontal();
		hMirror.explore ();
	    
		Picture hMirror2 = new Picture (file);
		hMirror2.setTitle ("Mirrored Horizontally B to T");
		hMirror2.mirrorHorizontalBotToTop();
		hMirror2.explore ();
	    
		Picture diag = new Picture (file);
		diag.setTitle ("Mirrored Diagonally");
		diag.mirrorDiagonal();
		diag.explore ();
	    
	    // Extension:
	    //  Complete ONE of: 
	    //     Part A7 - Mirroring Part of a Picture (Temple, Arms, Gull)
	    //     Part A8 - Creating a Collage (Copy part, myCollage)
	    //     Part A9+ - Edge Detection, Blur, Sharpen, Filter)
	    
*/
	}

}
