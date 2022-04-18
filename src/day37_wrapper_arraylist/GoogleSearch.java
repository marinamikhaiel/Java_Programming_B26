package day37_wrapper_arraylist;

public class GoogleSearch {
    public static void main(String[] args) {

        String result = "About 2,550,000,000 results (1.00 seconds)";
        String[] resultApart = result.split(" ");

        String resultStr = resultApart[1].replace(",", "");
        String timeStr = resultApart[3].substring(1);

        System.out.println(resultStr);
        System.out.println(timeStr);

        long resultNum = Long.parseLong(resultStr);
        double timeNum = Double.parseDouble(timeStr);

        if (resultNum >= 0) {
            System.out.println("TEST CASE PASSED - POSITIVE NUMBER");
        }
        if (timeNum <= 2 && timeNum >= 0) {
            System.out.println("TEST CASE PASSED - Under 2 seconds");
        }

    }
}
