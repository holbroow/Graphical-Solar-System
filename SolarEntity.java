/**
 * This abstract class provides a parent class to be extended by multiple 'Solar entity' classes in the Milky Way.
 * @author Will Holbrook
 */
public abstract class SolarEntity {
    protected SolarSystem ss;
    protected double distance;
    protected double angle;
    protected double diameter;
    protected String col;

    /**
     * Takes parameters for a basic Solar Entity (e.g. Moon, Planet, etc).
     *
     * @param ss Solar System object.
     * @param distance The object's distance to the point of rotation.
     * @param angle The object's angle around the rotation.
     * @param diameter The object's diameter.
     * @param col The object's color.
     */
    public SolarEntity(SolarSystem ss, double distance, double angle, double diameter, String col) {
        this.ss = ss;
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.col = col;
    }

    /**
     * Function to draw the object in the Solar System.
     */
    public void draw() {
        ss.drawSolarObject(distance, angle, diameter, col);
    }

    /**
     * @return the distance for this object.
     */
    public double getDistance() {
        return this.distance;
    }

    /**
     * @return the center of rotation distance for this object.
     */
    public double getAngle() {
        return this.angle;
    }

    /**
     * @return the diameter for this object.
     */
    public double getDiameter() {
        return this.diameter;
    }

    /**
     * @return the color for this object.
     */
    public String getColour() {
        return this.col;
    }

    /**
     * Sets a new distance for this object.
     * @param distance
     */
    public void setDistance(double newDistance) {
        this.distance = newDistance;
    }

    /**
     * Sets a new angle for this object.
     * @param angle
     */
    public void setAngle(double newAngle) {
        this.angle = newAngle;
    }

    /**
     * Sets a new diameter for this object.
     * @param diameter
     */
    public void setDiameter(double newDiameter) {
        this.diameter = newDiameter;
    }

    /**
     * Sets a new color for this object.
     * @param color
     */
    public void setColour(double newColour) {
        this.angle = newColour;
    }
}
