// program to create a 2D array to 1D array
import java.util.Scanner;

class ArrayConverter 
{
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
	    
	    //Taking input of rows and column
	    int row=input.nextInt();
	    int column=input.nextInt();

        // Declare the 2D Array
        int[][] arr = new int[row][column];

        // Input the elements of the 2D Array
        System.out.println("Enter the elements of the 2D Array: ");
        for (int i = 0; i  < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = input.nextInt();
            }
        }
		//Creating 1D array
        int total=row* column;
		int [] brr =int [total];
		int index=0;
      
        // Converting elements of 2D array to 1D array
        System.out.println("The elements of the 1D Array are: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                brr[index]=arr[i][j];
				index++;
            }
        }
            
		//printing 1D array
		for (int j = 0; j < brr.length; j++) {
            System.out.println(brr[j]);
        }
     
        // Close the Scanner Object
        input.close();
    }
}
