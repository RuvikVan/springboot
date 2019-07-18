package com.frame.springboot.controller;

import com.frame.springboot.model.City;
import com.frame.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author van
 */
@RequestMapping(value = "/hello")
@RestController
public class HelloWorld {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/world", method = RequestMethod.GET)
    public String world(){


        City city = new City();

        city.setName("qwe");

        cityService.save(city);

        return "qwe";

    }
}
