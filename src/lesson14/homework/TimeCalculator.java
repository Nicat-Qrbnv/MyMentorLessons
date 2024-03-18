package lesson14.homework;

public class TimeCalculator {

    public static String calculateDifference(int hour1, int minute1, int hour2, int minute2) {
        boolean first = validateTime(hour1, minute1);
        boolean second = validateTime(hour2, minute2);
        if (first && second) {
            int totalMinutes1 = hour1 * 60 + minute1;
            int totalMinutes2 = hour2 * 60 + minute2;
            int differenceInMinutes = Math.abs(totalMinutes2 - totalMinutes1);

            int hours = differenceInMinutes / 60;
            int minutes = differenceInMinutes % 60;

            return String.format("There is %d hour %d minutes difference", hours, minutes);
        } else {
            return "Invalid time values. Hours must be between 0 and 23, minutes must be between 0 and 59.";
        }
    }

    public static String calculateDifference(String time1, String time2) {
        String[] time1Parts = time1.split(":");
        String[] time2Parts = time2.split(":");

        int hour1 = Integer.parseInt(time1Parts[0]);
        int minute1 = Integer.parseInt(time1Parts[1]);

        int hour2 = Integer.parseInt(time2Parts[0]);
        int minute2 = Integer.parseInt(time2Parts[1]);

        return calculateDifference(hour1, minute1, hour2, minute2);
    }

    private static boolean validateTime(int hour, int minute) {
        return hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59;
    }
}
