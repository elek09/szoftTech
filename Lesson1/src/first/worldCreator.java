package first;

public class worldCreator {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		World world = new World("Solar system");
		Planet planet = new Planet("Earth", 1, 1);
		world.addPlanet(planet);
		System.out.println(world);
		world.getPlanets();
	}
}