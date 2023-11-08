/**
 * This class extends the Solar Entity class to model a Moon.
 * @author Will Holbrook
 */
public class Moon extends SolarEntity{
    private double corDistance;
    private double corAngle;
    private double rateOfRotation;
    private Planet planetToOrbit;
    public Moon(SolarSystem ss, Planet planetToOrbit, double distance, double angle, double diameter, String col, double corAngle, double corDistance, double rateOfRotation) {
        super(ss, distance, angle, diameter, col);
        this.corDistance = corDistance;
        this.corAngle = corAngle;
        this.rateOfRotation = rateOfRotation;
        this.planetToOrbit = planetToOrbit;
    }

    @Override
    public void draw() {
        ss.drawSolarObjectAbout(distance, angle, diameter, col, corDistance, corAngle);
    }

    // public void orbit(Planet planet) {
    //     this.corAngle = corAngle + rateOfRotation;
    //     this.distance = (planet.getCorDistance());
    // }

    public void orbit()
    {
        corAngle += planetToOrbit.getRateOfRotation(); // increase center of rotation angle by the planets speed so that it stays in-line with its planet.
        this.setAngle(this.getAngle() + rateOfRotation); // increase the angle of the moon to the earth.
        if(this.getAngle() >= 360){
            this.setAngle(0); // ensures that degree angle does not exceed 360.
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
