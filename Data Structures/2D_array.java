import java.util.*;
class 2D_array {

	public static void main(String[] args) {

		// create multi dimensional array
		
		int[][] multiArr = {{1,2,3},{4,5,6},{7,8,9}};
		
		
		for(int[] innerArr : multiArr){
		    for(int outer : innerArr){
		        System.out.print("\t"+outer);
		    }
		    System.out.println();
		}
		
		// adding two matrix
	    	Scanner sc = new Scanner(System.in);
		    System.out.println("Enter no of rows:");
		    int rows = sc.nextInt();
		    System.out.println("Enter no of Columns:");
		    int columns = sc.nextInt();
		    
		    int[][] matrix = new int[rows][columns];
		    
		   int total = rows * columns;
		    
		    System.out.println("Enter matrix values:");
		    for(int i=0; i<rows; i++){
		        for(int j=0; j<columns; j++){
		            matrix[i][j] = sc.nextInt();
		        }
		    }
		    
		    for(int[] innerArr : matrix){
		    for(int outer : innerArr){
		        System.out.print("\t"+outer);
		    }
		    System.out.println();
		}
		
		
		System.out.println("result After adding tow arrays");
		add_two_matrix(multiArr , matrix);

	}
	
	public static void add_two_matrix(int[][] matrix1 , int[][] matrix2){
	    
	    for(int i=0;i<matrix1.length;i++){
	         for(int j=0;j<matrix1.length;j++){
	            System.out.print(matrix1[i][j] + matrix2[i][j]+"\t");
	         }
	          System.out.println();
	    }
	    
	}

}
