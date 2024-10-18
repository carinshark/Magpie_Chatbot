

public class stringCheck{
    public static String whoData = "1st president:george washington;2nd president:John Adams;";
    public static void main(String[] args) {
        
        getAnswer("1st president");
        getAnswer("2nd president");
        



    }

    public static String getAnswer(String question){
        String answer;
        if (whoData.contains(question.toLowerCase())) {
            
            int questionStart = whoData.indexOf(question.toLowerCase());

            String data = whoData.substring(questionStart);
            int answerStart = data.indexOf(":");
            int answerEnd = data.indexOf(";");

            answer = data.substring(answerStart+1,answerEnd);

            
        }
        else {
            answer = "uknown";

        }

        return "";
    }
}