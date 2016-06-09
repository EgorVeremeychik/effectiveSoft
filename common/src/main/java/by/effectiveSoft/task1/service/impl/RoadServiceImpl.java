package by.effectiveSoft.task1.service.impl;

import by.effectiveSoft.task1.dao.IRoadDAO;
import by.effectiveSoft.task1.dao.exception.DAOException;
import by.effectiveSoft.task1.entity.Road;
import by.effectiveSoft.task1.service.IRoadService;
import by.effectiveSoft.task1.service.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Egor.Veremeychik on 09.06.2016.
 */

@Service
public class RoadServiceImpl implements IRoadService {

    @Autowired
    private IRoadDAO iRoadDAO;

    public RoadServiceImpl() {

    }

    public RoadServiceImpl(IRoadDAO iRoadDAO) {
        this.iRoadDAO = iRoadDAO;
    }

    @Override
    public void create(Road road) throws ServiceException {
        try {
            iRoadDAO.create(road);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(Long roadId) throws ServiceException {
        try {
            iRoadDAO.delete(roadId);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(Road road) throws ServiceException {
        try {
            iRoadDAO.update(road);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public Road getById(Long roadId) throws ServiceException {
        Road road = null;
        try {
            road = iRoadDAO.read(roadId);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
        return road;
    }

    @Override
    public List<Road> getAll() throws ServiceException {
        List<Road> roads = null;
        try {
            roads = iRoadDAO.readAll();
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
        return roads;
    }
}
