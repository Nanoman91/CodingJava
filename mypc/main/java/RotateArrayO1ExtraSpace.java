package main.java;

/*
 * http://www.geeksforgeeks.org/array-rotation/
 * Time complexity: O(n)
 * Auxiliary Space: O(1)
*/
class RotateArrayO1ExtraSpace 
{
	/*Function to left rotate arr[] of siz n by d*/
	void leftRotate(int arr[], int d, int n) 
	{
		int i, j, k, temp;
		for (i = 0; i < gcd(d, n); i++) 
		{
			/* move i-th values of blocks */
			temp = arr[i];
			j = i;
			while (1 != 0) 
			{
				k = j + d;
				if (k >= n) 
					k = k - n;
				if (k == i) 
					break;
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
	}

	/*UTILITY FUNCTIONS*/
	
	/* function to print an array */
	void printArray(int arr[], int size) 
	{
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
	}

	/*Fuction to get gcd of a and b*/
	int gcd(int a, int b) 
	{
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	// Driver program to test above functions
	public static void main(String[] args) {
		RotateArrayO1ExtraSpace rotate = new RotateArrayO1ExtraSpace();
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		rotate.leftRotate(arr, 2, 7);
		rotate.printArray(arr, 7); // Output is: 3 4 5 6 7 1 2 
	}
}
