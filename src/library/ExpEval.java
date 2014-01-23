package library;

import java.util.ArrayList;
import java.util.List;

public class ExpEval {
    public int evaluator(String expression) {
        List<Integer> Operands = new ArrayList<Integer>();

        if (expression.contains("(")) {
            expression = evaluageParentheses(expression).trim();
            if(expression.contains(")")){
                int index= expression.indexOf(")");
                expression = expression.substring(0,index-1);
            }
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

    private String evaluageParentheses(String expression) {
        int result = 0;
        List<Integer> Operands = new ArrayList<Integer>();
        if (expression.contains("(")) {
            int closeBracketIndex = 0;
            int openBracketIndex = 0;
            openBracketIndex = expression.indexOf("(");
            closeBracketIndex = expression.indexOf(")",closeBracketIndex);
            String innerExpression = expression.substring(openBracketIndex, closeBracketIndex + 1);
            String expressionWithoutBracktes = expression.substring(openBracketIndex + 1, closeBracketIndex);
            if(expressionWithoutBracktes.contains("(")){
                int openBracketsIndex= expressionWithoutBracktes.indexOf("(");
                expressionWithoutBracktes= expressionWithoutBracktes.substring(openBracketsIndex+1,expressionWithoutBracktes.length());
            }
            String[] elements = expressionWithoutBracktes.split(" ");
            List<String> Operators = getOperatorsAndOperands(Operands, elements);
            result = evaluate(Operands, Operators);
            expression = expression.replace(innerExpression, " ".concat(Integer.toString(result).concat(" ")));
            expression = evaluageParentheses(expression);

        }
        return expression;
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
