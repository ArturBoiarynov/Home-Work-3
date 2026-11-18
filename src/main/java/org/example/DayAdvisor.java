package org.example;

public class DayAdvisor implements Advisor {

    @Override
    public void advise(Day day) {
        switch(day) {
            case MONDAY ->
                System.out.println("Plan your top 3 tasks in the morning and avoid multitasking to stay productive.");
            case TUESDAY ->
                System.out.println("Focus on the hardest task first, while your energy is high.");
            case WEDNESDAY ->
                System.out.println("Take a short walk at lunch and review your progress so far.");
            case THURSDAY ->
                System.out.println("Finish important tasks today so Friday stays light and calm.");
            case FRIDAY ->
                System.out.println("Happy Friday!");
            case SATURDAY ->
                System.out.println("Go to a city park or a botanical garden and enjoy some fresh air.");
            case SUNDAY ->
                System.out.println("Visit a museum or a cozy cafe, then get ready for the new week.");
        }
    }
}
