package cli;

import library.ExpEval;

public class ExpEvalMain {
    public static void main(String[] args) {
        ExpEval expEval = new ExpEval();
        System.out.println(args[0]);
        double result = expEval.evaluator(args[0]);
        System.out.println(result);

    }
}

