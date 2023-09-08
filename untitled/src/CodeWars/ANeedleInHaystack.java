package CodeWars;

public class ANeedleInHaystack {
    public static void main(String[] args) {

    }

    public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            Object obj = haystack[i];

            if (obj instanceof String) {
                String str = (String) obj;
                if (str.equals("needle")) {
                    return "found the needle at index " + i;
                }
            }

        }
        return null;
    }

}
