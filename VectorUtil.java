public class VectorUtil {
    
    public static double dotProduct(double[] vector1, double[] vector2){
        double dotProduct = vector1[0] * vector2[0] + vector1[1] * vector2[1] + vector1[2] * vector2[2];
        return dotProduct;
    }
}
