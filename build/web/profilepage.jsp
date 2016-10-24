<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<!-- NEED TO ADD these attributes to load this page:
    annoucement
    name
    dob
    yog
    city
    email
    phonenum
    events
-->
<html>
    <link rel="shortcut icon" href="./favicon.ico">
  <link rel="icon" href="./favicon.ico">
  
<head>
    <style>
        .img{
        background-size: cover; 
	background-image: url("./manipaltwo.jpg");//url(http://www.engineering.careers360.com/careers360_cms/newsimages/image/June2010/manipal.jpg);
	background-size: cover;
	//-webkit-filter: blur(5px);
	z-index: -1;
        background-repeat: no-repeat;
        background-attachment: fixed;
        
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
    </style>
<title>${name}'s Profile Page</title>

</head>

<body class="img" style="margin: 0px; padding: 0px; font-family: 'Trebuchet MS',verdana;">
    <div style="z-index:1;">
<table width="100%" height="100%" cellpadding="5" cellspacing="0" border="0">
<tr>

<!-- ============ HEADER SECTION ============== -->
<td colspan="3" valign="center" style="height: 80px;"  >
    <h1>&nbsp;&nbsp;${name}</h1>
    
</td></tr>


<!-- ============ NAVIGATION BAR SECTION ============== !!!!!!!!!! ADD annoucement TO THE PAGE REQUEST WHEN LOADING --> 

<tr style="height:75px">
    <td width="100px" align="center" valign="bottom" ><h4>Annoucements</h4></td>
    <td colspan="2"><marquee scrollamount="15">${annoucement}</marquee></td>
</tr>
<tr style="height:50px;" >    
<!-- ============ LEFT COLUMN (MENU) ============== -->
<td width="25%" valign="top" >
    <h2>About</h2><br>
    ${student}<br><br>
    Date of birth: ${dob}<br><br>
    Year of Graduation: ${yog}<br><br>
    Current City: ${city}<br><br>
    Email address: ${email}<br><br>
    Phone number: ${phonenum} <br><br>
    <br>
    <form action="ChangeDetails" method="get">
        <input type="hidden" value='${studentid}' name="studentid"/>
        <input class="btn" type='submit' value='Edit details!'>
        <input type="hidden" value='${fromstudentid}' name="fromstudentid"/>
    </form>
</td>

<!-- ============ MIDDLE COLUMN (CONTENT) ============== -->
<td width="45%" valign="top" >

<h2>Want to communicate?</h2>

<form action='Send_Message'>
        
        <h3>Send a message to ${name}:</h3>
        <textarea name='message' style="height:250px;width:410px;"/></textarea><br><br>
        <input type="hidden" value='${fromstudentid}' name="fromstudentid"/>
        <input type="hidden" value='${name}' name="tostudentname"/>
        
        <input class="btn" type='submit' value='Send!'>
    </form>
${message}<br>

<br><br><br><br>
</td>

<td valign="top">
    <h2>Events ${name} is attending:-</h2><br>
    ${events}
</td>

</tr>

<!-- ============ FOOTER SECTION ============== -->
<tr><td colspan="3" align="right" height="20" bgcolor="#2B2B2B">
        <form action='ForwardToHomePage'>
        <input type="hidden" name='studentid' value=${fromstudentid} />
        <input style="width:150px;" class="btn" type="submit" value="Home Page"/>
</form>  
        <form action='index.jsp'>
        <input style="width:150px;" class="btn" type="submit" value="Sign out"/>
</form></td></tr>
</table></div>
</body>

<html>


