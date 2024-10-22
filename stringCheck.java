public class stringCheck{
    public static String whoData = "1st president:george washington;2nd president:John Adams;"
    +"3rd president:Thomas Jefferson;"
    +"4th president:James Madison;"
    +"5th president:James Monroe;"
    +"6th president:John Quincy Adams;"
    +"7th president:Andrew Jackson;"
    +"8th president:Martin Van Buren;"
    +"9th president:William Henry Harrison;"
    +"10th president:John Tyler;"
    +"11th president:James K. Polk;"
    +"12th president:Zachary Taylor;"
    +"13th president:Millard Filmore;"
    +"14th president:Franklin Pierce;"
    +"15th president:James Buchanan;"
    +"16th president:Abraham Lincoln;"
    +"17th president:Andrew Johnson;"
    +"18th president:Ulysses S. Grant;"
    +"19th president:Rutherford B. Hayes;"
    +"20th president:James A. Garfield;"
    +"21st president:Chester A. Arthur;"
    +"22nd president:Grover Cleveland;"
    +"23rd president:Benjamin Harrison;"
    +"24th president:Grover Cleveland;"
    +"25th president:William McKinley;"
    +"26th president:Theodore Roosevelt;"
    +"27th president:William Howard Taft;"
    +"28th president:Woodrow Wilson;"
    +"29th president:Warren G. Harding;"
    +"30th president:Calvin Coolidge;"
    +"31st president:Herbert Hoover;"
    +"32nd president:Franklin D. Roosevelt;"
    +"33rd president:Harry S. Truman;"
    +"34th president:Dwight D. Eisenhower;"
    +"35th president:John F. Kennedy;"
    +"36th president:Lyndon B. Johnson;"
    +"37th president:Richard Nixon;"
    +"38th president:Gerald Ford;"
    +"39th president:Jimmy Carter;"
    +"40th president:Ronald Reagan;"
    +"41st president:George H. W. Bush;"
    +"42nd president:Bill Clinton;"
    +"43rd president:George W. Bush;"
    +"44th president:Barak Obama;"
    +"45th president:Donald Trump;"
    +"46th president:Joe Biden;"
    ;

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

        return answer;
    }
}
