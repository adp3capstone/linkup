package za.ac.cput.adp3capstone.linkup.util;


import java.time.LocalDateTime;

public class Helper {
    public static boolean isStringNullOrEmpty(String x){
        if(x == null || x.isEmpty())
            return true;
        return false;
    }

    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email != null && email.matches(emailRegex);
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

    public static boolean isValidLong(Long value) {
        return value != null && value > 0;
    }

}
