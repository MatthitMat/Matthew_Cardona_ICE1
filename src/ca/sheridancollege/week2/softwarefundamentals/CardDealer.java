/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 *
 * @author dancye, 2019
 * Matthew Cardona
 * Student ID: 991640494
 */
public class CardDealer
{
   public static void main (String[] args)
   {
      Card card = new Card("Spades", 4); //Added by Matthew Cardona
      Card nineClubs = new Card("Clbs", 9);
      nineClubs.setSuit("diamonds");
   }
}
