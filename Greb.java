public class Greb implements Runnable {
    public void run(){
        Turtle greb = new Turtle();
        greb.penColor("red");
        greb.width(5);

        
        greb.left(180);
        greb.forward(20);
  
        for(int i=0 ; i<20;i++){
          greb.right(5.8);
          greb.forward(i);
        
        }
        greb.right(180);
        greb.left(60);
        greb.forward(20);
        greb.left(10);
        greb.forward(62);
        
        Turtle greb1 = new Turtle();
        greb1.penColor("red");
        greb1.width(5);
       
  
        for(int i=0 ; i<20;i++){
          greb1.left(5);
          greb1.forward(i);
        }
        greb1.right(180);
         for(int i=0 ; i<14;i++){
          greb1.right(5);
          greb1.forward(i);
        }
  
        for(double i=0 ; i<14.005;i++){
          greb1.left(5);
          greb1.forward(i);
        }

        Turtle greb2 = new Turtle(-7,130);
        greb2.penColor("red");
        greb2.width(5);
        

         for(int i=0 ; i<12;i++){
          greb2.left(4);
          greb2.forward(i);
        }
      greb2.right(180);
      for(int i=0 ; i<7;i++){
          greb2.left(10);
          greb2.forward(i);
        }

        Turtle greb3 = new Turtle(30,150);
        greb3.penColor("red");
        greb3.width(5);
        
       
       greb3.left(90);
       greb3.forward(5);
       for(int i=0 ; i<9;i++){
          greb3.left(10);
          greb3.forward(i);
        }
       for(int i=0 ; i<9;i++){
          greb3.left(5);
          greb3.forward(i);
        }

        Turtle greb4 = new Turtle(0,150);
        greb4.penColor("red");
        greb4.width(5);
        greb4.right(180);

         for(int i=0 ; i<5;i++){
          greb4.left(20);
          greb4.forward(i);
        }   
         for(int i=0 ; i<7;i++){
          greb4.left(20);
          greb4.forward(i);
        }
         for(int i=0 ; i<5;i++){
          greb4.left(20);
          greb4.forward(i);
        }

        for(int i=0 ; i<6;i++){
          greb4.left(2);
          greb4.forward(i);
        }
        for(int i=0 ; i<5;i++){   
          greb4.left(5);
          greb4.forward(i);
        }
    }
}
