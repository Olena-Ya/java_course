import java.util.ArrayList;
import java.util.HashMap;

public class collestionsDemo {
	//int	k1=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		collestionsDemo elementToInteract = new collestionsDemo();
		int a[] = {4,5,5,5,4,6,6,9,4};
		int k=0;
		ArrayList<Integer> listOfUniqueValues = new ArrayList<Integer>();
		for (int i=0; i<a.length; i++) {
			if (!listOfUniqueValues.contains(a[i])) {
	
	
				k=1;
				listOfUniqueValues.add(a[i]);
				
				
				for (int j=i+1; j<a.length; j++ ) {
					if(a[i]==a[j]) {
						k=k+1;
					}
				}
				System.out.print("Number " + a[i]);
				System.out.println(" : count " + k);
				
			}
		}
		
			
			HashMap<Integer, Integer>  hm = new HashMap<Integer, Integer>();
			for (int i1=0; i1<a.length; i1++) {
				System.out.println("i1 "+ i1 + hm);
				
				if (!hm.containsKey(a[i1])) {
					System.out.println("i1 "+ i1);
					System.out.println("a[i1] "+ a[i1]);
					System.out.println(!hm.containsKey(a[i1]));
					
					int k1=1;
					
					hm.put(a[i1], k1);
					for (int j=i1+1; j<a.length; j++ ) {
						System.out.println("j "+ j);
					   					   
						System.out.println(hm);
						
						if(a[i1]==a[j]) {
							k1=k1+1;
					System.out.println(a[i1] + " k1 " + k1);
							//hm.remove(a[i1]);
							hm.put(a[i1], k1);
						System.out.print("j " +j+ " a[i1] "+ a[i1] +" Map " + hm);
							System.out.println();
							
						
							if (j ==a.length-1) {
								k1=0;
							}													
						}
					}
										
				} 
		}
		System.out.println("Map " + hm);
	}
	
}
