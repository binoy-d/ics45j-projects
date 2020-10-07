package labs.lab3;

public class CreditCard {
	long[] number;
	
	 // Constructor that sets up this CreditCard object with this number. You can assume that the given number is always 16 digits.
	public CreditCard(long number) {
		this.number = new long[16];
		
		for(int i = 15; i>=0; i--) {
			this.number[i] = number%10;
			number/=10;
		}
	}
	// Returns the card number
	public long getNumber() {
		long out = 0;
		for(int i = 0; i<number.length;i++) {
			out*=10;
			out+=number[i];
		}
		return out;
	}
	// Returns a String containing the card number with a space inserted between every 4 characters
	public String getNumberWithSpaces() {
		String out = "";
		for(int i = 0; i<number.length; i++) {
			out+=number[i];
			if(i%4==3) {
				out+=" ";
			}
		}
		return out;
	}
	// Returns true if number is valid, false otherwise
	public boolean isValid() {
		int sum = 0;
		int count = 0;
		for(int i = 0; i<number.length; i++) {
			sum+=number[i];
			if(i%2==0) {
				sum+=number[i];
				if(number[i]>4) {
					count++;
				}
			}
		}
		return (sum+count)%10==0;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard cc1 = new CreditCard(4012888888881881L);
		System.out.println(cc1.getNumber()); // 4012888888881881
		System.out.println(cc1.getNumberWithSpaces()); // 4012 8888 8888 1881
		System.out.println(cc1.isValid()); // true 
		CreditCard cc2 = new CreditCard(1234567890123456L);
		System.out.println(cc2.getNumber()); // 1234567890123456
		System.out.println(cc2.getNumberWithSpaces()); // 1234 5678 9012 3456
		System.out.println(cc2.isValid()); // false 
	}

}
