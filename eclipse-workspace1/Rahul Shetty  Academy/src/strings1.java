
public class strings1 {

	static int aa = 38;
	//Methods
	
	public String getData11() {
		
		System.out.println("I am in the method getData11");
		return "getData11";
	}
	
	
	//revert String
	public boolean revertString(){
		String test = "Test is Palindrome";
		String newString = "";
		
		for (int i = test.length()-1; i>=0; i--) {
			newString = newString + test.charAt(i);
		}
		System.out.println (newString);
		System.out.println ();
		boolean flag = true;
		if (test == newString) {
			flag = true ;
		} else {
			flag = false ;
			System.out.println ("I am here");
		}
		System.out.println (flag);
		System.out.println ("I am there");
		return  flag;
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			strings1 ifPalindrom = new strings1();
			ifPalindrom.revertString();
	}

}