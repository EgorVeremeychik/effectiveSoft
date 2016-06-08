package by.effectiveSoft.task1.entity;

import javax.persistence.*;

/**
 * Created by EgorVeremeychik on 08.06.2016.
 */
@Entity
@Table(name = "roads")
public class Road {
    private Long roadId;
    private String roadName;

    public Road() {
    }

    public Road(Long roadId, String roadName) {
        this.roadId = roadId;
        this.roadName = roadName;
    }

    @Id
    @GeneratedValue
    @Column(name = "road_id")
    public long getRoadId() {
        return roadId;
    }

    public void setRoadId(Long roadId) {
        this.roadId = roadId;
    }

    @Column(name = "road_name", nullable = false)
    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
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
