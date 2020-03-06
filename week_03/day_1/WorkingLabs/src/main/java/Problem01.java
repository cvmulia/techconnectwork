public class Problem01 {

    public String rowOfAstrix(Integer value) {
        String answer = "";
        if (value <= 0) {
            return "";
        } else {

            for (int i = 0; i < value; i++) {

                answer += "*";
            }

            return answer;

        }
    }
}


