package learnpackage;

public class CarImplInterface  implements Transport{

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("We are driving!");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("We are driving slower...");
	}

}
