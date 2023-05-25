package org.example.Collections;
import java.util.*;

public class GenericBox <T>{
    List<T> values;
    public GenericBox(){
        values = new ArrayList<T>();
    }
    public void add(T value){
        values.add(value);
    }
    public List<T> get () {
        return values;
    }
}
