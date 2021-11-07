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
    }

    ;

    @BeforeMethod
    @Override
    public void fillArray2() {
        System.out.println("Содержимое arrayList2: ");
        for (int i = 0; i < 5; i++) {
            list2.add(i, list1.get(i).toString());
            System.out.println(list2.get(i));
        }
    }

    ;

    @Test
    public void test1() {
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list1.size(); j++) {
                if (list1.get(i).toString().equals(list2.get(j)) == true) {
                    System.out.println("Элемент " + i +
                            " ArrayList1 равен элементу " + j + " ArrayList2.");
                }
            }
        }
    }
}

