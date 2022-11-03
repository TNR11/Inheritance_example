package task_6;

public class LeafyGreen extends Vegetable {
	private String type;
	public LeafyGreen(double weight, double price, String type) {//parameterised contructor with three parameters.
		super (weight, price);
		this.setType(type);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
