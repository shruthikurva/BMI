
public class BMI  {

    public static double calculatorBMI(double height,double weight){
double bmi=weight/Math.pow(height,weight);
return bmi;
    }
    public static void main(String[] args) {
        double height=1.79832;
        double weight=70;
        double bmi=calculatorBMI(height,weight);
        System.out.println("The BMI is"+bmi+"so");
        if(bmi<18.5)
        System.out.print("underweight");
        else if(bmi>=18.5&& bmi<24.9)
        System.out.print("Healthy");
        else if(bmi>=24.9&& bmi<30)
        System.out.println("overweight");
        else if(bmi>=30)
        System.out.print("suffering from obesity");
    }
}
