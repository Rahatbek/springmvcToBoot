package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    private static volatile CarServiceImpl instance;

    private CarServiceImpl() {

    }

    public static CarServiceImpl getInstance() {
        synchronized (CarService.class) {
            if (instance == null) {
                instance = new CarServiceImpl();
            }
        }
        return instance;
    }

    @Override
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("toyota", "corolla", 10000));
        cars.add(new Car("toyota", "RAV4", 20000));
        cars.add(new Car("toyota", "camry", 18000));
        cars.add(new Car("toyota", "markX", 15000));
        cars.add(new Car("toyota", "avensis", 13000));
        return cars;
    }

    public List<Car> countCars(Integer n){
        if (n != 0 && n < 6) {
            List<Car> cars = getCars();
            List<Car> countCars = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                Car car = cars.get(i);
                countCars.add(car);
            }
            return countCars;
        } else
            return getCars();
    }
}
