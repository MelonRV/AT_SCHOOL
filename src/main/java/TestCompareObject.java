import java.util.ArrayList;

public class TestCompareObject {

    public static  void testCO(){
        ArrayList<String>list =  new ArrayList<String>();
        ArrayList<Integer>list1 = new ArrayList<Integer>();

        System.out.println("Тест метода сравнения объектов: " + CompareObjects.compare(list,list1));
        System.out.println("Тест метода перевода объектов в строку и сравнивнения: " + CompareObjects.compareHashCode(list,list1));
        System.out.println("Тест метода сравнивнения хэш-кодов объектов: " + CompareObjects.compareToString(list,list1));
    }
}
