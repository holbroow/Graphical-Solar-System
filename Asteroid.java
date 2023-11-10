/**
 * This class extends the Solar Entity class to model an Asteroid.
 * @author Will Holbrook
 */
public class Asteroid extends SolarEntity{
    private double rateOfRotation;
    private int minDistance;
    private int maxDistance;
    private int direction;

    /**
     * Creates an asteroid object.
     * 
     * @param ss Solar System object.
     * @param distance The object's distance to the point of rotation.
     * @param angle The object's angle around the rotation.
     * @param diameter The object's diameter.
     * @param col The object's color.
     * @param rateOfRotation The rate at which the object rotates/orbits.
     */
    public Asteroid(SolarSystem ss, double distance, double angle, double diameter, String col, double rateOfRotation) {
        super(ss, distance, angle, diameter, col);
        this.rateOfRotation = rateOfRotation;
        this.minDistance = Driver.ASTEROID_MIN_DISTANCE;
        this.maxDistance = Driver.ASTEROID_MAX_DISTANCE;
    }

    /**
     * Function to make the object orbit around the Sun.
     */
    public void orbit() {
        this.setAngle(this.getAngle() + this.rateOfRotation);

        if (distance == maxDistance) {
            direction = -1;
        } else if (distance == minDistance) {
            direction = 1;
        }
        distance += direction;
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
