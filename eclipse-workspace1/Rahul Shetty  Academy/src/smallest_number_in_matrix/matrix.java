package smallest_number_in_matrix;

public class matrix {

public  void array () {
	int a[][] = {{2,4,5},{3,4,7,8},{1,2,9,9,11}};
	int minValue=a[0][0];
	for (int i=0; i<a.length; i++) {
//		System.out.println("index i= " + i);
//		System.out.println("a.length =" + a.length);
//		System.out.println("a[" + i+"].length =" + a[i].length);
		for (int j=0; j<a[i].length; j++) {
			//System.out.println("index j= " + j);
		System.out.print(a[i][j] + " ");
		
		if (minValue>a[i][j]) {
		minValue = a[i][j];
				}
		
		
		}
		
		System.out.println();
	}
	System.out.println(minValue);
} 

public static void main (String[] args) {
	matrix matrixArray = new matrix();
	matrixArray.array();
	
}

}
