package smallest_number_in_matrix;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Float arrayX[] = {6.0f , 60f,-9f,0f,0.1f} ;
Float minValue=arrayX[0];
Float temp;
for (int i=0; i<arrayX.length; i++) {
	if (minValue>arrayX[i]) {
		minValue=arrayX[i];
	}
}

System.out.println("minValue "+ minValue);
System.out.println();

for (int i=0; i<arrayX.length; i++) {
	for (int j=i+1; j<arrayX.length; j++) {
		if (arrayX[i]>arrayX[j]) {
			temp = arrayX[i];
			arrayX[i]=arrayX[j];
			arrayX[j]=temp;
						
		}
		
		
	}
	
	System.out.print(arrayX[i] + "  ");
}



	}

}
