
public class Combo 
{
	int burger;
	int fries;
	int coke;
	
	public Combo(int burger, int coke, int fries) 
	{
		this.burger = burger;
		this.fries = fries;
		this.coke = coke;
	}
	public void setBurger(int burger) 
	{
		this.burger = burger;
	}
	public void setFries(int fries) 
	{
		this.fries = fries;
	}
	public void setCoke(int coke) 
	{
		this.coke = coke;
	}
	public int getBurger() 
	{
		return burger;
	}
	public int getFries() 
	{
		return fries;
	}
	public int getCoke() 
	{
		return coke;
	}
}