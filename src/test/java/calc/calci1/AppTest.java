package calc.calci1;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest 
{
   
    public void testAdd()
    {
        App a=new App();
        assertEquals(a,a.addition(4, 6));
        assertEquals(a,a.addition(87, 46));
    }

    public void testMul()
    {
        App a=new App();
        assertEquals(a,a.multiplication(4, 6));
        assertEquals(a,a.multiplication(17,4));
    }
    public void testDiv()
    {
        App a=new App();
        assertEquals(a,a.division(21,7));
        assertEquals(a,a.division(16,4));
    }
    public void testSub()
    {
        App a=new App();
        assertEquals(a,a.division(21,7));
        assertEquals(a,a.division(10,4));
    }
}
