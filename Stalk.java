public class Stalk implements Runnable{
    public void run(){
    
     Turtle bob = new Turtle();
     bob.penColor("green");
     bob.width(5);
    
     bob.right(90);
     for(int i=0;i<20;i++)
     
     {
         bob.right(1);
         bob.forward(i);
        
     }

     Turtle bob1 = new Turtle();
     bob1.penColor("green");
     bob1.width(5);
    
     bob1.right(90);
     for(int i=0;i<15;i++)
     
     {
         bob1.right(1);
         bob1.forward(i);
        
     }
     bob1.right(180);
       for(int i=0;i<15;i++)
     
     {
         bob1.right(4);
         bob1.forward(i);
        
     }
      bob1.right(180);
       for(int i=0;i<10;i++)
     
     {
        bob1.left(4);
        bob1.forward(i);
           
     }
    
       for(int i=0;i<11;i++)
     
     {
        bob1.right(5);
        bob1.forward(i);
           
     }
 }
}  
