package learnpackage;

public abstract class AnimalAbstract {
	
	public abstract void saySmth();
	public abstract void eat();
	
	public void walk(String place) {
		System.out.println("I'm walking here: " + place);
	}

}
