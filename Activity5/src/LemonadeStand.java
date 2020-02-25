
class LemonadeStand {
	private int lemons;
	private int gallonsOfWater;
	private int cupsOfSugar;
	private int emptyGlasses;
	private int glassesOfLemonade;
	private double price;
	private double income;
	
	public LemonadeStand()
	{
		setLemons(0);
		setGallonsOfWater(0);
		setCupsOfSugar(0);
		setEmptyGlasses(0);
		setGlassesOfLemonade(0);
		setPrice(0);
		setIncome(0);
	}
	
	public LemonadeStand(int newLemons, int water, int sugar, int glasses, double newPrice)
	{
		/*this.lemons = initLemons;
		this.gallonsOfWater = initGallonsOfWater;
		this.cupsOfSugar = initCupsOfSugar;
		this.emptyGlasses = initEmptyGlasses;
		this.price = initPrice;*/
		
		setLemons(newLemons);
		setGallonsOfWater(water);
		setCupsOfSugar(sugar);
		setEmptyGlasses(glasses);
		setPrice(newPrice);
		setGlassesOfLemonade(0);
		setIncome(0);
	}

	public int getLemons() {
		return lemons;
	}

	public void setLemons(int lemons) {
		if (lemons >= 0)
		{
			this.lemons = lemons;
		}
		else 
		{
			this.lemons = 0;
		}
	}

	public int getGallonsOfWater() {
		return gallonsOfWater;
	}

	public void setGallonsOfWater(int gallonsOfWater) {
		if (gallonsOfWater >= 0)
		{
			this.gallonsOfWater = gallonsOfWater;
		}
		else 
		{
			this.gallonsOfWater = 0;
		}
	}

	public int getCupsOfSugar() {
		return cupsOfSugar;
	}

	public void setCupsOfSugar(int cupsOfSugar) {
		if (cupsOfSugar >= 0)
		{
			this.cupsOfSugar = cupsOfSugar;
		}
		else 
		{
			this.cupsOfSugar = 0;
		}
	}

	public int getEmptyGlasses() {
		return emptyGlasses;
	}

	public void setEmptyGlasses(int emptyGlasses) {
		if (emptyGlasses >= 0)
		{
			this.emptyGlasses = emptyGlasses;
		}
		else 
		{
			this.emptyGlasses = 0;
		}
	}

	public int getGlassesOfLemonade() {
		return glassesOfLemonade;
	}

	public void setGlassesOfLemonade(int glassesOfLemonade) {
		if (glassesOfLemonade >= 0)
		{
			this.glassesOfLemonade = glassesOfLemonade;
		}
		else 
		{
			this.glassesOfLemonade = 0;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price >= 0)
		{
			this.price = price;
		}
		else 
		{
			this.price = 0;
		}
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		if (income >= 0)
		{
			this.income = income;
		}
		else 
		{
			this.income = 0;
		}
	}
	
	public int makeLemonade()
	{
		if(lemons - 6 >= 0 && gallonsOfWater - 1 >= 0 && cupsOfSugar - 1 >= 0 && emptyGlasses - 8 >= 0)
		{
			lemons = lemons - 6;
			gallonsOfWater = gallonsOfWater - 1;
			cupsOfSugar = cupsOfSugar - 1;
			emptyGlasses = emptyGlasses - 8;
			glassesOfLemonade = glassesOfLemonade + 8;
			return 8;
		}
		else 
		{
			return 0;
		}
	}
	
	public int sellLemonade()
	{
		makeLemonade();
		if(glassesOfLemonade > 0)
		{
			glassesOfLemonade = glassesOfLemonade - 1;
			income = income + price;
			return 1;
		}
		else 
		{
			return 0;
		}
	}
	
	public int sellMoreLemonade(int number)
	{
		makeLemonade();
		if(number <= 8)
		{
			if((glassesOfLemonade - number) >= 0) 
			{
				glassesOfLemonade = glassesOfLemonade - number;
				income = income + (price * number);
				return number;
			}
			else 
			{
				number = glassesOfLemonade;
				glassesOfLemonade = 0;
				income = income + (price * number);
				return number;
			}
		}
		else 
		{
			number = 8;
			glassesOfLemonade = glassesOfLemonade - number;
			income = income + (price * number);
			return number;
		}
	}
	
	public static void main(String[] args)
	{
		LemonadeStand lemonadeStand = new LemonadeStand(15, 3, 4, 20, 1.5);
		lemonadeStand.makeLemonade();
		System.out.println(lemonadeStand.getLemons());
		System.out.println(lemonadeStand.getGallonsOfWater());
		System.out.println(lemonadeStand.getGlassesOfLemonade());
		lemonadeStand.sellLemonade();
		lemonadeStand.sellLemonade();
		lemonadeStand.sellLemonade();
	}

}
