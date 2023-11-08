/**
 * This class extends the Solar Entity class to model an Asteroid.
 * @author Will Holbrook
 */
public class Asteroid extends SolarEntity{
    private double rateOfRotation;
    private int minDistance;
    private int maxDistance;
    private int direction;
    public Asteroid(SolarSystem ss, double distance, double angle, double diameter, String col, double rateOfRotation) {
        super(ss, distance, angle, diameter, col);
        this.rateOfRotation = rateOfRotation;
        this.minDistance = Driver.ASTEROID_MIN_DISTANCE;
        this.maxDistance = Driver.ASTEROID_MAX_DISTANCE;
    }

    public void orbit() {
        this.setAngle(this.getAngle() + this.rateOfRotation);

        if (distance == maxDistance) {
            direction = -1;
        } else if (distance == minDistance) {
            direction = 1;
        }
        distance += direction;
    }

    // getter
    public double getRateOfRotation() {
        return this.rateOfRotation;
    }

    //setter
    public void setRateOfRotation(double newRateOfRotation) {
        this.rateOfRotation = newRateOfRotation;
    }
}
