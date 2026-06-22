public class Main {
    public static void main(String args[]){
        Logger Logger1=Logger.getInstance();
        Logger Logger2=Logger.getInstance();
        
        Logger1.log("application started");
        Logger2.log("reset syatem");
        
        if(Logger1==Logger2){
            System.out.println("Both references point to the same Logger object.");
        }else{
            System.out.println("Different Logger objects.");
        }
    }
}
