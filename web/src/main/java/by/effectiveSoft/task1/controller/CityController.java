package by.effectiveSoft.task1.controller;

import by.effectiveSoft.task1.entity.City;
import by.effectiveSoft.task1.service.ICityService;
import by.effectiveSoft.task1.service.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Egor.Veremeychik on 10.06.2016.
 */

@Controller
@RequestMapping("/city")
public class CityController {

    @Autowired
    ICityService iCityService;

    @RequestMapping(value = "/")
    public String index(Model model) throws ServiceException {
        //model.addAttribute("city", new City());
        return "cities";
    }

    @RequestMapping(value = "/addCity")
    public String addCity(City city) throws ServiceException {
        iCityService.create(city);
        return "redirect:/city/";
    }

    @RequestMapping(value = "/delete/{cityId}")
    public String deleteCity(@PathVariable("cityId") Long cityId, Model model)throws ServiceException{
        iCityService.delete(cityId);
        return "redirect:/city/";
    }

    @ModelAttribute("cityList")
    public List<City> getAllCity() throws ServiceException {
        return iCityService.getAll();
    }

    @ModelAttribute("city")
    public City getCity() throws ServiceException {
        return new City();
    }
}
