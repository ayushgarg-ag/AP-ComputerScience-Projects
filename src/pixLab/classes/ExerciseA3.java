package pixLab.classes;

public class ExerciseA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file = "src/pixLab/images/BabySloth.jpg";
		Picture p = new Picture (file);
		Picture smallP = p.scale(0.25,0.25);
		smallP.write("src/pixLab/images/BabySloth.jpg");
		smallP.explore(); 

	}

}
