package abstract_classes.farm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> list = new ArrayList<Animal>();
		for (int i = 0; i < 6; i++) {
			int randomNum = (int) (Math.random() * 4);
			if (randomNum == 0) {
				list.add(new Cow());
			}
			if (randomNum == 1) {
				list.add(new Pig());
			}
			if (randomNum == 2) {
				list.add(new Horse());
			}
			if (randomNum == 3) {
				list.add(new Chicken());
			}

		}
		for (Animal a : list) {
			a.makeNoise();
			a.die();
		}
	}
}
