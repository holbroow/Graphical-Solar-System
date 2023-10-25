public class Moon extends SolarEntity{
    private double corDistance;
    private double corAngle;
    private double rateOfRotation;
    public Moon(double distance, double angle, double diameter, String col, double corAngle, double corDistance, double rateOfRotation) {
        super(distance, angle, diameter, col);
        this.corDistance = corDistance;
        this.corAngle = corAngle;
        this.rateOfRotation = rateOfRotation;
    }

    public void draw(SolarSystem solarSystem) {
        solarSystem.drawSolarObjectAbout(distance, angle, diameter, col, corDistance, corAngle);
    }

    // public void orbit(Planet planet) {
    //     this.corAngle = corAngle + rateOfRotation;
    //     this.distance = (planet.getCorDistance());
    // }

    public void orbit(Planet planet)
    {   
        //Increase cora by the planets orbit speed so that it keeps up with the planet orbiting the sun.
        corAngle += planet.getRateOfRotation();
        //Then increase the angle of the moon to the earth.
        this.setAngle(this.getAngle() + rateOfRotation);
        //Bounds of the angle.
        if(this.getAngle() >= 360){
            this.setAngle(0);
        }
    }

    // getters
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
    public void setRateOfRotation(double newRateOfRotation) {
        this.rateOfRotation = newRateOfRotation;
    }
}