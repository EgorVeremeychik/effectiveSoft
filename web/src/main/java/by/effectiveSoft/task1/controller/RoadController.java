package by.effectiveSoft.task1.controller;

import by.effectiveSoft.task1.entity.Road;
import by.effectiveSoft.task1.service.IRoadService;
import by.effectiveSoft.task1.service.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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
        model.addAttribute("roadList", iRoadService.getCityRoadsById(cityId));
        model.addAttribute("cityId", cityId);
        return "cityMore";
    }

    @RequestMapping(value = "/addRoad")
    public String addRoad(Road road, HttpServletRequest request) throws ServiceException {
        //System.out.println(request.getParameter("cityIdId"));
        //Long roadId = iRoadService.create(road);
        //System.out.println(roadId);
        return "redirect:/cityRoads/{cityId}";
    }

    @RequestMapping(value = "/delete/{roadId}")
    public String deleteRoad(@PathVariable("roadId") Long roadId)throws ServiceException{
        iRoadService.delete(roadId);
        return "redirect:/city/";
    }

    @ModelAttribute("road")
    public Road getRoad() throws ServiceException {
        return new Road();
    }
}
