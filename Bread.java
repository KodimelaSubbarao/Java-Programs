public class Bread  extends Food
{
	int tastyScore = 8;
	String type = "vegetarian";
	public Bread(double proteins,double fats,double carbs)
	{
		super(proteins,fats,carbs);
	}
	public void getMacroNutrients()
	{
		System.out.println(" A slice of bread has "+this.proteins+" gms of protein, "+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates.");
	}
	public String getType()
	{
        return this.type;
    }

    public int getTaste()
	{
        return this.tastyScore;
    }
}
