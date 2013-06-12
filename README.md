appletImage
===========
applet visor de imagenes en disco local.
By default , all browser security configurations disallow access to local files

Code
===========
Images are local files


<applet code=DisplayImageExample.class width="200" height="200" >
<param name="Image1" value="check1.jpg">
<param name="Image2" value="check2.jpg">
</applet>


java.policy
grant {
  permission java.io.FilePermission "C:/arqJxfs", "read";
};