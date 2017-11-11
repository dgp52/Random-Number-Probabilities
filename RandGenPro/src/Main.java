public class Main {
	//The idea is to associate a probability with any type of object
	private ProbabilityGenerator<Object> probabilityGenerator = new ProbabilityGenerator<>();
	
	public static void main(String[] args) {
		Main main = new Main();
		main.addElements();
		main.print();
	}
	
	public void addElements() {
		probabilityGenerator.addElementProbability(new String("deep"), -0.0005);
		probabilityGenerator.addElementProbability(new Element("apple", 10), -0xaf);
		probabilityGenerator.addElementProbability(new String("mango"), -10.5);
		probabilityGenerator.addElementProbability(new Element("orange", 90), -90);
	}
	
	public void print() {
		probabilityGenerator.printElements();
		probabilityGenerator.printProbability();
		probabilityGenerator.printCount();
	}
}
