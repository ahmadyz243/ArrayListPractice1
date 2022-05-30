package util;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        fillArrayList(arrayList);
        checkForPair(arrayList);
    }
    public static void fillArrayList(ArrayList<Integer> arrayList){
        int selection;
        do {
            System.out.println("enter a number:");
            arrayList.add(takeNumber());
            System.out.println("1. add another number:");
            System.out.println("2. finish:");
            selection = takeNumber();
        } while (selection != 2);
    }
    public static int takeNumber(){
        int input;
        Scanner scanner;
        while (true){
            try {
                scanner = new Scanner(System.in);
                input = scanner.nextInt();
                if(input > 0){
                    return input;
                }
            }catch (Exception e){
                System.out.println("you should enter numbers:");
            }
        }
    }
    public static  void checkForPair(ArrayList<Integer> arl){
        if(arl.size() % 2 != 0){
            arl.remove(arl.size() - 1);
        }
    }
}
