
package armyenrolment;

import armyenrolment.signup.RecruiterCountry;

public class ArmyEnrolment {

    
//    static void heightValidation(int height) throws HeightValidationException {
//        if (height >= 150) {
//
//        } else {
//            throw new HeightValidationException("You are too short");
//        }
//    }
//
//    static void countryValidation(String country) throws CountryValidationException {
//        if (!country.equals("Sri Lanka")) {
//            throw new CountryValidationException("Country validation failed");
//        } else {
//            try {
//                ageValidation(23);
//            } catch (AgeValidationException ex) {
//                System.out.println(ex);
//            }
//        }
//    }
//
//    static void weightValidation(int weight) throws WeightValidationException {
//        if (weight>50) {
//            try {
//               // RecruiterHeight rch = new RecruiterHeight(120);
//                heightValidation(120);
//            } catch (HeightValidationException ex) {
//                System.out.println(ex);
//                ex.printStackTrace();
//            }
//        } else {
//            throw new WeightValidationException("You need to gain weight");
//        }
//    }
//
//    static void ageValidation(int age) throws AgeValidationException {
//        if (age >= 18) {
//            try {
//                weightValidation(60);
//            } catch (WeightValidationException e) {
//                System.out.println(e);
//            }
//        } else {
//            throw new AgeValidationException("You are too young");
//        }
//    }

    public static void main(String args[]) {
        try {
            RecruiterCountry rcc = new RecruiterCountry();
            rcc.countryValidation("Sri Lanka");
           // countryValidation("Sri Lanka");
        } catch (Exception e) {
            System.out.println("Excption " + e);
        }



    }
    
}
