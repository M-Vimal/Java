
public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] strs1 = {"flower", "flow", "flight"};
	        String[] strs2 = {"dog", "racecar", "car"};

	        System.out.println("Longest common prefix of strs1: " + lcp(strs1)); // Output: "fl"
	        System.out.println("Longest common prefix of strs2: " + lcp(strs2)); // Output: ""
	    }
	
	public static String lcp(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start with the first string as the prefix
        String prefix = strs[0];

        // Compare the prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            // While the current string does not start with the prefix
            while (strs[i].indexOf(prefix) != 0) {
                // Reduce the prefix by one character from the end
                prefix = prefix.substring(0, prefix.length() - 1);
                // If the prefix is empty, return ""
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

	}


