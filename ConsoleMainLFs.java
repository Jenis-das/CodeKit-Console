
import java.io.IOException;
import java.util.*;


public class ConsoleMainLFs{

    //------------------------------- Files --------------------------------//
    public static Scanner sc = new Scanner(System.in);
    
  
    
    //------------------------- System Functions --------------------------//
    static void print(Object value){
        System.out.println(value);
    }

    static String enterString(String s){
        String st = sc.nextLine();
        return st; 
    }


    

    static int enterNumber(){
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        return n; 
    }

    static void viewArray(int arr[]){
        for (int i:arr){
            System.out. print(i + " ");
        }
        System.out.println();
    }


    static int[] getArray(){
        Scanner sc = new Scanner(System.in);
        print("Enter Array Size : ");
        int inp = sc.nextInt();
        int myArray[] = new int[inp] ;
        for( int i = 0; i <= inp - 1 ; i++){
            System.out.println("Enter number : "); 
            int inpval = sc.nextInt(); 
            myArray[i] = inpval;
        }
        return myArray;
    }


    static void ToPrint(String currentKey, String function, Boolean alter){
        if(alter == true){
            System.out.println("Enter \'"  + currentKey + "\' to find " + function + " in a Array");
        }else
        {
            System.out.println("Enter \'" + currentKey + "\' " + function);
        }
    }


    public static void clearConsole(String withHelp) {
        if("withHelpFunction".equals(withHelp)){
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                print("h for help");
            } catch (IOException | InterruptedException e) {
                System.out.println("Could not clear console.");
            }
        }else{
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (IOException | InterruptedException e) {
                System.out.println("Could not clear console.");
            }
        }

    }




    // -------------------------------- Program Functions ------------------------------- //
    static void even(int arr[]){
        System.out.println("Even Array Values");
        for (int i:arr){
            if(i%2 == 0 ){
                System.out.println(i);
            }
        }
    }
    
    static void odd(int arr[]){
        System.out.println("Odd Array Values");
        for (int i:arr){
            if(i%2 != 0 ){
                System.out.println(i);
            }
        }
    }


    static void greatestNumber(int arr[]){
        int myMax;
        myMax = arr[0];
        for (int i = 0 ; i <= arr.length - 1; i++){
            if(myMax <= arr[i]){
                myMax = arr[i];
            }

        }
        System.out.println("Greatest Array Values");
        System.out.println(myMax);
    }


    static void smallestNumber(int arr[]){
        int myMin;
        myMin = arr[0];
        for (int i = 0 ; i <= arr.length - 1; i++){
            if(myMin >= arr[i]){
                myMin = arr[i];
            }


        }
        System.out.println("Smallest Array Values");
        System.out.println(myMin);
    }


    static void swap(int arr[]){
        System.out.print( "Pick Range from 0 to : ");
        System.out.print(arr.length + " ");
        System.out.print("Before Swap : ");
        viewArray(arr);
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        int t = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = t;
        System.out.print("Swap Array Values : ");
        viewArray(arr);
    }


    static void secondLargest(int arr[]){
        int firstLargest = Integer.MIN_VALUE; 
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i<= arr.length - 1; i++ ){
            if(arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            if (firstLargest > arr[i]  && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }


        }
        viewArray(arr);
        System.out.print("Second Largest : ");
        System.out.print(secondLargest);
    }


    static void swapWhole(int arr[]){
        int n = arr.length;
        int newarr[] = new int[n];
        for (int i = 0; i < n ; i++) {
            newarr[i] = arr[n - i - 1]; 
        }
        viewArray(newarr);
    }



    static void amstrongNumber(){
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        int digit;
        int countOfN = String.valueOf(n).length();
        int k = countOfN;
        for( int i = 0 ; i <= countOfN; countOfN--){
            digit = n%10;
            sum += Math.pow(digit, k);
            n= n/10;
        }
        if (sum == temp) {
            System.out.println(temp + " is an Armstrong number.");
        }else{ 
            System.out.println(temp + " is Not an Armstrong number.");
        }
    }


    static void amicable(){

        int n1 = enterNumber();
        int n2 = enterNumber();
        class InnerFunction{

            int handleN(int num){
            int sum = 0;
                for(int i = 1; i< num; i++){
                    if(num%i == 0){
                        sum+= i;
                    }
                }
                return sum;
            }
        }
        
        InnerFunction n = new InnerFunction();
        int sum1 = n.handleN(n1);
        int sum2 = n.handleN(n2);
        if (sum1 == n2 && sum2 == n1){
            System.out.println("amicable numbers");
        }else{
            System.out.println("Not Amicable numbers");
        }
        
    }

    static void revArray(int arr[]){
        int temp = arr.length; 
        int arr2[] = new int[arr.length];
        for ( int i = 0 ; i < arr.length; i++){
            arr2[i] = arr[temp - i - 1];
        }
        viewArray(arr);
        viewArray(arr2);
    }

    


    static void palinDrome(){
        int n = enterNumber();
        int temp = n;
        int rev = 0, u;
        
        while(n!=0){
            u = n%10;
            rev = (rev * 10) + u;
            n /= 10;
        }
        print((rev == temp) ? "Palindrome": "Not Palindrome");
    }


    static void pureSwap(int arr[]){
        int st = 0;
        int end = arr.length - 1;
        print("Before Array : ");
        viewArray(arr);
        while(st<end){
            int t = arr[st];
            arr[st] = arr[end];
            arr[end] = t;
            st++;
            end--;
        }
        print("After Array");
        viewArray(arr);

    }

    static void palindromeArray(int arr[]){
        int st = 0;
        int end = arr.length - 1;
        int c = 0;
        while(st<end){
            if(arr[st] != arr[end]){
                c = 1;
                break;
            }
            st++;
            end--;

        }

        if(c == 0){
            print("Palindrome");
        }else {
            print("Not Palindrome");
        }
    }


    static void endZero(int arr[]){
         int index = 0;
        // Move non-zero elements forward
        for (int num : arr) {             // 2
            if (num != 0) {                // 2 !=0
                arr[index++] = num;         //   = 2
            }
        }

        // Fill the rest with zeros
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    static void swapArray(int[] arr){
        // without using another Array
        // not using original array becaz it will change the Original array so making another array will not change the original array 
        int n = arr.length - 1;
        int CopyArray[] = Arrays.copyOf(arr, arr.length);
        print("Before Array");
        viewArray(CopyArray);
        int temp;
        for(int i = 0; i<=n ;i++){
            temp = CopyArray[i];
            CopyArray[i] = CopyArray[n];
            CopyArray[n] =  temp;
            n--;            
        }
        print("After Array");
        viewArray(CopyArray);
    }



    static void delAryElm(int arr[]){
        int n = arr.length;
        print("Index Number ");
        System.out.print("From 0 to " + n + " : ");
        int index = enterNumber();
        int copyArray[] = new int[n - 1];
        print("Before Array");
        viewArray(arr);
        for(int i = 0, j = 0; i <= n - 1 ; i++){
            if (i == index){
                continue;
            }
            copyArray[j++] = arr[i];
        }
        print("After Array");
        viewArray(copyArray);
    }


    static int numberOfDigitsAnotherApproach(int n){
        if (n == 0){
            return 0;
        }
        return numberOfDigitsAnotherApproach(n/10) + 1;
    }


    static int numberOfDigits(int n, int k){
        if(n == 0){
            return k;
        }
        k++;
        return numberOfDigits(n/10, k);
    }

    
    static int CountbinaryDigitsAnotherApproach(int n){
        if (n == 0){
            return 0;
        }
        n /= 2;
        return CountbinaryDigitsAnotherApproach(n) + 1;
    }

    static int CountbinaryDigits(int n, int k){
        if (n == 0){
            return k;
        }
        n /= 2;
        k++;
        return CountbinaryDigits(n, k);
    }


    static String deciToInt(int n, String p){
        if(n == 0){
            return p; 
        }
        p = n%2 + p;
        n /= 2;
        return deciToInt(n, p);
    }







    static void help(int myArray[]){
        print("Array : ");
        viewArray(myArray);
        print("");
        ToPrint("exit", "To Exit", false);
        ToPrint("h", "Help", false);
        ToPrint("clr", " Clear Console ", false);
        ToPrint("VA", "To View an Array", false);
        print("");
        print("Programs");
        ToPrint("odd", "Odd", true);
        ToPrint("even", "Even" , true);
        ToPrint("gNum", "Greatest", true);
        ToPrint("sNum", "Smallest", true);
        ToPrint("SLN", "Second Largest", true);
        ToPrint("swap", "To Swap The Number", false);
        ToPrint("swapWhole", "To Swap The Whole Array", false);
        ToPrint("ams-num", "To find Amstrong Number", false);
        ToPrint("amicable", "To find amicable Number", false);
        ToPrint("revArray", "To reverse a Array", false);
        ToPrint("paliDom", "To find Palindrome ", false);
        ToPrint("paliDomAry", "To Know is The Array Palindrome", false);
        ToPrint("end0", "To Make all Zero to End", false);
        ToPrint("swapArayWithout", "To Swap Array Without Creating Another Array", false);
        ToPrint("delAryElm", "To Delete A Array Element", false);
        // ToPrint("romanToInt", "To Convert Roman Numbers into Numbers", false);
        // ToPrint("noDupInAry", "To Delete Duplicates in Array", false);
        ToPrint("StrBuilderEg", "To Give eg of all String Builder Methods", false);
        ToPrint("deciToInt", "Convert DECIMAL into INTEGER Using Recursion", false);
        ToPrint("nDigitsAA", "To find Number of Digits Another Approach Using Recursion", false);
        ToPrint("nDigits", "To Find Number of Digits Using Recursion", false);
        ToPrint("cbdAA", "Count Binary Digits Another Approach Using Recursion", false);
        ToPrint("cbd", "Count Binary Digits", false);
        

        
        
       
    }

    


    






    public static void main(String args[]){
        clearConsole("WithOutHelpFunction");
        print("");
        print("");
        print("Hello Guys Welcome to LiFrNDs' s Console Here you Get all Programs ");
        print("");
        print("");
        print("");
        int myArray[] = {1,4,6,8,10,8, 5, 7}; 
        // int myArray[] = getArray();
        help(myArray);
        
        
        // -------------------------------- Space before Input ---------------------------
        print("");


        // ConsoleLFs2.greet();
        while(true){
            String mykey = sc.nextLine();
            
            switch(mykey){
            //---------------------------- System Functions ------------------------------------
            case "VA" -> viewArray(myArray);
            case "h" -> help(myArray);
            case "clr" -> clearConsole("withHelpFunction");
            case "exit" -> {
            print("");
            print("Bye Dude !");
            print("");
            System.exit(0);
            }

            //---------------------------- Program Functions ----------------------------------  
            case "odd" -> odd(myArray);
            case "even" -> even(myArray);
            case "gNum" -> greatestNumber(myArray);
            case "sNum" -> smallestNumber(myArray);
            case "SLN" -> secondLargest(myArray);
            case "swap" -> swap(myArray);
            case "swapWhole" -> swapWhole(myArray);
            case "ams-num" -> amstrongNumber();
            case "amicable" -> amicable();
            case "revArray" -> revArray(myArray);
            case "paliDom" -> palinDrome();
            case "pureSwap" -> pureSwap(myArray);
            case "paliDomAry" -> palindromeArray(myArray);
            case "end0" -> endZero(myArray);
            case "swapArayWithout" -> swapArray(myArray);
            case "delAryElm" -> delAryElm(myArray);
            // ----------------------------- Recursions --------------------------//
            case "deciToInt" -> {
                int n = enterNumber();
                deciToInt(n, "");
            }
            case "nDigitsAA" -> {
                int n = enterNumber();
                numberOfDigitsAnotherApproach(n);
            }
            case "nDigits" -> {
                int n = enterNumber();
                numberOfDigits(n,0);
            }
            case "cbdAA" -> {
                int n = enterNumber();
                CountbinaryDigitsAnotherApproach(n);
            }
            case "cbd" -> {
                int n = enterNumber();
                CountbinaryDigits(n, 0);
            }
            
            // case "noDupInAry" -> noDupInAry(myArray);
            // case "romanToInt" -> cfs2.romanToInt();
            
            
            default -> {
                continue;
                }
            }

        }
    }
}

