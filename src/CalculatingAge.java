//Java program which will take birthdate as input and calculate age. use data format DD-MM-yyyy

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Scanner;

public class CalculatingAge {

    public static void main(String args[]) throws ParseException
    {
        //Reading name and date of birth from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your date of birth (dd-MM-yyyy): ");
        String dob = sc.next();
        //Converting String to Date
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = formatter.parse(dob);
        //Converting obtained Date object to LocalDate object
        Instant instant = date.toInstant();
        ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
        LocalDate givenDate = zone.toLocalDate();
        //Calculating the difference between given date to current date.
        Period period = Period.between(givenDate, LocalDate.now());
        System.out.print("Your current age is: ");
        System.out.print(period.getYears()+" years "+period.getMonths()+" months "+period.getDays()+" days");
    }
}