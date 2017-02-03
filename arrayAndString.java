import java.util.ArrayList;

public class arrayAndString {

	// ================== Samples ====================
		// public static String joinWords(String[] words) {
		// 	String sentence = "";
		// 	for (String w : words) {
		// 		sentence += w;
		// 	}
		// 	return sentence;

		// 	=========== use StringBuilder ================
		// 	StringBuilder sentence = new StringBuilder();
		// 	for (String w : words) {
		// 		sentence.append(w);
		// 	}
		// 	return sentence.toString();
		// }

		// public static ArrayList<String> merge(String[] words, String[] more) {
		// 	ArrayList<String> sentence = new ArrayList<String>();
		// 	for (String w : words) sentence.add(w);
		// 	for (String w: more) sentence.add(w);
		// 	return sentence;
	// }


	public static void main(String[] args) {
		// System.out.println("hello");

		// =============== Samples ======================

			// String[] a = {"one", "two", "three"};
			// String[] b = {"1", "2", "3"};

			// ArrayList<String> s = merge(a, b);
			// System.out.println(s);
			// String x = joinWords(a);
			// System.out.println(x);

		// ================ questions ===================

		// question 1
		// boolean unique = isUnique("abc");
		// System.out.println(unique);

		// question 2
		// String sort = sort("hello");
		// System.out.println(sort);
		boolean perm = isPerm2("hello", "ohelo");
		System.out.println(perm);

	}

	// question 1: determine if a string has all unique characters. What if you 
	// can't use additional data structures?

	public static boolean isUnique(String str) {
		if (str.length() > 128) return false;
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}

	// question 2: 2 strings, determine if they are permutations of the other
	public static boolean isPerm(String str1, String str2) {
		if (str1.length() != str2.length()) return false;
		return sort(str1).equals(sort(str2));
	}

	public static String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}

	public static boolean isPerm2(String s, String t) {
		if (s.length() != t.length()) return false;
		int[] letters = new int[128];
		char[] char_set = s.toCharArray();
		for (char c : char_set) {
			letters[c]++;
		}
		char[] char_set2 = t.toCharArray();
		for (char d : char_set2) {
			letters[d]--;
			if (letters[d] < 0) {
				return false;
			}
		}
		return true;
	}


}