package by.effectiveSoft.task1.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by EgorVeremeychik on 08.06.2016.
 */

@Entity
@Table(name = "cities")
public class City {

    private Long cityId;
    private String cityName;
    private Set<Road> roads = new HashSet<Road>();

    public City() {
    }

    public City(Long cityId, String cityName, Set<Road> roads) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.roads = roads;
    }

    @Column(nullable = false, name = "city_name", length = 100)
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Id
    @GeneratedValue
    @Column(nullable = false, name = "city_id")
    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "cityRoads", joinColumns = { @JoinColumn(name = "city_id") }, inverseJoinColumns = { @JoinColumn(name = "road_id") })
    public Set<Road> getRoads() {
        return roads;
    }

    public void setRoads(Set<Road> roads) {
        this.roads = roads;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Town{\n");
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
