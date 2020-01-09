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

public class GoogleBillboard extends PApplet {


public final static String e = "27182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435"; 




int i = 0;


public void setup() 


{           


   while(true){


   	String digits = e.substring(i, i+10);


   	double dNum = Double.parseDouble(digits);


   	if(isPrime(dNum)){


   		println(digits);


   		break;


   	}


   	i++;


   }


} 


public void draw() 


{  


	//not needed for this assignment


} 


public boolean isPrime(double dNum){  


   for(int i = 2; i <= Math.sqrt(dNum); i++){


   if(dNum%i==0)


   	return false;


   }


   return true; 


}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
