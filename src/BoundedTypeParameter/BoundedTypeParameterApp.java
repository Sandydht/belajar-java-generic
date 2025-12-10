package BoundedTypeParameter;

import core.NumberData;

public class BoundedTypeParameterApp {
    public static void main(String[] args) {
        NumberData<Integer> integerNumberData = new NumberData<>(100);
        // NumberData<String> stringNumberData = new NumberData<>("Sandy"); // error

        System.out.println(integerNumberData.getData());
    }
}
