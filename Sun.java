/**
 * This class extends the Solar Entity class to model the Sun.
 * @author Will Holbrook
 */
public class Sun extends SolarEntity {

    /**
     * Creates a Sun object.
     * 
     * @param ss
     * @param distance
     * @param angle
     * @param diameter
     * @param col
     */
    public Sun(SolarSystem ss, double distance, double angle, double diameter, String col) {
        super(ss, distance, angle, diameter, col);
    }
}
