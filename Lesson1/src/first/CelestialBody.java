package first;

// CelestialBody class representing any celestial body (e.g., planets, moons, stars)
class CelestialBody {
    private String name;
    private double mass; // in kilograms

    public CelestialBody(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public String toString() {
        return "Name: " + name + ", Mass: " + mass + " kg";
    }
}
