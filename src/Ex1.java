public class Ex1 {
    public static void main(String[] args) {
        System.out.println(isContainedInsideString("name nac12321hon", "nac12321"));
    }

    public static boolean isContainedInsideString(String str1, String str2) {
        boolean isContained = false;
        if (str2.length() <= str1.length()) {
            for (int i = 0, j = 0; i < str1.length() - 1; i++) {
                int currentChar = str1.charAt(i);
                if (currentChar == str2.charAt(j)) {
                    isContained = true;
                    j++;
                } else {
                    isContained = false;
                    j = 0;
                    if (currentChar == str2.charAt(j)) {
                        isContained = true;
                        j++;
                    }
                }
                if (j == str2.length()) {
                    break;
                }
            }
        }
        return isContained;
    }
}




