package smallest_number_in_matrix;

public class matrixFindMaxInColumnCondition {

public  void array () {
	int a[][] = {{2,4,5,11},{3,4,7,8},{1,2,9,13}};
	int minValue=a[0][0];
	int columnNumber=0;
	for (int i=0; i<a.length; i++) {
//		System.out.println("index i= " + i);
//		System.out.println("a.length =" + a.length);
//		System.out.println("a[" + i+"].length =" + a[i].length);
		for (int j=0; j<a[i].length; j++) {
			//System.out.println("index j= " + j);
		System.out.print(a[i][j] + " ");
		
		if (minValue>a[i][j]) {
		minValue = a[i][j];
		columnNumber=j;
				}
		}
		
		System.out.println();
	}
	System.out.println("minValue " +minValue);
	System.out.println("columnNumber in focus " +columnNumber);
	
	
	
	
	
	int maxValue=a[0][columnNumber];
	for (int i=0; i<a.length; i++) {
		System.out.println(a[i][columnNumber]);
		if (maxValue<a[i][columnNumber]) {
			maxValue = a[i][columnNumber];
			}		
	}
	System.out.println("maxValue " +maxValue);
}
	
	
	


/*
public  void maxInColumn (int k, int a[][]) {
	int maxValue=a[0][k];
	for (int i=0; i<a.length; i++) {
		System.out.println(a[i][k]);
		if (maxValue<a[i][k]) {
			maxValue = a[i][k];
			}		
	}
	System.out.println("maxValue" +maxValue);
}

*/

public static void main (String[] args) {
	matrixFindMaxInColumnCondition matrixArray = new matrixFindMaxInColumnCondition();
	matrixArray.array();
	//matrixArray.maxInColumn(0, null);
	
}

}
