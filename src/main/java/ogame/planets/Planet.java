package ogame.planets;

import ogame.OgameWeb;
import ogame.buildings.Building;
import ogame.buildings.DataTechnology;

import java.util.ArrayList;
import java.util.List;


public class Planet {
    private final String id;
    private final int positionOnList;
    private int diameter;
    private Temperature temperature = null;
    private Fields fields = null;
    private String name = "none";
    private Coordinate coordinate = null;
    private Moon moon = null;
    private ResourcesProduction resourcesProduction;
    private Resources resources;
    private List<Building> buildings;
    private long updateTime;

    public Planet(String id, int positionOnList) {
        this.id = id;
        this.positionOnList = positionOnList;
        this.resourcesProduction = new ResourcesProduction();
        this.resources = new Resources(0,0,0,0);

        buildings = new ArrayList<>();
        for(DataTechnology dataTechnology : DataTechnology.values()){
            buildings.add(new Building(dataTechnology.name(),dataTechnology.getValue()));
        }
    }
    /*
    Execute
     */
    public boolean click(){
        if(positionOnList != 0)
            return PlanetsList.clickOnPlanet(OgameWeb.webDriver,positionOnList);
        return false;
    }
    public boolean clickOnMoon(){
        if(positionOnList != 0)
            return PlanetsList.clickOnMoon(OgameWeb.webDriver,positionOnList);
        return false;
    }
    /*
    SETTERS
     */

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public void setMoon(Moon moon) {
        this.moon = moon;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    /*
    GETTERS
     */

    public String getId() {
        return id;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public Fields getFields() {
        return fields;
    }

    public String getName() {
        return name;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public Moon getMoon() {
        return moon;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getPositionOnList() {
        return positionOnList;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public ResourcesProduction getResourcesProduction() {
        return resourcesProduction;
    }

    public Building getBuilding(String dataTechnology) {
        for(Building building : buildings){
            if(building.getDataTechnology().equals(dataTechnology))
                return building;
        }
        return null;
    }

    public Building getBuilding(DataTechnology dataTechnology) {
        for(Building building : buildings){
            if(building.getDataTechnology().equals(dataTechnology))
                return building;
        }
        return null;
    }

    public Resources getResources() {
        return resources;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "id='" + id + '\'' +
                ", positionOnList=" + positionOnList +
                ", diameter=" + diameter +
                ", temperature=" + temperature +
                ", fields=" + fields +
                ", name='" + name + '\'' +
                ", coordinate=" + coordinate +
                ", moon=" + moon +
                '}';
    }
}
