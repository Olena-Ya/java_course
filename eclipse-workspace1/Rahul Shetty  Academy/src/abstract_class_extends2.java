import abstract_Class.Abstract_Class;

public class abstract_class_extends2 extends Abstract_Class {

	
	public static void main (String[] args ) {
		abstract_class_extends2	ac = new abstract_class_extends2();
		
		ac.AircraftSafetyGuidelines();
		ac.EngineGuidelines();
		ac.colorBody();
		
	}
	
	
	@Override
	public void colorBody() {
		// TODO Auto-generated method stub
	System.out.println("colorBody");
	}

}
