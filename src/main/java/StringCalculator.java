public class StringCalculator {

    public static double add(String input) {

        double output = 0;
        String[] numInput = input.split(",");

        if (numInput.length > 2) {
            throw new RuntimeException("Using more than 2");
        } else {
            for (String num: numInput){
                if (!num.isEmpty()) {
                    double numCheck = Double.parseDouble(num);
                    output += numCheck;
                }
            }
        }

        return output;
    }
}
