package Game;

import java.util.ArrayList;

public class Game {

	private Player player;
	private ArrayList<Enemy> enemies = new();
	private ArrayList<String> eventLog = new();
	
	public static void main(String[] args) {
		player = new Player("bo b", 1, 1);
		
		enemies.add(new Enemy());
		enemies.add(new Enemy("Goblin;12;5;16x16;20"));

	}
	
	private boolean checkCollision(Player p, Enemy e)
	{
		return (p.x == e.x && p.y == e.y);

	}
	private void decreaseHealth(Player p, Enemy e)
	{
		int startHealth = p.health;
		int newHealth = p.health - e.damage;
		
		p.health = newHealth >= 0 ? newHealth : 0;
		eventLog.add("Hit:Player by " + e.type + " for " +  e.damage + " -> HP " + startHealth + "->" + p.health);
		
	}
	private void addEnemy(Enemy e)
	{
		enemies.Add(e);
		eventLog.add("New enemy: " + e.type);
		
	}
	private ArrayList<Enemy> findByType(String query)
	{
		arrayList<Enemy> findedEnemies = new();
		query = query.toLowerCase();
		
		for (Enemy e: enemies)
		{
			if(e.type == query)
				findedEnemies.add(e);
			
		}
		
		return findedEnemies;
			
	}
	private ArrayList<Enemy> collidingWithPlayer()
	{
		ArrayList<Enemy> findedEnemies = new();

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
