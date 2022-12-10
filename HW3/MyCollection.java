import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCollection implements Iterable<String> {

    List<String> collection;
    int index;

    @Override
    public Iterator<String> iterator() {

        Iterator<String> it = new Iterator<String>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < collection.size();
            }

            @Override
            public String next() {
                return collection.get(index++);
            }

        };
        return it;

    }


    public MyCollection(){
        collection = new ArrayList<>();
    }

    public void add(String value){
        this.collection.add(value);
    }

    public String get(int index){
        if(index < collection.size())
        return this.collection.get(index);
        else return "За границей массива!";
    }
}
