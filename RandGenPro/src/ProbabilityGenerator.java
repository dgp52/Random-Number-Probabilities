import java.util.ArrayList;
import java.util.List;

public class ProbabilityGenerator<T> {
	
	//Element can represent any object
	private List<T> elements = new ArrayList<>();
	//probability can represent any number (byte, double, float, integer, short, and long)
	private List<Number> probability = new ArrayList<>();
	private List<Integer> count = new ArrayList<>(); 
	
	public void addElementProbability(T element, Number probability) {
		addElement(element);
		addProbability(probability);
		addCount();
	}
	
	private void addProbability(Number t) {
		System.out.print(t.byteValue() + " , "); 
		System.out.print(t.shortValue()+ " , "); 
		System.out.print(t.intValue()+ " , "); 
		System.out.print(t.longValue()+ " , "); 
		System.out.print(t.floatValue()+ " , "); 
		System.out.println(t.doubleValue()); 
		probability.add(t);
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
