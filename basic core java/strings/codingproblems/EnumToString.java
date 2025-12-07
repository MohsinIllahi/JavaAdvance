package strings.codingproblems;

public class EnumToString
{
    public static void main(String[] args)
    {
        enum Day 
        {
            SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
        }

        String days = "";
        for (Day day : Day.values())
        {
            days += day + " ";
        }
        System.out.println("String of days: " + days);
    }
}
