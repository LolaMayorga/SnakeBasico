package snake;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MiCanvas extends Canvas implements KeyListener{
    Snake snake;
    MiCanvas(Snake snake)
    {
       this.setBackground(Color.white);
       this.setBounds(50,50,300,300);
       this.snake=snake;
       this.addKeyListener(this);
    }
    
    public void paint(Graphics g)
    {
        snake.draw(g);
        
    }
   
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
       int key=e.getKeyCode();
        System.out.println("Paso");
       
       if (key==KeyEvent.VK_LEFT)
           snake.setMov('L');
       else if (key==KeyEvent.VK_RIGHT)
                snake.setMov('R');
            else if (key==KeyEvent.VK_DOWN)
                    snake.setMov('D');
                  else if (key==KeyEvent.VK_UP)
                            snake.setMov('U');
            
       repaint();
       
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

 
}
