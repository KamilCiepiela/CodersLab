import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class JUnitSampleTest {

    @Test
    public void sampleStringTest() {
        String testString = "CodersLabJava";

        boolean condition = testString.startsWith("Co");
        System.out.println(condition);
        assertTrue(condition);
    }

    @Test
    public void sampleListTest() {
        List<Integer> list = Arrays.asList(1,2,3,4);
        assertEquals(4, list.size());
        assertEquals(Integer.valueOf(2), list.get(1));

    }

    @Test
    public void myClassTest() {
        String parameter = "Kamil";

        MyClass myClass = new MyClass(parameter);
        String sample = myClass.getSample();
        assertEquals(parameter + "sample", sample);

        System.out.println(sample);

    }


}
