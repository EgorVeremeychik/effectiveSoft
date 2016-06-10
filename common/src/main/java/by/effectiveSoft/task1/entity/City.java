package by.effectiveSoft.task1.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by EgorVeremeychik on 08.06.2016.
 */

@Entity
@Table(name = "cities")
@NamedQueries({
        @NamedQuery(name = "City.readById", query = "select cities from City cities where cities.cityId = :city_id"),
        @NamedQuery(name = "City.readAll", query = "select cities from City cities"),
})
public class City {
    public static final String READ_BY_ID = "City.readById";
    public static final String READ_ALL = "City.readAll";

    @Id
    @GeneratedValue
    @Column(nullable = false, name = "city_id")
    private Long cityId;

    @Column(nullable = false, name = "city_name", length = 100)
    private String cityName;

    @OneToMany(targetEntity = Road.class, mappedBy = "city", fetch = FetchType.LAZY)
    private Set<Road> roads = new HashSet<>();

    public City() {
    }

    public City(String cityName) {
        this.cityName = cityName;
    }

    public City(Long cityId, String cityName) {
        this.cityId = cityId;
        this.cityName = cityName;
    }

    public City(String cityName, Set<Road> roads) {
        this.roads = roads;
        this.cityName = cityName;
    }

    public City(Long cityId, String cityName, Set<Road> roads) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.roads = roads;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Set<Road> getRoads() {
        return roads;
    }

    public void setRoads(Set<Road> roads) {
        this.roads = roads;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("City{\n");
        result.append("\tcityId = ").append(cityId);
        result.append(",\n\tcityName = ").append(cityName);
        result.append("}");
        return result.toString();
    }

    @Override
    public int hashCode() {
        int result = (int) ((3 * cityId) + (5 * cityName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        City city = (City) obj;
        if (this.cityId != city.cityId) {
            return false;
        }
        return cityName.equals(city.cityName);
    }
}
