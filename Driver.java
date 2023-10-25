public class Driver {
    public static void main(String[] args) {
        SolarSystem milkyWay = new SolarSystem(1000, 1000);

        Sun sun = new Sun(0, 0, 85, "YELLOW");      // create sun object
        Planet mercury = new Planet(80, 0, 20, "BROWN", 1.60745467);
        Planet venus = new Planet(100, 0, 30, "ORANGE", 1.17595702);
        Planet earth = new Planet(150, 0, 42, "BLUE", 1);     // create earth object
        Planet mars = new Planet(220, 0, 35, "RED", 0.806145064);
        Planet jupiter = new Planet(250, 0, 51, "BROWN", 0.438885158);
        Planet saturn = new Planet(280, 0, 41, "BROWN", 0.325386165);
        Planet uranus = new Planet(320, 0, 39, "BLUE", 0.228676964);
        Planet neptune = new Planet(350, 0, 39, "BLUE", 0.182337139);
        Moon moon = new Moon(32, 0, 10, "GREY", 0, 150, 2); // 0.034295302

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