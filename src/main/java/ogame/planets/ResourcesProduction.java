package ogame.planets;

import java.io.Serializable;

public class ResourcesProduction implements Serializable {

    private static final long serialVersionUID = 1992L;
    private double metalPerHour, metalPerDay, metalPerWeek;
    private double crystalPerHour, crystalPerDay, crystalPerWeek;
    private double deuteriumPerHour, deuteriumPerDay, deuteriumPerWeek;


    public long timeMilisecondsToMetalProduction(double ammountOfMetalToProduce){
        double metalPerSecond = metalPerHour/3600;
        return (long)(ammountOfMetalToProduce/metalPerSecond) * 1000L;
    }

    public long timeMilisecondsToCrystalProduction(double ammountOfCrystalToProduce){
        double crystalPerSecond = crystalPerHour/3600;
        return (long)(ammountOfCrystalToProduce/crystalPerSecond) * 1000L;
    }

    public long timeMilisecondsToDeuteriumProduction(double ammountOfDeuteriumToProduce){
        double deuteriumPerSecond = deuteriumPerHour/3600;
        return (long)(ammountOfDeuteriumToProduce/deuteriumPerSecond) * 1000L;
    }
    public double getMetalPerSecond() {
        return metalPerHour/3600;
    }

    public double getMetalPerMinute() {
        return metalPerHour/60;
    }

    public double getMetalPerHour() {
        return metalPerHour;
    }

    public void setMetalPerHour(double metalPerHour) {
        this.metalPerHour = metalPerHour;
    }

    public double getMetalPerDay() {
        return metalPerDay;
    }

    public void setMetalPerDay(double metalPerDay) {
        this.metalPerDay = metalPerDay;
    }

    public double getMetalPerWeek() {
        return metalPerWeek;
    }

    public void setMetalPerWeek(double metalPerWeek) {
        this.metalPerWeek = metalPerWeek;
    }

    public double getCrystalPerSecond() {
        return crystalPerHour/3600;
    }

    public double getCrystalPerMinute() {
        return crystalPerHour/60;
    }

    public double getCrystalPerHour() {
        return crystalPerHour;
    }

    public void setCrystalPerHour(double crystalPerHour) {
        this.crystalPerHour = crystalPerHour;
    }

    public double getCrystalPerDay() {
        return crystalPerDay;
    }

    public void setCrystalPerDay(double crystalPerDay) {
        this.crystalPerDay = crystalPerDay;
    }

    public double getCrystalPerWeek() {
        return crystalPerWeek;
    }

    public void setCrystalPerWeek(double crystalPerWeek) {
        this.crystalPerWeek = crystalPerWeek;
    }

    public double getDeuteriumPerSecond() {
        return deuteriumPerHour/3600;
    }

    public double getDeuteriumPerMinute() {
        return deuteriumPerHour/60;
    }
    public double getDeuteriumPerHour() {
        return deuteriumPerHour;
    }

    public void setDeuteriumPerHour(double deuteriumPerHour) {
        this.deuteriumPerHour = deuteriumPerHour;
    }

    public double getDeuteriumPerDay() {
        return deuteriumPerDay;
    }

    public void setDeuteriumPerDay(double deuteriumPerDay) {
        this.deuteriumPerDay = deuteriumPerDay;
    }

    public double getDeuteriumPerWeek() {
        return deuteriumPerWeek;
    }

    public void setDeuteriumPerWeek(double deuteriumPerWeek) {
        this.deuteriumPerWeek = deuteriumPerWeek;
    }
}
