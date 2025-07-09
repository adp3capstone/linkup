package za.ac.cput.adp3capstone.linkup.util;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class Helper {
    public static boolean isStringNullOrEmpty(String x){
        if(x == null || x.isEmpty())
            return true;
        return false;
    }

    public static boolean isIntNull(int y){
        if(y == 0)
            return true;
        return false;
    }

    public static boolean isIntNegative(int y){
        if(y < 0)
            return true;
        return false;
    }

    public static boolean isIntZero(int y){
        if(y == 0)
            return true;
        return false;
    }

    public static boolean isDoubleNull(double z){
        if(z == 0.0)
            return true;
        return false;
    }

    public static boolean isObjectNull(Object object){
        if (object == null){
            return true;
        }
        return false;
    }
  
    public static boolean isValidEmail(String email) {
        return !isStringNullOrEmpty(email) &&
                email.matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }


    public static boolean isDateNull(LocalDateTime dateTime) {
        return dateTime == null;
    }

    public static boolean isDateInFuture(LocalDateTime dateTime) {
        return dateTime != null && dateTime.isAfter(LocalDateTime.now());
    }

    public static boolean isTrue(boolean b){
        if(b == true)
            return true;
        return false;
    }

    public static LocalDate getDate(String id){
        int year = Integer.parseInt(id.substring(0,2));
        int month = Integer.parseInt(id.substring(2,4));
        int day = Integer.parseInt(id.substring(4,6));
        LocalDate date = LocalDate.of(year,month,day);
        return date;
    }

    public static boolean isValidLong(Long value) {
        return value != null && value > 0;
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Check if the phone number is numeric and has a valid length
        return phoneNumber.matches("\\d{10}");
    }
}
