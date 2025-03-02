public class LogicalUtil {
    public static boolean thereExists(boolean p, boolean q, boolean r){
        if (p == true || q == true || r == true){
            return true;
        } else {
            return false;
        }
    }

    public static boolean forAll(boolean p, boolean q, boolean r){
        if(p == true && q == true && r == true){
            return true;
        } else {
            return false;
        }
    }

    public static boolean majority(boolean p, boolean q, boolean r){
        if (p == true && q == true){
            return true;
        } else if (q == true && r == true){
            return true;
        } else if (p == true && r == true){
            return true;
        } else {
            return false;
        }
    }

    public static boolean minority(boolean p, boolean q, boolean r){
        if (p == false && q == false){
            return true;
        } else if (p == false && r == false){
            return true;
        } else if (q == false && r == false){
            return true;
        } else {
            return false;
        }
    }

    public static boolean implies(boolean p, boolean q){
        if(p == true && q == false){
            return false;
        } else {
            return true;
        }
    }

    public static boolean implies(boolean p, boolean q, boolean r){
        if (p == true && q == true && r == false){
            return false;
        } else {
            return true;
        }
    }
}
