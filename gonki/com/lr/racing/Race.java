package com.lr.racing;

public class Race {
	Car[] cars;
	int length;
	int counter_finish = 0;
	int[] result;

	// int distans_max =0;
	// int[] champions = new int[4];

	public Race(int length, Car[] cars) {
		this.length = length;
		this.cars = cars;
		this.result = new int[cars.length];
	}

	public void start() {

		while (counter_finish < cars.length) {

			for (int i = 0; i < cars.length; i++) {
				cars[i].move();
				result[i] = cars[i].position;
			}

			for (int i = 0; i < cars.length; i++) {
				if (result[i] >= length) { // cars[i].position
					counter_finish = counter_finish + 1;
					System.out.println(cars[i]
							+ " and has been finished and drinking white beer");
					System.out
							.println(" cars[i].position  " + cars[i].position);
					System.out.println(" counter_finish  " + counter_finish);
				}
			}

		}

		int champions_maxlength = 0;
		for (int i = 0; i < cars.length; i++) {
			if (cars[champions_maxlength].position < cars[i].position) {
				champions_maxlength = i;

			}
		}
		System.out.println(cars[champions_maxlength]);

	}
}