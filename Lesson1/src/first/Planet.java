package first;

public class Planet {
    private String name;
    private int moons;
    private int suns;
    

    public Planet(String name, int moons, int suns) {
        this.name = name;
        this.moons=moons;
        this.suns=suns;
    }

    public String toString() {
        return "Planets name:"+name+" Number of moons:"+moons+" Number of suns: "+suns;
    }
}
