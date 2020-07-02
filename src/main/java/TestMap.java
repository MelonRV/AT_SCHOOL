import java.util.HashMap;

public class TestMap {

    public static void testMap() {
        System.out.println("Тест метода подсчета одинаковых элементов в HashMap," +
                " поиск производится по фамилии и имени: " +Map.countElementsInMap(" Ерохин", "Сергей"));

        HashMap<String, String> map2 = new HashMap<String, String>();
        map2.put("Ерохин", "Сергей ");
        map2.put("Ярмолов", "Алексей");
        map2.put("Карасев ", "Дмитрий");
        map2.put("Андреев", "Владимир");
        
    System.out.println("Тест метода удаления определенного элемента из HashMap: " + Map.deleteValueFromMap(map2, "Владимир"));
    }

}
