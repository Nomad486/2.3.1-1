package web.services;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    public List<Car> cars(int count) {
        List<Car> cars = Arrays.asList(

        new Car(1, "Car1", "White"),
        new Car(2, "Car2", "Black"),
        new Car(3, "Car3", "Blue"),
        new Car(4, "Car4", "Yellow"),
        new Car(5, "Car5", "Green")
        );

    return cars.subList(0, Math.min(count, cars.size()));
    }
}
