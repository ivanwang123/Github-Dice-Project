public class Die {

	int sides = 6;
	int value = 1;

	public Die() {
		value = (int)(Math.random() * sides) + 1;
	}

	public Die(int sides) {
		this.sides = sides;
		value = (int)(Math.random() * sides) + 1;
	}

	public void roll() {
		value = (int)(Math.random() * sides) + 1;
	}

	public int getSides() {
		return sides;
	}

	public int getValue() {
		return value;
	}

	public String toString() {
		return "Number of sides: " + sides + ", Value: " + value;
	}
}