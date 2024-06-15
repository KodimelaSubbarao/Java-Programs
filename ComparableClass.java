package Collections;

public class ComparableClass implements Comparable<ComparableClass>
{
	private String StdName;
	private int StdId;
	private String StdBranch;
	
	public ComparableClass(String StdName, int StdId, String StdBranch)
	{
		this.StdName=StdName;
		this.StdId=StdId;
		this.StdBranch=StdBranch;
	}

	@Override
	public String toString() 
	{
		return StdName+"\t"+StdId+"\t"+StdBranch;
	}
	@Override
	public int compareTo(ComparableClass cc)
	{
		//return this.StdId-cc.StdId;
		//return this.StdName.compareTo(cc.StdName);
		return this.StdBranch.compareTo(cc.StdBranch);
	}
	
}
