package by.effectiveSoft.task1.dao.hibernate;

import by.effectiveSoft.task1.dao.ICityDAO;
import by.effectiveSoft.task1.dao.exception.DAOException;
import by.effectiveSoft.task1.entity.City;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;

/**
 * Created by EgorVeremeychik on 08.06.2016.
 */
@Repository
@Transactional
public class ICityDAOImpl implements ICityDAO {
    private static final String READ_CITY_BY_ID = "select cities from City cities where cities.cityId = ?1";
    private static final String READ_ALL_CITIES = "select cities from City cities";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void create(City entity) throws DAOException {
        entityManager.persist(entity);
    }

    @Override
    public City read(Long id) throws DAOException {
        Query query = entityManager.createQuery(READ_CITY_BY_ID);
        query.setParameter(1,id);
        City city = (City) query.getSingleResult();
        return city;
    }

    @Override
    public List<City> readAll() throws DAOException {
        Query query = entityManager.createQuery(READ_ALL_CITIES);
        List<City> cityList = query.getResultList();
        return cityList;
    }

    @Override
    public void update(City entity) throws DAOException {

    }

    @Override
    public void delete(Long id) throws DAOException {

    }
}
