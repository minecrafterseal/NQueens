NQueens Pseudo code

declaration of variables;
chess board size = n
array of strings for each: diagOne, diagTwo, columns, rows

counter k to create a number to test

k has a lower bound of (2^n)-1 and an upper bound of whatever the hell

convert k to binary; make sure that k in binary has n ones in it; add the appropriate amount of 0s to it to make it have n^2 digits\
binary number is a string btw

while k is less than its upper bound
	if solution = false, check if k is a solution by:

{
create n rows by sub-stringing the binary number

create n columns by taking the rth term from each row

create 2n-1 diagonals by making a coordinate system; row[0]char[0]+ row[1]char[1], row[6]char[0] + row[7]char[1]; this creates the first n-1 diagonals by testing when it hits
the bottom row. for the other diagonals, check for when the diagonal hits the top row; row[0]char[7], row[1]char[7] + row[0]char[6]

create 2n-1 diagonals in the other direction by also using a coordinate system; row[7]char[7], row[6]char[7] + row[7]char[6], row[5]char[7] + row[6]char[6] + row[7]char[5]
(row[n-1-newCounter]char[n-1-r]; r increases, newCounter decreases). for the other half of diagonals, do the same except check for when it hits the top row; row[0]char[0],
row[1]char[0] + row[0]char[1]

}



check each row to make sure there is exactly 1 one in it
same for columns
diagonals: just make sure that there are no more than 2 ones in the same string
if k fails any one of these tests, noSolution = true and k=k+1; the process is repeated until k reaches its upper bound. The number of solutions is then reported to the user.
Store the solution value of k as an integer solution.
ALSO, ask if the user wants to see a solution; if yes, convert solution to binary and report it to the user row by row so that the user sees that a chessboard is formed with 1s
representing queens and 0s representing blank spaces.



public class NQueenTester
{
	public static void main(String[] args)
	{
		int chessSize = 8;
		int n = chessSize;
		int k=0;
		int r = 0;
		int counterTwo = 0;
		int newCounter = 0;
		int counter = 0;
		int zeroesAdd = 0;
		String[] rows = new String[n];
		String[] columns = new String[n];
		String[] diagOne = new String[(2*n)-1];
		String[] diagTwo = new String[(2*n)-1];
		int upperBound = 0;
		int lowerBound = 0;
		int integerSolution = 0;
		

		while k is less than its upper bound
			{
				if solution is false
				{
					convert k to binary

					check the number of ones

					if ones != n, not enough or too many ones = true

					if not enough or too many ones = false
					{
						add zeroes to the number so that it has n^2 digits
						
						arrange the binary number into rows by substringing the binary number; check rows here as well

						arrange the binary number into columns by taking the rth character from each row and making it into a string; check columns

						arrange the binary number into diagOne by the process above; check diagOne
			
						arrange the binary number into diagTwo by the process above; check diagTwo

						if these tests are all passed
						{
							solution = true
						}

					

						
					}
					
					
				}
				if solution is true
				{
					solutions = solutions + 1;
					solution = false;
					integerSolution = k;
				}
				k=k+1;
			}
			
	}
}
