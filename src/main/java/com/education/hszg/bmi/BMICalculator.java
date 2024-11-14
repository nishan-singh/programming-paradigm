package com.education.hszg.bmi;

public class BMICalculator {

    public static void main(String[] args) {
        BMICalculator bmiCalculator = new BMICalculator();
        System.out.println("Test des BMI Calculator");
        System.out.println(bmiCalculator.calculateBMI(90, 1.7));
     }

    public double calculateBMI(double weightInKilogram, double heightInMeters) {

        if((weightInKilogram < 30) || (weightInKilogram > 150)) return 0.0;
        if((heightInMeters < 1.20) || (heightInMeters > 2.50)) return 0.0;
        
        double bmi = weightInKilogram / (heightInMeters * heightInMeters); 

        // returning 0 to treat it as false;
        return bmi;
    }
    
    public void calculateBMIRecommendation(String messageToPrint) {
        System.out.println(messageToPrint);
    }

    public String getBMIRecommendation(double weightInKG, double heightInMeters) {
        if(calculateBMI(weightInKG, heightInMeters) < 21) {
            return "Eat more";
        } 
        if (calculateBMI(weightInKG, heightInMeters) > 24) {
            return "hit gym";
        } 
        
        return "You are doing good!";
    }
}