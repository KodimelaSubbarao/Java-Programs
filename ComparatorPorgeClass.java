package Collections;

public class ComparatorPorgeClass 
{
	private String StdName;
	private int StdId;
	private String StdBranch;
	
	public ComparatorPorgeClass(String StdName, int StdId, String StdBranch)
	{
		this.StdName=StdName;
		this.StdId=StdId;
		this.StdBranch=StdBranch;
	}

	public String getStdName() 
	{
		return StdName;
	}

	public int getStdId() 
	{
		return StdId;
	}

	public String getStdBranch() 
	{
		return StdBranch;
	}
	public String toString()
	{
		return StdName+"\t"+StdId+"\t"+StdBranch;
	}
}
