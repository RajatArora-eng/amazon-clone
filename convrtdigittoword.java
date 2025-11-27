public class convrtdigittoword {
    public static void main(String[] s) {
        String[] digit = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] words = new String[s[0].length()];
        int i = 0;
        int n = Integer.parseInt(s[0]);
        while (n > 0) {
            words[i] = digit[n % 10];
            i++;
            n /= 10;
        }
        for (i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }
    }
}