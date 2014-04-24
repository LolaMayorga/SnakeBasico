package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

public class Snake {
  LinkedList <Rectangle> snake  = new LinkedList();
  int lado=10;
  int body=3;
  char mov;
  boolean crece;
  
  Snake()
  {
      int x=150;
      int y=150;
      for (int i=0; i<body; i++)
      {
          Rectangle r= new Rectangle(x,y,lado,lado);
          snake.add(r);
          y+=10;
      }
      crece=false;
  }
  
  public void draw(Graphics g)
  {
     g.setColor(Color.red);
     for (int i=0; i<body; i++)
     {
         Rectangle r=snake.get(i);
         g.fillRect(r.x, r.y, r.width, r.height);
     }
  }
  
   public void left()
   {
       Rectangle r = new Rectangle(snake.getFirst());
       r.x-=lado;
       if (r.x<0)
           r.x=300-lado;
       snake.addFirst(r);
       if (body<snake.size())
           snake.removeLast();
       
   }
    public void right()
   {
       Rectangle r = new Rectangle(snake.getFirst());
       r.x+=lado;
       if (r.x>=300)
           r.x=0;
       snake.addFirst(r);
       if (body<snake.size())
           snake.removeLast();
       
   }
     public void up()
   {
       Rectangle r = new Rectangle(snake.getFirst());
       r.y-=lado;
       if (r.y<0)
           r.y=300-lado;
       snake.addFirst(r);
       if (body<snake.size())
           snake.removeLast();
       
   }
      public void down()
   {
       Rectangle r = new Rectangle(snake.getFirst());
       r.y+=lado;
       if (r.y>=300)
           r.y=0;
       snake.addFirst(r);
       if (body<snake.size())
           snake.removeLast();
       
   }

    public void setMov(char mov) {
        this.mov = mov;
    }

    public char getMov() {
        return mov;
    }
      
}
;