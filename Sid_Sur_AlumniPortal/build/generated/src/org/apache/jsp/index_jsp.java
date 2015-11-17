package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html >\n");
      out.write("    <link rel=\"shortcut icon\" href=\"./favicon.ico\">\n");
      out.write("  <link rel=\"icon\" href=\"./favicon.ico\">\n");
      out.write("  <head>\n");
      out.write("      \n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Alumni Portal Login</title>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("        <style>\n");
      out.write("      /* NOTE: The styles were added inline because Prefixfree needs access to your styles and they must be inlined if they are on local disk! */\n");
      out.write("      @import url(http://fonts.googleapis.com/css?family=Exo:100,200,400);\n");
      out.write("@import url(http://fonts.googleapis.com/css?family=Source+Sans+Pro:700,400,300);\n");
      out.write("\n");
      out.write("body{\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tbackground: #fff;\n");
      out.write("\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-family: Arial;\n");
      out.write("\tfont-size: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".body{\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: -20px;\n");
      out.write("\tleft: -20px;\n");
      out.write("\tright: -40px;\n");
      out.write("\tbottom: -40px;\n");
      out.write("\twidth: auto;\n");
      out.write("\theight: auto;\n");
      out.write("\tbackground-image: url(\"./manipal.jpg\");//url(http://www.engineering.careers360.com/careers360_cms/newsimages/image/June2010/manipal.jpg);\n");
      out.write("\tbackground-size: cover;\n");
      out.write("\t-webkit-filter: blur(5px);\n");
      out.write("\tz-index: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".grad{\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: -20px;\n");
      out.write("\tleft: -20px;\n");
      out.write("\tright: -40px;\n");
      out.write("\tbottom: -40px;\n");
      out.write("\twidth: auto;\n");
      out.write("\theight: auto;\n");
      out.write("\tbackground: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(0,0,0,0)), color-stop(100%,rgba(0,0,0,0.65))); /* Chrome,Safari4+ */\n");
      out.write("\tz-index: 1;\n");
      out.write("\topacity: 0.7;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header{\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: calc(50% - 35px);\n");
      out.write("\tleft: calc(50% - 255px);\n");
      out.write("\tz-index: 2;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header div{\n");
      out.write("\tfloat: left;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-family: 'Exo', sans-serif;\n");
      out.write("\tfont-size: 35px;\n");
      out.write("\tfont-weight: 200;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header div span{\n");
      out.write("\tcolor: #5379fa !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login{\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: calc(50% - 75px);\n");
      out.write("\tleft: calc(50% - 50px);\n");
      out.write("\theight: 150px;\n");
      out.write("\twidth: 350px;\n");
      out.write("\tpadding: 10px;\n");
      out.write("\tz-index: 2;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login input[type=text]{\n");
      out.write("\twidth: 250px;\n");
      out.write("\theight: 30px;\n");
      out.write("\tbackground: transparent;\n");
      out.write("\tborder: 1px solid rgba(255,255,255,0.6);\n");
      out.write("\tborder-radius: 2px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-family: 'Exo', sans-serif;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tfont-weight: 400;\n");
      out.write("\tpadding: 4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login input[type=password]{\n");
      out.write("\twidth: 250px;\n");
      out.write("\theight: 30px;\n");
      out.write("\tbackground: transparent;\n");
      out.write("\tborder: 1px solid rgba(255,255,255,0.6);\n");
      out.write("\tborder-radius: 2px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-family: 'Exo', sans-serif;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tfont-weight: 400;\n");
      out.write("\tpadding: 4px;\n");
      out.write("\tmargin-top: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login input[type=submit]{\n");
      out.write("\twidth: 260px;\n");
      out.write("\theight: 35px;\n");
      out.write("\tbackground: #fff;\n");
      out.write("\tborder: 1px solid #fff;\n");
      out.write("\tcursor: pointer;\n");
      out.write("\tborder-radius: 2px;\n");
      out.write("\tcolor: #a18d6c;\n");
      out.write("\tfont-family: 'Exo', sans-serif;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tfont-weight: 400;\n");
      out.write("\tpadding: 6px;\n");
      out.write("\tmargin-top: 10px;\n");
      out.write("}\n");
      out.write(".reg input[type=submit]{\n");
      out.write("        width: 260px;\n");
      out.write("\theight: 35px;\n");
      out.write("\tbackground: #556;\n");
      out.write("\tborder: 1px solid #fef;\n");
      out.write("\tcursor: pointer;\n");
      out.write("\tborder-radius: 2px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-family: 'Exo', sans-serif;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tfont-weight: 400;\n");
      out.write("\tpadding: 6px;\n");
      out.write("\tmargin-top: 10px;\n");
      out.write("}\n");
      out.write(".login input[type=submit]:hover{\n");
      out.write("\topacity: 0.8;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login input[type=submit]:active{\n");
      out.write("\topacity: 0.6;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login input[type=text]:focus{\n");
      out.write("\toutline: none;\n");
      out.write("\tborder: 1px solid rgba(255,255,255,0.9);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login input[type=password]:focus{\n");
      out.write("\toutline: none;\n");
      out.write("\tborder: 1px solid rgba(255,255,255,0.9);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login input[type=submit]:focus{\n");
      out.write("\toutline: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("::-webkit-input-placeholder{\n");
      out.write("   color: rgba(255,255,255,0.6);\n");
      out.write("}\n");
      out.write("\n");
      out.write("::-moz-input-placeholder{\n");
      out.write("   color: rgba(255,255,255,0.6);\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        !function(){function e(e,r){return[].slice.call((r||document).querySelectorAll(e))}if(window.addEventListener){var r=window.StyleFix={link:function(e){try{if(\"stylesheet\"!==e.rel||e.hasAttribute(\"data-noprefix\"))return}catch(t){return}var n,i=e.href||e.getAttribute(\"data-href\"),a=i.replace(/[^\\/]+$/,\"\"),o=(/^[a-z]{3,10}:/.exec(a)||[\"\"])[0],s=(/^[a-z]{3,10}:\\/\\/[^\\/]+/.exec(a)||[\"\"])[0],l=/^([^?]*)\\??/.exec(i)[1],u=e.parentNode,p=new XMLHttpRequest;p.onreadystatechange=function(){4===p.readyState&&n()},n=function(){var t=p.responseText;if(t&&e.parentNode&&(!p.status||p.status<400||p.status>600)){if(t=r.fix(t,!0,e),a){t=t.replace(/url\\(\\s*?((?:\"|')?)(.+?)\\1\\s*?\\)/gi,function(e,r,t){return/^([a-z]{3,10}:|#)/i.test(t)?e:/^\\/\\//.test(t)?'url(\"'+o+t+'\")':/^\\//.test(t)?'url(\"'+s+t+'\")':/^\\?/.test(t)?'url(\"'+l+t+'\")':'url(\"'+a+t+'\")'});var n=a.replace(/([\\\\\\^$*+[\\]?{}.=!:(|)])/g,\"\\$1\");t=t.replace(RegExp(\"\\\\b(behavior:\\\\s*?url\\\\('?\\\"?)\"+n,\"gi\"),\"$1\")}var i=document.createElement(\"style\");i.textContent=t,i.media=e.media,i.disabled=e.disabled,i.setAttribute(\"data-href\",e.getAttribute(\"href\")),u.insertBefore(i,e),u.removeChild(e),i.media=e.media}};try{p.open(\"GET\",i),p.send(null)}catch(t){\"undefined\"!=typeof XDomainRequest&&(p=new XDomainRequest,p.onerror=p.onprogress=function(){},p.onload=n,p.open(\"GET\",i),p.send(null))}e.setAttribute(\"data-inprogress\",\"\")},styleElement:function(e){if(!e.hasAttribute(\"data-noprefix\")){var t=e.disabled;e.textContent=r.fix(e.textContent,!0,e),e.disabled=t}},styleAttribute:function(e){var t=e.getAttribute(\"style\");t=r.fix(t,!1,e),e.setAttribute(\"style\",t)},process:function(){e(\"style\").forEach(StyleFix.styleElement),e(\"[style]\").forEach(StyleFix.styleAttribute)},register:function(e,t){(r.fixers=r.fixers||[]).splice(void 0===t?r.fixers.length:t,0,e)},fix:function(e,t,n){for(var i=0;i<r.fixers.length;i++)e=r.fixers[i](e,t,n)||e;return e},camelCase:function(e){return e.replace(/-([a-z])/g,function(e,r){return r.toUpperCase()}).replace(\"-\",\"\")},deCamelCase:function(e){return e.replace(/[A-Z]/g,function(e){return\"-\"+e.toLowerCase()})}};!function(){setTimeout(function(){},10),document.addEventListener(\"DOMContentLoaded\",StyleFix.process,!1)}()}}(),function(e){function r(e,r,n,i,a){if(e=t[e],e.length){var o=RegExp(r+\"(\"+e.join(\"|\")+\")\"+n,\"gi\");a=a.replace(o,i)}return a}if(window.StyleFix&&window.getComputedStyle){var t=window.PrefixFree={prefixCSS:function(e,n){var i=t.prefix;if(t.functions.indexOf(\"linear-gradient\")>-1&&(e=e.replace(/(\\s|:|,)(repeating-)?linear-gradient\\(\\s*(-?\\d*\\.?\\d*)deg/gi,function(e,r,t,n){return r+(t||\"\")+\"linear-gradient(\"+(90-n)+\"deg\"})),e=r(\"functions\",\"(\\\\s|:|,)\",\"\\\\s*\\\\(\",\"$1\"+i+\"$2(\",e),e=r(\"keywords\",\"(\\\\s|:)\",\"(\\\\s|;|\\\\}|$)\",\"$1\"+i+\"$2$3\",e),e=r(\"properties\",\"(^|\\\\{|\\\\s|;)\",\"\\\\s*:\",\"$1\"+i+\"$2:\",e),t.properties.length){var a=RegExp(\"\\\\b(\"+t.properties.join(\"|\")+\")(?!:)\",\"gi\");e=r(\"valueProperties\",\"\\\\b\",\":(.+?);\",function(e){return e.replace(a,i+\"$1\")},e)}return n&&(e=r(\"selectors\",\"\",\"\\\\b\",t.prefixSelector,e),e=r(\"atrules\",\"@\",\"\\\\b\",\"@\"+i+\"$1\",e)),e=e.replace(RegExp(\"-\"+i,\"g\"),\"-\"),e=e.replace(/-\\*-(?=[a-z]+)/gi,t.prefix)},property:function(e){return(t.properties.indexOf(e)?t.prefix:\"\")+e},value:function(e){return e=r(\"functions\",\"(^|\\\\s|,)\",\"\\\\s*\\\\(\",\"$1\"+t.prefix+\"$2(\",e),e=r(\"keywords\",\"(^|\\\\s)\",\"(\\\\s|$)\",\"$1\"+t.prefix+\"$2$3\",e)},prefixSelector:function(e){return e.replace(/^:{1,2}/,function(e){return e+t.prefix})},prefixProperty:function(e,r){var n=t.prefix+e;return r?StyleFix.camelCase(n):n}};!function(){var e={},r=[],n=getComputedStyle(document.documentElement,null),i=document.createElement(\"div\").style,a=function(t){if(\"-\"===t.charAt(0)){r.push(t);var n=t.split(\"-\"),i=n[1];for(e[i]=++e[i]||1;n.length>3;){n.pop();var a=n.join(\"-\");o(a)&&-1===r.indexOf(a)&&r.push(a)}}},o=function(e){return StyleFix.camelCase(e)in i};if(n.length>0)for(var s=0;s<n.length;s++)a(n[s]);else for(var l in n)a(StyleFix.deCamelCase(l));var u={uses:0};for(var p in e){var f=e[p];u.uses<f&&(u={prefix:p,uses:f})}t.prefix=\"-\"+u.prefix+\"-\",t.Prefix=StyleFix.camelCase(t.prefix),t.properties=[];for(var s=0;s<r.length;s++){var l=r[s];if(0===l.indexOf(t.prefix)){var c=l.slice(t.prefix.length);o(c)||t.properties.push(c)}}\"Ms\"!=t.Prefix||\"transform\"in i||\"MsTransform\"in i||!(\"msTransform\"in i)||t.properties.push(\"transform\",\"transform-origin\"),t.properties.sort()}(),function(){function e(e,r){return i[r]=\"\",i[r]=e,!!i[r]}var r={\"linear-gradient\":{property:\"backgroundImage\",params:\"red, teal\"},calc:{property:\"width\",params:\"1px + 5%\"},element:{property:\"backgroundImage\",params:\"#foo\"},\"cross-fade\":{property:\"backgroundImage\",params:\"url(a.png), url(b.png), 50%\"}};r[\"repeating-linear-gradient\"]=r[\"repeating-radial-gradient\"]=r[\"radial-gradient\"]=r[\"linear-gradient\"];var n={initial:\"color\",\"zoom-in\":\"cursor\",\"zoom-out\":\"cursor\",box:\"display\",flexbox:\"display\",\"inline-flexbox\":\"display\",flex:\"display\",\"inline-flex\":\"display\",grid:\"display\",\"inline-grid\":\"display\",\"min-content\":\"width\"};t.functions=[],t.keywords=[];var i=document.createElement(\"div\").style;for(var a in r){var o=r[a],s=o.property,l=a+\"(\"+o.params+\")\";!e(l,s)&&e(t.prefix+l,s)&&t.functions.push(a)}for(var u in n){var s=n[u];!e(u,s)&&e(t.prefix+u,s)&&t.keywords.push(u)}}(),function(){function r(e){return a.textContent=e+\"{}\",!!a.sheet.cssRules.length}var n={\":read-only\":null,\":read-write\":null,\":any-link\":null,\"::selection\":null},i={keyframes:\"name\",viewport:null,document:'regexp(\".\")'};t.selectors=[],t.atrules=[];var a=e.appendChild(document.createElement(\"style\"));for(var o in n){var s=o+(n[o]?\"(\"+n[o]+\")\":\"\");!r(s)&&r(t.prefixSelector(s))&&t.selectors.push(o)}for(var l in i){var s=l+\" \"+(i[l]||\"\");!r(\"@\"+s)&&r(\"@\"+t.prefix+s)&&t.atrules.push(l)}e.removeChild(a)}(),t.valueProperties=[\"transition\",\"transition-property\"],e.className+=\" \"+t.prefix,StyleFix.register(t.prefixCSS)}}(document.documentElement);\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <div class=\"body\"></div>\n");
      out.write("\t\t<div class=\"grad\"></div>\n");
      out.write("\t\t<div class=\"header\">\n");
      out.write("\t\t\t<div>Alumni<span>Portal</span></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<br>\n");
      out.write("                <div class=\"login\"><form method=\"post\" action=\"Intermediate_Login\">\n");
      out.write("                                <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"username\" name=\"user\"><br>\n");
      out.write("\t\t\t\t<input type=\"password\" placeholder=\"password\" name=\"password\"><br>\n");
      out.write("                                <input type=\"submit\" value=\"Login\"></form><br>\n");
      out.write("                                <div class=\"reg\">\n");
      out.write("                                <form method=\"post\" action=\"registration.jsp\">\n");
      out.write("                                    <input type=\"submit\" value=\"Register\">\n");
      out.write("                                </form></div>\n");
      out.write("\t\t</div>\n");
      out.write("                <script>\n");
      out.write("                         !function(){function e(e,r){return[].slice.call((r||document).querySelectorAll(e))}if(window.addEventListener){var r=window.StyleFix={link:function(e){try{if(\"stylesheet\"!==e.rel||e.hasAttribute(\"data-noprefix\"))return}catch(t){return}var n,i=e.href||e.getAttribute(\"data-href\"),a=i.replace(/[^\\/]+$/,\"\"),o=(/^[a-z]{3,10}:/.exec(a)||[\"\"])[0],s=(/^[a-z]{3,10}:\\/\\/[^\\/]+/.exec(a)||[\"\"])[0],l=/^([^?]*)\\??/.exec(i)[1],u=e.parentNode,p=new XMLHttpRequest;p.onreadystatechange=function(){4===p.readyState&&n()},n=function(){var t=p.responseText;if(t&&e.parentNode&&(!p.status||p.status<400||p.status>600)){if(t=r.fix(t,!0,e),a){t=t.replace(/url\\(\\s*?((?:\"|')?)(.+?)\\1\\s*?\\)/gi,function(e,r,t){return/^([a-z]{3,10}:|#)/i.test(t)?e:/^\\/\\//.test(t)?'url(\"'+o+t+'\")':/^\\//.test(t)?'url(\"'+s+t+'\")':/^\\?/.test(t)?'url(\"'+l+t+'\")':'url(\"'+a+t+'\")'});var n=a.replace(/([\\\\\\^$*+[\\]?{}.=!:(|)])/g,\"\\$1\");t=t.replace(RegExp(\"\\\\b(behavior:\\\\s*?url\\\\('?\\\"?)\"+n,\"gi\"),\"$1\")}var i=document.createElement(\"style\");i.textContent=t,i.media=e.media,i.disabled=e.disabled,i.setAttribute(\"data-href\",e.getAttribute(\"href\")),u.insertBefore(i,e),u.removeChild(e),i.media=e.media}};try{p.open(\"GET\",i),p.send(null)}catch(t){\"undefined\"!=typeof XDomainRequest&&(p=new XDomainRequest,p.onerror=p.onprogress=function(){},p.onload=n,p.open(\"GET\",i),p.send(null))}e.setAttribute(\"data-inprogress\",\"\")},styleElement:function(e){if(!e.hasAttribute(\"data-noprefix\")){var t=e.disabled;e.textContent=r.fix(e.textContent,!0,e),e.disabled=t}},styleAttribute:function(e){var t=e.getAttribute(\"style\");t=r.fix(t,!1,e),e.setAttribute(\"style\",t)},process:function(){e(\"style\").forEach(StyleFix.styleElement),e(\"[style]\").forEach(StyleFix.styleAttribute)},register:function(e,t){(r.fixers=r.fixers||[]).splice(void 0===t?r.fixers.length:t,0,e)},fix:function(e,t,n){for(var i=0;i<r.fixers.length;i++)e=r.fixers[i](e,t,n)||e;return e},camelCase:function(e){return e.replace(/-([a-z])/g,function(e,r){return r.toUpperCase()}).replace(\"-\",\"\")},deCamelCase:function(e){return e.replace(/[A-Z]/g,function(e){return\"-\"+e.toLowerCase()})}};!function(){setTimeout(function(){},10),document.addEventListener(\"DOMContentLoaded\",StyleFix.process,!1)}()}}(),function(e){function r(e,r,n,i,a){if(e=t[e],e.length){var o=RegExp(r+\"(\"+e.join(\"|\")+\")\"+n,\"gi\");a=a.replace(o,i)}return a}if(window.StyleFix&&window.getComputedStyle){var t=window.PrefixFree={prefixCSS:function(e,n){var i=t.prefix;if(t.functions.indexOf(\"linear-gradient\")>-1&&(e=e.replace(/(\\s|:|,)(repeating-)?linear-gradient\\(\\s*(-?\\d*\\.?\\d*)deg/gi,function(e,r,t,n){return r+(t||\"\")+\"linear-gradient(\"+(90-n)+\"deg\"})),e=r(\"functions\",\"(\\\\s|:|,)\",\"\\\\s*\\\\(\",\"$1\"+i+\"$2(\",e),e=r(\"keywords\",\"(\\\\s|:)\",\"(\\\\s|;|\\\\}|$)\",\"$1\"+i+\"$2$3\",e),e=r(\"properties\",\"(^|\\\\{|\\\\s|;)\",\"\\\\s*:\",\"$1\"+i+\"$2:\",e),t.properties.length){var a=RegExp(\"\\\\b(\"+t.properties.join(\"|\")+\")(?!:)\",\"gi\");e=r(\"valueProperties\",\"\\\\b\",\":(.+?);\",function(e){return e.replace(a,i+\"$1\")},e)}return n&&(e=r(\"selectors\",\"\",\"\\\\b\",t.prefixSelector,e),e=r(\"atrules\",\"@\",\"\\\\b\",\"@\"+i+\"$1\",e)),e=e.replace(RegExp(\"-\"+i,\"g\"),\"-\"),e=e.replace(/-\\*-(?=[a-z]+)/gi,t.prefix)},property:function(e){return(t.properties.indexOf(e)?t.prefix:\"\")+e},value:function(e){return e=r(\"functions\",\"(^|\\\\s|,)\",\"\\\\s*\\\\(\",\"$1\"+t.prefix+\"$2(\",e),e=r(\"keywords\",\"(^|\\\\s)\",\"(\\\\s|$)\",\"$1\"+t.prefix+\"$2$3\",e)},prefixSelector:function(e){return e.replace(/^:{1,2}/,function(e){return e+t.prefix})},prefixProperty:function(e,r){var n=t.prefix+e;return r?StyleFix.camelCase(n):n}};!function(){var e={},r=[],n=getComputedStyle(document.documentElement,null),i=document.createElement(\"div\").style,a=function(t){if(\"-\"===t.charAt(0)){r.push(t);var n=t.split(\"-\"),i=n[1];for(e[i]=++e[i]||1;n.length>3;){n.pop();var a=n.join(\"-\");o(a)&&-1===r.indexOf(a)&&r.push(a)}}},o=function(e){return StyleFix.camelCase(e)in i};if(n.length>0)for(var s=0;s<n.length;s++)a(n[s]);else for(var l in n)a(StyleFix.deCamelCase(l));var u={uses:0};for(var p in e){var f=e[p];u.uses<f&&(u={prefix:p,uses:f})}t.prefix=\"-\"+u.prefix+\"-\",t.Prefix=StyleFix.camelCase(t.prefix),t.properties=[];for(var s=0;s<r.length;s++){var l=r[s];if(0===l.indexOf(t.prefix)){var c=l.slice(t.prefix.length);o(c)||t.properties.push(c)}}\"Ms\"!=t.Prefix||\"transform\"in i||\"MsTransform\"in i||!(\"msTransform\"in i)||t.properties.push(\"transform\",\"transform-origin\"),t.properties.sort()}(),function(){function e(e,r){return i[r]=\"\",i[r]=e,!!i[r]}var r={\"linear-gradient\":{property:\"backgroundImage\",params:\"red, teal\"},calc:{property:\"width\",params:\"1px + 5%\"},element:{property:\"backgroundImage\",params:\"#foo\"},\"cross-fade\":{property:\"backgroundImage\",params:\"url(a.png), url(b.png), 50%\"}};r[\"repeating-linear-gradient\"]=r[\"repeating-radial-gradient\"]=r[\"radial-gradient\"]=r[\"linear-gradient\"];var n={initial:\"color\",\"zoom-in\":\"cursor\",\"zoom-out\":\"cursor\",box:\"display\",flexbox:\"display\",\"inline-flexbox\":\"display\",flex:\"display\",\"inline-flex\":\"display\",grid:\"display\",\"inline-grid\":\"display\",\"min-content\":\"width\"};t.functions=[],t.keywords=[];var i=document.createElement(\"div\").style;for(var a in r){var o=r[a],s=o.property,l=a+\"(\"+o.params+\")\";!e(l,s)&&e(t.prefix+l,s)&&t.functions.push(a)}for(var u in n){var s=n[u];!e(u,s)&&e(t.prefix+u,s)&&t.keywords.push(u)}}(),function(){function r(e){return a.textContent=e+\"{}\",!!a.sheet.cssRules.length}var n={\":read-only\":null,\":read-write\":null,\":any-link\":null,\"::selection\":null},i={keyframes:\"name\",viewport:null,document:'regexp(\".\")'};t.selectors=[],t.atrules=[];var a=e.appendChild(document.createElement(\"style\"));for(var o in n){var s=o+(n[o]?\"(\"+n[o]+\")\":\"\");!r(s)&&r(t.prefixSelector(s))&&t.selectors.push(o)}for(var l in i){var s=l+\" \"+(i[l]||\"\");!r(\"@\"+s)&&r(\"@\"+t.prefix+s)&&t.atrules.push(l)}e.removeChild(a)}(),t.valueProperties=[\"transition\",\"transition-property\"],e.className+=\" \"+t.prefix,StyleFix.register(t.prefixCSS)}}(document.documentElement);\n");
      out.write("   \n");
      out.write("                </script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
