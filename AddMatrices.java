import java.util.Scanner;

class Matrix{
	int rows;
	int columns;
	int matrix[][];
	
	//constructor
	Matrix(int rows,int columns) {
		this.rows=rows;
		this.columns=columns;
		matrix=new int[rows][columns];
	}
	
	//copy constructor
	Matrix(Matrix mat){
		rows=mat.rows;
		columns=mat.columns;
		matrix=new int[rows][columns];
	}
	
	Scanner sc=new Scanner(System.in);
	
	public void getMat() {
		System.out.println("Enter elements in matrix: ");
		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++) {
				matrix[i][j]=sc.nextInt();
			}
	}
	
	public void displayMat() {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(matrix[i][j]+" ");
				}
			System.out.println();
			}
	}
	
	public static Matrix addMat(Matrix mat1,Matrix mat2) {
		Matrix matrixSum=new Matrix(mat1);
		for(int i=0;i<matrixSum.rows;i++)
			for(int j=0;j<matrixSum.columns;j++) {
				matrixSum.matrix[i][j]=mat1.matrix[i][j]+mat2.matrix[i][j];
			}
		return matrixSum;
	}
}

public class AddMatrices {
	public static void main(String[] args) {
		int rows,columns;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of rows of matrices: ");
		rows=sc.nextInt();
		System.out.println("Enter number of columns of matrices: ");
		columns=sc.nextInt();
		
		Matrix matrix1=new Matrix(rows,columns);
		Matrix matrix2=new Matrix(rows,columns);
		Matrix matrix3=new Matrix(rows,columns);
		
		matrix1.getMat();
		matrix2.getMat();
		matrix3=Matrix.addMat(matrix1, matrix2);
		
		System.out.println("matrix1: ");
		matrix1.displayMat();
		System.out.println("matrix2: ");
		matrix2.displayMat();
		System.out.println("sum of matrix: ");
		matrix3.displayMat();
	
		sc.close();
	}
}
