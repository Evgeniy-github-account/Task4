import org.testng.annotations.BeforeMethod;
import java.util.ArrayList;

public class BaseTest {
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList(list1);

    @BeforeMethod
    public void fillArray1() {
        System.out.println("Содержимое arrayList1: ");
        for (int i = 0; i < 5; i++) {
            list1.add(i, i + 1);
            System.out.println(list1.get(i));
        }
    };
    @BeforeMethod
    public void fillArray2() {
        System.out.println("Содержимое arrayList2: ");
        for (int i = 0; i < 5; i++) {
            list2.add(i, list1.get(i).toString());
            System.out.println(list2.get(i));
        }
    };

}
