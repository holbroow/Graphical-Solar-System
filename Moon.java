public class Moon extends SolarEntity{
    
    public Moon(double distance, double angle, double diameter, String col, double corAngle, double corDistance, double rateOfRotation) {
        super(distance, angle, diameter, col, corDistance, corAngle, rateOfRotation);
    }

    public void orbit(Planet planet) {
        this.corAngle = corAngle + rateOfRotation;
        this.distance = (planet.getCorDistance());
    }
}