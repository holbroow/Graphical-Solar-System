public class Driver {
    public static final int SYSTEM_WIDTH = 1200;
    public static final int SYSTEM_HEIGHT = 1000;
    public static final int ASTEROID_AMOUNT = 250;
    public static final int ASTEROID_MIN_DISTANCE = 270;
    public static final int ASTEROID_MAX_DISTANCE = 310;

    public static void main(String[] args) {
        SolarSystem milkyWay = new SolarSystem(SYSTEM_WIDTH, SYSTEM_HEIGHT);

        Sun sun = new Sun(milkyWay, 0, 0, 50, "#F9AE28");      // create sun object
        Planet mercury = new Planet(milkyWay, 80, 0, 15, "#C2B396", 1.60745467);
        Planet venus = new Planet(milkyWay, 100, 0, 25, "#DBAB3F", 1.17595702);
        Planet earth = new Planet(milkyWay, 150, 0, 37, "#0C0E3F", 1);     // create earth object
        Planet mars = new Planet(milkyWay, 220, 0, 30, "#D66038", 0.806145064);
        Planet jupiter = new Planet(milkyWay, 370, 0, 46, "#A45934", 0.438885158);
        Planet saturn = new Planet(milkyWay, 415, 0, 33, "#BC9154", 0.325386165);
        Planet uranus = new Planet(milkyWay, 440, 0, 34, "2596BE", 0.228676964);
        Planet neptune = new Planet(milkyWay, 480, 0, 34, "#4269FD", 0.182337139);

        Moon earthMoon = new Moon(milkyWay, earth, 32, 0, 10, "GREY", 0, earth.getDistance(), 3.4295302); // 34.295302% speed relative to earth(1)
        Moon marsPhobosMoon = new Moon(milkyWay, mars, 25, 0, 7, "#97897F", 0, mars.getDistance(), 7.17449664);
        Moon marsDeimosMoon = new Moon(milkyWay, mars, 25, 0, 7, "#907C6F", 0, mars.getDistance(), 4.53456376);
        Moon jupiterEuropaMoon = new Moon(milkyWay, jupiter, 30, 0, 10, "#A38770", 0, jupiter.getDistance(), 4.61073826);
        Moon jupiterGanymedeMoon = new Moon(milkyWay, jupiter, 30, 0, 5, "#6D5A4A", 0, jupiter.getDistance(), 3.65100671);
        Moon jupiterCallistoMoon = new Moon(milkyWay, jupiter, 30, 0, 5, "#434135", 0, jupiter.getDistance(), 2.75167785);
        Moon jupiterIoMoon = new Moon(milkyWay, jupiter, 30, 0, 5, "#D5C85C", 0, jupiter.getDistance(), 5.81677852);

        Planet saturnRingElem1 = new Planet(milkyWay, saturn.getDistance(), 0, 92, "GREY", saturn.getRateOfRotation());
        Planet saturnRingElem2 = new Planet(milkyWay, saturn.getDistance(), 0, 65, "BLACK", saturn.getRateOfRotation());
        Planet saturnRingElem3 = new Planet(milkyWay, saturn.getDistance(), 0, 53, "GREY", saturn.getRateOfRotation());
        Planet saturnRingElem4 = new Planet(milkyWay, saturn.getDistance(), 0, 33, "BLACK", saturn.getRateOfRotation());


        Planet planets[] = {mercury, 
                            venus, 
                            earth, 
                            mars, 
                            jupiter, 
                            saturn, 
                            uranus, 
                            neptune};

        Moon moons[] = {earthMoon,
                        marsPhobosMoon,
                        marsDeimosMoon,
                        jupiterEuropaMoon,
                        jupiterGanymedeMoon,
                        jupiterCallistoMoon,
                        jupiterIoMoon};

        Planet ringElements[] = {saturnRingElem1,
                                saturnRingElem2,
                                saturnRingElem3,
                                saturnRingElem4};

        Asteroid asteroids[] = new Asteroid[ASTEROID_AMOUNT];

        for (int i = 0; i < ASTEROID_AMOUNT; i++) {
            int randomStartDistance = ASTEROID_MIN_DISTANCE + ((int)(Math.random() * ((ASTEROID_MAX_DISTANCE - ASTEROID_MIN_DISTANCE) + 1)));
            int randomStartAngle = 0 + ((int)(Math.random() * ((360 - 0) + 1)));
            asteroids[i] = new Asteroid(milkyWay, randomStartDistance, randomStartAngle, 3, "FFFFFF", 100);
        }


        while (true) {
            // Draw all objects and intitiate orbit function for each

            sun.draw();
            for (Planet obj : ringElements) {
                obj.draw();
            }
            for (Planet obj : planets) {
                obj.draw();
            }
            for (Moon obj : moons) {
                obj.draw();
            }
            for (Asteroid obj : asteroids) {
                obj.draw();
            }

            for (Planet obj : ringElements) {
                obj.orbit();
            }
            for (Planet obj : planets) {
                obj.orbit();
            }
            for (Moon obj : moons) {
                obj.orbit();
            }
            for (Asteroid obj : asteroids) {
                obj.orbit();
            }

            milkyWay.finishedDrawing();
        }
    }
}
