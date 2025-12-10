package Wildcard;

import core.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        print(new MyData<Integer>(100));
        print(new MyData<String>("Sandy"));
        print(new MyData<Boolean>(true));
    }

    public static void print(MyData<?> data) {
        System.out.println(data.getData());
    }
}
