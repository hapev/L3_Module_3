package concrete_classes.cities;

import abstract_classes.cities.City;

public class SanDiego extends City {

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);

	}

	@Override
	public double getAnnualTaxes() {

		return ((double) population * growthRate) + 1_000_000;
	}

}
