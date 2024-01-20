package SolarSystem;

import SolarSystem.Atmosphere.Atmosphere;

public class Planet {
    public int diameter;
    public int mass;
    public Atmosphere atmosphere;

    public Atmosphere getAtmosphere() {
        return atmosphere;
    }

    public Planet(int diameter, int mass, Atmosphere atmosphere) {
        this.diameter = diameter;
        this.mass = mass;
        this.atmosphere = atmosphere;
    }
}
