package collectionframework1;

import java.util.Comparator;

public class Sortbylname implements Comparator<Marksheet>{

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		// TODO Auto-generated method stub
		return o1.getLname().compareTo(o2.getLname());
	}
	
	

}
