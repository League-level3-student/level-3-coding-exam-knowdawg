import java.util.HashMap;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int matches = 0;
		for (String keys1 : hashmap1.keySet()) {
			for (String keys2 : hashmap2.keySet()) {
				if (keys1 == keys2) {
					matches += 1; 
				}
			}
		} return matches;
	}
}
