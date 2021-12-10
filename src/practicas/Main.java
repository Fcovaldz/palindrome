package practicas;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

    isPalindorme("francisco");
    }
    public static boolean isPalindorme(String str) {
        int inc = 0;
        int des = str.length()-1;
        boolean sError = false;
        while((inc < des ) && (!sError)){
            if (str.charAt(inc) == str.charAt(des)){
                inc++;
                des--;
            } else {
                sError = true;
            }
        }
        if (!sError){
            System.out.println(str + " SI es un Palindromo");
        } else {
            System.out.println(str + " NO es palindromo");
        }
        return false;
         }


    }
