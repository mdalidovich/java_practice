package practice;

public class CalculateNumberOfDays {

    public static void main(String args[]){

        double distance = 5000;
        double carSpeedAnHour = 50;
        double days = (distance / carSpeedAnHour) / 8;
        System.out.println("The trip time is " + days + " days");


    }


}
