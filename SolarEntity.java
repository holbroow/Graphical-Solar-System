public class SolarEntity {
    protected double distance;
    protected double angle;
    protected double diameter;
    protected String col;

    public SolarEntity(double distance, double angle, double diameter, String col) {
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.col = col;
    }

    public void draw(SolarSystem solarSystem) {
        solarSystem.drawSolarObject(distance, angle, diameter, col);
    }

    // getters
    public double getDistance() {
        return this.distance;
    }
    public double getAngle() {
        return this.angle;
    }
    public double getDiameter() {
        return this.diameter;
    }
    public String getColour() {
        return this.col;
    }

    // setters
    public void setDistance(double newDistance) {
        this.distance = newDistance;
    }
    public void setAngle(double newAngle) {
        this.angle = newAngle;
    }
    public void setDiameter(double newDiameter) {
        this.diameter = newDiameter;
    }
    public void setColour(double newColour) {
        this.angle = newColour;
    }
    public void setCorDistance(double newCorDistance) {
        this.angle = newCorDistance;
    }
    public void setCorAngle(double newCorAngle) {
        this.angle = newCorAngle;
    }
}