package library;

import java.util.ArrayList;
import java.util.List;

public class ExpEval {

    public int evaluator(String expression) {
        String[] elements = expression.split(" ");
        List<Integer> Operands = new ArrayList<Integer>();
        List<String> Operators = getOperatorsAndOperands(Operands, elements);
        return evaluate(Operands, Operators);
    }

    private List<String> getOperatorsAndOperands(List<Integer> operands, String[] elements) {
        List<String> operators = new ArrayList<String>();
        for (String s : elements) {
            try {
                operands.add(Integer.parseInt(s));
            } catch (Exception ex) {
                operators.add(s);
            }
        }
        return operators;

    }

    private int evaluate(List<Integer> Operands, List<String> Operators) {
        int first = Operands.get(0);
        int result = 0;
        int second = Operands.get(1);
        if (Operators.contains("+"))
            result = first + second;
        if (Operators.contains("-"))
            result = first - second;
        if (Operators.contains("*"))
            result = first * second;
        if (Operators.contains("/"))
            result = first / second;
        if (Operators.contains("^"))
            result = (int)Math.pow(first,second);

        return result;
    }
}
