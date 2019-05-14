package learnpackage;

public class PlaneImlInterface implements Transport{

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("We  are flying!");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("We are flying slower....");
	}

}
