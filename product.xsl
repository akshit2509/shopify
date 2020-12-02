<?xml version = "1.0" encoding = "UTF-8"?> 
<xsl:stylesheet version = "1.0" xmlns:xsl = "http://www.w3.org/1999/XSL/Transform"> 
<xsl:template match = "/"> 
<html> <body>



<h1> <center>  </center></h1> <h2><center>Order Details</center></h2> 
<table border = "1" align="center"> 
<tr bgcolor = "mediumseagreen"> <th>Product ID</th>  <th>Product Details</th> <th>Price</th><th>Payment Method</th><th>status</th></tr>
<xsl:for-each select = "class/product"> 
<xsl:sort select = "@orderId"/> 
<tr> 
<td><xsl:value-of select = "@orderId"/></td> 
<td><xsl:value-of select = "productDetails"/></td> 
<td><xsl:value-of select = "prodPrice"/></td> 
<td><xsl:value-of select = "payMethod"/></td> 
<td><xsl:value-of select = "status"/></td> 
</tr> 
</xsl:for-each> 
</table> </body> </html> 
</xsl:template> 
</xsl:stylesheet>