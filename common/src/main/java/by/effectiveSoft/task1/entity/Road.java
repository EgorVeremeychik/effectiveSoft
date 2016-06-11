package by.effectiveSoft.task1.entity;

import javax.persistence.*;

/**
 * Created by EgorVeremeychik on 08.06.2016.
 */
@Entity
@Table(name = "roads")
@NamedQueries({
        @NamedQuery(name = "Road.readById", query = "select road from Road road where road.roadId = :road_id"),
        @NamedQuery(name = "Road.readAll", query = "select road from Road road"),
        @NamedQuery(name = "Road.getCityRoadsById", query = "select road from Road road where road.city.cityId = :city_id"),
})
public class Road {
    public static final String READ_BY_ID = "Road.readById";
    public static final String READ_ALL = "Road.readAll";
    public static final String GET_CITY_ROADS_BY_ID = "Road.getCityRoadsById";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "road_id")
    private Long roadId;

    @Column(name = "road_name", nullable = false)
    private String roadName;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = City.class)
    @JoinTable(name = "cityRoads", joinColumns = @JoinColumn(name = "road_id"), inverseJoinColumns = @JoinColumn(name = "city_id"))
    private City city;

    public Road() {}

    public Road(String roadName) {
        this.roadName = roadName;
    }

    public Road(Long roadId, String roadName) {
        this.roadId = roadId;
        this.roadName = roadName;
    }

    public long getRoadId() {
        return roadId;
    }

    public void setRoadId(Long roadId) {
        this.roadId = roadId;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Road{\n");
        result.append("\troadId = ").append(roadId);
        result.append(",\n\troadName = ").append(roadName);
        result.append("}");
        return result.toString();
    }

    @Override
    public int hashCode() {
        int result = (int) ((7 * roadId) + (9 * roadName.hashCode()));
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
        Road road = (Road) obj;
        if (roadId != road.roadId) {
            return false;
        }
        if (!roadName.equals(road.roadName)) {
            return false;
        }
        return true;
    }
}
