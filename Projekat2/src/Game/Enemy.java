public static Enemy{
		
			private String tip;
			private int x;
			private int y;
			private int width;
			private int heigth;
			private int damage;
			
			public Enimy(String tip, int x, int y, int width, int heigth, int damage) {
				if (tip == Nule || tip.trim().isEmpty()) {
					throw new IllegalArgumentException("Tip neprijatelja ne smije biti prazan!");
				}
			
				this.tip = tip.trim();
				this.x = x;
				this.y = y;
				this.width = width;
				this.heigth = heigth;
				this.damage = Math.max(0, damage);
						
			}
			
			public String gettip() {
				return tip;
			}
			
			public void settip(String tip) {
			     if (tip == Nule || tip.trim().isEmtpy()) {
			    	 throw new IllegalArgumentException("Tip neprijatelja ne smije biti prazan!");
			     }
			     this.tip = tip.trim();
			}
			
			------
			
			public int getX() {
				return x;
			}
			
			public void setX(int x) {
			     this.x = x;
			}
			
			-------
			
			public int getY() {
				return y;
			}
			
			public void setY(int y) {
			     this.y = y;
			}
			-------
			
			public int getWidth() {
				return width;
			}
			
			public void setWidth(int width) {
			     this.width = width;
			}
			
			-------
			
			public int getHeigth() {
				return heigth;
			}
			
			public void setHeigth(int heigth) {
			     this.heigth = heigth;
			}

			-----
						
			public String getDamage() {
				return damage;
			}
			
			public void setDamage(int Damage) {
			     this.damage = Math.max(0, damage);
			}
			
			
			public String toString() {
				return String.format("Enemy(%s) @ (%d %d) %dx%d DMG=%d",
						tip, x, y, width, heigth, damage);
			}
		}
