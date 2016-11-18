
import java.util.Comparator;

public class LandComparatorInv implements Comparator<Land> {

	public int compare(Land land1, Land land2) {

		if (land1.getInv() == land2.getInv()) {
			return 0;
		} else if (land1.getInv() < land2.getInv()) {
			return -1;
		} else {
			return 1;
		}
	}

}
