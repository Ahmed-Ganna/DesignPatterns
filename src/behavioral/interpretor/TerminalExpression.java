package behavioral.interpretor;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression{

    String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpret(String str) {
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            String test = st.nextToken();
            if (test.equals(data)) {
                return true;
            }
        }
        return false;
    }
}
