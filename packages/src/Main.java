import SolarSystem.Atmosphere.Atmosphere;
import SolarSystem.Planet;

public class Main {
    public static void main(String[] args) {

        Atmosphere atmosfera = new Atmosphere("dense", false);
        Planet planeta = new Planet(100, 9999, atmosfera);

        System.out.println(planeta.atmosphere.density);
        System.out.println(planeta.mass);


    }
}