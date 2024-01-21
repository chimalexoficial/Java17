package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

    static <X> X doubleValue(X value) {
        return value;
    }

    static <X extends List> void duplicate(X list) {
        list.addAll(list);
    }

    //sum of any of the list
    static double sumOfNumberList(List<? extends Number> numbers) {
        double sum = 0.0;
        for(Number number:numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    static void addCoupleOfValues(List<? super Number> numbers) {
        numbers.add(1);
        numbers.add(1.0);
        numbers.add(1.0f);
        numbers.add(1l);
    }
    public static void main(String[] args) {
        List emptyList = new ArrayList<Number>();
        addCoupleOfValues(emptyList);
        System.out.println(emptyList);


        System.out.println(sumOfNumberList(List.of(1,2,3,4,5)));
        System.out.println(sumOfNumberList(List.of(1.1,1.2,1.3,1.4,1.5,5.1)));
        System.out.println(sumOfNumberList(List.of(1l,2l,3l)));
        String value1 = doubleValue(new String());
        Integer number1 = doubleValue(Integer.valueOf(5));
        ArrayList list1 = doubleValue(new ArrayList<>());

        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3));
        duplicate(numbers);
        System.out.println(numbers);

//        MyCustomList<String> list = new MyCustomList<>();
//        list.addElement("Element 1");
//        list.addElement("Element 2");
//        String value = list.get(0);

//        System.out.println(value);

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(5);
        list2.addElement(7);
        Integer number = list2.get(0);
        System.out.println(number);
    }
}
