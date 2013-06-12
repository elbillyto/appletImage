appletImage
===========
Applet visor de imagenes en disco local.
By default , all browser security configurations disallow access to local files


## Code Example
Images are local files
```html
<html>
<body>
<applet code=DisplayImageExample.class width="200" height="200" >
<param name="Image1" value="check1.jpg">
<param name="Image2" value="check2.jpg">
</applet>
</body>
</html>
```
```javascript
java.policy
grant {
  permission java.io.FilePermission "C:/arqJxfs", "read";
};
```
