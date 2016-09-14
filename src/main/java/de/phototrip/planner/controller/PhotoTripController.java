package de.phototrip.planner.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PhotoTripController {

    @RequestMapping("/details")
    public String index(@RequestParam(value = "country", required = false, defaultValue = "Norway") String country,
                        Model model){
        model.addAttribute("country", country);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Greeting from ");
        stringBuilder.append(country);
        stringBuilder.append("! See you soon!");

        String returnvalue = stringBuilder.toString();
        return returnvalue;
    }
}
