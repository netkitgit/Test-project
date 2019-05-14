package learnpackage;

public class DogExtAbstract extends AnimalAbstract{

	@Override
	public void saySmth() {
		System.out.println("Gav!");		
	}

	@Override
	public void eat() {
		System.out.println("I like bones!");
	}
	
	public void  sit() {
		System.out.println("I'm sitting!");
	}

}
