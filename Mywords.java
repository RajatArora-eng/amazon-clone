public class Mywords {
    public static String convertToIndianWords(long number) {
        if (number == 0) return "zero";

        String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"
        };

        String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
        };

        StringBuilder result = new StringBuilder();

        if (number >= 10000000) {
            result.append(convertToIndianWords(number / 10000000)).append(" crore ");
            number %= 10000000;
        }
        if (number >= 100000) {
            result.append(convertToIndianWords(number / 100000)).append(" lakh ");
            number %= 100000;
        }
        if (number >= 1000) {
            result.append(convertToIndianWords(number / 1000)).append(" thousand ");
            number %= 1000;
        }
        if (number >= 100) {
            result.append(convertToIndianWords(number / 100)).append(" hundred ");
            number %= 100;
        }
        if (number > 0) {
            if (number < 20) {
                result.append(units[(int) number]).append(" ");
            } else {
                result.append(tens[(int) number / 10]).append(" ").append(units[(int) number % 10]).append(" ");
            }
        }

        return result.toString().trim();
    }

    public String towords(String string) {
      
        throw new UnsupportedOperationException("Unimplemented method 'towords'");
    }
}
