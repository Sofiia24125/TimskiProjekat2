package Game;

public class Enemy{
		
			private String type;
			private int x;
			private int y;
			private int width;
			private int heigth;
			private int damage;
			
			public Enemy(String tip, int x, int y, int width, int heigth, int damage) {
				if (tip == null || tip.trim().isEmpty()) {
					throw new IllegalArgumentException("Tip neprijatelja ne smije biti prazan!");
				}
			
				this.type = tip.trim();
				this.x = x;
				this.y = y;
				this.width = width;
				this.heigth = heigth;
				this.damage = Math.max(0, damage);
						
			}
			public Enemy(String pars)
			{
		        String[] parts = pars.split(";");
				
				this.type = parts[0].trim();
				this.x = Integer.parseInt(parts[1]);
				this.y = Integer.parseInt(parts[2]);
				this.width = Integer.parseInt(parts[3]);
				this.heigth = Integer.parseInt(parts[4]);
				this.damage = Math.max(0, Integer.parseInt(parts[5]));
			}
			public String getType() {
				return type;
			}
			
			public void setType(String tip) {
			     if (tip.isEmpty())
			     {
			    	 throw new IllegalArgumentException("Tip neprijatelja ne smije biti prazan!");
			     }
			     this.type = tip.trim();
			}
			
			
			public int getX() {
				return x;
			}
			
			public void setX(int x) {
			     this.x = x;
			}
			
			
			public int getY() {
				return y;
			}
			
			public void setY(int y) {
			     this.y = y;
			}
			
			public int getWidth() {
				return width;
			}
			
			public void setWidth(int width) {
			     this.width = width;
			}
			
			
			public int getHealth() {
				return heigth;
			}
			
			public void setHeigth(int heigth) {
			     this.heigth = heigth;
			}

						
			public int getDamage() {
				return damage;
			}
			
			public void setDamage(int Damage) {
			     this.damage = Math.max(0, damage);
			}
			
			
			public String toString() {
				return String.format("Enemy(%s) @ (%d %d) %dx%d DMG=%d",
						type, x, y, width, heigth, damage);
			}
		}
