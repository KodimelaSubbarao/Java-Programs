public class ZooSimulation 
{
	public static void main(String[] args)
	{
		Mammal lion = new Mammal("Lion", true);
        System.out.println(lion);
        lion.makeSound();
        lion.nurseYoung();
        Mammal lionCub = lion.reproduce();
        System.out.println(lionCub);
		 System.out.println();
        // Instantiate a Bird object (e.g., eagle) with sample data
        Bird eagle = new Bird("Eagle", true);
        System.out.println(eagle);
        eagle.makeSound();
        eagle.buildNest();
        Bird eaglet = eagle.reproduce();
		System.out.println(eaglet);
	}
}

class  Animal 
{
	private String species ;
	public Animal(String species)
	{
		this.species=species;
	}
	public String getSpecies()
	{
		return species;
	}
	public void makeSound()
	{
		System.out.println(" a generic animal sound");
	}
	public String toString()
	{
		return "Animal "+species;
	}
	public Animal reproduce(){
		System.out.println(" Mammals give birth to live young.");
		return new Animal("Unknown");
	}
}

class Mammal extends Animal
{
	private boolean hasFur;
	public Mammal(String species  ,boolean hasFur)
	{
		super(species );
		this.hasFur=hasFur;
	}
	public void makeSound()
	{
		System.out.println(" a Mammal animal sound");
	}
	public String toString()
	{
		 String furStatus = hasFur ? "has fur" : "does not have fur";
         return "Mammal: " + getSpecies() + ", " + furStatus;
	}
	public Mammal reproduce(){
		System.out.println(" Mammals give birth to live young.");
		return new Mammal(getSpecies(), hasFur);
	}

	public void nurseYoung(){
		System.out.println("Mammals nurse their young");
	}
}

class Bird extends Animal
{
	private boolean canFly ;
	
	public Bird(String species  ,boolean canFly)
	{
		super(species );
		this.canFly=canFly;
	}
	public void makeSound()
	{
		System.out.println(" a Birds animal sound");
	}
	public String toString()
	{
		String flightStatus = canFly ? "can fly" : "cannot fly";
        return "Bird: " + getSpecies() + ", " + flightStatus;
	}
	public Bird reproduce(){
		 System.out.println("Birds lay eggs as a means of reproduction.");
        return new Bird(getSpecies(), canFly);
	}
	public void buildNest(){
		System.out.println(" birds building nests for their eggs.");
	}
}
