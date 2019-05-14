package learnpackage;

public class TestImplInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarImplInterface car = new CarImplInterface();
		PlaneImlInterface plane = new PlaneImlInterface();
		
		car.go();
		car.stop();
		
		plane.go();
		plane.stop();
		
	}

}
