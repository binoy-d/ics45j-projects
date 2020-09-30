package labs.lab1;

import java.awt.Rectangle;
import java.math.BigInteger;
import java.util.Random;

//Copy and paste this template into your Main.java file
class Main {
	public static String problem1_makeOutWord(String out, String word) {
		// WRITE YOUR CODE HERE�
		return out.substring(0, out.length()/2)+word+out.substring(out.length()/2);
	}

	public static String problem2_switchEO(String str) {
		// WRITE YOUR CODE HERE
		//this is probably a bad way to do this
		String newStr =  str.replace("e", "~");
		newStr = newStr.replace("o", "e");
		newStr = newStr.replace("~", "o");
		
		newStr = newStr.replace("E", "~");
		newStr = newStr.replace("O", "E");
		newStr = newStr.replace("~", "O");
		return newStr;
	}

	public static String problem3_drawNumbers() {
		// WRITE YOUR CODE HERE
		Random rand = new Random();
		String out = "The winning numbers are ";
		for(int i = 0; i<6; i++) {
			out+=(rand.nextInt(100)+1)+" ";
		}
		return out.substring(0, out.length()-1); 
	}
	
	public static Rectangle problem4_growSquare(Rectangle r) {
		// WRITE YOUR CODE HERE
		r.grow(5,5);
		r.translate(5,5);
		return r; 
	}
	
	public static BigInteger problem5_bigPower(BigInteger bigInt) {
		// WRITE YOUR CODE HERE
		return bigInt.pow(4); // FIX ME
	}

	public static void main(String[] args) {
	  //WRITE YOUR TEST CASES FOR ALL FUNCTIONS HERE 
	  	System.out.println(problem1_makeOutWord("<<>>", "Yay").equals("<<Yay>>"));
		System.out.println(problem1_makeOutWord("--------", "WooHoo").equals("----WooHoo----"));
		System.out.println(problem1_makeOutWord("ab", "word").equals("awordb"));
		
		System.out.println(problem2_switchEO("Hello, World!").equals("Holle, Werld!"));
		System.out.println(problem2_switchEO("OOOOOOHHH...").equals("EEEEEEHHH..."));
		System.out.println(problem2_switchEO("Java is fun!").equals("Java is fun!"));
		
		System.out.println(problem3_drawNumbers());
		
		System.out.println(problem4_growSquare(new Rectangle(100, 100, 50, 50)));
		System.out.println(problem4_growSquare(new Rectangle(0, 0, 20, 20)));
		System.out.println(problem4_growSquare(new Rectangle(2, 8, 83, 83)));
		
		//jesus christ
		System.out.println(problem5_bigPower(new BigInteger("12345678987654321")).equals(new BigInteger("23230572939574190285016132680582106822956386016021987551618623681")));
		System.out.println(problem5_bigPower(new BigInteger("999999998888888")).equals(new BigInteger("999999995555552007407419253777018382857935068069867401383936")));
	}             
}
