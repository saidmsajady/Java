package lambdaandfunctionalinterfaces;

public class ConsolePrinter implements IPrinter {

    @Override 
    public void print(String message) {
        System.out.println(message);
    }
    
}
