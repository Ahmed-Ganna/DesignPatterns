package behavioral.interpretor;

public class AndExpression implements Expression{

    private Expression exp1;
    private Expression exp2;

    public AndExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpret(String text) {
        return exp1.interpret(text) && exp2.interpret(text);
    }
}
