public class Distance_calculation {

    public static void main(String[] args){

        double a=-9.81;
        double t=10;
        int Vi=0;
        int Xi=0;
         double Xt=0.5*a*t*t+Vi*t+Xi;

        System.out.println("the value of Xt is"+Xt+"m");
    }
}
