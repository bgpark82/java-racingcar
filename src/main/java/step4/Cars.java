package step4;

import java.util.ArrayList;
import java.util.List;

public class Cars {


    public Cars(String names) {

    }

    public boolean equals(Object o) {
        Cars c = (Cars) o;
        return getClass().equals(c.getClass());
    }

    public List<Car> split(String names) {
        String[] list = names.split(",");
        List<Car> cars = new ArrayList<>();
        for(int i = 0; i < list.length; i++){
            cars.add(Car.of(list[i]));
        }
        return cars;
    }
}
