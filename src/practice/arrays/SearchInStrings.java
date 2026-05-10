package practice.arrays;

import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char target = scanner.next().charAt(0);
        System.out.print("Enter the name:");
        String name = scanner.nextLine();
        System.out.println(search(name,target));
    }
    static boolean search(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i <str.length(); i++){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
