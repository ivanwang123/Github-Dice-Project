import java.util.ArrayList;

public class Die {

	ArrayList<Integer> die = new ArrayList<>();

	public Die() {
		for(int i = 1; i <= 6; i++)
			die.add(i);
	}

	public Die(int sides) {
		for(int i = 1; i <= sides; i++)
			die.add(i);
	}
}