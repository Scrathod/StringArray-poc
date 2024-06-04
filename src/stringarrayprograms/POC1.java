package stringarrayprograms;

import java.util.Scanner;

public class POC1
{
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter The Number Of Customer");
	        int size = scanner.nextInt();
	        String[] array = new String[size];
	        System.out.println("Enter the Names of the customer");
	        for (int i = 0; i <array.length ; i++)
	        {
	            array[i] = scanner.next();
	        }
	        System.out.println("Enter customer name to search");
	        String name = scanner.next();
	        boolean result = false;
	        for (int i = 0; i <array.length ; i++)
	        {
	            if(array[i].equalsIgnoreCase(name))
	            {
	                result = true;
	                break;
	            }

	        }
	        if(result)
	        {
	            System.out.println(name+" found");
	        }
	        else{
	            System.out.println(name+" not found");
	        }
	    }
	}

