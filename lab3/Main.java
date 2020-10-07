package labs.lab3;

//Copy and paste this template into your Main.java file
class Main {
	public static String problem1_mirrorEnds(String str) {
		// WRITE YOUR CODE HERE 
		
		String out = "";
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				return out;
			}
			out+=str.charAt(i);
		}
		return out; // FIX ME
	}
	
	public static int problem2_sumNumbers(String str) {
		// WRITE YOUR CODE HERE
		int sum = 0;
		int currentNum = 0;
		for(int i = 0; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))){
				currentNum*=10;
				currentNum+=Integer.parseInt(""+str.charAt(i));
			}else {
				sum+=currentNum;
				currentNum = 0;
			}
		}
		return sum+currentNum;
	}
	
	public static String problem3_notReplace(String str) {
		// WRITE YOUR CODE HERE
		//gotta love regex
		return str.replaceAll("\\bis\\b", "is not"); // FIX ME
	}
	
	public static int problem5_getNumTwists(int starting, int target) {
		// WRITE YOUR CODE HERE 
		int total = 0;
		
		while(starting>0 || target>0) {
			int dist = Math.abs(target%10-starting%10);
			if(dist<=5) {
				total+=dist;	
			}else {
				total+=(10-dist);
				
			}
			
			starting/=10;
			target/=10;
		}
		
		return total; // FIX ME
	}
	
	public static int[] problem6_evenOdd(int[] nums) {
		// WRITE YOUR CODE HERE 
		int start = 0;
		
		for(int i = 0; i<nums.length; i++) {
			if(nums[i]%2==0) {
				int temp = nums[start];
				nums[start] = nums[i];
				nums[i] = temp;
				start++;
			}
		}
		
		
		return nums;
	}

	/*
	public static void printArr(int[] arr) {
		String out = "";
		for(int num : arr) {out+=num+" ";}
		System.out.println(out);
	}
	*/
	public static void main(String[] args) {
	  //WRITE YOUR TEST CASES FOR ALL FUNCTIONS HERE 
		//System.out.println(problem1_mirrorEnds("abXYZba")); // returns "ab"
		//System.out.println(problem1_mirrorEnds("abca")); // returns "a"
		//System.out.println(problem1_mirrorEnds("aba")); // returns "aba"
		//System.out.println(problem1_mirrorEnds("abc")); // returns ""
		
		//System.out.println(problem2_sumNumbers("abc123xyz")); // returns 123
		//System.out.println(problem2_sumNumbers("aa11b33")); // returns 44
		//System.out.println(problem2_sumNumbers("7 11")); // returns 18
		//System.out.println(problem2_sumNumbers("Robert")); // returns 0
		
		//System.out.println(problem3_notReplace("is test")); // returns "is not test"
		//System.out.println(problem3_notReplace("is-is")); // returns "is not-is not"
		//System.out.println(problem3_notReplace("This is right"));// returns"This is not right"
		//System.out.println(problem3_notReplace("I love Java!")); // returns "I love Java!"
		//System.out.println(problem3_notReplace("My favorite number is3.")); // returns "My favorite number is not3."
		//System.out.println(problem3_notReplace("I miss you")); // returns "I miss you"
		
		//System.out.println(problem5_getNumTwists(1729, 5714)); // returns 10
		//System.out.println(problem5_getNumTwists(0000, 9999)); // returns 4
		//System.out.println(problem5_getNumTwists(4590, 4590)); // returns 0
		//System.out.println(problem5_getNumTwists(7712, 1729)); // returns 8
		//printArr(problem6_evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1})); // returns [0, 0, 0, 1, 1, 1, 1] (remember 0 is an even number)
		//printArr(problem6_evenOdd(new int[]{3, 3, 2})); // returns [2, 3, 3]
		//printArr(problem6_evenOdd(new int[]{2, 2, 2})); // returns [2, 2, 2]
		
		//Item treats = new Item(2.5, true, 10); 
		//Item collar = new Item(15.75, false, 1);
		//Item dogShampoo = new Item(9, false, 2);
		//Item bones = new Item(6.25, true, 5);
		//Invoice myInvoice = new Invoice();
		//myInvoice.addItem(treats);
		//myInvoice.addItem(collar);
		//myInvoice.addItem(dogShampoo);
		//myInvoice.addItem(bones);
		//System.out.println(myInvoice.getTotal()); // should return 84.375 (22.50 for treats + 15.75 for collar + 18 for dogShampoo + 28.125 for bones)
		
	}
}
