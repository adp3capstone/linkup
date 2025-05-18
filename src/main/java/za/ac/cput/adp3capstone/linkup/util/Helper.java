package za.ac.cput.adp3capstone.linkup.util;

public class Helper {
    public static boolean isStringNullOrEmpty(String x){
        if(x.isEmpty() || x == null)
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
}
