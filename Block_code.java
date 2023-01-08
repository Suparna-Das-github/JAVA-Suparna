
//Created by Suparna



// Coding Blocks Code Challenge in Java






public class Program
{
    public static void main(String[] args) {
         
    String n = "* ".repeat(3), s = " ".repeat(3),a = "&".repeat(7); 
      
    for(int i=0; i<5; i++){
       System.out.println((n+s).repeat(3));       
       if(i==2)                
System.out.print(" ".repeat(7)+a+"&&"+"\n");              

        if(i==2)  
         System.out.print(a+" ".repeat(9)+a+"\n");  
          System.out.println((n+s).repeat(3));               
     } 
     
    }
}
