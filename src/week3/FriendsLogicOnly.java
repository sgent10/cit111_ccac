/*
 * Copyright (C) 2018 delores
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package week3;

import java.util.Scanner;

/**
 * Class to demonstrate implementation of if/else logic in context of an
 * activity that creates a chain of logic to assess friend compatability
 * 
 * @author delores the javabot
 */
public class FriendsLogicOnly {
    
    public static void main(String[] args) {
        // hard-coded response to question 1
        
        int response;
        // compatability score: this variable will be adjusted based on
        // the user's response to questions
        int compScore = 0;
        Scanner keyscan = new Scanner(System.in);
        
        System.out.println("Are you a vegetarian? (0 = no, 1 = yes)");
            response = keyscan.nextInt();
            if(response == 1){
                compScore = compScore+5;
            }
        System.out.println("Do you enjoy hiking and camping? (0 = no, 1 = yes)");
        response = keyscan.nextInt();
            if(response == 1){
                compScore = compScore+5;
            }else{
                System.out.println(" Do you enjoy going outside?");
                    response = keyscan.nextInt();
                    if(response == 1){
                compScore = compScore+15;
                    }else{
                compScore = compScore-100;
                    }
            }
        System.out.println("Do you like playing video games? (0 = no, 1 = yes)");
        response = keyscan.nextInt();
            if(response == 1){
                compScore = compScore+5;
        
            }//close if block
        
        System.out.println(compScore);
        // lots more questions
        
        // final check of compatibility score
        if(compScore >= 5){
            System.out.println("Great, we might be friends!");
        } else {
            System.out.println("Well according to the data, "
                    + "you are the weakest link, Goodbye.");
        } // end of if/else blocks
   
    } // close main
    
} // close class