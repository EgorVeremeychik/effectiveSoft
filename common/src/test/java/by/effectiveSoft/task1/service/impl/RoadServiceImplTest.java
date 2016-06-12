package by.effectiveSoft.task1.service.impl;

import by.effectiveSoft.task1.entity.Road;
import by.effectiveSoft.task1.service.IRoadService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by EgorVeremeychik on 10.06.2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:common-context.xml")
public class RoadServiceImplTest extends Assert {

    @Autowired
    private IRoadService iRoadService;

    @Test
    public void testCreate() throws Exception {
        Road road = new Road();
        road.setRoadName("A1");
        iRoadService.create(road);
    }

    @Test
    public void testGetById() throws Exception {
        System.out.println(iRoadService.getById(1L));
    }

    @Test
    public void testGetCityRoadsById() throws Exception {
        List<Road> roads = iRoadService.getCityRoadsById(3L);
        System.out.println(roads);
    }
}