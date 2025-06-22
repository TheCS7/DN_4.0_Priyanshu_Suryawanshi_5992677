public class Testclass {  
    public static void main(String[] args) {  
        Logger logger1 = Logger.getInstance();  
        Logger logger2 = Logger.getInstance();  

        System.out.println("Same instance? " + (logger1 == logger2));  
        logger1.log("Logger message test 1");  
        logger2.log("logger message test  2");  
    }  
}

