import java.util.Comparator;

public class LandComparatorYta implements Comparator<Land> {

	public int compare(Land land1, Land land2) {

		if (land1.getYta() == land2.getYta()) {
			return 0;
		} else if (land1.getYta() < land2.getYta()) {
			return -1;
		} else {
			return 1;
		}
	}

}
