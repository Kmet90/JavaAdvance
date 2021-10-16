package ExercisesGenerics.GenericBoxOfInteger02;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    List<T> value;

    public Box(){
        this.value = new ArrayList<>();
    }
    public void add(T element){
        value.add(element);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T element : value){
            sb.append(String.format("%s: %s", element.getClass().getName()
                    ,element.toString())).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
