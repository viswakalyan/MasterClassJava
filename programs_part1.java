public class DecimalComparator{
    
    public static boolean areEqualByThreeDecimalPlaces(double firstDecimal, double secondDecimal){
        
        return (int) (firstDecimal * 1000) == (int) (secondDecimal * 1000);
    }
 
}

========================================================================================================
public class LeapYear {
    
    public static boolean isLeapYear(int year){
        boolean isLeapyear= false;
        if(year >= 1 && year <= 9999){
            if(year % 4 == 0){
                if(year % 100 != 0){
                    isLeapyear= true;
                }else{
                    if(year % 400 == 0){
                        isLeapyear= true;
                    }
                }
            }
        }
        return isLeapyear;
    }
 
}
===========================================================================================================
public class BarkingDog {
    
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean wakeUp=false;
        if(((hourOfDay >= 0 && hourOfDay < 8) || 
        (hourOfDay > 22 && hourOfDay <= 23)) && barking){
            wakeUp=true;
        }
        return wakeUp;
    }
 
}
Solution 2:
public class BarkingDog {
         public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
            if(!barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)){
                return false;
            }
                return true;
        }
}

================================================================================================================
public class MegaBytesConverter {
    
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kiloBytes + " KB = " + (kiloBytes/1024) + " MB and " + (kiloBytes%1024) + " KB");
        }
    }
 
}
==========================================================================================================
public class SpeedConverter {
    // write your code here
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }else{
            return Math.round(kilometersPerHour/1.609);
        }
    }
    
    public static void printConversion(double kilometersPerHour){
        long miles=toMilesPerHour(kilometersPerHour);
        if(miles==-1){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
        }
    }
        
}

solution 2:
public class SpeedConverter {
 
	public static long toMilesPerHour(double kilometersPerHour)  {
		return kilometersPerHour < 0 ? -1 : Math.round(kilometersPerHour / 1.609);
	}
	
	public static void printConversion(double kilometersPerHour)  {
		System.out.println(kilometersPerHour < 0 ? "Invalid Value" : kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
	}
 
}



=================================================================================================
public class PositiveNegativeZero {
    // write code here
    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("positive");
        }else if(number < 0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
    }
}

Solution 2:
System.out.println(number > 0 ? "positive" : number < 0 ? "negative" : "zero");

=========================================================================================================
public class EqualSumChecker {
    
    public static boolean hasEqualSum(int first, int second, int third){
        boolean areEqual = false;
        if(first + second == third){
            areEqual = true;
        }
        return areEqual;
    }
 
}

Solution 2:

public class EqualSumChecker {
    
    public static boolean hasEqualSum(int first, int second, int third){
        
        return first + second == third ? true : false ;
    }
 
}
Solution 3:
public class EqualSumChecker {

    public static boolean hasEqualSum(int firstNumber,int secondNumber,int thirdNumber){

    return firstNumber+secondNumber == thirdNumber;

    }

}

=======================================================================================================
public class TeenNumberChecker {
    
    public static boolean hasTeen(int first, int second, int third){
        return isTeen(first) || isTeen(second) || isTeen(third);
    }
    
    public static boolean isTeen(int age){
        boolean isTeen = false;
        if(age >= 13 && age <= 19){
            isTeen = true;
        }
        return isTeen;
    }
 
}

=======================================================================================================
public class MethodOverloading {
    public static void main(String[] args) {
        calculateScore("Tim",50);
        calculateScore(10);
        calculateScore();
    }

    private static void calculateScore() {
        System.out.println("No player name, no player score.");
    }

    public static void calculateScore(int score) {
        // its the example to set the default value for method parameters
        calculateScore("Anonymous",score);
    }

    public static void calculateScore(String playerName , int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
    }
}
=======================================================================================================

public class MethodOverloadingChallange1 {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(8));
        //convertToCentimeters(8);
        System.out.println(convertToCentimeters(5,3));
        //convertToCentimeters(5,3);
    }
    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }
    public static double convertToCentimeters(int feet, int inches){
        return ((feet * 12) + inches) * 2.54;
    }
}

Solution2:
public static double convertToCentimeters(int inches) {
    return inches * 2.54;
}
 
public static double convertToCentimeters(int feet, int inches) {
    return convertToCentimeters(feet * 12 + inches);
}
==================================================================================================================

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(500));
        //getDurationString(500);
        System.out.println(getDurationString(123,45));
        //getDurationString(123,45);
    }

    private static String getDurationString(int seconds) {
        if(seconds >= 0){
            return getDurationString(seconds/60,seconds%60);
        }else{
            return "invalid input";
        }
    }

    private static String getDurationString(int minutes, int seconds) {
        if(minutes > 0 && (seconds > 0 && seconds <= 59)){
            return (minutes/60)+"h "+ (minutes % 60) + "m " + seconds + " s";
        }else{
            return "invalid input";
        }
    }
}


==================================================================================================================
public class AreaCalculator {
     public static double area(double radius){
         if(radius >= 0){
             return Math.PI * radius * radius;
         }else {
             return -1;
         }
     }
     
     public static double area(double length, double width){
         if(length >= 0 && width >= 0){
             return length * width;
         }else{
             return -1;
         }
     }
}

solution 2:
public class AreaCalculator {
    public static double area (double radius) {
        return (radius < 0) ? -1 : radius * radius * Math.PI;
    }
 
    public static double area (double x, double y) {
        return (x < 0 || y < 0) ? -1 : x * y;
    }
}

==================================================================================================================

public class MinutesToYearsDaysCalculator {
    // write your code here
    public static void printYearsAndDays(long minutes){
    String str = (minutes < 0) ? "Invalid Value" : (minutes + " min = " + (minutes/(365*24*60)) + " y and " + ((minutes/(24*60))%365) + " d") ;
    System.out.println(str);
}
}

==================================================================================================================

public class IntEqualityPrinter {
    // write your code here
    public static void printEqual(int first, int second, int third){
        if(first < 0 || second < 0 || third < 0){
            System.out.println("Invalid Value");
        }else if(first == second && second == third){
            System.out.println("All numbers are equal");
        }else if(first != second && second != third && first != third){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }
}

==================================================================================================================

public class PlayingCat {
    // write your code here
    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean isPlaying = false;
        if(summer && temperature >= 25 && temperature <= 45){
            isPlaying = true;
        }else if(!summer && temperature >= 25 && temperature <= 35){
            isPlaying = true;
        }
        return isPlaying;
    }
}
Solution 2 :
public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {       
        int upperLimit = summer ? 45 : 35;
        return temperature >= 25 && temperature <= upperLimit;
    }
}
==================================================================================================================
public class SwitchCase {
    public static void main(String[] args) {
        int switchValue = 6;
        switch (switchValue){
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 3: case 4:
            case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;
        }
    }
}
==================================================================================================================
Enhanced Switch:

public class SwitchCase {
    public static void main(String[] args) {
        int switchValue = 6;
        switch (switchValue) {
            case 1 -> System.out.println("value is 1");
            case 2 -> System.out.println("value is 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, or 5");
        }
    }
}

==================================================================================================================

public class SwitchCaseReturn {
    public static void main(String[] args) {
        String month = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
        System.out.println(month + " is in the " + getQuarter("JANUARY") + " quarter");
    }

    public static String getQuarter(String month) {
        return switch (month){
            case "JANUARY", "FEBRUARY", "MARCH" -> { yield "1st" ;}
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}

==================================================================================================================
NumberOfDaysInMonth :
=======================

public static boolean isLeapYear(int year) {
 
    if ((year < 1) || (year >= 9999)) {
        return false;
    } else return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
}
 
public static int getDaysInMonth(int month, int year) {
 
    if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))) {
        return -1;
    }
    if (isLeapYear(year) && month == 2) {
        return 29;
    }
 
    switch (month) {
        case 11:
        case 4:
        case 6:
        case 9:
            return 30;
        case 2:
            return 28;
        default:
            return 31;
    }
 
}
==================================================================================================================

public class ForLoop {
    public static void main(String[] args) {
        for(int counter = 1; counter <= 5; counter++){
            System.out.println(counter);
        }
        for(double rate = 2.0 ; rate <= 5.0;rate++){
            double interestAmount= (1000.00 *rate)/100;
            System.out.println("interest rate of "+ rate+ "% the interest  amount is "+interestAmount);
        }
        System.out.println("*************************************************************************************************");
        for(double rate = 7.5; rate <=10;rate += 0.25){
            double interestAmount= (1000.00 *rate)/100;
            if(interestAmount > 85){
                break;
            }
            System.out.println("interest rate of "+ rate+ "% the interest  amount is "+interestAmount);
        }

    }
}

==================================================================================================================
 public static boolean isPrime(int number){
        if(number > 2){
            for(int i=2; i<=number/2;i++){
                if(number%i==0){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
========================================================================================================================
public class Sum3and5 {
    public static void main(String[] args) {
        int counter =0;
        int sum=0;
        for(int i=1;i<=1000;i++){
            if(i%15==0){
                sum += i;
                System.out.println(i);
                if(++counter >=5){
                    break;
                }
            }
        }
        System.out.println("sum = " + sum);
    }
}

========================================================================================================================

public class SumOddRange {

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(100, 1000));
    }
    public static boolean isOdd(int number){
        if(number <= 0){
            return false;
        }
        return number%2 != 0;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if(end < start || start < 0 || end < 0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }
}

========================================================================================================================
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "A");
        map.put("b", "B");
        map.put("c", "C");
        map.put("d", "D");

        map.keySet().forEach(key -> {
            String value = map.get(key);
            String newValue = value + "W";
            map.put(key, newValue);
        });

        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
========================================================================================================================
public class SumDigit {

    public static void main(String[] args) {

        System.out.println(sumDigit(1000));
        System.out.println(sumDigit(458));
    }

    public static int sumDigit(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        while(number >0){
            sum += number %10;
            number /= 10;

        }
        return sum;
    }
}
========================================================================================================================
What is a Palindrome number?  
A palindrome number is a number which when reversed is equal to the original number.

public class NumberPalindrome {
    
    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        int temp =number;
        int revserNumber = 0;
        while(temp > 0){
            revserNumber = (revserNumber*10) + temp%10;
            temp /= 10;
        }
        if(revserNumber == number){
            return true;
        }
        return false;
    }
 
}
========================================================================================================================
public class FirstLastDigitSum {
    // write your code here
    public static int sumFirstAndLastDigit(int number){
        if(number <0){
            return -1;
        }
        int sum = number % 10;
        int temp = 0;
        do{
            temp = number;
            number /= 10;
            
        }while(number > 0);
        return temp+sum;
    }
}

Solution 2:

public class FirstLastDigitSum {
 
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
 
        int lastDigit = number % 10;
        while (number > 9) {
            number /= 10;
        }
        return lastDigit + number;
    }
}
========================================================================================================================
public class EvenDigitSum {
    // write your code here
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
       int temp=0;
       int sum =0;
       while(number > 0){
           temp = number % 10;
           if(temp %2 == 0){
               sum += temp;
           }
           number /= 10;
       }
       return sum;
    }
}
========================================================================================================================
public class SharedDigit {
    // write your code here
    public static boolean hasSharedDigit(int first, int second){
        if(first<10 || first >99 || second< 10 || second > 99 ){
            return false;
        }
        if((first/10 == second/10) || (first/10 == second%10) || (first%10 == second%10) || (first%10 == second/10) ){
            return true;
        }
        return false;
    }
}
========================================================================================================================

Write a method named hasSameLastDigit with three parameters of type int. 

Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.

The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.


public class LastDigitChecker {
    // write your code here
    public static boolean hasSameLastDigit(int a,int b, int c){
        if(isValid(a) && isValid(b) && isValid(c)){
            a %= 10;
            b %= 10;
            c %= 10;
            if(a==b || b==c ||c== a){
                return true;
            }
        }
        return false;
    }
    
    public static boolean isValid(int x){
        if(x < 10  || x >1000){
            return false;
        }
        return true;
    }
}

========================================================================================================================
Write a method named printFactors with one parameter of type int named number. 

If number is < 1, the method should print "Invalid Value".

The method should print all factors of the number. A factor of a number is an integer which divides that number wholly (i.e. without leaving a remainder).


public class FactorPrinter {
    // write your code here
    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
            return;
        }
        for(int i=1 ; i <= number/2; i++){
            if(number %i==0){
                System.out.print(i+ " ");
            }
        }
        System.out.print(number);
    }
}

========================================================================================================================
Write a method named getGreatestCommonDivisor with two parameters of type int named first and second. 

If one of the parameters is < 10, the method should return -1 to indicate an invalid value.


public class GreatestCommonDivisor {
    // write your code here
    public static int getGreatestCommonDivisor(int x , int y){
        if(x<10 || y<10){
            return -1;
        }
        while(x!=y){
            if(x>y){
                x=x-y;
            }else{
                y=y-x;
            }
        }
        return x;
    }
}



========================================================================================================================
What is the perfect number?
A perfect number is a positive integer which is equal to the sum of its proper positive divisors. 
Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.
For example, take the number 6: 
Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6. 

Therefore, 6 is a perfect number (as well as the first perfect number).

public class PerfectNumber {
    // write your code here
    public static boolean isPerfectNumber(int number){
        if(number <1){
            return false;
        }
        int sum =0;
        for(int i=1; i<=number/2;i++){
            if(number%i==0){
                sum += i;
            }
            
        }
        if(sum == number){
            return true;
        }
        return false;
    }
}


========================================================================================================================
Flour Pack Problem
Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal. 

The parameter bigCount represents the count of big flour bags (5 kilos each).

The parameter smallCount represents the count of small flour bags (1 kilo each).

The parameter goal represents the goal amount of kilos of flour needed to assemble a package.

Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal. The method should return true if it is possible to make a package with goal kilos of flour.

If the sum is greater than goal, ensure that only full bags are used towards the goal amount. For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false since each big bag is 5 kilos and cannot be divided. However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal, and it's okay if there are additional bags left over.

If any of the parameters are negative, return false.



EXAMPLE INPUT/OUTPUT:

canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.

canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.

canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.

canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos. 

canPack (-3, 2, 12); should return false since bigCount is negative.

Solution steps:
1. Validation of the parameter values

2. Determine how many bigCount can fill the goal:  As long as goal is greater than or equal to 5, take the goal and subtract 5 for each bigCount that you have.  Use a while loop to do this and make sure you decrement the number of bigCount for each iteration.

3. Determine how many smallCount can fill the goal:  The remaining amount is what you have to fill with smallCount, so evaluate that you have enough smallCount to fulfill the "remaining" goal.



public class FlourPacker {
    // write your code here
    public static boolean canPack(int bigCount,int smallCount,int goal){
		// #1 validation
        if(bigCount<0 || smallCount < 0 || goal < 0){
            return false;
        }
        while(bigCount > 0 && goal >=5){
            bigCount--;
            goal -=5;
        }
        return smallCount >= goal;
    }
}
========================================================================================================================
Write a method named getLargestPrime with one parameter of type int named number. 

If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.



The method should calculate the largest prime factor of a given number and return it.

HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.

public class LargestPrime {
    // write your code here
    public static int getLargestPrime(int number){
        if(number < 2){
            return -1;
        }
        for(int i=2;i<number;i++){
            if(number % i == 0){
                number /= i;
                i--;
            }
        }
        return number;
    }
}
========================================================================================================================
Diagonal Star
Write a method named printSquareStar with one parameter of type int named number. 

If number is < 5, the method should print "Invalid Value".

The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).



EXAMPLE INPUT/OUTPUT:

EXAMPLE 1

printSquareStar(5); should print the following:

→ NOTE: For text in Code Blocks below, use code icon {...}  on Udemy

*****
** **
* * *
** **
*****

Explanation:

*****   5 stars
** **   2 stars space 2 stars
* * *   1 star space 1 star space 1 star
** **   2 stars space 2 stars
*****   5 stars


public class DiagonalStar {
    // write your code here
    public static void printSquareStar(int number){
        if(number <5){
            System.out.println("Invalid Value");
            return;
        }
        for(int row =0 ;row<number;row ++){
            for(int column =0; column < number ; column++){
                if(row==0 || row == number-1 || column == 0 || column == number-1 || row == column || column == number-1-row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}

========================================================================================================================

Reading input from Scanner:

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int currentYear = 2022;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

//        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi, What's your Name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course!");

//        String dateOfBirth = System.console().readLine("What year were you born? ");
        System.out.println("What year were you born? ");

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 125) + " and <= " + (currentYear));
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed!!! Try again.");
            }
        } while (!validDOB);

        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth) {

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return (currentYear - dob);
    }
}

========================================================================================================================
In this challenge, you'll read 5 valid numbers from the console, entered by the user, and print the sum of those five numbers.
You'll want to check that the numbers entered, are valid integers. 
If not,  print out the message "Invalid number" to the console, but continue looping, until you do have 5 valid numbers.
Before the user enters each number, prompt them with the message, "Enter number #x:", where x represents the count, 1, 2, 3, etc.
And as an example there, the first message would look something like,"Enter number #1:", the next, "Enter number #2:", and so on.



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        double sum = 0;

        do {
            System.out.println("Enter number #" + counter + ":");
            String nextNumber = scanner.nextLine();
            try {
//                int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        } while (counter <= 5);

        System.out.println("The sum of the 5 numbers = " + sum);
    }
}

========================================================================================================================
You'll be using an endless loop which:
Prompts the user to enter a number, or any character to quit.
Validates if the user-entered data really is a number, you can choose either an integer, or double validation method.
If the user-entered data is not a number, quit the loop.
Keep track of the minimum number entered.
Keep track of the maximum number entered.
If the user has previously entered a set of numbers (or even just one), display the minimum, and maximum number, which the user entered.


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double max = 0;
        double min = 0;
        int loopCount = 0;

        while (true) {
            System.out.println("Enter a number, or any character to exit:");
            String nextEntry = scanner.nextLine();
            try {
                double validNum = Double.parseDouble(nextEntry);
                if (loopCount == 0 || validNum < min) {
                    min = validNum;
                }
                if (loopCount == 0 || validNum > max) {
                    max = validNum;
                }
                loopCount++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }

        if (loopCount > 0) {
            System.out.println("min = " + min + ", max = " + max);
        } else {
            System.out.println("No valid data entered");
        }
    }
}


========================================================================================================================

Write a method called inputThenPrintSumAndAverage that does not have any parameters.

The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.

When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".

XX represents the sum of all entered numbers of type int.
YY represents the calculated average of all numbers of type long.

TIP: Use Scanner to read an input from the user.

TIP: Use casting when calling the round method since it needs double as a parameter.

NOTE: Use the method Math.round to round the calculated average (double). The method round returns long.

import java.util.Scanner;
 
public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
 
        while (true) {
            try {
                sum += Integer.parseInt(scanner.nextLine());
                count ++;
            } catch (Exception e) {
                break;
            }
        }
        long avg = Math.round((double) sum/count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}

========================================================================================================================
write a program that helps Bob calculate how many buckets of paint he needs to buy before going to work. Bob might also have some extra buckets at home. He also knows the area that he can cover with one bucket of paint.

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0) return -1;
        return (int) Math.ceil(width*height/areaPerBucket-extraBuckets);
    }
    
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width<=0 || height<=0 || areaPerBucket<=0) return -1;
        return (int) Math.ceil(width*height/areaPerBucket);
    }
    
    public static int getBucketCount(double area, double areaPerBucket){
        if(area<=0 || areaPerBucket<=0) return -1;
        return (int) Math.ceil(area/areaPerBucket);
    }
}


========================================================================================================================





































































































































































































































































































































































































































































