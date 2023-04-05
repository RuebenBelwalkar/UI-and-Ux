package com.ani.boot.services;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.ani.boot.entity.Car;

@PropertySource("other.properties")
@PropertySource("myapp.yml")
@Service
public class CarService {

    @Value("${testing.accounts.ws}")
    private String website;

    @Value("${testing.accounts.mail}")
    private String mail;

    public void createNewCar(Long id, String make, String model) {

        
        Car car = new Car();
        car.setId(id);
        car.setMake(make);
        car.setModel(model);
        System.out.println(car.toString());
    }
}
