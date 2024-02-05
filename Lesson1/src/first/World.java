package first;

public class World {
    private String name;
    Planet planet = new Planet("Earth",1,1);
    public World(String name) {
    	this.name = name;
    }

    public String toString() {
    	return "Worlds name:"+name+", "+planet;
    } 
}
