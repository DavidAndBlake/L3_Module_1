package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return 0; // <- this needs changing
	}

	public static int countPearls(List<Boolean> oysters) {
		int containsAPearl = 0;
		for (int i = 0; i < oysters.size(); i++) {

			if (oysters.get(i).equals(true)) {
			containsAPearl++;	
			}
			if (oysters.get(i).equals(false)) {
			}
		}
		System.out.println(containsAPearl);
		return containsAPearl;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = peeps.get(0);
		for (int i = 0; i < peeps.size(); i++) {
			if (tallest < peeps.get(i))
			{
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static Object findLongestWord(List<String> words) {
		String longest = words.get(0);
		for (int i = 0; i < words.size(); i++) {
			if (longest.length() < words.get(i).length())
			{
				longest = (words.get(i));
			}
		}
		return longest;
	}

	// Add other methods here
}