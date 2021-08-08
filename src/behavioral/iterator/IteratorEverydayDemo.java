package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IteratorEverydayDemo {

	public static void main(String[] args) {
		List<String>  list = new ArrayList<>();
		list.add("Ahmed");
		list.add("Mohamed");
		list.add("Alaa");


		for (String name : list) { // Implicit iterator
			System.out.println(name);
		}


		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()){
			String name = iterator.next();
			System.out.println(name);
			iterator.remove();
		}

		System.out.println(list.size());
	}
}
