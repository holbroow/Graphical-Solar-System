public class Driver {
    public static void main(String[] args) {
        SolarSystem milkyWay = new SolarSystem(1200, 1000);

        Sun sun = new Sun(0, 0, 50, "#F9AE28");      // create sun object
        Planet mercury = new Planet(80, 0, 15, "#C2B396", 1.60745467);
        Planet venus = new Planet(100, 0, 25, "#DBAB3F", 1.17595702);
        Planet earth = new Planet(150, 0, 37, "#0C0E3F", 1);     // create earth object
        Planet mars = new Planet(220, 0, 30, "#D66038", 0.806145064);
        Planet jupiter = new Planet(370, 0, 46, "#A45934", 0.438885158);
        Planet saturn = new Planet(415, 0, 33, "#BC9154", 0.325386165);
        Planet uranus = new Planet(440, 0, 34, "2596BE", 0.228676964);
        Planet neptune = new Planet(480, 0, 34, "#4269FD", 0.182337139);

        Moon earthMoon = new Moon(32, 0, 10, "GREY", 0, earth.getDistance(), 0.034295302); // 0.034295302 speed relative to earth(1)
        Moon marsPhobosMoon = new Moon(25, 0, 7, "#97897F", 0, mars.getDistance(), 0.0717449664);
        Moon marsDeimosMoon = new Moon(25, 0, 7, "#907C6F", 0, mars.getDistance(), 0.0453456376);
        Moon jupiterEuropaMoon = new Moon(30, 0, 10, "#A38770", 0, jupiter.getDistance(), 0.461073826);
        Moon jupiterGanymedeMoon = new Moon(30, 0, 5, "#6D5A4A", 0, jupiter.getDistance(), 0.365100671);
        Moon jupiterCallistoMoon = new Moon(30, 0, 5, "#434135", 0, jupiter.getDistance(), 0.275167785);
        Moon jupiterIoMoon = new Moon(30, 0, 5, "#D5C85C", 0, jupiter.getDistance(), 0.581677852);

        Planet saturnRingElem1 = new Planet(saturn.getDistance(), 0, 92, "GREY", saturn.getRateOfRotation());
        Planet saturnRingElem2 = new Planet(saturn.getDistance(), 0, 65, "BLACK", saturn.getRateOfRotation());
        Planet saturnRingElem3 = new Planet(saturn.getDistance(), 0, 53, "GREY", saturn.getRateOfRotation());
        Planet saturnRingElem4 = new Planet(saturn.getDistance(), 0, 33, "BLACK", saturn.getRateOfRotation());


        while (true) {
            //// Draw()
            // Saturn Ring Elements
            saturnRingElem1.draw(milkyWay);
            saturnRingElem2.draw(milkyWay);
            saturnRingElem3.draw(milkyWay);
            saturnRingElem4.draw(milkyWay);
            // Planets
            sun.draw(milkyWay);
            mercury.draw(milkyWay);
            venus.draw(milkyWay);
            earth.draw(milkyWay);
            mars.draw(milkyWay);
            jupiter.draw(milkyWay);
            saturn.draw(milkyWay);
            uranus.draw(milkyWay);
            neptune.draw(milkyWay);
            // Moons
            earthMoon.draw(milkyWay);
            marsPhobosMoon.draw(milkyWay);
            marsDeimosMoon.draw(milkyWay);
            jupiterEuropaMoon.draw(milkyWay);
            jupiterGanymedeMoon.draw(milkyWay);
            jupiterCallistoMoon.draw(milkyWay);
            jupiterIoMoon.draw(milkyWay);


            //// Orbit()
            // Saturn Ring Elements
            saturnRingElem1.orbit();
            saturnRingElem2.orbit();
            saturnRingElem3.orbit();
            saturnRingElem4.orbit();
            // Planets
            mercury.orbit();
            venus.orbit();
            earth.orbit();
            mars.orbit();
            jupiter.orbit();
            saturn.orbit();
            uranus.orbit();
            neptune.orbit();
            // Moons
            earthMoon.orbit(earth);
            marsPhobosMoon.orbit(mars);
            marsDeimosMoon.orbit(mars);
            jupiterEuropaMoon.orbit(jupiter);
            jupiterGanymedeMoon.orbit(jupiter);
            jupiterCallistoMoon.orbit(jupiter);
            jupiterIoMoon.orbit(jupiter);

            

            //// Refresh Screen
            milkyWay.finishedDrawing();
        }
    }
}