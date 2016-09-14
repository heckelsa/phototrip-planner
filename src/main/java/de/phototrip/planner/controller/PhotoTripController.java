package de.phototrip.planner.controller;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
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
        return "Greetings from this trip.";
    }
}
