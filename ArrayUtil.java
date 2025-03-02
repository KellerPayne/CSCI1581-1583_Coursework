public class ArrayUtil {
   
    public static void reverse(String[] arr){
        int length = arr.length;
        for(int i = 0; i < length/2; i++){
            String temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
    }

    public static String[] resize(String[] array){
        int length = array.length;
        String[] newArray = new String[length * 2];
        for(int i = 0; i < length; i++){
            newArray[i] = array[i];
        }
        
        return newArray;
    }

    public static boolean contains(String element, String[] array){
        boolean foundIt = false;
        for(int i = 0; i < array.length; i++){
            if(element == array[i]){
                foundIt = true;
            }
        }
        
        return foundIt;
    }
}
