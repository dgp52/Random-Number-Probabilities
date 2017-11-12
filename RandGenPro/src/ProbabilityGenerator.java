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
	
	public void addElementProbability(T element, Double probability) {
		addElement(element);
		addProbability(probability);
		addCount();
	}
	
	private void addProbability(Double d) {
		if (d < 0) {
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
		 while(count.get(0) < 1000) {
			 Random random = new Random();
			 double randDouble = probabilitySum * random.nextDouble();
			 randDouble = 0.0;
			 double sum = 0;
			 int index = 0;
			 while(sum < randDouble) {
				 sum = sum + probability.get(index++);
			 }
			 int temp = Math.max(0, index-1);
			 count.set(temp, count.get(temp)+1);
		 }
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
	
	public void printProbabilitySum() {
		System.out.print(probabilitySum);
	}
}