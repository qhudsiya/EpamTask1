package calc.calci1;

/**
 * Hello world!
 *
 */
public class App 
{
    public int addition(int a,int b)
    {
        return a+b;
    }
    public int subtraction(int a,int b)
    {
    	if(a>=b)
        return a-b;
    	else
    		return b-a;
    }
    public int multiplication(int a,int b)
    {
        return a*b;
    }
    public int division(int a,int b)
    {
    	if(b>a || b==0)
        return -1;
    	else
    		return a/b;
    }
}
