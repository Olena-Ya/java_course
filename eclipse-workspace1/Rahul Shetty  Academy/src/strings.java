
/**
 * 
 */
public class strings {
	static int b =37;
	
	
	//Methods
	public void getData1() {
		System.out.println("I am in the method getData1");
	}
	
	
	public int getData2() {
		System.out.println("I am in the method getData2");
		return 2;
	}
	
	
	public String getData3() {
		System.out.println("I am in the method getData3");
		return "getData3";
	}
	
	
	public static void main(String[] args) {
		int a =35;
		
		strings data1 = new strings();
		data1.getData1();
		data1.getData2();
		data1.getData3();
		
		System.out.println("Hi");
		System.out.println(a);
		System.out.println(b);
		
		strings1 data11 = new strings1 ();
		data11.getData11();
		System.out.println(data11.aa);
	}

}
