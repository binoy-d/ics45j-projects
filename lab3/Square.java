package labs.lab3;

public class Square {
	
	
	int[][] nums;	
	 /* 
	  * Constructor that sets up this Square object with the given 2-D array. 
	  * Assume that the array that is passed in will have:
	  * 	num rows = num columns
	  * 	at least 1 row and 1 column
	  * 	no more than 10 rows and 10 columns
	  * 	no uninitialized values
	  */
	public Square(int[][] nums) {
		this.nums = nums;
	}
	
	// Returns the sum of the numbers in row i (assume i will always be a valid row index)
	public int rowSum(int i) {
		int sum = 0;
		for(int c = 0; c<nums[i].length; c++) {
			sum+=nums[i][c];
		}
		return sum;
	}
	
	// Returns the sum of the numbers in column i (assume i will always be a valid column index)
	public int columnSum(int i) {
		int sum = 0;
		for(int r = 0; r<nums.length; r++) {
			sum+=nums[r][i];
		}
		return sum;
		
	}
	
	// Returns the sum of the numbers in the main diagonal (left/top to right/bottom) if mainDiagonal==true
	//otherwise returns the sum of the numbers in the other diagonal (right/top to left/bottom)
	public int diagonalSum(boolean mainDiagonal)  {
		int sum = 0;
		for(int i = 0; i<nums.length; i++) {
			sum+=mainDiagonal?nums[i][i]:nums[i][nums.length-1-i];
		}
		return sum;
	}
	
	// Returns true if square is a magic square, false otherwise
	public boolean isMagic() {
		int sum = rowSum(0);
		for(int i = 0; i<nums.length; i++) {
			if(rowSum(i) != sum || columnSum(i)!=sum) {
				return false;
			}
		}
		return diagonalSum(true)==sum && diagonalSum(false)==sum;
	}
}
