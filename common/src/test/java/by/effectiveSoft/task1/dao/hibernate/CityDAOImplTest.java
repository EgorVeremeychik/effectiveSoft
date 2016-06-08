package by.effectiveSoft.task1.dao.hibernate;

import by.effectiveSoft.task1.dao.CityDAO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by EgorVeremeychik on 08.06.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:common-context.xml")
public class CityDAOImplTest extends Assert {

    @Autowired
    private CityDAO cityDAO;

    @Test
    public void testReadAll() throws Exception {
        cityDAO.readAll();
    }
}