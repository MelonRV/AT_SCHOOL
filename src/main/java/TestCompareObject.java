import java.util.ArrayList;

public class TestCompareObject {

    public static  void testCO(){
        ArrayList<String>list =  new ArrayList<String>();
        ArrayList<Integer>list1 = new ArrayList<Integer>();

        System.out.println(CompareObjects.compare(list,list1));
        System.out.println(CompareObjects.compareHashCode(list,list1));
        System.out.println(CompareObjects.compareToString(list,list1));
    }
}
