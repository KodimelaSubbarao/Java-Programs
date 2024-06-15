package Collections;

import java.util.Comparator;

public class ComparatorClass implements Comparator<ComparatorPorgeClass>
{

	@Override
	public int compare(ComparatorPorgeClass cpc1, ComparatorPorgeClass cpc2) 
	{
		//return cpc1.getStdId()-cpc2.getStdId();
		//return cpc1.getStdName().compareTo(cpc2.getStdName());
		return cpc1.getStdBranch().compareTo(cpc2.getStdBranch());
	}
	
}
