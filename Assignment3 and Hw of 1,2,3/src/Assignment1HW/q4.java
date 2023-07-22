package Assignment1HW;

public class q4 {
	final int rows = 3;
	final int columns = 4;
	
	public double [][] addMatrix(double [][]a1,double [][]a2)
	{
		double [][]a3=new double[rows][columns];
		for(int i = 0;i<rows;i++) 
		{
			for(int j = 0;j<columns;j++)
			{
				a3[i][j]=a1[i][j]+a2[i][j];
			}
		}
		return a3;
	}
	
	public static void main(String[] args) {

	}

}
