public class Driver {
    public static void main(String[] args) {
        SolarSystem milkyWay = new SolarSystem(1000, 1000);

        Sun sun = new Sun(0, 0, 85, "YELLOW", 0, 0, 0);      // create sun object
        Planet mercury = new Planet(sun.getDistance(), 0, 20, "BROWN", 60, 0, 1.60745467);
        Planet venus = new Planet(sun.getDistance(), 0, 30, "ORANGE", 100, 0, 1.17595702);
        Planet earth = new Planet(sun.getDistance(), 0, 42, "BLUE", 150, 0, 1);     // create earth object
        Planet mars = new Planet(sun.getDistance(), 0, 35, "RED", 220, 0, 0.806145064);
        Planet jupiter = new Planet(sun.getDistance(), 0, 51, "BROWN", 250, 0, 0.438885158);
        Planet saturn = new Planet(sun.getDistance(), 0, 41, "BROWN", 280, 0, 0.325386165);
        Planet uranus = new Planet(sun.getDistance(), 0, 39, "BLUE", 320, 0, 0.228676964);
        Planet neptune = new Planet(sun.getDistance(), 0, 39, "BLUE", 350, 0, 0.182337139);
        Moon moon = new Moon(0, 0, 10, "GREY", 180, 40, 0.0); // 0.034295302

        while (true) {
            // Draw()
            sun.draw(milkyWay);
            mercury.draw(milkyWay);
            venus.draw(milkyWay);
            earth.draw(milkyWay);
            mars.draw(milkyWay);
            jupiter.draw(milkyWay);
            saturn.draw(milkyWay);
            uranus.draw(milkyWay);
            neptune.draw(milkyWay);
            moon.draw(milkyWay);

            // Orbit()
            mercury.orbit();
            venus.orbit();
            earth.orbit();
            mars.orbit();
            jupiter.orbit();
            saturn.orbit();
            uranus.orbit();
            neptune.orbit();
            moon.orbit(earth);

            
            // Refresh Screen
            milkyWay.finishedDrawing();
        }
    }
}