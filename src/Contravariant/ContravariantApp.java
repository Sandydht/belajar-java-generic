package Contravariant;

import Generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Sandy");
        MyData<? super String> stringMyData = objectMyData;
        process(objectMyData);

        System.out.println(objectMyData.getData());
        System.out.println(stringMyData.getData());
    }

    public static void process(MyData<? super String> myData) {
        String value = (String) myData.getData();
        System.out.println(value);

        myData.setData("Sandy Dwi Handoko Trapsilo");
    }
}
