
import com.mycompany.lab9.Calculator;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jakub
 */
public class CalculatorTests {

    @Test
    public void add_for1and2_returns3() {
        int a = 1;
        int b = 2;
        int c = 3;

        Calculator calc = new Calculator();

        int result = calc.add(a, b);

        Assert.assertEquals(c, result);
    }

    @Test
    public void add_for1andN1_returns0() {
        int a = 1;
        int b = -1;
        int c = 0;

        Calculator calc = new Calculator();

        int result = calc.add(a, b);

        Assert.assertEquals(c, result);
    }

    @Test
    public void sub_for2and1_returns1() {
        int a = 2;
        int b = 1;
        int c = 1;

        Calculator calc = new Calculator();

        int result = calc.sub(a, b);

        Assert.assertEquals(c, result);
    }

    @Test
    public void sub_for1and2_returnsN1() {
        int a = 1;
        int b = 2;
        int c = -1;

        Calculator calc = new Calculator();

        int result = calc.sub(a, b);

        Assert.assertEquals(c, result);
    }

    @Test
    public void sub_forN1andN2_returns1() {
        int a = -1;
        int b = -2;
        int c = 1;

        Calculator calc = new Calculator();

        int result = calc.sub(a, b);

        Assert.assertEquals(c, result);
    }

    @Test
    public void sub_for1and1_returns0() {
        int a = 1;
        int b = 1;
        int c = 0;

        Calculator calc = new Calculator();

        int result = calc.sub(a, b);

        Assert.assertEquals(c, result);
    }


    @Test()
    public void div_for1and0_throwsEx() {
        int a = 1;
        int b = 0;

        Calculator calc = new Calculator();

        calc.div(1, 0);
    }
}
