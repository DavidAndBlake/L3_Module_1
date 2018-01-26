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
			if (tallest < peeps.get(i)) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static Object findLongestWord(List<String> words) {
		String longest = words.get(0);
		for (int i = 0; i < words.size(); i++) {
			if (longest.length() < words.get(i).length()) {
				longest = (words.get(i));
			}
		}
		return longest;
	}

	public static Object containsSOS(List<String> message1) {
		for (int i = 0; i < message1.size(); i++) {
			String s = message1.get(i);
			if (s.contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		for (int i = 0; i < results.size(); i++) {
			for (int j = i + 1; j < results.size(); j++) {
				if (results.get(i) > results.get(j)) {
					double temp = results.get(i);
					results.set(i, results.get(j));
					results.set(j, temp);
				}
			}
		}
		return results;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		for (int i = 0; i < unsortedSequences.size(); i++){
			for (int j = i + 1; j < unsortedSequences.size(); j++) {
				if 
			}
		}
		return null;
	}

	// Add other methods here
}