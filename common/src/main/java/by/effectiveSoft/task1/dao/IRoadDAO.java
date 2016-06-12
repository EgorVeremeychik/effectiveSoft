package by.effectiveSoft.task1.dao;

import by.effectiveSoft.task1.dao.exception.DAOException;
import by.effectiveSoft.task1.entity.Road;

import java.util.List;

/**
 * Created by EgorVeremeychik on 08.06.2016.
 */
public interface IRoadDAO extends AbstractDAO<Road,Long> {
    List<Road> getCityRoadsById(Long cityId) throws DAOException;
}
