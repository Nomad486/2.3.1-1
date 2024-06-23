package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.Arrays;
import java.util.List;


@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> cars = Arrays.asList(
            new Car(1, "Car1", "White"),
            new Car(2, "Car2", "Black"),
            new Car (3, "Car3","Yellow"),
            new Car (4, "Car4", "Blue"),
            new Car (5, "Car5", "Red")
            );

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
