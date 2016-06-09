package by.effectiveSoft.task1.service.impl;

import by.effectiveSoft.task1.dao.ICityDAO;
import by.effectiveSoft.task1.dao.exception.DAOException;
import by.effectiveSoft.task1.entity.City;
import by.effectiveSoft.task1.entity.Road;
import by.effectiveSoft.task1.service.ICityService;
import by.effectiveSoft.task1.service.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Egor.Veremeychik on 09.06.2016.
 */

@Service
public class CityServiceImpl implements ICityService {

    @Autowired
    private ICityDAO iCityDAO;

    public CityServiceImpl() {}

    public CityServiceImpl(ICityDAO iCityDAO) {
        this.iCityDAO = iCityDAO;
    }

    @Override
    public void create(City city) throws ServiceException {

    }

    @Override
    public void delete(Long cityId) throws ServiceException {

    }

    @Override
    public void update(City city) throws ServiceException {

    }

    @Override
    public City getById(Long cityId) throws ServiceException {
        City city = null;
        try {
            city = iCityDAO.read(cityId);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
        return city;
    }

    @Override
    public List<City> getAll() throws ServiceException {
        return null;
    }
}
