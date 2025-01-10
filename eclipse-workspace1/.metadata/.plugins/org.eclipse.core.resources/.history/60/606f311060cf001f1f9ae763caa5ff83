package smallest_number_in_matrix;

public class sorting_methods {
	
	public static float [] arrayX () {
		float arrayX[] = {6.0f , 60f,-9f,0f,0.1f} ;
		return arrayX;
	}
	
	
	public void minValue (float anyArray[]) {
		Float minValue=anyArray[0];
		for (int i=0; i<anyArray.length; i++) {
			if (minValue>anyArray[i]) {
				minValue=anyArray[i];
			}
		}

		System.out.println("minValue "+ minValue);
		System.out.println();
	}
	
	
	public void sortArray(float anyArray[]) {
		float temp;
		for (int i=0; i<anyArray.length; i++) {
			for (int j=i+1; j<anyArray.length; j++) {
				if (anyArray[i]>anyArray[j]) {
					temp = anyArray[i];
					anyArray[i]=anyArray[j];
					anyArray[j]=temp;								
				}	
			}
			System.out.print(anyArray[i] + "  ");
		}
	}

	public static void main(String[] args) {
	
		sorting_methods sortingObject = new sorting_methods();
		float arrayToSort[] = sortingObject.arrayX();
		sortingObject.minValue(arrayToSort);
		sortingObject.sortArray(arrayToSort);
}



}
