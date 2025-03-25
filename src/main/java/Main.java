import java.util.ArrayList;
import java.util.List;

public class Main {
    List<String> names = new ArrayList<>() {{
        add("Артем");
        add("Балван");
        add("Вошан");
        add("Гена");
        add("Дима");
        add("Ержан");
        add("Жан");
    }};

    public static int algorithmBinarySearch(String searchName,  List<String> listNames) {
        int start = 0;
        int end = listNames.size() - 1;
        int middle = (start + end) / 2;

        while (searchName.compareTo(listNames.get(middle))!=0){
            
        }


        return middle;
    }
}


