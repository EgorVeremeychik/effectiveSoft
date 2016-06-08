package by.effectiveSoft.task1.entity;

/**
 * Created by EgorVeremeychik on 08.06.2016.
 */
public class City {
    private Long cityId;
    private String name;

    public City() {
    }

    public City(Long cityId, String name) {
        this.cityId = cityId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Town{\n");
        result.append("\tcityId = ").append(cityId);
        result.append(",\n\tname = ").append(name);
        result.append("}");
        return result.toString();
    }

    @Override
    public int hashCode() {
        int result = (int) ((3 * cityId) + (5 * name.hashCode()));
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
        return name.equals(city.name);
    }
}
