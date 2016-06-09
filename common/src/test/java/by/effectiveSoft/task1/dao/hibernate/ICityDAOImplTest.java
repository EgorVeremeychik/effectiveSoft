package by.effectiveSoft.task1.dao.hibernate;

import by.effectiveSoft.task1.dao.ICityDAO;
import by.effectiveSoft.task1.entity.City;
import by.effectiveSoft.task1.entity.Road;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by EgorVeremeychik on 08.06.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:common-context.xml")
public class ICityDAOImplTest extends Assert {

    @Autowired
    private ICityDAO ICityDAO;

    @Test
    public void testRead() throws Exception {
        System.out.println(ICityDAO.read(2L));
    }

    @Test
    public void testReadAll() throws Exception {
        System.out.println(ICityDAO.readAll());
    }

    @Test
    public void testCreate() throws Exception {
        Set<Road> roadSet = new HashSet<>();
        Road road = new Road(4L,"qwe");
        Road road1 = new Road(5L,"aasd");
        roadSet.add(road);
        roadSet.add(road1);
        City a = new City();
        a.setCityName("Москва");
        a.setRoads(roadSet);
        ICityDAO.create(a);
    }

    @Test
    public void testUpdate() throws Exception {
        Set<Road> roadSet = new HashSet<>();
        Road road = new Road(4L,"qwe");
        Road road1 = new Road(5L,"aasd");
        roadSet.add(road);
        roadSet.add(road1);
        City a = new City();
        a.setCityName("йафавыв");
        a.setRoads(roadSet);
        ICityDAO.update(a);
    }

    @Test
    public void testDelete() throws Exception {
        ICityDAO.delete(9L);
    }
}