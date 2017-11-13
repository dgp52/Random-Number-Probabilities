public class Main {
	//The idea is to associate a probability with any type of object
	private ProbabilityGenerator<Object> pg = new ProbabilityGenerator<>();
	
	public static void main(String[] args) {
		Main main = new Main();
		main.addElements();
		main.getResults();
		main.print();
	}
	
	public void getResults() {
		pg.sumAndPick();
	}
	
	public void addElements() {
		pg.addElementProbability(new Element("apple", 10), -10.0);
		pg.addElementProbability(new String("mango"), 30.0);
		pg.addElementProbability(new Element("orange", 60), 90.0);
	}
	
	public void print() {
		pg.printElements();
		pg.printProbability();
		pg.printCount();
		//pg.printProbabilitySum();
	}
}