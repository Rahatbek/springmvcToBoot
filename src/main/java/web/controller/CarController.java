package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

//    @GetMapping("cars")
//    public String getCars(Model model) {
//        model.addAttribute("cars", CarServiceImpl.getInstance().getCars());
//        return "cars";
//    }

    @GetMapping("cars")
    public String getCountCars(Model model, @RequestParam(value = "count", required = false, defaultValue = "0") Integer count) {
        List<Car> cars = CarServiceImpl.getInstance().countCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
