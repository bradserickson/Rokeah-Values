import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Value> list = new ArrayList<Value>();

        //explain
        System.out.println("Prepare to find out what is most important to you!");
        String input;

        while(true){
            System.out.print("Do you want to rank Instrumental Values or Terminal Values? (Type 'I' or 'T'): ");
            input = in.nextLine();
            if (input.equals("I")){
                addInstruValues(list);
                break;
            } else if (input.equals("T")){
                addTermValues(list);
                break;
            } else {
                System.out.println("Not a valid input, please try again.");
            }
        }



        //bubble sort
        System.out.println("The program will give you two choices, select which one is more important to you by typing '1' or '2'.");
        for (int i = 0; i <= list.size() - 1; i++){
            Value choice1 = list.get(i);

            int count = i + 1;

            for (int c = count; c <= list.size() - 1; c++){
                Value choice2 = list.get(c);

                    while(true){
                        System.out.printf("'%s' or '%s'?:  ", choice1.getName(), choice2.getName());
                        input = in.nextLine();
                        if (input.equals("1")){
                            choice1.addPoint();
                            break;
                        } else if (input.equals("2")){
                            choice2.addPoint();
                            break;
                        } else {
                            System.out.println("Not a valid input, please enter '1' or '2'.");
                        }
                    }


            }
        }

        //print values with points
        System.out.printf("%-20s %s%n", "Value", "Points");
        System.out.println("---------------------------------------------");
        list.sort(Comparator.comparing(Value::getPoints));

        for (Value val : list){
            System.out.printf("%-20s %d%n", val.getName(), val.getPoints());
        }

        // save results?
        while(true){

            System.out.print("do you want to save your results?\nNote: this will override any previous save. (type 'Yes' or 'No'): ");
            input = in.nextLine();

            if(input.equalsIgnoreCase("Yes")){
                printToFile(list);
                break;
            }
            else if(input.equalsIgnoreCase("No")){
                System.out.println("okay :(");
                break;
            }
            else {
                System.out.println("Invalid input, try again :)");
            }
        }



    } //end of main

    public static void printToFile(ArrayList<Value> list){

        String fileName;
        //select which list results to print to
        if (list.get(0).getCategory().equals("Instrumental")){
            fileName = "instrumental-results.txt";
        } else {
            fileName = "terminal-results.txt";
        }


        PrintWriter writer = null;

        try {
            writer = new PrintWriter(fileName);
        } catch (FileNotFoundException e){
            System.out.println("\nFile not found");
        }

        for(Value item : list){
            writer.printf("%-15s[Score: %2d]\n",item.getName(), item.getPoints());
        }

        writer.close();

    }

    public static void addInstruValues(ArrayList<Value> list){
        Value val1 = new Value("Ambitious", "Instrumental");
        list.add(val1);
        Value val2 = new Value("Broadminded", "Instrumental");
        list.add(val2);
        Value val3 = new Value("Capable", "Instrumental");
        list.add(val3);
        Value val4 = new Value("Cheerful", "Instrumental");
        list.add(val4);
//        Value val5 = new Value("Clean", "Instrumental");
//        list.add(val5);
//        Value val6 = new Value("Courageous", "Instrumental");
//        list.add(val6);
//        Value val7 = new Value("Forgiving", "Instrumental");
//        list.add(val7);
//        Value val8 = new Value("Helpful", "Instrumental");
//        list.add(val8);
//        Value val9 = new Value("Honest", "Instrumental");
//        list.add(val9);
//        Value val10 = new Value("Imaginative", "Instrumental");
//        list.add(val10);
//        Value val11 = new Value("Independent", "Instrumental");
//        list.add(val11);
//        Value val12 = new Value("Intellectual", "Instrumental");
//        list.add(val12);
//        Value val13 = new Value("Logical", "Instrumental");
//        list.add(val13);
//        Value val14 = new Value("Loving", "Instrumental");
//        list.add(val14);
//        Value val15 = new Value("Obedient", "Instrumental");
//        list.add(val15);
//        Value val16 = new Value("Polite", "Instrumental");
//        list.add(val16);
//        Value val17 = new Value("Responsible", "Instrumental");
//        list.add(val17);
//        Value val18 = new Value("Self-controlled", "Instrumental");
//        list.add(val18);
    }

    public static void addTermValues(ArrayList<Value> list){
        Value val1 = new Value("True Friendship", "Terminal");
        Value val2 = new Value("Mature Love", "Terminal");
        Value val3 = new Value("Self-Respect", "Terminal");
        Value val4 = new Value("Happiness", "Terminal");
//        Value val5 = new Value("Inner Harmony", "Terminal");
//        Value val6 = new Value("Equality", "Terminal");
//        Value val7 = new Value("Freedom", "Terminal");
//        Value val8 = new Value("Pleasure", "Terminal");
//        Value val9 = new Value("Social Recognition", "Terminal");
//        Value val10 = new Value("Wisdom", "Terminal");
//        Value val11 = new Value("Salvation", "Terminal");
//        Value val12 = new Value("Family Security", "Terminal");
//        Value val13 = new Value("National Security", "Terminal");
//        Value val14 = new Value("A Sense of Accomplishment", "Terminal");
//        Value val15 = new Value("A World of Beauty", "Terminal");
//        Value val16 = new Value("A World at Peace", "Terminal");
//        Value val17 = new Value("A Comfortable Life", "Terminal");
//        Value val18 = new Value("An Exciting Life", "Terminal");
        list.add(val1);
        list.add(val2);
        list.add(val3);
        list.add(val4);
//        list.add(val5);
//        list.add(val6);
//        list.add(val7);
//        list.add(val8);
//        list.add(val9);
//        list.add(val10);
//        list.add(val11);
//        list.add(val12);
//        list.add(val13);
//        list.add(val14);
//        list.add(val15);
//        list.add(val16);
//        list.add(val17);
//        list.add(val18);
    }
}