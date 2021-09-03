package NEAT;

import java.lang.Math;

public class ActivationFunctions {

    public static double Relu(double x){
        return Math.max(0,x);
    }

    public static double Sign(double x){
        if (x==0) return 0;
        else if (x > 0) return 1;
        else return -1;
    }

    public static double Linear(double x){
        return x;
    }

    public static double PieceWiseLinear(double x){
        if (x > 0.5) return 1;
        else if (x < -0.5) return 0;
        else return x;
    }

    public static double Sigmoid(double x){
        return 1 / (1 + Math.exp(-1 * x));
    }

    public static double TanH(double x){
        return (Math.exp(x) - Math.exp(-1 * x)) / (Math.exp(x) + Math.exp(-1 * x));
    }

    public static double Rectifier(double x){
        return Math.log(1 + Math.exp(x));
    }



}
