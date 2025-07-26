// Simple Java program
// FileName: "Hello.java"
public class Hello {
    
    // Your program begins with a call to main().
    // Prints "Hello, Globe" to the terminal window.
 public static void main(String[] args)
{
    try {
        System.out.println("Hello, Globe Master1");
    } catch (Exception e) {
        System.err.println("An error occurred: " + e.getMessage());
        e.printStackTrace();
    }
}  
}