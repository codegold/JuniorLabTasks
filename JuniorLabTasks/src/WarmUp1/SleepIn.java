package WarmUp1;


//The parameter weekday is true if it is a weekday, and the parameter vacation
// is true if we are on vacation. We sleep in if it is not a weekday or we're
// on vacation. Return true if we sleep in.
//
//
//        sleepIn(false, false) → true
//        sleepIn(true, false) → false
//        sleepIn(false, true) → true
public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation){
            return true;
            /**
             Solution notes: better to write "vacation" than "vacation == true"
             though they mean exactly the same thing.
             Likewise "!weekday" is better than "weekday == false".
             This all can be shortened to: return (!weekday || vacation);
             Here we just put the return-false last, or could use an if/else.
             */
        }
        return false;
    }
    public boolean nearHundred(int n) {
        return (Math.abs(100 - n) <= 10) || (Math.abs(200-n) <= 10);
    }

    public String missingChar(String str, int n) {
        String front = str.substring(0, n);

       /**  Start this substring at n+1 to omit the char.
         Can also be shortened to just str.substring(n+1)
         which goes through the end of the string.
        */
        String back = str.substring(n+1, str.length());

        return front + back;
    }
}
