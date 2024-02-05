package first;

import java.util.ArrayList;
import java.util.List;

public class World {
    private String name;
    // list for the planets
    private List<Planet> planets;

    public World(String name) {
        this.name = name;
        planets = new ArrayList<>();
    }

    // add planets to the world
    public void addPlanet(Planet p) {
        planets.add(p);
    }

    // get all the planets of the world
    public void getPlanets() {
        for (Planet planet : planets) {
            System.err.println(planet);
        }
    }

    public String toString() {
        return "Worlds name:" + name;
    }
}
