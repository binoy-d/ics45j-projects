package labs.lab7;

public class Main {
	//recursively counts the number of 8s as a digit
	public static int problem1_count8s(int n) {
		if(n<=9) {
			return n==8?1:0;
		}else {
			if((n/10)%10 == 8) {
				//if digit to left is 8
				return problem1_count8s(n/10)+(n%10==8?2:0);
			}else {
				return problem1_count8s(n/10)+(n%10==8?1:0);
			}
		}
		
	}
	
	public static boolean problem2_arrayTimesTen(int[] arr, int i) {
		if(i+1 >= arr.length) {
			return false;
		}
		return arr[i]*10 == arr[i+1] || problem2_arrayTimesTen(arr, i+1);
	}
	
	
	
	public static String problem3_addStars(String s) {
		if(s.length() == 1) {
			return s;
		}
		return s.charAt(0)+"*"+problem3_addStars(s.substring(1));
		
	}

	public static void main(String[] args) {
		
		//PROBLEM 1
		System.out.println(problem1_count8s(8));
		System.out.println(problem1_count8s(818));
		System.out.println(problem1_count8s(8818));
		System.out.println(problem1_count8s(8888));
		
		
		//PROBLEM 2
		System.out.println(problem2_arrayTimesTen(new int[] {1, 2, 20}, 0)); // returns true
		System.out.println(problem2_arrayTimesTen(new int[] {3, 30, 0}, 0)); // returns true
		System.out.println(problem2_arrayTimesTen(new int[] {3}, 0)); // returns false
		
		
		//PROBLEM 3
		System.out.println(problem3_addStars("hello")); // returns "h*e*l*l*o"
		System.out.println(problem3_addStars("abc")); // returns "a*b*c"
		System.out.println(problem3_addStars("ab")); // returns "a*b"
		System.out.println(problem3_addStars("a")); // returns "a"
		System.out.println(problem3_addStars("12345")); // returns "1*2*3*4*5"
		
		
		//PROBLEMS 4 & 5
		Roster roster = new Roster();
		roster.addPerson(3, "Robert");
		roster.addPerson(5, "Adriana");
		roster.addPerson(188, "Rujun");
		roster.addPerson(9, "Anupriya");
		roster.addPerson(45, "Yizhen");
		roster.addPerson(88, "Emily");
		System.out.println(roster.getNamesInAlphaOrder()+"a"); // returns "Adriana Anupriya Emily Robert Rujun Yizhen"
		System.out.println(roster.findPerson(9).getName()); // returns "Anupriya" 
		System.out.println(roster.findPerson("Yizhen").getId()); // returns 45
		roster.removePerson(3);
		roster.removePerson("Emily");
		System.out.println(roster.getNamesInAlphaOrder()+"a");// returns "Adriana Anupriya Rujun Yizhen"
		
		//PROBLEM 6
		Driveway driveway = new Driveway(); 
		System.out.println(driveway.add(1)); 
		System.out.println(driveway.add(2)); 
		System.out.println(driveway.add(3)); 
		System.out.println(driveway.add(3)); 
		System.out.println(driveway.add(4)); 
		System.out.println(driveway.remove(2)); 
		System.out.println(driveway.remove(4)); 
		System.out.println(driveway.add(5)); 
		System.out.println(driveway.add(6)); 
		System.out.println(driveway.remove(1)); 
		System.out.println(driveway.remove(1));
		

	}

}
