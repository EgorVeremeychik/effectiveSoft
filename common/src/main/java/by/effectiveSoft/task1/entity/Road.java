package by.effectiveSoft.task1.entity;

/**
 * Created by EgorVeremeychik on 08.06.2016.
 */
public class Road {
    private Long roadId;
    private String name;

    public Road() {
    }

    public Road(Long roadId, String name) {
        this.roadId = roadId;
        this.name = name;
    }

    public long getRoadId() {
        return roadId;
    }

    public void setRoadId(Long roadId) {
        this.roadId = roadId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Road{\n");
        result.append("\troadId = ").append(roadId);
        result.append(",\n\tname = ").append(name);
        result.append("}");
        return result.toString();
    }

    @Override
    public int hashCode() {
        int result = (int) ((7 * roadId) + (9 * name.hashCode()));
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
        if (!name.equals(road.name)) {
            return false;
        }
        return true;
    }
}
