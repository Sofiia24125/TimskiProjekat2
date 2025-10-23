package Game;

import java.util.ArrayList;

public class Game {

	private static Player player;
	private static ArrayList<Enemy> enemies = new ArrayList<>();
	private static ArrayList<String> eventLog = new ArrayList<>();
	
	public static void main(String[] args) {
		player = new Player("bo b", 1, 1);
		
		enemies.add(new Enemy("Goblin", 1,1,10,15,25));
		enemies.add(new Enemy("Goblin;12;5;16x16;20"));

		resolveCollsions();
		
	}
	
	private boolean checkCollision(Player p, Enemy e)
	{
		return (p.getX() == e.getX() && p.getY() == e.getY());

	}
	private void decreaseHealth(Player p, Enemy e)
	{
		int startHealth = p.getHealth();
		int newHealth = p.getHealth() - e.getHealth();
		
		startHealth = newHealth >= 0 ? newHealth : 0;
		eventLog.add("Hit:Player by " + e.getType() + " for " +  e.getDamage() + " -> HP " + startHealth + "->" + p.getHealth());
		
	}
	private void addEnemy(Enemy e)
	{
		enemies.add(e);
		eventLog.add("New enemy: " + e.getType());
		
	}
	private ArrayList<Enemy> findByType(String query)
	{
		ArrayList<Enemy> findedEnemies = new ArrayList<>();
		query = query.toLowerCase();
		
		for (Enemy e: enemies)
		{
			if(e.getType() == query)
				findedEnemies.add(e);
			
		}
		
		return findedEnemies;
			
	}
	private ArrayList<Enemy> collidingWithPlayer()
	{
		ArrayList<Enemy> findedEnemies = new ArrayList<>();

		for (Enemy e: enemies)
		{
			if(checkCollision(player, e))
				findedEnemies.add(e);

			
		}
		return findedEnemies;

	}
	private void resolveCollsions()
	{
		for (Enemy e: collidingWithPlayer())
		{
			decreaseHealth(player, e);
		}
	}

}
