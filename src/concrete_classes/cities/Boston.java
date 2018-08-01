package concrete_classes.cities;

import abstract_classes.cities.City;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);

	}

	@Override
	public double getAnnualTaxes() {

		return ((double) (population) * growthRate) + (population * 0.5);
	}

}
