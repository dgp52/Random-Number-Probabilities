import java.util.ArrayList;
import java.util.List;

public class ProbabilityGenerator<T> {
	
	private List<T> elements = new ArrayList<>();
	private List<T> probability = new ArrayList<>();
	
	public void addElementProbability(T element, T probability) {
		addElement(element);
		addProbability(probability);
	}
	
	public void printElements() {
		System.out.println(elements.toString());
	}
	
	public void printProbability() {
		System.out.println(probability.toString());
	}
	
	private void addProbability(T t) {
		probability.add(t);
	}
	
	private void addElement(T t) {
		elements.add(t);
	}
}
