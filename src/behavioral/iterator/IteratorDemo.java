package behavioral.iterator;


public class IteratorDemo {

	public static void main(String[] args) {
		BikeRepository repository = new BikeRepository();
		repository.addBike("Bike1");
		repository.addBike("Bike2");
		repository.addBike("Bike3");

		for (String bike :
				repository) {
			System.out.println(bike);
		}
	}
}
