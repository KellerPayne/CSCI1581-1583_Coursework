public class RelationalUtil {
    public static boolean isIncreasing(int x, int y, int z){
        if (x < y && y < z){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDecreasing(int x, int y, int z){
        if (x > y && y > z){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isBetween(int x, int y, int z){
        if (x < y && y < z){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPositive(int x){
        if (x > 0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isNegative(int x){
        if (x < 0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean overlaps(int min1, int max1, int min2, int max2){
        if (min2 < min1){
            return true;
        } else if (max2 < max1){
            return true;
        } else {
            return false;
        }
    }
}
