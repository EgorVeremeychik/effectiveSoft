package by.effectiveSoft.task1.service;

import by.effectiveSoft.task1.entity.City;
import by.effectiveSoft.task1.service.exception.ServiceException;

import java.util.List;

/**
 * Created by Egor.Veremeychik on 09.06.2016.
 */
public interface ICityService {
    void create(City city) throws ServiceException;

    void delete(Long cityId) throws ServiceException;

    void update(City city) throws ServiceException;

    City getById(Long cityId) throws ServiceException;

    List<City> getAll() throws ServiceException;
}
