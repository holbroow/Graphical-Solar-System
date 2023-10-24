public class SolarEntity {
    protected double distance;
    protected double angle;
    protected double diameter;
    protected String col;
    protected double corDistance;
    protected double corAngle;
    protected double rateOfRotation;

    public SolarEntity(double distance, double angle, double diameter, String col, double corDistance, double corAngle, double rateOfRotation) {
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.col = col;
        this.corDistance = corDistance;
        this.corAngle = corAngle;
        this.rateOfRotation = rateOfRotation;
    }

    public void draw(SolarSystem solarSystem) {
        solarSystem.drawSolarObjectAbout(distance, angle, diameter, col, corDistance, corAngle);
    }

    public void orbit() {
        this.corAngle = corAngle + rateOfRotation;
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
    public double getCorDistance() {
        return this.corDistance;
    }
    public double getCorAngle() {
        return this.corAngle;
    }
    public double getRateOfRotation() {
        return this.rateOfRotation;
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
    public void setRateOfRotation(double newRateOfRotation) {
        this.rateOfRotation = newRateOfRotation;
    }
}