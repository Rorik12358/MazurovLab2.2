package Lab2_5;

/**
 * Created by R2-D2 on 16.02.2016.
 */
public class A {
    public static double calcSquare(final int base, final int height){
        double res = base*height;
        System.out.println(res);
        return res;
    }
    public static double calcSquare(final int sideOfFoursquare){
        double res = Math.pow(sideOfFoursquare,2);
        System.out.println(res);
        return res;
    }
    public static double calcSquare(final double radius){
        double res = Math.PI*Math.pow(radius,2);
        System.out.println(res);
        return res;
    }}
