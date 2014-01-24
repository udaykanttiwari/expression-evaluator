package library;

import org.junit.Assert;
import org.junit.Test;

public class ExpEvalTest {
    @Test
    public void evaluater_should_add_one_and_two_result_three() {
        double expected = 3;
        ExpEval exp_eval = new ExpEval();

        double actual = exp_eval.evaluator("1 + 2");
        Assert.assertEquals(expected, actual,1);
    }

    @Test
    public void evaluater_should_substract_four_from_eight() {
        double expected = 4;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("8 - 4");
        Assert.assertEquals(expected, actual,1);
    }

    @Test
    public void evaluater_should_multiply_four_from_eight() {
        double expected = 32;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("8 * 4");
        Assert.assertEquals(expected, actual,1);
    }

    @Test
    public void evaluater_should_divide_eight_from_four() {
        double expected = 2;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("8 / 4");
        Assert.assertEquals(expected, actual,1);
    }

    @Test
    public void evaluater_should_square_from_four() {
        double expected = 256;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("4 ^ 4");
        Assert.assertEquals(expected, actual,1);
    }

    @Test
    public void evaluater_should_add_three_operand_and_two_operator() {
        double expected = 4;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("5 - 4 + 3");
        Assert.assertEquals(expected, actual,1);
    }

    @Test
    public void multiply_two_three_and_four_get_result_twenty_four() {
        double expected = 24;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("2 * 3 * 4");
        Assert.assertEquals(expected, actual,1);
    }

    @Test
    public void multiply_two_three_and_substract_get_result_twenty_four() {
        double expected = 2;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("2 * 3 - 4");
        Assert.assertEquals(expected, actual,1);
    }

    @Test
    public void divide_two_by_three_and_subtract_four_from_result() {
        double expected = -4;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("2 / 3 - 4");
        Assert.assertEquals(expected, actual,1);
    }

    @Test
    public void add_two_and_three_with_single_parentheses() {
        double expected = 5;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("(2 + 3)");
        Assert.assertEquals(expected, actual,1);
    }

    @Test
    public void subtract_two_and_three_with_single_parentheses() {
        double expected = -1;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("(2 - 3)");
        Assert.assertEquals(expected, actual,1);
    }

    @Test
    public void multiply_two_and_three_with_single_parentheses() {
        double expected = 6;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("(2 * 3)");
        Assert.assertEquals(expected, actual,1);
    }

    @Test
    public void add_two_and_three_and_five_and_six_with_multiple_parentheses() {
        double expected = 13;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("(2 + 3)+(5 + 3)");
        Assert.assertEquals(expected, actual,1);
    }

    @Test
    public void substract_two_and_three_and_add_five_and_six_with_multiple_parentheses() {
        double expected = 7;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("(2 - 3)+(5 + 3)");
        Assert.assertEquals(expected, actual,1);
    }

    @Test
    public void multiply_two_and_three_and_add_five_and_six_with_multiple_parentheses() {
        double expected = 14;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("(2 * 3)+(5 + 3)");
        Assert.assertEquals(expected, actual,1);
    }

    @Test
    public void divide_two_and_three_and_add_five_and_six_with_multiple_parentheses() {
        double expected = 8;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("(2 / 3)+(5 + 3)");
        Assert.assertEquals(expected, actual,1);
    }

    @Test
    public void evaluate_two_to_power_three() {
        double expected = 8;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("(2 ^ 3)");
        Assert.assertEquals(expected, actual,1);
    }

    @Test
    public void evaluate_expression_with_nested_parentheses() {
        double expected = 10;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("((2 + 3)+(1 * 5))");
        Assert.assertEquals(expected, actual,1);
    }

    @Test
    public void multiply_two_and_three_and_multiply_one_and_five_with_nested_brackets() {
        double expected = 30;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("((2 * 3)*(1 * 5))");
        Assert.assertEquals(expected, actual,1);
    }

    @Test
    public void divide_5_from_2_with_nested_parentheses() {
        double expected = 2;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("((5 / 2))");
        Assert.assertEquals(expected, actual,1);
    }

    @Test
    public void validate_user_input() {
        double expected = 0;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("((5 / 2)");
        Assert.assertEquals(expected, actual,1);
    }

    @Test
    public void evaluator_should_take_minus_two_and_plus_eight_and_should_give_answer_six() {
        double expected = 10;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("2+8");
        Assert.assertEquals(expected, actual,1);
    }
    @Test
    public void evaluate_expression_with_negative_values() {
        double expected = 6;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("-2+8");
        Assert.assertEquals(expected, actual,1);
    }
    @Test
    public void evaluate_expression_minus_eight() {
        double expected = -8;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("(-8)");
        Assert.assertEquals(expected, actual,1);
    }
    @Test
    public void evaluate_expression_plus_five(){
        double expected = 8;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("(+8)");
        Assert.assertEquals(expected, actual,1);
    }
    @Test
    public void evaluate_expression_five_plus_minus_three(){
        double expected = 2;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("5+(-3)");
        Assert.assertEquals(expected, actual,1);
    }
    @Test
    public void evaluate_expression_multiply_five_with_three(){
        double expected = 15;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("5*(-3)");
        Assert.assertEquals(expected, actual,1);
    }
    @Test
    public void evaluate_shold_give_false_when_brackets_or_not_same(){
        double expected = 0;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("5*(-3");
        Assert.assertEquals(expected, actual,1);
    }
    @Test
    public void add_two_and_three_double_values(){
        double expected = 5.0;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("2.0 + 3.0");
        Assert.assertEquals(expected, actual,1);
    }
    @Test
    public void multiply_two_double_values(){
        double expected = 6.0;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("2.0*3.0");
        Assert.assertEquals(expected, actual,1);
    }
    @Test
    public void divide_twenty_two_by_three(){
        double expected = 7.333333333;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("22.0/3.0");
        Assert.assertEquals(expected, actual,1);
    }
    @Test
    public void subtract_one_point_two_five_with_its_own(){
        double expected = 0.0;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("1.25 - 1.25");
        Assert.assertEquals(expected, actual,1);
    }
    @Test
    public void subtract_minus_one_minus_one(){
        double expected = -2.0;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("-1-1");
        Assert.assertEquals(expected, actual,1);
    }
    @Test
    public void evaluate_twenty_two_plus(){
        double expected = 22.0;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("22+");
        Assert.assertEquals(expected, actual,1);
    }
    @Test
    public void evaluate_twenty_two_asterisk(){
        double expected = 22.0;
        ExpEval exp_eval = new ExpEval();
        double actual = exp_eval.evaluator("22*");
        Assert.assertEquals(expected, actual,1);
    }
}
