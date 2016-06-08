package by.effectiveSoft.task1.dao.hibernate;

import by.effectiveSoft.task1.dao.ICityDAO;
import by.effectiveSoft.task1.dao.exception.DAOException;
import by.effectiveSoft.task1.entity.City;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by EgorVeremeychik on 08.06.2016.
 */
@Repository
public class ICityDAOImpl implements ICityDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Long create(City entity) throws DAOException {
        return null;
    }

    @Override
    public City read(Long id) throws DAOException {
       City city = null;
        try {
            if ((city = (City) sessionFactory.getCurrentSession().get(
                    City.class, id)) == null) {
                throw new DAOException(String.format(
                        "the author with id = %d not found", id));
            }
        } catch (HibernateException he) {
            throw new DAOException(he);
        }
        return city;
    }

    @Override
    public List<City> readAll() throws DAOException {
        return null;
    }

    @Override
    public void update(City entity) throws DAOException {

    }

    @Override
    public void delete(Long id) throws DAOException {

    }
}
