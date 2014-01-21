package library;

import org.junit.Assert;
import org.junit.Test;

public class ExpEvalTest {
    @Test
    public void add_one_two(){
        int expected = 3;
        ExpEval exp_eval = new ExpEval();
        int actual = exp_eval.addition(1,2);
        Assert.assertEquals(expected,actual);
    }
}
