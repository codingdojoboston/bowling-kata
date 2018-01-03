package codingdojo.scrumorg;

public class Bowling {
	public static int playGame(String input) {
		int score = 0;
		for (Character c: input.toCharArray()) {
			if (!c.equals('-')) {
				score = score + Integer.parseInt(c.toString());
			}
		}
		return score;
	}
}
