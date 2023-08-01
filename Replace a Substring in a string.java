import java.util.Scanner;

public class Repalce_String {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        //edge case
        if(str.length() == 0){
            throw new Exception("CANT PEROFRM THIS OPERATION ON EMPTY STRING");
        }
        //get the old string to be repalced
        System.out.println("Enter the string that you want to be replace");
        String old_Str = sc.nextLine();

        //get the new string that you want to substitute
        System.out.println("Enter the new string that you want to replace with old string");
        String new_str = sc.nextLine();

        String ans = str.replace(old_Str,new_str);
        System.out.println(ans);



    }

}
