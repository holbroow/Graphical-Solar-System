/**
 * This class extends the Solar Entity class to model a Moon.
 * @author Will Holbrook
 */
public class Moon extends SolarEntity{
    private double corDistance;
    private double corAngle;
    private double rateOfRotation;
    private Planet planetToOrbit;

    /**
     * Creates a Moon object.
     * 
     * @param ss Solar System object.
     * @param distance The object's distance to the point of rotation.
     * @param angle The object's angle around the rotation.
     * @param diameter The object's diameter.
     * @param col The object's color.
     * @param corDistance The distance part of the polar co-ordinate about which this object orbits.
     * @param corAngle The angular part of the polar co-ordinate about which this object orbits.
     * @param rateOfRotation The rate at which the object rotates/orbits.
     * @param planetToOrbit The planet that this object will orbit.
     */
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

    /**
     * Function to make the object orbit around a Planet.
     */
    public void orbit()
    {
        corAngle += planetToOrbit.getRateOfRotation(); // increase center of rotation angle by the planets speed so that it stays in-line with its planet.
        this.setAngle(this.getAngle() + rateOfRotation); // increase the angle of the moon to the earth.
        if(this.getAngle() >= 360){
            this.setAngle(0); // ensures that degree angle does not exceed 360.
        }
    }

    /**
     * @return the center of rotation distance for this object.
     */
    public double getCorDistance() {
        return this.corDistance;
    }

    /**
     * @return the center of rotation angle for this object.
     */
    public double getCorAngle() {
        return this.corAngle;
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
