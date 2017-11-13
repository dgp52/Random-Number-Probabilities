import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProbabilityGenerator<T> {
	
	//Element can represent any object
	private List<T> elements = new ArrayList<>();
	//Probability is represented as double
	private List<Double> probability = new ArrayList<>();
	private List<Integer> count = new ArrayList<>(); 
	private double probabilitySum = 0;
	private final int COUNTER = 1000;
	
	
	public void addElementProbability(T element, Double probability) {
		addElement(element);
		addProbability(probability);
		addCount();
	}
	
	private void addProbability(Double d) {
		if (d < 0.0) {
			//Negative probability is converted to zero
			probability.add(0.0);
		} else {
			probability.add(d);
		}
	}
	
	private void addElement(T t) {
		elements.add(t);
	}
	
	public void sumAndPick() {
		sumProbability();
		pickAnElement();
	}
	
	private void sumProbability() {
		for(Double d : probability) {
			probabilitySum += d;
		}
	}
	
	private void pickAnElement () {
		int i = 0;
		 while(i < COUNTER) {
			 Random random = new Random();
			 double randDouble = probabilitySum * random.nextDouble();
			 double sum = 0;
			 int index = 0;
			 while(sum < randDouble) {
				 sum = sum + probability.get(index++);
			 }
			 int temp = Math.max(0, index-1);
			 count.set(temp, count.get(temp)+1);
			 i++;
		 }
	}
	
	private void addCount() {
		count.add(0);
	}
	
	public void printElements() {
		System.out.println("Elements: " + elements.toString());
	}
	
	public void printProbability() {
		System.out.println("Probability: " + probability.toString());
	}
	
	public void printCount() {
		System.out.println("Count: " + count.toString());
	}
	
	public void printProbabilitySum() {
		System.out.print("Sum: " + probabilitySum);
	}
}