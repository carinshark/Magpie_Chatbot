
import java.util.Scanner;

public class Magpie{
    
    
    public static void main(String[] args) {
        // datasets
    String people = "1st president:George Washington;2nd president:John Adams;"
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
    +"46th president:Joe Biden;"+
    "first president:George Washington;second president:John Adams;"
    +"third president:Thomas Jefferson;"
    +"fourth president:James Madison;"
    +"fifth president:James Monroe;"
    +"sixth president:John Quincy Adams;"
    +"seventh president:Andrew Jackson;"
    +"eighth president:Martin Van Buren;"
    +"ninth president:William Henry Harrison;"
    +"tenth president:John Tyler;"
    +"eleventh president:James K. Polk;"
    +"twelvth president:Zachary Taylor;"
    +"thirteenth president:Millard Filmore;"
    +"fourteenth president:Franklin Pierce;"
    +"fifteenth president:James Buchanan;"
    +"sixteenth president:Abraham Lincoln;"
    +"seventeenth president:Andrew Johnson;"
    +"eighteenth president:Ulysses S. Grant;"
    +"nineteenth president:Rutherford B. Hayes;"
    +"twentyth president:James A. Garfield;"
    +"twenty first president:Chester A. Arthur;"
    +"twentysecond president:Grover Cleveland;"
    +"twenty third president:Benjamin Harrison;"
    +"twenty fourth president:Grover Cleveland;"
    +"twenty fifth president:William McKinley;"
    +"twenty sixth president:Theodore Roosevelt;"
    +"twenty seventh president:William Howard Taft;"
    +"twenty eighth president:Woodrow Wilson;"
    +"twenty ninth president:Warren G. Harding;"
    +"thirtyth president:Calvin Coolidge;"
    +"thirty first president:Herbert Hoover;"
    +"thirty second president:Franklin D. Roosevelt;"
    +"thirty third president:Harry S. Truman;"
    +"thirty fourth president:Dwight D. Eisenhower;"
    +"thirty fifth president:John F. Kennedy;"
    +"thirty sixth president:Lyndon B. Johnson;"
    +"thirty seventh president:Richard Nixon;"
    +"thirty eighth president:Gerald Ford;"
    +"thirty ninth president:Jimmy Carter;"
    +"fourtyth president:Ronald Reagan;"
    +"fourty first president:George H. W. Bush;"
    +"fourty second president:Bill Clinton;"
    +"fourty third president:George W. Bush;"
    +"fourty fourth president:Barak Obama;"
    +"fourty fifth president:Donald Trump;"
    +"fourty sixth president:Joe Biden;"    
    ;
    String greetings = "how are you:I am amazing, how are you?;"+
    "who are you:I am a chatbot programed by fortnite CEO epic games tim sweeney;"+
    "why were you created:I was created for a AP CSA project.;"+
    "when is your birthday:My birthday is the 21st of October.;"+
    "hello:haiiiiii!;"+
    "heya:hiya!;"+
    "hey:hi;"+
    "how r u:good good good!;"+
    "good:great! so would you like to ask me a question about who I am, the order of presidents (who is the 1st president?, second president?) ;"+
    ":;"+
    ":;"+
    ":;"+
    ":;"+
    ":;"+
    ":;"+
    ":;"+
    ":;"+
    ":;"+
    ":;"+
    ":;"+
    ":;"+
    ":;"+
    ":;"+
    ":;"+
    ":;";

        boolean botActive = true;

        Scanner scan = new Scanner(System.in);

        String question;

        while (botActive){
            question = scan.nextLine();

            //remove punchuation

            question = (question.contains("."))?question.substring(0,question.indexOf(".")):question;
            question = (question.contains("!"))?question.substring(0,question.indexOf("!")):question;
            question = (question.contains("?"))?question.substring(0,question.indexOf("?")):question;
            question = (question.contains("/"))?question.substring(0,question.indexOf("/")):question;
            question = (question.contains("'"))?question.substring(0,question.indexOf("'")):question;

            
            if (question.equals("end")){
                botActive = false;
            }
            else if(question.contains("who is the")){
            question = question.substring(question.indexOf("the ")+4);
            System.out.println("the "+question+" is "+getAnswer(question,people));
            }
            else{
                System.out.println(getAnswer(question,greetings));            }


        }

        scan.close();
    }

    public static String getAnswer(String question,String whoData){
        String answer;
        
        if (whoData.contains(question.toLowerCase())) {
            
            int questionStart = whoData.indexOf(question.toLowerCase());

            String data = whoData.substring(questionStart);
            int answerStart = data.indexOf(":");
            int answerEnd = data.indexOf(";");

            answer = data.substring(answerStart+1,answerEnd);

            
        }
        else {

            answer = "Your question is beyond my comprehension "+pickExpression();

        }

        return answer;
    }

    public static String pickExpression(){
        switch ((int)(Math.random()*5)) {
            case 0:
                return ":)";
            case 1:
                return ":3";
            case 2:
                return ":D";
            case 3:
                return ":]";
            case 4:
                return ":}";
        }
        return ":O";
    }
    
}
