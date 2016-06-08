package by.effectiveSoft.task1.dao.hibernate;

import by.effectiveSoft.task1.dao.CityDAO;
import by.effectiveSoft.task1.dao.exception.DAOException;
import by.effectiveSoft.task1.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by EgorVeremeychik on 08.06.2016.
 */
@Repository
public class CityDAOImpl implements CityDAO {

    @Autowired
    private DataSource dataSource;

    @Override
    public Long create(City entity) throws DAOException {
        return null;
    }

    @Override
    public City read(Long id) throws DAOException {
        return null;
    }

    @Override
    public List<City> readAll() throws DAOException {
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("Select * from city");
            ResultSet resultSet = preparedStatement.executeQuery()){
            while (resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(City entity) throws DAOException {

    }

    @Override
    public void delete(Long id) throws DAOException {

    }
}
