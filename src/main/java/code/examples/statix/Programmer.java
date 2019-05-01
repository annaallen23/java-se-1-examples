package code.examples.statix;

public class Programmer extends Writer {
    public static String write() {
        return "Programmer writing code";
    }

    public static void main(String[] args){

        Writer w = new Programmer();
        String result =  w.write();
        System.out.println("Result is " + result);
    }
}