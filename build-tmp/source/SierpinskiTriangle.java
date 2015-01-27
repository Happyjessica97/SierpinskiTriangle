import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class SierpinskiTriangle extends PApplet {

public void setup()
{  background(8,90,80);
	size(500,500);
	
}
public void draw()
{
sierpinski(20,480,480);
}
public void mouseDragged()//optional
{	//background(8,90,80);
	int somenumber = (int)(Math.random()*20);
sierpinski(somenumber,mouseY,mouseX);
}
public void mousePressed(){
	int somecolor1 = (int)(Math.random()*401);
	int somecolor2 = (int)(Math.random()*401);
	int somecolor3 = (int)(Math.random()*401);
	background(somecolor1,somecolor2,somecolor3);
}
public void sierpinski(int x, int y, int len) 
{
	if(len > 20){
		sierpinski(x,y,len/2);
		sierpinski(x + len/2,y,len/2);
		sierpinski(x +len/4,y - len/2,len/2);
		

	}else{
		//fill(255,255,255);
		int somecolor1 = (int)(Math.random()*401);
		int somecolor2 = (int)(Math.random()*401);
		int somecolor3 = (int)(Math.random()*401);
		fill(somecolor1,somecolor2,somecolor3);
		triangle(x, y, x+len, y,x +len/2, y-len);
		
	}

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "SierpinskiTriangle" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
