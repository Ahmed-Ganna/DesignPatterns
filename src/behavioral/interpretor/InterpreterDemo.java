package behavioral.interpretor;

public class InterpreterDemo {

	static Expression buildInterpreterTree() {
		
		Expression terminal1 = new TerminalExpression("Lions");
		Expression terminal2 = new TerminalExpression("Tigers");
		Expression terminal3 = new TerminalExpression("Bears");

		Expression andExpression = new AndExpression(terminal1 , terminal2);
		Expression orExpression = new OrExpression(terminal3 , andExpression);



		return orExpression;

	}

	/**
	 * main method - build the interpreter and then interpret a specific
	 * sequence
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		//String context = "Lions";
		//String context = "Tigers";
		String context = "Bears";
		//String context = "Lions Tigers";
		//String context = "Lions Bears";
		//String context = "Tigers";

		Expression define = buildInterpreterTree();

		System.out.println(context + " is " + define.interpret(context));
	}
}
