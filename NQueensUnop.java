
public class NQueens
{
	public static void main(String[] args)
	{
		int chessSize = 8;
		int n = chessSize;
		int k=0;
		int r = 0;
		int z = 0;
		int counterTwo = 0;
		int newCounter = 0;
		int counter = 0;
		int solutionsCounter = 0;
	
		int upperBound = 16434824;
		int lowerBound = 342391;
		double integerSolution = 0;
		int solutions = 0;
		boolean solution = false;
		boolean notEnoughOrTooManyOnes = false;
		int ones = 0;
		char number = ' ';
		int baseNconvert = 0;
		String binary = "";
		int additionalVariable = 0;
		boolean kDoesNotWork = false;
		int[] solutionThing = new int[10000000];

		counter = 0;
		r = 0;
		int helpful = 1;
		
		
		
		int[] remainders = new int[n];
		
		

		
		
		counter = 0;
		
		while (counter != n)
		{
			remainders[counter] = 0;
			counter = counter+1;
		}

		
	
		z = lowerBound;

		while (z<upperBound)
		{
				kDoesNotWork = false;	
				counter = 0;
				if (kDoesNotWork == false)
				{
					
					while (counter != n)
					{
						remainders[counter] = 0;
						counter = counter+1;
					}
					
					counter = 0;
					baseNconvert = z;
					k = z;
					
					while (counter != n)
					{
						
						baseNconvert = (k%n);
						remainders[counter] = baseNconvert;
						k = (k/n);
						counter = counter+1;
						
						
						
					}
					
					
					counter = 1;
					r=1;
	
					while (counter < (n+1))
					{
						while (r != n)
						{
							
							if (remainders[r] - remainders[r-counter] == 0 || remainders[r] - remainders[r-counter] == counter || remainders[r] - remainders[r-counter] == -counter)
							{
							
								kDoesNotWork = true;
								break;
							}
							
							r=r+1;
						}
						
						counter = counter+1;
						r = counter;
						
					}
					

					
				}
		
				
				
					if (kDoesNotWork == false)
					{
						solutions = solutions + 1;
						solution = false;
						solutionThing[solutionsCounter] = z;
						kDoesNotWork = false;
						integerSolution = z;
						solutionsCounter = solutionsCounter + 1;
					}
				
				z=z+(n-1);
				System.out.println(z);
			}
			
			System.out.println("There are " + solutions + " solutions for a chessboard with sidelength " + n + ".");
			
	}
}