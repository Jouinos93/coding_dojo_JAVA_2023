import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return String.format("Hello, lovely to see you. How are you,?");
    }
    
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }

    public String guestGreeting() {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        String dayPeriod;
        if (hour >= 5 && hour < 12) {
            dayPeriod = "morning";
        } else if (hour >= 12 && hour < 18) {
            dayPeriod = "afternoon";
        } else {
            dayPeriod = "evening";
        }
        return guestGreeting("Alfred", dayPeriod);
    }
    
    public String dateAnnouncement() {
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
        String formattedDate = formatter.format(currentDate);
        return "It is currently " + formattedDate + ".";
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.contains("Alexis")) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.contains("Alfred")) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that, I shall retire.";
        }
    }
    
    // NINJA BONUS: Guest Greeting Overloading
    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely to see you.", name);
    }

    // SENSEI BONUS: Write your own AlfredQuote method
    public String customAlfredQuote() {
        // Your custom behavior for Alfred goes here
        return "I'm tired. I need a nap.";
    }
}
