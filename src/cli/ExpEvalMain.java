package cli;

import library.ExpEval;

public class ExpEvalMain {
    public static void main(String[] args) {
        ExpEval expEval = new ExpEval();
        int result = expEval.addition(2, 3);

        System.out.println(result);

    }
}

