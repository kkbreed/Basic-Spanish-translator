/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translator;

/**
 *
 * @author user
 */
public class Translator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create string object to use for the string variable below
        String greetingStr;     //Good morning 
        String pleasureStr;    //It is a pleasure to meet you
        String callStr;       //Please call me tomorrow
        String dayStr;       //Have a nice day!
       
        //Add string into variable I created above
        greetingStr = "Good Morning";       
        pleasureStr = "It is a pleasure to meet you";
        callStr = "Please call me tomorrow";
        dayStr = "Have a nice day!";
    
        //Added whitespace to improve readability
    System.out.print(greetingStr);
    System.out.println("                     Buenos días");
    System.out.print(pleasureStr);
    System.out.println("     Es un placer conocerte");
    System.out.print(callStr);
    System.out.println("          Por favor, llámame mañana");
    System.out.print(dayStr);
    System.out.println("                 Que tengas un buen día!");
    
    }
}
  
