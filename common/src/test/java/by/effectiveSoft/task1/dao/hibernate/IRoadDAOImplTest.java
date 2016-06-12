package by.effectiveSoft.task1.dao.hibernate;

import by.effectiveSoft.task1.dao.IRoadDAO;
import by.effectiveSoft.task1.entity.Road;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by EgorVeremeychik on 10.06.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:common-context.xml")
public class IRoadDAOImplTest extends Assert {

    @Autowired
    private IRoadDAO iRoadDAO;

    @Test
    public void testCreate() throws Exception {
        Road road = new Road("A5");
        Long roadID = iRoadDAO.create(road);
        System.out.println(roadID);
    }

    @Test
    public void testRead() throws Exception {

    }

    @Test
    public void testReadAll() throws Exception {

    }

    @Test
    public void testDelete() throws Exception {
        iRoadDAO.delete(5L);
    }
}