package loops;

public class loops {
	
	
	public void task1 () {
		int k=1;
		for (int j=0; j<4; j++) {
		for (int i=1; i<=4-j; i++)
		{
			System.out.print (k +" ");
			k++;
		}	
		System.out.println ("");
	}
		}

	
	public void task2 () {
		int k=1;
		for (int i=0; i<5; i++) 
		{
			for (int j=1; j<1+i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();
			
		}
		
	}
	
	
	
	public void task3 () {
		for (int i=0; i<5; i++) 
		{
			int k=1;
			for (int j=1; j<1+i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();
			
		}
		
	}
	
	
	public void task4 () {
		
		for (int i=1; i<4; i++) 
		{
				for (int j=3; j<=i*3; j=j+3) {
				System.out.print(j);
				System.out.print("\t");
			
			}
			System.out.println();
			
		}
	}
	
	
	public void task5 () {
		int k = 3;
		for (int i=1; i<4; i++) 
		{
				for (int j=3; j<=i*3; j=j+3) {
				System.out.print(k);
				System.out.print("\t");
				k=k+3;
			
			}
			System.out.println();
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loops loopsMethod  = new loops();
		
		for (int i=1; i<=4; i++)
		{
			System.out.println ("Outer loop started");
			
			
			for (int j=1; j<=4; j++)
			{
				System.out.println ("Inner loop");
				
			}
			
			System.out.println ("Outer loop finished");
		}
		
		loopsMethod.task1();
		loopsMethod.task2();
		loopsMethod.task3();
		loopsMethod.task4();
		loopsMethod.task5();
}
}
