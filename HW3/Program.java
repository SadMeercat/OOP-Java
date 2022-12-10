import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program{
    public static void main(String[] args) {
        //#region
        //the 1st task
        // Создать метод, который принимает массив int и сортирует его по последней цифре. 
        // Используйте метод Arrays.sort. для его работы создайте свой компаратор. 
        // Имеется в виду последняя цифра в записи числа, например в числе 123, последння цифра 3. 
        // Надо сделать сортировку, которая учитывает только эту последнюю цифру в числе.
        List<String> myNumbers = new ArrayList<>();

        myNumbers.add("1");
        myNumbers.add("12");
        myNumbers.add("10");
        myNumbers.add("133");
        myNumbers.add("19");
        myNumbers.add("18");

        System.out.println(myNumbers);
        myNumbers.sort(new MyComporator());
        System.out.println(myNumbers);

//#endregion
        System.out.println("-----------------------------------------");
        //#region
        //the 2nd task
        // Создайте класс, который представляет из себя коллекцию, добавьте 2 метода add и get для работы 
        // с коллекцией. Реализуйте возможность использования цикла for-each для работы с 
        // данной коллекцией. Для этого реализуйте интерфейс Iterable и создайте итератор

        MyCollection collection = new MyCollection();
        collection.add("123");
        collection.add("243");
        collection.add("546");
        collection.add("890");

        collection.get(2);
        collection.get(4);
        collection.get(8);

        for (var string : collection) {
            System.out.println(string);
        }
        //#endregion
    }
}