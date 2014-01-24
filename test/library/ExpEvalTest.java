package library;

import org.junit.Assert;
import org.junit.Test;

public class ExpEvalTest {
    @Test
    public void evaluater_should_add_one_and_two_result_three() {
        int expected = 3;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("1 + 2");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void evaluater_should_substract_four_from_eight() {
        int expected = 4;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("8 - 4");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void evaluater_should_multiply_four_from_eight() {
        int expected = 32;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("8 * 4");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void evaluater_should_divide_eight_from_four() {
        int expected = 2;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("8 / 4");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void evaluater_should_square_from_four() {
        int expected = 256;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("4 ^ 4");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void evaluater_should_add_three_operand_and_two_operator() {
        int expected = 4;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("5 - 4 + 3");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiply_two_three_and_four_get_result_twenty_four() {
        int expected = 24;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("2 * 3 * 4");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiply_two_three_and_substract_get_result_twenty_four() {
        int expected = 2;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("2 * 3 - 4");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divide_two_by_three_and_subtract_four_from_result() {
        int expected = -4;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("2 / 3 - 4");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void add_two_and_three_with_single_parentheses() {
        int expected = 5;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("(2 + 3)");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void subtract_two_and_three_with_single_parentheses() {
        int expected = -1;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("(2 - 3)");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiply_two_and_three_with_single_parentheses() {
        int expected = 6;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("(2 * 3)");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void add_two_and_three_and_five_and_six_with_multiple_parentheses() {
        int expected = 13;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("(2 + 3)+(5 + 3)");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void substract_two_and_three_and_add_five_and_six_with_multiple_parentheses() {
        int expected = 7;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("(2 - 3)+(5 + 3)");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiply_two_and_three_and_add_five_and_six_with_multiple_parentheses() {
        int expected = 14;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("(2 * 3)+(5 + 3)");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divide_two_and_three_and_add_five_and_six_with_multiple_parentheses() {
        int expected = 8;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("(2 / 3)+(5 + 3)");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void evaluate_two_to_power_three() {
        int expected = 8;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("(2 ^ 3)");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void evaluate_expression_with_nested_parentheses() {
        int expected = 10;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("((2 + 3)+(1 * 5))");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiply_two_and_three_and_multiply_one_and_five_with_nested_brackets() {
        int expected = 30;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("((2 * 3)*(1 * 5))");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divide_5_from_2_with_nested_parentheses() {
        int expected = 2;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("((5 / 2))");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void validate_user_input() {
        int expected = 0;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("((5 / 2)");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void evaluator_should_take_minus_two_and_plus_eight_and_should_give_answer_six() {
        int expected = 10;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("2+8");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void evaluate_expression_with_negative_values() {
        int expected = 6;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("-2+8");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void evaluate_expression_minus_eight() {
        int expected = -8;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("(-8)");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void evaluate_expression_plus_five(){
        int expected = 8;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("(+8)");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void evaluate_expression_five_plus_minus_three(){
        int expected = 2;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("5+(-3)");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void evaluate_expression_multiply_five_with_three(){
        int expected = 15;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.evaluator("5*(-3)");
        Assert.assertEquals(expected, actual);
    }

}
