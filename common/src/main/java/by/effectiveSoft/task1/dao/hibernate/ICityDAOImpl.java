package by.effectiveSoft.task1.dao.hibernate;

import by.effectiveSoft.task1.dao.ICityDAO;
import by.effectiveSoft.task1.dao.exception.DAOException;
import by.effectiveSoft.task1.entity.City;
import by.effectiveSoft.task1.entity.Road;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;

import static by.effectiveSoft.task1.entity.City.READ_ALL;
import static by.effectiveSoft.task1.entity.City.READ_BY_ID;

/**
 * Created by EgorVeremeychik on 08.06.2016.
 */
@Repository
@Transactional
public class ICityDAOImpl implements ICityDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void create(City entity) throws DAOException {
        entityManager.persist(entity);
    }

    @Override
    public City read(Long id) throws DAOException {
        TypedQuery<City> query =
                entityManager.createNamedQuery(READ_BY_ID, City.class);
        query.setParameter("city_id",id);
        City city = query.getSingleResult();
        return city;
    }

    @Override
    public List<City> readAll() throws DAOException {
        TypedQuery<City> query = entityManager.createNamedQuery(READ_ALL, City.class);
        List<City> cityList = query.getResultList();
        return cityList;
    }

    @Override
    public void update(City entity) throws DAOException {
        entityManager.merge(entity);
    }

    @Override
    public void delete(Long id) throws DAOException {
        City city = entityManager.find(City.class, id);
        if (city == null) {
            throw new DAOException(String.format(
                    "the city with id = %d not found", id));
        }
        entityManager.remove(city);
    }
}
