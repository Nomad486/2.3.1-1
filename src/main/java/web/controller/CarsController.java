package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.CarService;
import web.services.CarServiceImpl;

import java.util.Objects;

@Controller
public class CarsController {

    private CarServiceImpl carServiceImpl;

    public CarsController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping(value = "/cars")
    public String cars (@RequestParam(value = "count" , defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carServiceImpl.cars(count));
        return "cars";
    }
}
