package library;

import java.util.ArrayList;
import java.util.List;

public class ExpEval {

    public int evaluator(String expression) {
        List<Integer> Operands = new ArrayList<Integer>();

        if (expression.contains("(")) {
            String expressionWithoutParenthesis = removeParentheses(expression);
            String[] elements = expressionWithoutParenthesis.split(" ");
            List<String> Operators = getOperatorsAndOperands(Operands, elements);
            return evaluate(Operands, Operators);
        }
        String[] elements = expression.split(" ");
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

    private String removeParentheses(String expression) {
        int startingIndexOfParentheses = expression.indexOf("(");
        int lastIndexOfParentheses = expression.indexOf(")");
        String expressionWithoutParenthesis = expression.substring(startingIndexOfParentheses + 1, lastIndexOfParentheses);
        return expressionWithoutParenthesis;
    }

    private int evaluate(List<Integer> Operands, List<String> Operators) {

        for (int i = 0; i < Operators.size(); i++) {
            int first = Operands.get(i);
            int result = 0;
            int second = Operands.get(i + 1);
            if (Operators.get(i).contains("+"))
                Operands.set(i + 1, first + second);
            if (Operators.get(i).contains("-"))
                Operands.set(i + 1, first - second);
            if (Operators.get(i).contains("*"))
                Operands.set(i + 1, first * second);
            if (Operators.get(i).contains("/"))
                Operands.set(i + 1, first / second);
            if (Operators.get(i).contains("^"))
                Operands.set(i + 1, (int) Math.pow(first, second));
        }
        int result = Operands.get(Operands.size() - 1);

        return result;
    }
}
