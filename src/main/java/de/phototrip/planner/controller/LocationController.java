package de.phototrip.planner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;

@Controller
public class LocationController {

    @RequestMapping("/createLocation")
    public String index (@RequestParam(value = "id", required = true) int id,
                         @RequestParam(value = "name") String name,
                         @RequestParam(value = "description") String description,
                         @RequestParam(value = "coordinates") String coordinates,
                         @RequestParam(value = "priority") int priority,
                         @RequestParam(value = "picture") File picture){

        return "Erfolgreich eingetragen";
    }


}
