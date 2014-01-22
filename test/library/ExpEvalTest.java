package library;

import org.junit.Assert;
import org.junit.Test;

public class ExpEvalTest {
    @Test
    public void evaluate_should_evaluate_expression_and_should_give_result_three(){
        int expected = 3;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("1 + 2");
        Assert.assertEquals(expected,actual);
    }
}
