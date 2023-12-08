//Write a Java code that converts float to Float converts Float to String converts String to float converts float to String converts String to Float converts Float to float.

package EXPERIMENT_7;
public class TypeConversions1 {
    public static void main(String[] args) {
        // Convert float to Float
        float floatValue = 3.14f;
        Float floatObject = floatValue;
        
        // Convert Float to String
        String stringValue = floatObject.toString();
        
        // Convert String to float
        float newFloatValue = Float.parseFloat(stringValue);
        
        // Convert float to String
        String newStringValue = String.valueOf(floatValue);
        
        // Convert String to Float
        Float newFloatObject = Float.valueOf(newStringValue);
        
        // Convert Float to float
        float newFloatValueFromFloat = floatObject;
        
        // Print the results
        System.out.println("float to Float: " + floatObject);
        System.out.println("Float to String: " + stringValue);
        System.out.println("String to float: " + newFloatValue);
        System.out.println("float to String: " + newStringValue);
        System.out.println("String to Float: " + newFloatObject);
        System.out.println("Float to float: " + newFloatValueFromFloat);
    }
}
