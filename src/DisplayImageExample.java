import java.applet.Applet;

/*
Display Image in an Applet Example
This Java example shows how to display an image using drawImage method
of an Java Graphics class.
*/


//import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

/*
<applet code = "DisplayImageExample" width = 1000 height = 500>
        <param name = "Image1" value = "file:/C:/arqJxfs/check1.jpg">
        <param name = "Image2" value = "file:/C:/arqJxfs/check2.jpg">
</applet>
*/

public class DisplayImageExample extends Applet
{
Image img1, img2;

public void init(){		
        img1 = getImage(getDocumentBase(), getParameter("Image1"));
        img2 = getImage(getDocumentBase(), getParameter("Image2"));
        
}

public void paint(Graphics g){
       
        //display an image using drwaImage method of Graphics class.
        g.drawImage(img1, 0,0,this);
        g.drawImage(img2, 100,100,this);
}


}