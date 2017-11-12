public class Main {
	//The idea is to associate a probability with any type of object
	private ProbabilityGenerator<Object> probabilityGenerator = new ProbabilityGenerator<>();
	
	public static void main(String[] args) {
		Main main = new Main();
		main.addElements();
		main.print();
	}
	
	public void addElements() {
		probabilityGenerator.addElementProbability(new Element("apple", 10), 10.0);
		probabilityGenerator.addElementProbability(new String("mango"), 30.0);
		probabilityGenerator.addElementProbability(new Element("orange", 60), 60.0);
	}
	
	public void print() {
		probabilityGenerator.printElements();
		probabilityGenerator.printProbability();
		probabilityGenerator.printCount();
	}
}