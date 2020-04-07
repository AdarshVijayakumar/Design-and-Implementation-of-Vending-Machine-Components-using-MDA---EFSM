package Driver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;

import AbstractFactory.*;
import DataStore.*;
import InputProcessor.*;
import MDAEFSM.*;
import OutputProcessor.*;

public class Driver {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int choice;

        System.out.println(" ******** Select Vending Machine *******");
        System.out.println("          1. Vending Machine - 1");
        System.out.println("          2. Vending MAchine - 2");

        input = bufferedReader.readLine();

        if (input.equalsIgnoreCase("1")){
                                                       //create VM1_Factory, DS1, OutputProcessor, MDAEFSM and VM1 objects
            AbstractFactory af = new VM1_Factory();
            DataStore ds = af.get_DataStore();
            OutputProcessor op = new OutputProcessor(af, ds);
            MDAEFSM mda = new MDAEFSM(op);
            VM1 vm1 = new VM1(mda, ds);

            System.out.println("*************************************");
            System.out.println("          Vending Machine -1");
            System.out.println("          MENU of Operations");
            System.out.println("          0.  create(int)");
            System.out.println("          1.  coin(int)");
            System.out.println("          2.  sugar()");
            System.out.println("          3.  tea()");
            System.out.println("          4.  chocolate()");
            System.out.println("          5.  insert_cups(int)");
            System.out.println("          6.  set_price(int)");
            System.out.println("          7.  Cancel()");
            System.out.println("          8.  card(float)");
            System.out.println("          q.  quit");
            System.out.println("  Please make a note of these operations");
            System.out.println("           Vending Machine-1 Execution");

            while(true){
                System.out.println("\n  Select Operation: ");
                //System.out.print("\n");
                System.out.print("0-create,1-coin,2-sugar,3-tea,4-chocolate,5-insert_cups,6-set_price,7-cancel,8-card, q-quit");
                System.out.print("\n");

                input = bufferedReader.readLine();

                if (input.isEmpty())
                    continue;
                if (input.equalsIgnoreCase("q"))
                    break;

                choice = Integer.parseInt(input);

                System.out.print("0-create,1-coin,2-sugar,3-tea,4-chocolate,5-insert_cups,6-set_price,7-cancel,8-card, q-quit");

                switch(choice){
                    case 0:  // create(int)
                        int p;
                        System.out.print("\n\nOperation: create(int p)");
                        //System.out.print("\n");
                        System.out.print("  Enter value of parameter p - initial price of the drink ");
                        System.out.print("\n");
                        p = in.nextInt();
                        vm1.create(p);
                        break;

                    case 1:  // coin
                        int v;
                        System.out.print("\n\nOperation: coin(int v)");
                        //System.out.print("\n");
                        System.out.print("  Enter value of parameter v - coin value");
                        System.out.print("\n");
                        v = in.nextInt();
                        vm1.coin(v);
                        break;

                    case 2:  //sugar
                        System.out.print("\n\nOperation: sugar()");
                        //System.out.print("\n");
                        vm1.sugar();
                        break;

                    case 3:  //tea
                        System.out.print("\n\nOperation: tea()");
                        //System.out.print("\n");
                        vm1.tea();
                        break;

                    case 4:  //chocolate
                        System.out.print("\n\nOperation: chocolate()");
                        //System.out.print("\n");
                        vm1.chocolate();
                        break;

                    case 5:  //insert cups
                        int n;
                        System.out.print("\n\nOperation: insert_cups(int n)");
                        //System.out.print("\n");
                        System.out.print("  Enter value of parameter n - # of cups");
                        System.out.print("\n");
                        n = in.nextInt();
                        vm1.insert_cups(n);
                        break;

                    case 6:  //set_price
                        System.out.print("\n\nOperation: set_price(int p)");
                        int pr;
                        //System.out.print("\n");
                        System.out.print("  Enter value of parameter p - new price of the drink");
                        System.out.print("\n");
                        pr = in.nextInt();
                        vm1.set_price(pr);
                        break;

                    case 7:  //cancel
                        System.out.print("\n\nOperation: cancel()");
                        //System.out.print("\n");
                        vm1.cancel();
                        break;

                    case 8:  //card
                        float x;
                        System.out.print("\n\nOperation: card(float x)");
                        //System.out.print("\n");
                        System.out.print("  Enter value of parameter x - available fund");
                        System.out.print("\n");
                        x = in.nextFloat();
                        vm1.card(x);
                        break;

                    case 'q':
                        System.exit(0);

                    default:
                        System.out.println("\nInvalid Choice");
                        break;
                }
            }
        }
        else if (input.equalsIgnoreCase("2")){

            AbstractFactory af = new VM2_Factory();
            DataStore ds = af.get_DataStore();
            OutputProcessor op = new OutputProcessor(af, ds);
            MDAEFSM mda = new MDAEFSM(op);
            VM2 vm2 = new VM2(mda, ds);

            System.out.println("*************************************");
            System.out.println("          Vending Machine -1");
            System.out.println("          MENU of Operations");
            System.out.println("          0.  CREATE(int)");
            System.out.println("          1.  COIN(int)");
            System.out.println("          2.  SUGAR()");
            System.out.println("          3.  CREAM()");
            System.out.println("          4.  COFFEE()");
            System.out.println("          5.  InsertCups(int)");
            System.out.println("          6.  SetPrice(int)");
            System.out.println("          7.  CANCEL()");
            System.out.println("          q.  quit");
            System.out.println("  Please make a note of these operations");
            System.out.println("           Vending Machine-1 Execution");

            while (true)  {

                System.out.println("\n  Select Operation: ");
                //System.out.print("\n");
                System.out.print("0-CREATE,1-COIN,2-SUGAR,3-CREAM,4-COFFEE,5-InsertCups,6-SetPrice,7-CANCEL,q-quit");
                System.out.print("\n");

                input = bufferedReader.readLine();

                if (input.isEmpty())
                    continue;
                if (input.equalsIgnoreCase("q"))
                    break;

                choice = Integer.parseInt(input);

                System.out.print("0-CREATE,1-COIN,2-SUGAR,3-CREAM,4-COFFEE,5-InsertCups,6-SetPrice,7-CANCEL,q-quit");

                switch(choice) {
                    case 0:  // CREATE(int)
                        float p;
                        System.out.print("\nOperation: CREATE(float p)");
                        //System.out.print("\n");
                        System.out.print("  Enter value of parameter p - initial price of the drink");
                        System.out.print("\n");
                        p = in.nextFloat();
                        vm2.CREATE(p);
                        break;

                    case 1:  // COIN
                        float v;
                        System.out.print("\nOperation: COIN(float v)");
                        //System.out.print("\n");
                        System.out.print("  Enter value of parameter v - coin value ");
                        System.out.print("\n");
                        v = in.nextFloat();
                        vm2.COIN(v);
                        break;

                    case 2:  //SUGAR
                        System.out.print("\nOperation: SUGAR()");
                        //System.out.print("\n");
                        vm2.SUGAR();
                        break;

                    case 3:  //CREAM
                        System.out.print("\nOperation: CREAM()");
                        //System.out.print("\n");
                        vm2.CREAM();
                        break;

                    case 4:  //COFFEE
                        System.out.print("\nOperation: COFFEE()");
                        //System.out.print("\n");
                        vm2.COFFE();
                        break;

                    case 5:  // InsertCups
                        int n;
                        System.out.print("\nOperation: InsertCups(int n)");
                        //System.out.print("\n");
                        System.out.print("  Enter value of parameter n - # of cups");
                        System.out.print("\n");
                        n = in.nextInt();
                        vm2.InsertCups(n);
                        break;

                    case 6:  //SetPrice
                        System.out.print("\nOperation: SetPrice(float p)");
                        float pr;
                        //System.out.print("\n");
                        System.out.print("  Enter value of parameter p - new price of the drink");
                        System.out.print("\n");
                        pr = in.nextFloat();
                        vm2.SetPrice(pr);
                        break;

                    case 7:  //CANCEL
                        System.out.print("\nOperation: CANCEL()");
                        //System.out.print("\n");
                        vm2.CANCEL();
                        break;

                    case 'q':
                        System.exit(0);

                    default:
                        System.out.println("\nInvalid Choice");
                        break;
                }
            }

        }

    }
}
