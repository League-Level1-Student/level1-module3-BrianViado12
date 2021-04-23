package _06_gridworld;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridworldRunner {
	public static void main(String[] args) {
		World world = new World();
		world.show();
		Location location = new Location(1, 1);
		Location location1 = new Location(5, 4);
		Bug bug1 = new Bug();
		Bug bug2 = new Bug();
		world.add(location, bug1);
		world.add(location1, bug2);
		
	}
	
}
