

import java.util.ArrayList;
import java.util.*;
public class TFL_Line_Station
{

public static void main(String args[])
{
    ArrayList<String> tfl_line= new ArrayList<String >();// array list
    tfl_line.add("Metro");
    tfl_line.add("Bakerloo");
    tfl_line.add("Central");
    tfl_line.add("Jubilee");
    tfl_line.add("Circle");
    tfl_line.add("Picadilly");
    tfl_line.add("Victoria");
    tfl_line.add("Nothern");
    tfl_line.add("Waterloo n City");
    tfl_line.add("District");
    tfl_line.add("Hammersmith & City");

    //System.out.println(tfl_line);
    ArrayList<String> zone_1= new ArrayList<String >();// array list for zone 1 station
    zone_1.add("Aldgate"); zone_1.add("Angel");
    zone_1.add("Baker Street");zone_1.add("Bank");
    zone_1.add("Barbican");zone_1.add("Bayswater");
    zone_1.add("Bond Street");zone_1.add("Covent Garden");
    zone_1.add("Farringdon");zone_1.add("Embankment");
    zone_1.add("Paddington");zone_1.add("Holborn");
    zone_1.add("Euston");zone_1.add("Moorgate");
    zone_1.add("Notting Hill Gate");zone_1.add("Liverpool");
    zone_1.add("Regent Park");zone_1.add("Tottanham Court");
    zone_1.add("Waterloo");zone_1.add("Tower Bridge");
    zone_1.add("Kensigton High Street");zone_1.add("South Kensington");
    zone_1.add("King Cross");zone_1.add("St Paul's");

    ArrayList<String> station= new ArrayList<String >();// to store user input in arraylist
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter zone 1 station name");
    String station1=scanner.nextLine();// it will take line with space

    station.add(station1);// store user input station1 in station arraylist
  //  System.out.println(station1);
   // boolean b=zone_1.contains(station.get(0));

    switch (station.get(0))
    {
        case "Waterloo":
            System.out.println("Bakerloo, Northern, Jubilee lines comes to this station");
            break;

        case "Aldgate":
            System.out.println("Circle ,Metro lines comes to this station");
            break;

        case "Angel":
            System.out.println(" Northern lines comes to this station");
            break;

        case "Baker Street":
            System.out.println("Bakerloo, Metro,circle,Hammersmith & City and Jubilee lines comes to this station");
            break;

        case "Bank":
            System.out.println("central,northern,Waterloo &City lines comes to this station");
            break;

        case "Barbican":
            System.out.println("Metro,circle,Hammersmith n City lines comes to this station");
            break;

        case "Bayswater":
            System.out.println("circle & District lines comes to this station");
            break;

        case "Bond Street":
            System.out.println("central, Jubilee lines comes to this station");
            break;

        case "Covent Garden":
            System.out.println("picadilly lines comes to this station");
            break;

        case "Farringdon":
            System.out.println("Metro,circle,Hammersmith n City lines comes to this station");
            break;

        case "Embankment":
            System.out.println("Bakerloo, circle,District and northern  lines comes to this station");
            break;

        case "Paddington":
            System.out.println("Bakerloo,circle,District, Hammersmith n City  lines comes to this station");
            break;

        case "Holborn":
            System.out.println(" picadilly, central lines comes to this station");
            break;

        case "Euston":
            System.out.println(" Northern, Victoria lines comes to this station");
            break;

        case "Moorgate":
            System.out.println(" Northern, circle,Metro, Hammersmith n City lines comes to this station");
            break;

        case "Notting Hill Gate":
            System.out.println("central,circle,Distric lines comes to this station");
            break;

        case "Liverpool":
            System.out.println("central, circle,Metro,Hammersmith n City lines comes to this station");
            break;

        case "Regent Park":
            System.out.println("Bakerloo, ircle,Metro,Hammersmith n City lines comes to this station");
            break;

        case "Tottanham Court":
            System.out.println("central, Northern,   lines comes to this station");
            break;

        case "Tower Bridge":
            System.out.println("circle,District lines comes to this station");
            break;

        case "Kensigton High Street":
            System.out.println("circle ,District lines comes to this station");
            break;

        case "South Kensington":
            System.out.println("circle ,District, picadilly lines comes to this station");
            break;

        case "King Cross":
            System.out.println("Metro, Northern, circle,Hammersmith n City lines comes to this station");
            break;

        case "St Paul's":
            System.out.println(" central lines comes to this station");
            break;



        default:
                System.out.println("This station does not come in zone 1 ");
    }
















}
    }





















