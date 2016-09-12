package de.phototrip.planner.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhotoTripController {

    @RequestMapping("/")
    public String index(){
        return "Greetings from this trip.";
    }
}
