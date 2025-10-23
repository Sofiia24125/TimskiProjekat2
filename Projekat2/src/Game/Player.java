package Game;

public class Player {
    private String name;
    private int x;
    private int y;
    private int width;
    private int height;
    private int health;

   
    public Player(String name, int x, int y, int width, int height, int health) {
        this.name = formatName(name);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.health = fixHealth(health);
    }

   
    public Player() {
        this("Unknown", 0, 0);
    }

    
    public Player(String name, int x, int y) {
        this(name, x, y, 50, 50, 100);
    }

  
    private String formatName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "Unknown";
        }
        name = name.trim();
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    
    private int fixHealth(int health) {
        if (health < 0) return 0;
        if (health > 100) return 100;
        return health;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Player{name='" + name + "', x=" + x + ", y=" + y +
               ", width=" + width + ", height=" + height + ", health=" + health + "}";
    }
    
    public int getX()
    {
    	return x;
    	
    }
    public int getY()
    {
    	return y;
    	
    }
    public int getHealth()
    {
    	return health;
    	
    }
    public void setHealth(int health)
    {
    	this.health = health;
    	
    }
}
