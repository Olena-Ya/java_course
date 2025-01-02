package arrays;

public class multidimensionalArray {

	public static void main (String[] args){
	int a[][] =new int [2][3];
	a[0][0]=1;
	a[0][1]=2;
	a[0][2]=3;
	a[1][0]=4;
	a[1][1]=5;
	a[1][2]=6;
	

	
	/*for ( int i=0; i<a.length; i++) {
		for ( int b=0; b<a[i].length; b++) {
			System.out.print(a[i][b] +" ");
			
	}
		System.out.println();
	}
	*/
	
	for ( int i=0; i<2; i++) {
		for ( int b=0; b<3; b++) {
			System.out.print(a[i][b] +" ");
			
	}
	}
	
	
	
}
}

