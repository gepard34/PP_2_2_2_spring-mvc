package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{
    private List<Car> cars;
    private static int CAR_COUNT;
    {
        cars = new ArrayList<>();
        cars.add(new Car(++CAR_COUNT, "Audi", "A6"));
        cars.add(new Car(++CAR_COUNT, "BMW", "530"));
        cars.add(new Car(++CAR_COUNT, "Lada", "2109"));
        cars.add(new Car(++CAR_COUNT, "Mercedes", "E300"));
        cars.add(new Car(++CAR_COUNT, "Toyota", "Camry"));
        cars.add(new Car(++CAR_COUNT, "Nissan", "Skyline"));
    }
    @Override
    public List<Car> index(Integer count) {
        if ((count == null) || (count > cars.size())) {
            return cars;
        } else {
            return cars.stream().limit(count).toList();
        }
    }


}
