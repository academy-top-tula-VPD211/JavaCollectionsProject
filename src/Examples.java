import java.util.ArrayList;
import java.util.Comparator;

public class Examples {
    public static void ArrayListIntegerExample(){
        ArrayList<Integer> array = new ArrayList<Integer>();
        int size = 10;

        for(int i = 0; i < size; i++)
            array.add(getRandom(100));
        arrayConsole(array);

        ArrayList<Integer> subArray = new ArrayList<>();
        for(int i = 0; i < size / 2; i++)
            subArray.add(getRandom(100));
        array.addAll(subArray);
        arrayConsole(array);

        System.out.println(array.contains(50));

        array.set(5, 1000);
        arrayConsole(array);

        array.sort(Comparator.naturalOrder());
        arrayConsole(array);
    }

    public static int getRandom(int max){
        return (int)(Math.random() * max);
    }

    public static <T> void arrayConsole(ArrayList<T> array){
//        for(int i = 0; i < array.size(); i++)
//            System.out.printf("%d ", array.get(i));

        array.forEach(item -> System.out.printf("%d ", item));
        System.out.println();
    }

    public static <T> void arrayConsoleLn(ArrayList<T> array){
        array.forEach(item -> System.out.println(item.toString()));
        System.out.println();
    }
}
