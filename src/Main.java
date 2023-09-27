import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Value> instruList = new ArrayList<Value>();

        Value val1 = new Value("Ambitious", "Instrumental");
            instruList.add(val1);
        Value val2 = new Value("Broadminded", "Instrumental");
            instruList.add(val2);
        Value val3 = new Value("Capable", "Instrumental");
            instruList.add(val3);
        Value val4 = new Value("Cheerful", "Instrumental");
            instruList.add(val4);
        Value val5 = new Value("Clean", "Instrumental");
            instruList.add(val5);
        Value val6 = new Value("Courageous", "Instrumental");
            instruList.add(val6);
        Value val7 = new Value("Forgiving", "Instrumental");
            instruList.add(val7);
        Value val8 = new Value("Helpful", "Instrumental");
            instruList.add(val8);
        Value val9 = new Value("Honest", "Instrumental");
            instruList.add(val9);
        Value val10 = new Value("Imaginative", "Instrumental");
            instruList.add(val10);
        Value val11 = new Value("Independent", "Instrumental");
            instruList.add(val11);
        Value val12 = new Value("Intellectual", "Instrumental");
            instruList.add(val12);
        Value val13 = new Value("Logical", "Instrumental");
            instruList.add(val13);
        Value val14 = new Value("Loving", "Instrumental");
            instruList.add(val14);
        Value val15 = new Value("Obedient", "Instrumental");
            instruList.add(val15);
        Value val16 = new Value("Polite", "Instrumental");
            instruList.add(val16);
        Value val17 = new Value("Responsible", "Instrumental");
            instruList.add(val17);
        Value val18 = new Value("Self-controlled", "Instrumental");
            instruList.add(val18);

        //bubble sort
        for (int i = 0; i < instruList.size() - 1; i++){
            Value choice1 = instruList.get(i);

            int count = i + 1;

            for (int c = count; c < instruList.size() - 1; c++){
                Value choice2 = instruList.get(c);
                String input = "";

                    while(true){
                        System.out.printf("Which is more important to you '%s' or '%s'? (type 1 or 2 to select) ", choice1.getName(), choice2.getName());
                        input = in.nextLine();
                        if (input.equals("1")){
                            choice1.addPoint();
                            break;
                        } else if (input.equals("2")){
                            choice2.addPoint();
                            break;
                        } else {
                            System.out.println("Not a valid input, please try again.");
                        }
                    }


            }
        }

        //print values with points
        System.out.printf("%-20s %s%n", "Value", "Points");
        System.out.println("---------------------------------------------");
        instruList.sort(Comparator.comparing(Value::getPoints));

        for (Value val : instruList){
            System.out.printf("%-20s %d%n", val.getName(), val.getPoints());
        }

    } //end of main
}