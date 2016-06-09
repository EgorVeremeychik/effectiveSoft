package by.effectiveSoft.task1.service.impl;

import by.effectiveSoft.task1.dao.IRoadDAO;
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
    private IRoadDAO roadDAO;

    public RoadServiceImpl() {

    }

    public RoadServiceImpl(IRoadDAO roadDAO) {
        this.roadDAO = roadDAO;
    }

    @Override
    public void create(Road road) throws ServiceException {

    }

    @Override
    public void delete(Long roadId) throws ServiceException {

    }

    @Override
    public void update(Road road) throws ServiceException {

    }

    @Override
    public Road getById(Long roadId) throws ServiceException {
        return null;
    }

    @Override
    public List<Road> getAll() throws ServiceException {
        return null;
    }
}
