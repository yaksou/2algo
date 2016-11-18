

import java.io.*;
import java.util.*;
import java.io.*;
import java.util.*;

public class Land {

	private String landetsnamn;
	private int invånare;
	private int yta;
	private String huvudstad;

	public Land(String land, int inv, int storlek, String huvudstadsnamn) {
		landetsnamn = land;
		invånare = inv;
		yta = storlek;
		huvudstad = huvudstadsnamn;
	}

	public String getLandsnamn() {
		return landetsnamn;
	}

	public String getStadsnamn() {
		return huvudstad;
	}

	public int getInv() {
		return invånare;
	}

	public int getYta() {
		return yta;
	}

	public String toString() {
		return ("Land: " + landetsnamn + ", Invånare: " + invånare + ", Yta: " + yta + ", Huvudstad: " + huvudstad
				+ ".");
	}

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("europa.txt"));

		ArrayList<Land> lander = new ArrayList<Land>();
		
		

		for (int i = 0; scan.hasNext(); i++) {
			String tempLandNamn = scan.next();
			int tempInv;
			String temp = scan.next();

			while (!(47 < temp.charAt(0) && temp.charAt(0) < 58)) {
				tempLandNamn = tempLandNamn + " " + temp;
				temp = scan.next();
			}

			tempInv = Integer.parseInt(temp);

			int area = scan.nextInt();

			String hstad = scan.nextLine();

			hstad = hstad.substring(1, hstad.length());

			lander.add(new Land(tempLandNamn, tempInv, area, hstad));

		}

		Scanner userScan = new Scanner(System.in);

		System.out.println("Vilken sorterings metod: Efter landsnamn (1), Efter invånare (2), Efter yta (3).");

		int val = userScan.nextInt();

		PrintWriter out = null;

		try {

			out = new PrintWriter(new FileOutputStream("data3.txt", true));

			switch (val) {
			case 1:

				lander.sort(new LandComparatorLandsnamn());

				break;
			case 2:
				lander.sort(new LandComparatorInv());
				break;
			case 3:
				lander.sort(new LandComparatorYta());
				break;

			default:
				System.out.println("Avslutar program.");
				System.exit(0);
				break;
			}

		} catch (IOException e) {

			System.out.println(e);
		}

		for (int i = 0; i < lander.size(); i++)
			System.out.println(lander.get(i).toString());

		out.close();

	}

}
