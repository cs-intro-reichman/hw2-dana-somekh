public class TimeCalc {
    public static void main(String[] args) {
        String timeInput = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        int index = timeInput.indexOf(':');
        int hours = Integer.parseInt(timeInput.substring(0, index));
        int minutes = Integer.parseInt(timeInput.substring(index + 1));
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);
        String hoursString = "";
        String minutesString = "";
        if (newMinutes < 10) {
            minutesString =  "0" + Integer.toString(newMinutes);
        }
        else {
            minutesString =  Integer.toString(newMinutes);
        }
        if (newHours < 10) {
            hoursString =  "0" + Integer.toString(newHours);
        }
        else {
            hoursString =  Integer.toString(newHours);
        }
        System.out.println(hoursString + ":" + minutesString);
    }
}
