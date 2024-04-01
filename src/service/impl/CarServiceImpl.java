package service.impl;

import dao.CarDao;
import dao.daoImpl.CarDaoImpl;
import model.Car;
import service.CarService;

import java.util.List;

public class CarServiceImpl implements CarService {
    CarDao carDao = new CarDaoImpl();

    @Override
    public void saveCar(Long id, Car car) {
        carDao.saveCar(id, car);
    }

    @Override
    public List<Car> getCarByPersonId(Long id) {
        return carDao.getCarByPersonId(id);
    }

    @Override
    public Car getCarById(Long id) {
        return carDao.getCarById(id);
    }

    @Override
    public void updateCarById(Long id,Car car) {
        carDao.updateCarById(id, car);
    }

    @Override
    public String deleteCarById(Long id) {
        return carDao.deleteCarById(id);
    }
}
