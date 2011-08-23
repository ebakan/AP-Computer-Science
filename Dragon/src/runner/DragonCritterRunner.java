package runner;

import actors.*;
import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class DragonCritterRunner {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(19,19));
		DragonCritter dragon = new DragonCritter();
		world.add(dragon);
		world.show();

	}

}
