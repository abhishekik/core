package collectionframework1;

import java.util.Comparator;

public class Sortbymat implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet z1, Marksheet z2) {
		// TODO Auto-generated method stub
		return z1.getMat()-z2.getMat();
	}

}
