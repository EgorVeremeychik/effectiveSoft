package by.effectiveSoft.task1.dao.hibernate;

import by.effectiveSoft.task1.dao.exception.DAOException;
import by.effectiveSoft.task1.dao.IRoadDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by EgorVeremeychik on 08.06.2016.
 */

@Repository
@Transactional
public class IRoadDAOImpl implements IRoadDAO {

    @Autowired
    private DataSource dataSource;

    @Override
    public void create(IRoadDAO entity) throws DAOException {
    }

    @Override
    public IRoadDAO read(Long id) throws DAOException {
        return null;
    }

    @Override
    public List<IRoadDAO> readAll() throws DAOException {
        return null;
    }

    @Override
    public void update(IRoadDAO entity) throws DAOException {

    }

    @Override
    public void delete(Long id) throws DAOException {

    }
}
