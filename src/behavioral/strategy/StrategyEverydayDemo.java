package behavioral.strategy;


import java.util.*;

public class StrategyEverydayDemo {



	private static void printContents(List<Person> people) {
		for (Person person : people) {
			System.out.println(person.getName());
		}
	}

	public static void main(String args[]) {
		Person ahmed = new Person("Ahmed","3233212",20);
		Person mohamed = new Person("Mohamed","32223323212",50);
		Person alaa = new Person("Bahaa","3565775",40);

		List<Person> list = new ArrayList<>();
		list.add(ahmed);
		list.add(mohamed);
		list.add(alaa);

		System.out.println("Not sorted");
		printContents(list);

		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getAge() > o2.getAge()){
					return 1;
				}else if (o1.getAge() < o2.getAge()){
					return -1;
				}else {
					return 0;
				}
			}
		});

		System.out.println("Sorted by age");
		printContents(list);

		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		System.out.println("Sorted by name");
		printContents(list);


	}
}
