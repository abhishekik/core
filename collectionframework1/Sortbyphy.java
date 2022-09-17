package collectionframework1;

import java.util.Comparator;

public class Sortbyphy implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		// TODO Auto-generated method stub
		return m1.getPhy() - m2.getPhy();
	}
	
	

}
