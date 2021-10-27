package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class Cars {
    static List<Car> cars = List.of(
            new Car(1,"Toyota camry", 2000),
            new Car(2,"Mercedes amg 50", 20200),
            new Car(3,"Chevrolet spark II", 2007),
            new Car(4,"Toyota avensis", 3090),
            new Car(5,"Lexus 570", 2009)
    );


    @GetMapping
    public String helloPage(@RequestParam(value = "name", required = false) String name, Model model) {
        model.addAttribute("cars", cars);
        return "cars";
    }


    @GetMapping("/cars")
    public  String getCars(@RequestParam(value = "count",required = false)int count,Model model ) {
        List<Car> carList = new ArrayList<>();
        if (count > 5) {
            model.addAttribute("cars", cars);
        } else {
            for (int i = 0; i < count; i++) {
                carList.add(cars.get(i));
            }
            model.addAttribute("cars",carList);
        }
        return "cars";
    }
}