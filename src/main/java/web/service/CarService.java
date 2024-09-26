package web.service;

import org.springframework.stereotype.Service;
import web.entity.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CarService {

    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "black", 2014));
        cars.add(new Car("BMW", "yellow", 2004));
        cars.add(new Car("Rolls", "white", 2023));
        cars.add(new Car("Lada", "blue", 2016));
        cars.add(new Car("PojoCat", "gray", 1901));
    }


    public List<Car> getCars(int count) {
        if (count <= 0) return Collections.emptyList();
        if (count >= cars.size()) return cars;
        else return cars.subList(0, count);
    }

}
