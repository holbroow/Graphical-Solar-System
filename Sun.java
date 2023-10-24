public class Sun extends SolarEntity {
    public Sun(double distance, double angle, double diameter, String col, double corDistance, double corAngle, double rateOfRotation) {
        super(distance, angle, diameter, col, corDistance, corAngle, rateOfRotation);
    }

    public void draw(SolarSystem solarSystem) {
        solarSystem.drawSolarObject(distance, angle, diameter, col);
    }
}