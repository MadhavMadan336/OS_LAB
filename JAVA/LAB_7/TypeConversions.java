//Write a Java code that converts int to Integer, converts Integer to String, converts String to int, converts int to String, converts String to Integer converts Integer to int.

package EXPERIMENT_7;
public class TypeConversions {
    public static void main(String[] args) {
        // Convert int to Integer
        int intValue = 42;
        Integer integerValue = Integer.valueOf(intValue);
        // Convert Integer to String
        String stringValue = integerValue.toString();
        // Convert String to int
        int newIntValue = Integer.parseInt(stringValue);
        // Convert int to String
        String newStringValue = String.valueOf(intValue);     
        // Convert String to Integer
        Integer newIntegerValue = Integer.valueOf(newStringValue);
        // Convert Integer to int
        int newIntValueFromInteger = newIntegerValue.intValue();
        // Print the results
        System.out.println("int to Integer: " + integerValue);
        System.out.println("Integer to String: " + stringValue);
        System.out.println("String to int: " + newIntValue);
        System.out.println("int to String: " + newStringValue);
        System.out.println("String to Integer: " + newIntegerValue);
        System.out.println("Integer to int: " + newIntValueFromInteger);
    }
}

