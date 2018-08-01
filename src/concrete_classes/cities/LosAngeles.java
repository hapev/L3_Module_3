package concrete_classes.cities;

import abstract_classes.cities.City;

public class LosAngeles extends City {

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);

	}

	@Override
	public double getAnnualTaxes() {

		return ((double) population * (growthRate / 2));
	}

}
