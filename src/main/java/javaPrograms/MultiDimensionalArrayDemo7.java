package javaPrograms;

public class MultiDimensionalArrayDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Multi Dimensional Array
		
		
				String [][] arr5= {{"1","2","3","4"},{"sonal","mittal","selenium","abc"},{"x","1","batch","23"}};
				
				// print the values of this array arr5
				
				// Use 2 for loops  ---> 1 loop for parent, 1 loop for child
				
				// 1 loop for moving inside my parent loop
				
				for(int i=0; i<arr5.length;i++)  // i =2
				{
					for(int j=0;j<arr5[i].length;j++)  // j=0
					{
						
						System.out.println(arr5[i][j]);  // arr5[2][0]  //x,1,batch,23
					}
					
				}

	}

}
