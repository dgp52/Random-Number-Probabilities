
public class Element {
	private String name;
	private int probability;
	
	public Element(String name, int probability) {
		this.name = name;
		this.probability = probability;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getProbability() {
		return probability;
	}
	
	public void setProbability(int probability) {
		this.probability = probability;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
