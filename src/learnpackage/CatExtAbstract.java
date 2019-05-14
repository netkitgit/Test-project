package learnpackage;

public class CatExtAbstract extends AnimalAbstract{

	@Override
	public void saySmth() {		
		System.out.println("Mew!");		
	}

	@Override
	public void eat() {
		System.out.println("I like milk!");		
	}

}
