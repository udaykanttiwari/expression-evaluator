package library;

import java.util.ArrayList;
import java.util.List;

public class ExpEval {
    public double evaluator(String expression){
        List<Double> Operands = new ArrayList<Double>();
        expression = handleSpaces(expression);
        if (expression.contains("(")) {
            expression = evaluageParentheses(expression).trim();
            expression = handleSpaces(expression);
            if (expression.contains(")")) {

                int index = expression.indexOf(")");
                expression = expression.substring(0, index - 1);
            }
        }
        String[] elements = expression.split(" ");
        List<String> Operators = getOperatorsAndOperands(Operands, elements);
        return evaluate(Operands, Operators);
    }

    private List<String> getOperatorsAndOperands(List<Double> operands, String[] elements) {
        List<String> operators = new ArrayList<String>();

        for (String s : elements) {
            try {
                operands.add(Double.parseDouble(s));

            } catch (Exception ex) {
                operators.add(s);
            }
        }
        return operators;

    }

    private String evaluageParentheses(String expression) {
        double result = 0;
        List<Double> Operands = new ArrayList<Double>();
        if (expression.contains("(")) {
            int closeBracketIndex = 0;
            int openBracketIndex = 0;
            openBracketIndex = expression.indexOf("(");
            closeBracketIndex = expression.indexOf(")", closeBracketIndex);
            String innerExpression = expression.substring(openBracketIndex, closeBracketIndex + 1);
            String expressionWithoutBracktes = expression.substring(openBracketIndex + 1, closeBracketIndex);
            if (expressionWithoutBracktes.contains("(")) {
                int openBracketsIndex = expressionWithoutBracktes.indexOf("(");
                expressionWithoutBracktes = expressionWithoutBracktes.substring(openBracketsIndex + 1, expressionWithoutBracktes.length());
            }
            String[] elements = expressionWithoutBracktes.split(" ");
            List<String> Operators = getOperatorsAndOperands(Operands, elements);
            result = evaluate(Operands, Operators);
            expression = expression.replace(innerExpression, " ".concat(Double.toString(result).concat(" ")));
            expression = evaluageParentheses(expression);

        }
        if (expression.contains(")")) {
            expression = expression.replaceAll("\\)", "");
        }
        return expression;
    }

    private double evaluate(List<Double> Operands, List<String> Operators) {
        for (int i = 0; i < Operators.size(); i++) {
            double first = Operands.get(i);
            double result = 0;
            double second = Operands.get(i + 1);
            if (Operators.get(i).contains("+"))
                Operands.set(i + 1, first + second);
            if (Operators.get(i).contains("-"))
                Operands.set(i + 1, first - second);
            if (Operators.get(i).contains("*"))
                Operands.set(i + 1, first * second);
            if (Operators.get(i).contains("/"))
                Operands.set(i + 1, first / second);
            if (Operators.get(i).contains("^")){
                Operands.set(i + 1, (double) Math.pow(first, second));
            }
        }
        double result = Operands.get(Operands.size() - 1);
        return result;
    }


    private String handleSpaces(String expression) {

        expression = expression.replaceAll(" +", "");
        expression = expression.replaceAll("\\+", " + ")
                .replaceAll("\\-", " - ")
                .replaceAll("/", " / ")
                .replaceAll("\\*", " * ")
                .replaceAll("\\^", " ^ ")
                .replaceAll("\\+   ", " + ")
                .replaceFirst("^ - ", "-").replaceAll("\\( - ", "(-")
                .replaceAll("\\+  - ", "- ").replaceAll("\\*  -", "*")
                .replaceFirst("^ -", "-").replaceAll(" -  - ", " + ")
                .replaceAll("\\^  - ","^ -");
        return expression;

    }

}
