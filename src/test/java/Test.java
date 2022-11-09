import HW21.ArrayAvverage;
import HW21.DblArray;

import static org.junit.Assert.assertEquals;

public class Test {

    @org.junit.Test
    public void testAvverage(){
        ArrayAvverage arra1 = new ArrayAvverage(new int[]{3,3,3,3});

        double actual = arra1.info();
        double expectedresult = 3;
        assertEquals(expectedresult, actual, 0);


    }
    @org.junit.Test
    public void TestDblArray(){
        DblArray dblarr = new DblArray(new int [3][3]);
        dblarr.checkArrays();
        String expectedResult = "Kvadrat";
        assertEquals(expectedResult, "Kvadrat");
    }
}
