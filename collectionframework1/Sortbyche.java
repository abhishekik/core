package collectionframework1;

import java.util.Comparator;

public class Sortbyche implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet n1, Marksheet n2) {
		// TODO Auto-generated method stub
		return n1.getChe()-n2.getChe();
	}

}
