package stringarrayprograms;

import java.util.Scanner;

public class POC2 
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of cargo");
        int cargoQuantity = scanner.nextInt();
        System.out.println("Enter the cargo id's");
        int[] array = new int[cargoQuantity];
        for (int i = 0; i < array.length ; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the number of shipment");
        int totalShipment = scanner.nextInt();
        System.out.println("Enter the shipment name");
        String[] shipmentName = new String[totalShipment];
        for (int i = 0; i <shipmentName.length ; i++) {
            shipmentName[i] = scanner.next();
        }
        System.out.println("Enter the cargo Id");
        int cargoId = scanner.nextInt();
        for (int i = 0; i <array.length ; i++) {
            if(array[i]==cargoId)
            {
                if(cargoQuantity<=totalShipment)
                {
                    System.out.println(shipmentName[i]);
                    break;
                }
                else{
                    System.out.println("Yet to be shiped");
                }
            }

        }


    }

}
