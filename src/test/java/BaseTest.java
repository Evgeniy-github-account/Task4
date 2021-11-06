import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class BaseTest implements PrepareTestData {
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList(list1);

    @BeforeMethod
    @Override
    public void fillArray1() {
        System.out.println("Содержимое arrayList1: ");
        for (int i = 0; i < 5; i++) {
            list1.add(i, i + 1);
            System.out.println(list1.get(i));
        }
    };
    @BeforeMethod
    @Override
    public void fillArray2() {
        System.out.println("Содержимое arrayList2: ");
        for (int i = 0; i < 5; i++) {
            list2.add(i, list1.get(i).toString());
            System.out.println(list2.get(i));
        }
    };

    @Test
    public void test1() {
        Assert.assertEquals(list2,list1);
    }
}

