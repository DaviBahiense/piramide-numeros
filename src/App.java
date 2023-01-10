public class App {
    public static void main(String[] args)  {

   int number = 6;
   
        for (int i = 1; i < number; i++) {
            String line = ""+i;
            for (int j = 1; j < i; j++) {
                
                line +=i;
                
            }
            
            System.out.println(line);
        }
    }
}