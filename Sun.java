/**
 * This class extends the Solar Entity class to model the Sun.
 * @author Will Holbrook
 */
public class Sun extends SolarEntity {

    /**
     * Creates a Sun object.
     * 
     * @param ss Solar System object.
     * @param distance The object's distance to the point of rotation.
     * @param angle The object's angle around the rotation.
     * @param diameter The object's diameter.
     * @param col The object's color.
     */
    public Sun(SolarSystem ss, double distance, double angle, double diameter, String col) {
        super(ss, distance, angle, diameter, col);
    }
}
