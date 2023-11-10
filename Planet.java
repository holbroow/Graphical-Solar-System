/**
 * This class extends the Solar Entity class to model a Planet.
 * @author Will Holbrook
 */
 public class Planet extends SolarEntity{
    private double rateOfRotation;

    /**
     * Creates a Planet object.
     * 
     * @param ss Solar System object.
     * @param distance The object's distance to the point of rotation.
     * @param angle The object's angle around the rotation.
     * @param diameter The object's diameter.
     * @param col The object's color.
     * @param rateOfRotation The rate at which the object rotates/orbits.
     */
    public Planet(SolarSystem ss, double distance, double angle, double diameter, String col, double rateOfRotation) {
        super(ss, distance, angle, diameter, col);
        this.rateOfRotation = rateOfRotation;
    }

    /**
     * Function to make the object orbit around the Sun.
     */
    public void orbit() {
        this.setAngle(this.getAngle() + this.rateOfRotation);
    }

    /**
     * @return the rate of rotation for this object.
     */
    public double getRateOfRotation() {
        return this.rateOfRotation;
    }

    /**
     * Sets a new rate of rotation for this object.
     * @param rateOfRotation
     */
    public void setRateOfRotation(double newRateOfRotation) {
        this.rateOfRotation = newRateOfRotation;
    }
}
