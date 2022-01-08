package homework8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        createList(12, 4);

    }

    public static void createList(int start, int step){
        List<Integer> numberList = new ArrayList<>();
        int list_value = start;
        for (int i =0; i<10; i++){
            numberList.add(list_value);
            list_value = list_value + step;
        }
        System.out.println(numberList.toString());

        numberList.remove(0);
        numberList.remove(0);
        numberList.remove(numberList.size()-1);

        System.out.println(numberList.toString());
    }
}
