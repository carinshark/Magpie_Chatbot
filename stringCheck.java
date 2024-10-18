public class MyThirdProgram{
    public static String whoData = "1st president:george washington;2nd president:John Adams;"
    +"3rd president:;"
    +"4th president:;"
    +"5th president:;"
    +"6th president:;"
    +"7th president:;"
    +"8th president:;"
    +"9th president:;"
    +"10th president:;"
    +"11th president:;"
    +"12th president:;"
    +"13th president:;"
    +"14th president:;"
    +"15th president:;"
    +"16th president:;"
    +"17th president:;"
    +"18th president:;"
    +"19th president:;"
    +"20th president:;"
    +"21st president:;"
    +"22nd president:;"
    +"23rd president:;"
    +"24th president:;"
    +"25th president:;"
    +"26th president:;"
    +"27th president:;"
    +"28th president:;"
    +"29th president:;"
    +"30th president:;"
    +"31st president:;"
    +"32nd president:;"
    +"33rd president:;"
    +"34th president:;"
    +"35th president:;"
    +"36th president:;"
    +"37th president:;"
    +"38th president:;"
    +"39th president:;"
    +"40th president:;"
    +"president:;"
    +"president:;"
    +"president:;"
    +"president:;"
    +"president:;";

    public static void main(String[] args) {
        
        getAnswer("1st president");
        getAnswer("2nd president");
        



    }

    public static String getAnswer(String question){
        String answer;
        System.out.println("Please format your strings correctly! otherwise I will not understand ): ");
        if (whoData.contains(question.toLowerCase())) {
            
            int questionStart = whoData.indexOf(question.toLowerCase());

            String data = whoData.substring(questionStart);
            int answerStart = data.indexOf(":");
            int answerEnd = data.indexOf(";");

            answer = data.substring(answerStart+1,answerEnd);

            
        }
        else {
            answer = "beyond my comprehension";

        }

        return "";
    }
}
