public class Egg extends Food
{
	int tastyScore = 7;
	String type = "non-vegetarian";
	public Egg(double proteins,double fats,double carbs)
	{
		super(proteins,fats,carbs);
	}
	 void getMacroNutrients() {
        System.out.println("A slice of bread has " + this.proteins + " gms of protein, " + this.fats + " gms of fats and " + this.carbs + " gms of carbohydrates.");
    }

    public String getType() {
        return this.type;
    }

    public int getTaste() {
        return this.tastyScore;
    }
}
