public abstract class Food  
{
	double proteins;
	double fats;
	double carbs;
	double tastyScore;
	public Food(double proteins,double fats,double carbs)
	{
		this.proteins= proteins;
		this.fats=fats;
		this.carbs= carbs;
	}
	abstract void getMacroNutrients();
}
