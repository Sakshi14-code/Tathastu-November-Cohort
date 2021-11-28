// Java program to find factorial
// of given number
class Program3 {

    int factorial(int n)
    {
    
        // single line to find factorial
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    
    }
    
    
    // Driver Code
    public static void main(String args[])	
    {
        Program3 obj = new Program3();
        int num = 5;
        System.out.println("Factorial of " + num +
                        " is " + obj.factorial(num));
    }
    }
    
    