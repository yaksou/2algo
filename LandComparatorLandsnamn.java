import java.util.Comparator;

public class LandComparatorLandsnamn implements Comparator<Land> {
	public int compare(Land land1, Land land2) {
		return land1.getLandsnamn().compareTo(land2.getStadsnamn());
	}

}
