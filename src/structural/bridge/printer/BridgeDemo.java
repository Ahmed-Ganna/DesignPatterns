package structural.bridge.printer;

public class BridgeDemo {

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setClassification("Action");
		movie.setTitle("John Wick");
		movie.setRuntime("2:15");
		movie.setYear("2014");

		Formatter formatter = new PrintFormatter();

		Printer printer = new MoviePrinter(movie);

		System.out.print(printer.print(formatter));

	}

}