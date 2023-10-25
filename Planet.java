public class Planet extends SolarEntity{
    private double rateOfRotation;
    public Planet(double distance, double angle, double diameter, String col, double rateOfRotation) {
        super(distance, angle, diameter, col);
        this.rateOfRotation = rateOfRotation;
    }

    public void orbit() {
        this.setAngle(this.getAngle() + this.rateOfRotation);
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