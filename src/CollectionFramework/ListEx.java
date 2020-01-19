package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
            cars.add("BMW");
            cars.add("toyota");
            cars.add("nissan");
             cars.add("civic");
        System.out.println(cars);
        cars.add("tasla");
        System.out.println(cars);
   cars.add("honda");
        System.out.println(cars);
        for (String car : cars){
            System.out.println(car);
        }

    }
}
