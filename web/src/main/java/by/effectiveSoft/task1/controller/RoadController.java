package by.effectiveSoft.task1.controller;

import by.effectiveSoft.task1.entity.City;
import by.effectiveSoft.task1.entity.Road;
import by.effectiveSoft.task1.service.IRoadService;
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
@RequestMapping("/road")
public class RoadController {

    @Autowired
    IRoadService iRoadService;

    @RequestMapping("/cityRoads/{cityId}")
    public String getCityRoads(@PathVariable("cityId") Long cityId, Model model) throws ServiceException {
        System.out.println(cityId);
        model.addAttribute("roadList", iRoadService.getCityRoadsById(cityId));
        return "cityMore";
    }
}
