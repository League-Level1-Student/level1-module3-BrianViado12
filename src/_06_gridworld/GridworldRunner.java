package _06_gridworld;

import java.awt.Color;

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
		Location location2 = new Location(0,1);
		Location location3 = new Location(2, 1);
		Bug bug1 = new Bug();
		Bug bug2 = new Bug(Color.blue);
		Flower flower1 = new Flower();
		Flower flower2 = new Flower();
		Flower flower3 = new Flower(Color.red);
		world.add(location, bug1);
		world.add(location1, bug2);
		world.add(location2, flower1);
		world.add(location3, flower2);
		for (int i = 0; i < 95; i++) {
			world.add(world.getRandomEmptyLocation(), flower3);
		}
		bug1.turn();
		bug1.turn();
		
	}
	
}
