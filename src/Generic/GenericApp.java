package Generic;

import core.MyData;
import core.Pair;
import util.ArrayHelper;

public class GenericApp {
    public static void main(String[] args) {
        MyData<String> myDataString = new MyData<String>("Sandy");
        MyData<Integer> myDataInteger = new MyData<Integer>(1);
        var myDataBoolean = new MyData<Boolean>(true);

        System.out.println(myDataString.getData());
        System.out.println(myDataInteger.getData());
        System.out.println(myDataBoolean.getData());

        Pair<String, Integer> pairStringInteger = new Pair<String, Integer>("Sandy", 28);

        System.out.println(pairStringInteger.getFirst());
        System.out.println(pairStringInteger.getSecond());

        String[] names = {"Sandy", "Dwi", "Handoko", "Trapsilo"};
        Integer[] values = {1, 2, 3, 4, 5};

        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.<Integer>count(values));
    }
}
