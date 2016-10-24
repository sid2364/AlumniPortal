<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<!-- NEED TO ADD these attributes to load this page:
block
studentid
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
<title>Inbox</title>

</head>

<body class="img" style="margin: 0px; padding: 0px; font-family: 'Trebuchet MS',verdana;">
    <div style="z-index:1;">
<table width="100%" height="100%" cellpadding="5" cellspacing="0" border="0">
<tr>

<!-- ============ HEADER SECTION ============== -->
<td colspan="4" valign="center" style="height: 120px;"  >
    <h1>&nbsp;&nbsp;All messages received by userID: ${studentid}</h1>
    
</td></tr>


<!-- ============ NAVIGATION BAR SECTION ============== !!!!!!!!!! ADD annoucement TO THE PAGE REQUEST WHEN LOADING --> 

<tr>
    <td style="width:5%" align="center" valign="bottom" ><h4>Announcements</h4></td>
    <td colspan='2'><marquee scrollamount="15">${annoucement}</marquee></td>
</tr>
<tr style="height:400px;" >    
<!-- ============ LEFT COLUMN (MENU) ============== -->
<td colspan='3' width="25%" valign="top" >
    Here are all your messages.
    ${block}
</td>

<!-- ============ MIDDLE COLUMN (CONTENT) ============== -->



</tr>

<!-- ============ FOOTER SECTION ============== -->
<tr><td colspan="3" align="right" height="20" bgcolor="#2B2B2B">
        <form action='ForwardToHomePage'>
        <input type="hidden" name='studentid' value=${studentid} />
        <input style="width:150px;" class="btn" type="submit" value="Home Page"/>
</form>  
        <form action='index.jsp'>
        <input style="width:150px;" class="btn" type="submit" value="Sign out"/>
</form></td></tr>
</table></div>
</body>

<html>


