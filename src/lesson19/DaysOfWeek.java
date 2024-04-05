package lesson19;

public enum DaysOfWeek {
    MON("Monday"),
    TUE("Tuesday"),
    WED("Wednesday"),
    THU("Thursday"),
    FRI("Friday"),
    SAT("Saturday"),
    SUN("Sunday");
    private final String name;

    DaysOfWeek(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return (this.ordinal() + 1) + " " + name;
    }
}
