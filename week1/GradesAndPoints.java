import java.util.Scanner;


public class GradesAndPoints {
    public static void main(String[] args){
        Scanner reader= new Scanner(System.in);
        
        System.out.println("Type the points[0-60]: ");
        int points=Integer.parseInt(reader.nextLine());
        
        
        if(points<29){
          String grade= "Failed";
          System.out.println("Grade: " + grade);
        }else if(points>30 && points <34){
            int grade= 1;
            System.out.println("Grade: " + grade);
        }else if(points>35 && points <39){
            int grade= 2;
            System.out.println("Grade: " + grade);
        }
        else if(points>40 && points <44){
            int grade= 3;
            System.out.println("Grade: " + grade);
        }
        else{
            System.out.println("Value unknown");
        }
 
    }
        
    
}