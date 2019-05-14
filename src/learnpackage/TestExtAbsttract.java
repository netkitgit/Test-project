package learnpackage;

public class TestExtAbsttract {

	public static void main(String[] args) {
		
		DogExtAbstract dog = new DogExtAbstract();
		CatExtAbstract cat = new CatExtAbstract();
		
		dog.walk("Park");
		dog.saySmth();
		
		cat.walk("Backyard");
		cat.saySmth();

	}

}
