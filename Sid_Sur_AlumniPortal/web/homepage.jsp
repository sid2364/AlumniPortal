<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>

<title>Alumni Portal</title>
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
<table class="theme-table" padding="10" spacing="10px" width="100%" height="100%" cellpadding="5" cellspacing="0" border="0">
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
<td align='center' height="50px">Welcome to your homepage, ${username}!</td>
<td height="50px"  align='center'>
    <form action='ProfilePage_Intermediate' method='post'>
        <br>
        <input style="background:transparent; border:1; color:black;" class="btn" type="submit" value="Go To Profile Page"/>
        <input type="hidden" value=${userid} name='studentid' />
        <input type="hidden" value=${userid} name='fromstudentid' />
    </form></td> 
<td height="50px"  align='center'> <form action='CheckInbox'>
        <br> <input type="hidden" value=${userid} name='studentid' /> <input style="background:transparent; border:1; color:black;" class="btn" type="submit" value="Check Your Inbox"/>
</form></td>
</tr>
<tr style="height:75px">
    <td height="40px" width="100px"  align="center"><bold><font size="5">Announcements</font></bold></td>
<td height="40px" colspan="2"><marquee scrollamount="15">${annoucement}</marquee></td>
</tr>
<tr>
<!-- ============ LEFT COLUMN (MENU) ============== -->
<td width="20%" valign="top">
    
    <form action='View_Event'>
        
        <h3>View All Events:</h3>
        
        <input type="hidden" value=${userid} name="studentid"/>
        <input style="width:150px;" class="btn" type='submit' value='View!'>
    </form>
    <form action='Create_Event'>
        
        <h3>Create an event!</h3>
        Event name:<br><input type='text' name='ename'/><br>
        Event time:<br><input type='text' name='etime'/><br>
        Event date:<br><input type='text' name='edate'/><br>
        Event location:<br><input type='text' name='elocation'/><br>
        <input type="hidden" value=${userid} name='studentid'/>
        <input style="width:150px;" class="btn" type='submit' value='Create event!'>
    </form>
        ${eventmessage}
    
   
<!--<a href="#">Menu link</a><br>
<a href="#">Menu link</a><br>
<a href="#">Menu link</a><br>
<a href="#">Menu link</a><br>
<a href="#">Menu link</a>
-->
</td>

<!-- ============ MIDDLE COLUMN (CONTENT) ============== -->
<td width="55%" valign="top">

<h2>News Feed</h2>

<div style="overflow:auto;height:250px">
    
<form action='Post_Feed'>
        
        <h3>What's on your mind?</h3>
        <input style="width:600px;" type='text' name='post'/><br><br>
        <input type="hidden" value=${userid} name="userid"/>
        <input style="width:150px;" class="btn" type='submit' value='Post!'><br><br><br><br>
    </form>
    ${feed}</div>
  
<br>

</td>

<td width="25%" valign="top">
    <h3>Search for student/alumni:</h3>
    <div style="overflow:auto;height:300px">
    <form action='Search_ShowAll'  method='post'>
        <input type="hidden" value=${userid} name="userid"/>
        <input style="width:150px;" class ="btn" type='submit' value='Show All!'>
    </form>
    <form action='Search_Student' method='post'>
        <input type='text' name='searchfor'/>
        <input type="hidden" value=${userid} name="userid"/>
        <input style="width:150px;" class="btn" type='submit' value='Search By Name!'><br>
    </form>    
    <form action='Search_ByYear'  method='post'>
        <input type="text" name="year"/>
        <input type="hidden" value=${userid} name="userid"/>
        <input style="width:150px;" class ="btn" type='submit' value='Search By Year!'>
    </form>
    <form action='Search_ByCity'  method='post'>
        <input type="text" name="city"/>
        <input type="hidden" value=${userid} name="userid"/>
        <input style="width:150px;" class ="btn" type='submit' value='Search By City!'>
    </form>
    <br><br>
    
    
    ${people}
    </div>
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


