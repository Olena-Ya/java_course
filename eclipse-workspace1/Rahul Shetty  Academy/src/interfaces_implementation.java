import interfaces.CentralTraffic;
import interfaces.ContinentalTraffic;

public class interfaces_implementation  implements CentralTraffic, ContinentalTraffic {

	
	
	
	public static void main(String[] args) {
				
			CentralTraffic ct = new  interfaces_implementation();
			ContinentalTraffic contt = new interfaces_implementation();
			interfaces_implementation internalt = new interfaces_implementation();
			
			ct.FlashingYellow();
			ct.greenGo();
			ct.redStop();
			contt.trainSymbol();
			internalt.internalRules();
			
			
			
	}
	
	public void internalRules() {
		// TODO Auto-generated method stub
		System.out.println ("internalRules  from interfaces_implementation");
	}
	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println ("trainSymbol  from ContinentalTraffic interface");
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println ("greenGo  from CentralTraffic interface");
		
	}

	@Override
	public void FlashingYellow() {
		// TODO Auto-generated method stub
		System.out.println ("FlashingYellow  from CentralTraffic interface");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println ("redStop  from CentralTraffic interface");
		
	}

}
