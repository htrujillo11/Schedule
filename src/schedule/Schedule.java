/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

/**
 *
 * @author 20359
 */
public class Schedule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String firstName = "Horacio";
        String lastName = "Trujillo";
        int year = 2020;
        
        System.out.println("My name is " + firstName + " " + lastName + " and I graduate in " + year);
        
        String courseOne = "     Global Studies";
        String courseTwo = "     Algebra 2";
        String courseThree = "     Computer Science";     
        String courseFour = "     Chemistry";
        String courseFive = "     English";
        String courseSix = "     Team Sports";    
        String courseSeven = "     American History";        
        String teacherOne = "    Dugard";        
        String teacherTwo = "    Lisette";
        String teacherThree = "    Larrubia";
        String teacherFour = "    Chomat";
        String teacherFive = "    Chacon";
        String teacherSix = "    Lorenzo";
        String teacherSeven = "    Cunningham";
           
       System.out.println("+-------------------------------------------------------+ ");
       System.out.println(" | 1 | " + courseOne + "       | " + teacherOne);
       System.out.println(" | 2 | " + courseTwo + "            | " + teacherTwo);
       System.out.println(" | 3 | " + courseThree + "     | " + teacherThree);
       System.out.println(" | 4 | " + courseFour + "            | " + teacherFour);
       System.out.println(" | 5 | " + courseFive + "              | " + teacherFive);
       System.out.println(" | 6 | " + courseSix + "          | " + teacherSix);
       System.out.println(" | 7 | " + courseSeven + "     | " + teacherSeven);
       System.out.println("+-------------------------------------------------------+ ");
    }
    
}
