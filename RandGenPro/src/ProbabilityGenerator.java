import java.util.ArrayList;
import java.util.List;

public class ProbabilityGenerator<T> {
	
	//Element can represent any object
	private List<T> elements = new ArrayList<>();
	//Probability is represented as double
	private List<Double> probability = new ArrayList<>();
	private List<Integer> count = new ArrayList<>(); 
	
	public void addElementProbability(T element, Double probability) {
		addElement(element);
		addProbability(probability);
		addCount();
	}
	
	private void addProbability(Double d) {
		probability.add(d);
	}
	
	private void addElement(T t) {
		elements.add(t);
	}
	
	private void addCount() {
		count.add(0);
	}
	
	public void printElements() {
		System.out.println(elements.toString());
	}
	
	public void printProbability() {
		System.out.println(probability.toString());
	}
	
	public void printCount() {
		System.out.println(count.toString());
	}
}