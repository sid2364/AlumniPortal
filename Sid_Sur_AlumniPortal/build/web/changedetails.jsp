<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>

<title>Change Details</title>

    <link rel="shortcut icon" href="./favicon.ico">
  <link rel="icon" href="./favicon.ico">
  <style>
    * {
      font-family: Helvetica;
    }
  .btn {
  background: #000000;
  background-image: -webkit-linear-gradient(top, #000000, #cccccc);
  background-image: -moz-linear-gradient(top, #000000, #cccccc);
  background-image: -ms-linear-gradient(top, #000000, #cccccc);
  background-image: -o-linear-gradient(top, #000000, #cccccc);
  background-image: linear-gradient(to bottom, #000000, #cccccc);
  -webkit-border-radius: 28;
  -moz-border-radius: 28;
  border-radius: 28px;
  font-family: Arial;
  color: #ffffff;
  font-size: 12px;
  padding: 7px 17px 7px 17px;
  text-decoration: none;
}

.btn:hover {
  background: #79c3f2;
  background-image: -webkit-linear-gradient(top, #79c3f2, #3498db);
  background-image: -moz-linear-gradient(top, #79c3f2, #3498db);
  background-image: -ms-linear-gradient(top, #79c3f2, #3498db);
  background-image: -o-linear-gradient(top, #79c3f2, #3498db);
  background-image: linear-gradient(to bottom, #79c3f2, #3498db);
  text-decoration: none;
}
.body{
	position: absolute;
	top: -20px;
	left: -20px;
	right: -40px;
	bottom: -40px;
	width: auto;
	height: auto;
	background-image: url("./manipaltwo.jpg");//url(http://www.engineering.careers360.com/careers360_cms/newsimages/image/June2010/manipal.jpg);
	//background-size: cover;
	-webkit-filter: blur(5px);
	z-index: 0;
        
}
.theme-table{
    background-image: url("./manipaltwo.jpg");//url(http://www.engineering.careers360.com/careers360_cms/newsimages/image/June2010/manipal.jpg);
	//background-size: cover;
	//-webkit-filter: blur(5px);
        background-repeat: no-repeat; 
        background-size: cover;
        background-attachment: fixed;
}

</style>
</head>

<body style="margin: 0px; padding: 0px; font-family: 'Trebuchet MS',verdana;">
    <div class="theme-table">
<table  class="theme-table" padding="10" spacing="10px" width="100%" height="100%" cellpadding="5" cellspacing="0" border="0">
<tr>

<!-- ============ HEADER SECTION ============== -->
<td colspan="3" style="height: 80px; width:100%; position: fixed; z-index: 2" bgcolor="#4f4f4f" ><!-- bgcolor="#787878" -->
<bold><font size="7" color="#fefefe" font-family="sans-serif">Alumni Portal</font></bold><br>
    <bold><font size="4" color="#000">A place to meet, talk and discover.</font></bold>
    
</td></tr>
<tr><td>asd</td></tr>

<!-- ============ NAVIGATION BAR SECTION ============== bgcolor="#bbbbbb"-->

<tr>
<td colspan="2" align='left' valign='bottom' height="50px"></td>

</tr>


<!-- ============ LEFT COLUMN (MENU) ============== -->
<td colspan="3" width="50%" valign="top">
    
    
    
    
        <h3>Change details:-</h3>
        <form action="ChangeDetails" method="post"><table width="50%">
                <tr><td>Year of Graduation: </td><td><input type="text" name="yog" value=${yog} /><br><br></td></tr>
                <tr><td>Date of birth: </td><td><input type="text" name="dob" value=${dob} /><Br><br></td></tr>
                <tr><td>Current city: </td><td><input type="text" name="city" value=${city} /><br><br></td></tr>
                <tr><td>Phone number: </td><td><input type="text" name="phonenum" value=${phonenum} /><br><br></td></tr>
                <tr><td>Email address: </td><td><input type="text" name="email" value=${email} /><Br><br></td></tr>
                <tr><td>Password: </td><td><input type="text" name="password" value=${password} /><Br><br></td></tr>
                <input type="hidden" name="studentid" value=${studentid} /><br><br></tr>
                <tr><td colspan="2" align='center'><input style="width:'200px';" class="btn" type="submit"/><br><br></td></tr>
            </table>
        </form>
        
        
   
<!--<a href="#">Menu link</a><br>
<a href="#">Menu link</a><br>
<a href="#">Menu link</a><br>
<a href="#">Menu link</a><br>
<a href="#">Menu link</a>
-->
</td>

<!-- ============ MIDDLE COLUMN (CONTENT) ============== -->


</tr>

<!-- ============ FOOTER SECTION ============== -->
<tr style="postion:fixed;"><td style=" width:100%; height:35px; position: absolute" colspan="3" align="right" height="20" bgcolor="#2B2B2B">
<form action='ForwardToHomePage'>
        <input type="hidden" name='studentid' value=${studentid} />
        <input style="width:150px;" class="btn" type="submit" value="Home Page"/>
</form>        
<form action='index.jsp'>
        <input style="width:150px;" class="btn" type="submit" value="Sign out"/>
</form></tr>
</table></div>
</body>

<html>


