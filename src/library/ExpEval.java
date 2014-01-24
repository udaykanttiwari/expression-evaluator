package library;

import com.sun.org.apache.regexp.internal.recompile;

import java.util.ArrayList;
import java.util.List;

public class ExpEval {
    public int evaluator(String expression) {
        List<Integer> Operands = new ArrayList<Integer>();
        if (0 == compareParentheses(expression)) {
            System.out.println("wrong input");
            return 0;
        }
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


        if (expression.contains("("))

        {
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
            expression = expression.replace(innerExpression, " ".concat(Integer.toString(result).concat(" ")));
            expression = evaluageParentheses(expression);

        }
        if (expression.contains(")")) {
            expression = expression.replaceAll("\\)", "");
        }
        return expression;
    }

    private int evaluate(List<Integer> Operands, List<String> Operators) {
        if (Operands.size() < 2)
            return Operands.get(0);
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

    public int compareParentheses(String expression) {
        int openBracketsCount = 0;
        int closeBracketsCount = 0;
        String[] elements = expression.split("");
        for (String element : elements) {
            if (element.contains("(")) {
                openBracketsCount++;
            }
            if (element.contains(")")) {
                closeBracketsCount++;
            }
        }
        if (openBracketsCount == closeBracketsCount)
            return 1;
        return 0;

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
                .replaceAll("\\+  - ", "- ");
        System.out.println(expression);
        return expression;
    }

}
