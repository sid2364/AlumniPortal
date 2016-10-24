
<!doctype html>
<html lang="en-US">
    <style>
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
<head>
  <meta charset="utf-8">
  <meta http-equiv="Content-Type" content="text/html">
  <title>Alumni Portal Registration</title>
    <link rel="shortcut icon" href="./favicon.ico">
  <link rel="icon" href="./favicon.ico">
  <link rel="stylesheet" type="text/css" media="all" href="css/styles.css">
  <link rel="stylesheet" type="text/css" media="all" href="css/switchery.min.css">
  <script type="text/javascript" src="js/switchery.min.js"></script>
</head>

<body>
  <div id="wrapper">
  
  <h1>Registration</h1>
  <h4>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${message}</h4>
  <form action="Register">
  <div class="col-2">
    <label>
      Name
      <input placeholder="What is your full name?" id="name" name="name" tabindex="1">
    </label>
  </div>
  <div class="col-2">
    <label>
      Login ID
      <input placeholder="What would you like to use to log in?" id="studentid" name="studentid" tabindex="2">
    </label>
  </div>
  
  <div class="col-3">
    <label>
      Password
      <input type="password" placeholder="Enter your password here." id="password" name="password" tabindex="3">
    </label>
  </div>
  <div class="col-3">
    <label>
      Email
      <input placeholder="What is your e-mail address?" id="email" name="email" tabindex="4">
    </label>
  </div>
  <div class="col-3">
    <label>
      Year of Graduation
      <select tabindex="5" name="yearofgrad">
        <option>1955</option>
<option>1956</option>
<option>1957</option>
<option>1958</option>
<option>1959</option>
<option>1960</option>
<option>1961</option>
<option>1962</option>
<option>1963</option>
<option>1964</option>
<option>1965</option>
<option>1966</option>
<option>1967</option>
<option>1968</option>
<option>1969</option>
<option>1970</option>
<option>1971</option>
<option>1972</option>
<option>1973</option>
<option>1974</option>
<option>1975</option>
<option>1976</option>
<option>1977</option>
<option>1978</option>
<option>1979</option>
<option>1980</option>
<option>1981</option>
<option>1982</option>
<option>1983</option>
<option>1984</option>
<option>1985</option>
<option>1986</option>
<option>1987</option>
<option>1988</option>
<option>1989</option>
<option>1990</option>
<option>1991</option>
<option>1992</option>
<option>1993</option>
<option>1994</option>
<option>1995</option>
<option>1996</option>
<option>1997</option>
<option>1998</option>
<option>1999</option>
<option>2000</option>
<option>2001</option>
<option>2002</option>
<option>2003</option>
<option>2004</option>
<option>2005</option>
<option>2006</option>
<option>2007</option>
<option>2008</option>
<option>2009</option>
<option>2010</option>
<option>2011</option>
<option>2012</option>
<option>2013</option>
<option>2014</option>
<option>2015</option>
<option>2016</option>
<option>2017</option>
<option>2018</option>
<option>2019</option>
      </select>
    </label>
  </div>
  
  <div class="col-4">
    <label>
      Date of Birth
      <input placeholder="When were you born?" id="dob" name="dob" tabindex="5">
    </label>
  </div>
  <div class="col-4">
    <label>
      Current City
      <input placeholder="Where do you stay?" id="currentcity" name="currentcity" tabindex="6">
    </label>
  </div>
      
    
  <div class="col-4">
    <label>
      Phone Number
      <input placeholder="Where do we call you?" id="phonenum" name="phonenum" tabindex="7">
    </label>
  </div>
  <div class="col-4 switch">
    <label>Are you currently studying?</label>
    <center style="position:relative;margin-bottom:8px;"><input name="role" type="checkbox" class="js-switch"></center>
  </div>    
  
  <div class="col-submit">
    <input type="submit" class="submitbtn">Create User</button>
  </div>
  
  </form>
  </div>
<script type="text/javascript">
var elems = Array.prototype.slice.call(document.querySelectorAll('.js-switch'));

elems.forEach(function(html) {
  var switchery = new Switchery(html);
});
</script>
</body>
</html>