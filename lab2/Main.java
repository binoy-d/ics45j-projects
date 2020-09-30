package labs.lab2;

import java.util.Scanner;

//Copy and paste this template into your Main.java file
class Main {
	public static void problem1_calculate() {
		// WRITE YOUR CODE HERE 
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter the first integer: ");
		int num1 = s.nextInt();
		System.out.print("Please enter the second integer: ");
		int num2 = s.nextInt();
		System.out.printf("%-11s %9d%n","Sum:", (num1+num2));
		System.out.printf("%-11s %9d%n","Difference:", (num1-num2));
		System.out.printf("%-11s %9d%n","Product:", (num1*num2));
		System.out.printf("%-11s %12.2f%n","Average:", (num1+num2)/2.0);
		System.out.printf("%-11s %9d%n","Distance:", Math.abs(num1-num2));
		System.out.printf("%-11s %9d%n","Maximum:", Math.max(num1,num2));
		System.out.printf("%-11s %9d%n","Minimum:", Math.min(num1,num2));
		s.close();
	}
	
	public static void problem2_removeCommas() {
		// WRITE YOUR CODE HERE 
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter an integer between 1,000 and 999,999, using a comma after the thousands: ");
		System.out.println(Integer.parseInt(s.next().replaceAll(",", "")));
		s.close();
	}
	
	public static String problem3_printDigits(int number) {
		return (""+number).replaceAll("(\\d)(\\d)(\\d)(\\d)(\\d)","$1 $2 $3 $4 $5");
	}
	
	public static double problem6_getNumericGrade(String letterGrade) {
		// WRITE YOUR CODE HERE 
		letterGrade = letterGrade.toUpperCase();
		
		double base = "FDCBA".indexOf(letterGrade.charAt(0));
		if(letterGrade.length() == 1 || letterGrade.equals("A+")) {
			return base;
		}else if(letterGrade.length()==2 && base!=-1){
			if(letterGrade.charAt(0) == 'F') {
				return -1.0;
			}
			if(letterGrade.charAt(1)=='+') {
				return base+0.3;
			}else if(letterGrade.charAt(1) =='-') {
				return base-0.3;
			}else {
				return -1.0;
			}
		}
		return -1.0;
	}
	
	public static String problem6_getLetterGrade(double numericGrade) {
		if(numericGrade>4 || numericGrade<0) {
			return "Error";
		}else if(numericGrade>=3.7) {
			return numericGrade==4.0?"A+":"A";
		}else if(numericGrade>=3.3) {
			return "A-";
		}else if(numericGrade>=3.0) {
			return "B+";
		}else if(numericGrade>=2.7) {
			return "B";
		}else if(numericGrade>=2.3) {
			return "B-";
		}else if(numericGrade>=2.0) {
			return "C+";
		}else if(numericGrade>=1.7) {
			return "C";
		}else if(numericGrade>=1.3) {
			return "C-";
		}else if(numericGrade>=1.0) {
			return "D+";
		}else if(numericGrade>=0.7) {
			return "D";
		}else if(numericGrade>=0) {
			return "D-";
		}else{
			return "F";
		}
	}
	
	public static String problem7_withoutX2(String str) {
		// WRITE YOUR CODE HERE 
		if(str.charAt(0) == 'x') {
			if(str.charAt(1) == 'x') {
				return str.substring(2);
			}
			return str.substring(1);
		}else if(str.charAt(1) == 'x') {
			return str.charAt(0)+str.substring(2);
		}
		return str;
	}
	
	public static String problem10_getRomanNumerals(int integer) {
		if(integer<1 || integer>3900) {
			return "Error";
		}
		
		int[] dec = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String out = "";
        for(int i = 0; integer>0; i++) {
            while(dec[i] <= integer) {
            	integer-=dec[i];
                out+=roman[i];
            }
        }    
        return out;
	}

	public static void main(String[] args) {
	  //WRITE YOUR TEST CASES FOR ALL FUNCTIONS HERE  
		//problem1_calculate();
		//problem2_removeCommas();
		//System.out.println(problem3_printDigits(16384));
		//System.out.println(problem3_printDigits(22250));
		//System.out.println(problem6_getNumericGrade("G")); // returns -1.0
		//System.out.println(problem6_getNumericGrade("a-")); // returns 3.7
		//System.out.println(problem6_getNumericGrade("C+")); // returns 2.3
		//System.out.println(problem6_getNumericGrade("B")); // returns 3.0
		//System.out.println(problem6_getNumericGrade("A+")); // returns 3.0
		//System.out.println(problem6_getLetterGrade(2.85)); // returns "B"
		//System.out.println(problem6_getLetterGrade(0.51)); // returns "D-"
		//System.out.println(problem6_getLetterGrade(4.0)); // returns "A+"
		//System.out.println(problem6_getLetterGrade(8.3)); // returns "Error"
		//System.out.println(problem7_withoutX2("xHi")); // returns "Hi"
		//System.out.println(problem7_withoutX2("Hxi")); // returns "Hi"
		//System.out.println(problem7_withoutX2("Hi")); // returns "Hi"
		//System.out.println(problem7_withoutX2("XHi")); // returns "XHi"
		//System.out.println(problem7_withoutX2("Hxix")); // returns "XHi"
		//System.out.println(problem7_withoutX2("Hxxx")); // returns "XHi"
		System.out.println(problem10_getRomanNumerals(1978)); // returns "MCMLXXVIII"
		System.out.println(problem10_getRomanNumerals(29)); // returns "XXIX"
		System.out.println(problem10_getRomanNumerals(4000)); // returns "Error"
	}            
}
