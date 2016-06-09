package by.effectiveSoft.task1.service.impl;

import by.effectiveSoft.task1.entity.City;
import by.effectiveSoft.task1.entity.Road;
import by.effectiveSoft.task1.service.ICityService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Egor.Veremeychik on 09.06.2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:common-context.xml")
public class CityServiceImplTest extends Assert {

    @Autowired
    private ICityService iCityService;

    @Test
    public void testCreate() throws Exception {
        Set<Road> roadSet = new HashSet<>();
        Road road2 = new Road(4L,"qwe");
        Road road3 = new Road(5L,"aasd");
        roadSet.add(road2);
        roadSet.add(road3);
        City a = new City("Паричи",roadSet);
        iCityService.create(a);
    }

    @Test
    public void getById() throws Exception {
        System.out.println(iCityService.getById(1L));
    }

}