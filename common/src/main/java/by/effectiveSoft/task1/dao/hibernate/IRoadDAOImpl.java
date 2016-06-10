package by.effectiveSoft.task1.dao.hibernate;

import by.effectiveSoft.task1.dao.IRoadDAO;
import by.effectiveSoft.task1.dao.exception.DAOException;
import by.effectiveSoft.task1.entity.Road;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

import static by.effectiveSoft.task1.entity.Road.GET_CITY_ROADS_BY_ID;
import static by.effectiveSoft.task1.entity.Road.READ_ALL;
import static by.effectiveSoft.task1.entity.Road.READ_BY_ID;

/**
 * Created by EgorVeremeychik on 08.06.2016.
 */

@Repository
@Transactional
public class IRoadDAOImpl implements IRoadDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void create(Road entity) throws DAOException {
        entityManager.persist(entity);
    }

    @Override
    public Road read(Long id) throws DAOException {
        TypedQuery<Road> query =
                entityManager.createNamedQuery(READ_BY_ID, Road.class);
        query.setParameter("road_id",id);
        Road road = query.getSingleResult();
        return road;
    }

    @Override
    public List<Road> readAll() throws DAOException {
        TypedQuery<Road> query = entityManager.createNamedQuery(READ_ALL, Road.class);
        List<Road> roadList = query.getResultList();
        return roadList;
    }

    @Override
    public void update(Road entity) throws DAOException {
        entityManager.merge(entity);
    }

    @Override
    public void delete(Long id) throws DAOException {
        Road road = entityManager.find(Road.class, id);
        if (road == null) {
            throw new DAOException(String.format(
                    "the road with id = %d not found", id));
        }
        entityManager.remove(road);
    }

    @Override
    public List<Road> getCityRoadsById(Long id) throws DAOException {
        TypedQuery<Road> query = entityManager.createNamedQuery(GET_CITY_ROADS_BY_ID, Road.class);
        query.setParameter("city_Id", id);
        List<Road> roadList = query.getResultList();
        return roadList;
    }
}
