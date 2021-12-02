package finished;

import static java.util.stream.Collectors.joining;

public class timeConversion {
    //Given a time in -hour AM/PM format, convert it to military (24-hour) time.

    public static String tester(String s) {
        String message = "";
        String newMessage = s.substring(0, s.length() -2);

        String hours = s.substring(0, 2);
        String remained = s.substring(2, s.length()-2);

        if(s.endsWith("PM")){
            if(s.startsWith("12")){
                //print as is
                message = newMessage;
            }
            else{
                //parse to int & add 12 to make it military time
                int h = Integer.parseInt(hours);
                h += 12;
                message = h + remained;
            }
        }
        else if(s.endsWith("AM")){
            if(s.startsWith("12")){
                int h = Integer.parseInt(hours);
                h -= 12;
                message = "0" + h + remained;
            }
            else{
                //print as is
                message = newMessage;
            }
        }
        return message;
    }

    public static void main(String[] args) {
        System.out.println(tester("07:05:45PM"));
        System.out.println(tester("12:01:00PM"));
        System.out.println(tester("12:01:00AM"));
        System.out.println(tester("1:01:00AM"));

        //07:05:45PM --> 19:05:45
        //12:01:00PM --> 12:01:00 - WORKS
        //12:01:00AM --> 00:01:00
        //1:01:00 - WORKS
    }


}
