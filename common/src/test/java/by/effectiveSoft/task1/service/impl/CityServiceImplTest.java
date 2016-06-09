package by.effectiveSoft.task1.service.impl;

import by.effectiveSoft.task1.dao.ICityDAO;
import by.effectiveSoft.task1.service.ICityService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Egor.Veremeychik on 09.06.2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:common-context.xml")
public class CityServiceImplTest extends Assert {

    @Autowired
    private ICityService iCityService;

    @Test
    public void getById() throws Exception {
        System.out.println(iCityService.getById(1L));
    }

}