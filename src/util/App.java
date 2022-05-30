package util;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        fillArrayList(arrayList);
        checkForPair(arrayList);
        orderedPair(arrayList);
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
    public static void orderedPair(ArrayList<Integer> arl){
        for(int i = 1; i < arl.size();){
            if(arl.get(i) < arl.get(i-1)){
                arl.remove(i - 1);
                arl.remove(i - 1);
            }else{
                i += 2;
            }
        }
    }
}
