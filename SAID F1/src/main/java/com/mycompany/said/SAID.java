
package com.mycompany.said;

import java.util.Scanner;


public class SAID {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        
        System.out.print("Enter ID number:");
        
        
        //long num = (0);
         String num = input.nextLine();
         
         String dob = extractDateOfBirth(num);
         
         if (dob != null){
             System.out.println("Date of birth:" + " " + dob);
             
         }else{
             System.out.println("invalid ");
         }
         
         int Age = TheAge(num);
         
             System.out.println("Age :" + Age);
        
         
        String Gender = genderReveal(num);
        
        if (Gender != null){
            System.out.println("Gender :" + Gender);
        }else{
            System.out.print("Gender :" + null);
        }
        
        String Citizen = Resident (num);
        if (Citizen != null){
            System.out.println("Citizenship :"+ Citizen);
        }else{
            System.out.print("Citizenship :" + null);
        }
    }
    
        
    
    private static String extractDateOfBirth (String num){
        //int ThisYear = 24;
        if (num.length() == 13) {
            int year = Integer.parseInt( num.substring(0,2)) ;
            String month = num.substring(2, 4);
            String day = num.substring(4, 6);
            
            String century = (year < 24) ? "20" : "19";
            String fullYear = century + String.format("%02d", year);
            
            //int TheAge = (year - ThisYear);
            
         
            
            return  fullYear + "/" + month + "/" +day;
        } else{
            return null;
        }
    }
    
    private static String genderReveal(String num) {
        
        if (num.length() == 13){
            int gender = Integer.parseInt(num.substring(6, 10));
            
            String Reveal = (gender >= 5000) ? "Male" : "Female";
            return Reveal;
        }else{
            return null;
        }
    }
    private static Integer TheAge(String num){
        
        if(num.length() == 13){
            
            int ThisYear = 2024;
            
            int year = Integer.parseInt( num.substring(0,2)) ;
            String century = (year < 24) ? "20" : "19";
            String fullYear = century + String.format("%02d", year);
            
            
            
            int ThisAge = Integer.parseInt(fullYear);
            
            int old = (ThisYear - ThisAge);
            
            return old;
        
        
        }
        return null;
    }
    private static String Resident (String num){
        
        if (num.length() ==13){
            int real = Integer.parseInt(num.substring(10, 11));
            
            String SA = (real == 0)? "SA citizen" : "Permanent resident";
            return SA;
        }else {
            return null;
        }
    
    
    }
    
}
