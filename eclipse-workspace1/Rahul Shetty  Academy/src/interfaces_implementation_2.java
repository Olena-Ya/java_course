import interfaces.CentralTraffic;
import interfaces.ContinentalTraffic;

public class interfaces_implementation_2 implements CentralTraffic, ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic ct= new interfaces_implementation_2();
		ContinentalTraffic ctt= new interfaces_implementation_2();
		interfaces_implementation_2 lm= new interfaces_implementation_2();
		ct.greenGo();
		ctt.trainSymbol();
		lm.localMethod();
//System.out.println("");
	}

	
	public void localMethod () {
		System.out.println("localMethod");
	}
	
	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("trainSymbol");
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo");
	}

	@Override
	public void FlashingYellow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		
	}

}
