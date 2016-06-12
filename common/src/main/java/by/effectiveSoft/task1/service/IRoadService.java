package by.effectiveSoft.task1.service;

import by.effectiveSoft.task1.entity.Road;
import by.effectiveSoft.task1.service.exception.ServiceException;

import java.util.List;

/**
 * Created by Egor.Veremeychik on 09.06.2016.
 */
public interface IRoadService {
    Long create(Road road) throws ServiceException;

    void delete(Long roadId) throws ServiceException;

    void update(Road road) throws ServiceException;

    Road getById(Long roadId) throws ServiceException;

    List<Road> getAll() throws ServiceException;

    List<Road> getCityRoadsById(Long cityId) throws ServiceException;

}
