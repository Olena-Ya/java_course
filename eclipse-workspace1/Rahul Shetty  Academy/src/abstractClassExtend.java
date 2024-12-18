import abstract_Class.Abstract_Class;

public class abstractClassExtend extends Abstract_Class {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		abstractClassExtend	safety = new abstractClassExtend();
		safety.EngineGuidelines();
		safety.AircraftSafetyGuidelines();
		safety.colorBody();
	}


	@Override
	public void colorBody() {
		// TODO Auto-generated method stub
		System.out.println("Your own colorBody  not abstract Class");

}
}
