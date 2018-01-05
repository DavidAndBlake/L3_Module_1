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

	// Add other methods here
}