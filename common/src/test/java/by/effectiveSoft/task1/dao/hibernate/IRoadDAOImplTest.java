package by.effectiveSoft.task1.dao.hibernate;

import by.effectiveSoft.task1.dao.IRoadDAO;
import by.effectiveSoft.task1.entity.City;
import by.effectiveSoft.task1.entity.Road;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;

/**
 * Created by EgorVeremeychik on 10.06.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:common-context.xml")
public class IRoadDAOImplTest extends Assert {

    @Autowired
    private IRoadDAO iRoadDAO;

    @Autowired
    private EntityManager entityManager;

    @Test
    public void testCreate() throws Exception {
        City city = new City();
        city.setCityId(1L);
        entityManager.persist(city);

        Road road1 = new Road();
        road1.setCity(city);

        entityManager.persist(road1);
        Road road = new Road("A1");
        iRoadDAO.create(road);
    }

    @Test
    public void testRead() throws Exception {

    }

    @Test
    public void testReadAll() throws Exception {

    }
}