package Covariant;

import core.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Sandy");
        process(stringMyData);
    }

    public static void process(MyData<? extends Object> data) {
        Object object = data.getData();
        System.out.println(object);
        // data.setData("Sandy"); // error (tidak boleh, karena berbahaya)
    }
}
