package library;

import org.junit.Assert;
import org.junit.Test;

public class ExpEvalTest {
    @Test
    public void evaluater_should_add_one_and_two_result_three(){
        int expected = 3;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("1 + 2");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void evaluater_should_substract_four_from_eight(){
        int expected = 4;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("8 - 4");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void evaluater_should_multiply_four_from_eight(){
        int expected = 32;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("8 * 4");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void evaluater_should_divide_eight_from_four(){
        int expected = 2;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("8 / 4");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void evaluater_should_square_from_four(){
        int expected = 256;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("4 ^ 4");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void evaluater_should_add_three_operand_and_two_operator(){
        int expected = 4;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("5 - 4 + 3");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void multiply_two_three_and_four_get_result_twenty_four(){
        int expected = 24;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("2 * 3 * 4");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void multiply_two_three_and_substract_get_result_twenty_four(){
        int expected = 2;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("2 * 3 - 4");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void divide_two_by_three_and_subtract_four_from_result(){
        int expected = -4;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("2 / 3 - 4");
        Assert.assertEquals(expected,actual);
    }
}
