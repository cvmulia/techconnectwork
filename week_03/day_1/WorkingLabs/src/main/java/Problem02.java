public class Problem02 {

    public String generateAstrixTriangle(int value){
        String answer ="";
        int rows = value;
        if (value<=0){
            return "";
        }

        for (int i = 1; i<=rows; i++){
            for (int j=0; j<i;j++){
                answer +="*";
            }
            answer += "\n";
        }

        return answer;

    }

}
