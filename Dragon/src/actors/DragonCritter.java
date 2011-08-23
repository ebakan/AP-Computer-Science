package actors;
import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.ArrayList;

public class DragonCritter extends Critter{
  @Override
public void makeMove(Location loc) {}
  
  @Override
public void processActors(ArrayList<Actor> actors) {
    for (int i=0;i<actors.size();i++) 
      if (actors.get(i) instanceof Rock || actors.get(i) instanceof Fire) actors.remove(i);
    ArrayList<Location> locations = new ArrayList<Location>();
    for (Actor a: actors) locations.add(a.getLocation());
    locations.addAll(getMoveLocations());
    Fire fire = new Fire();
    if (locations.size()<1) return;
    int choice = (int) Math.random()*locations.size();
    System.out.println(locations.size());
    System.out.println(choice);
    while (getGrid().get(locations.get(choice)) instanceof Rock || getGrid().get(locations.get(choice)) instanceof Fire) choice = (int) Math.random()*locations.size();
    fire.putSelfInGrid(getGrid(), locations.get(choice));
  }
}