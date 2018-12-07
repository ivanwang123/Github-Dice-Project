public class DiceRunner {
	public static void main(String[] args) {
		//Test 1

		System.out.println("Test 1: ");

		DiceHolder diceHolder = new DiceHolder();
		Die die1 = new Die();
		Die die2 = new Die();
		diceHolder.addDie(die1);
		diceHolder.addDie(die2);

		boolean rolling = true;
		int rolls = 0;

		while(rolling) {
			rolls++;
			diceHolder.shake();
			System.out.println("Roll " + rolls + ":\n" + diceHolder);

			if (die1.getValue() == 1 && die2.getValue() == 1) {
				rolling = false;
			}
		}
		System.out.println("It took " + rolls + " rolls to get a snake eye");

		//Test 2
		System.out.println("\nTest 2");

		DiceHolder diceHolder2 = new DiceHolder();

		int full = 1;
		System.out.println("Die: ");
		while(full != -1) {
			int sides = (int)(Math.random() * 10) + 2;
			Die die = new Die(sides);
			full = diceHolder2.addDie(die);
			if (full != -1)
				System.out.println(die);
		}
		diceHolder2.shake();
		System.out.println("Die: \n" + diceHolder2);
	}
}