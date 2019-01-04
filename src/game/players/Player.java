package game.players;


public class Player {

	private int health, counter;
	private String name, color;
	private double speed, x, y;
	
	public Player() {
		this.health = 100;
		this.name = "Player 1";
		this.speed = 50;
	}
	
	public Player(int health, String name, String color, double speed) {
		this.health = health;
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	
	public void movement(int direction) {
		
		switch(direction) {
		case 0:
			break;
		case 1:
			break;
		default:
			//do nothing
			break;
			
		}
	}
	

									//SETTERS AND GETTERS
	public void setHealth(int health) {
		this.health = health;
	}
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public int getHealth() {
		return health;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getSpeed() {
		return speed;
	}
}
