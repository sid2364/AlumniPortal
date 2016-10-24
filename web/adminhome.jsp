<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>

<title>Alumni Portal Admin</title>

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


<!-- ============ NAVIGATION BAR SECTION ============== bgcolor="#bbbbbb"-->
<tr><td colspan="3">This won't even be visible.</tr>
<tr><td colspan="3">This won't even be visible.</tr>
<tr><td colspan="3">This won't even be visible.</tr>
<tr>
<td colspan="2" align='left' valign='bottom' height="50px">Welcome, ${username}!</td>

</tr>
<tr style="height:75px">
    <td colspan="1" height="40px" width="100px"  align="center"><bold><font size="5">Annoucements</font></bold></td>
<td height="40px" colspan="2"><marquee scrollamount="15">${annoucement}</marquee></td>
</tr>
<tr>
<!-- ============ LEFT COLUMN (MENU) ============== -->
<td width="50%" valign="top">
    
    
    
    
        <h3>Authorize users</h3>
        ${block}
        <h6>*click on Blocked/Unlocked to toggle status</h6>
        
        
   
<!--<a href="#">Menu link</a><br>
<a href="#">Menu link</a><br>
<a href="#">Menu link</a><br>
<a href="#">Menu link</a><br>
<a href="#">Menu link</a>
-->
</td>

<!-- ============ MIDDLE COLUMN (CONTENT) ============== -->
<td colspan="2" valign="top">

<h2>Post an announcement!</h2>

<div style="overflow:auto;height:250px">
    
<form action='Post_Ann'>
        
        <h3>Make announcement:</h3>
        <textarea style="width:600px;height: 125px" type='text' name='post'/></textarea><br><br>
        <input type="hidden" value=${userid} name="userid"/>
        <input style="width:150px;" class="btn" type='submit' value='Post!'><br><br><br><br>
    </form>
    </div>
  
<br>

</td>


</tr>

<!-- ============ FOOTER SECTION ============== -->
<tr style="postion:fixed;"><td style=" width:100%; height:35px; position: absolute" colspan="3" align="right" height="20" bgcolor="#2B2B2B">
        
<form action='index.jsp'>
        <input style="width:150px;" class="btn" type="submit" value="Sign out"/>
</form></tr>
</table></div>
</body>

<html>


