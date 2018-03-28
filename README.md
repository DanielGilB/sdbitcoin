# SDBitcoin
Enterprise Service Bus about Bitcoin price info using Mule.
Get Bitcoin price data from HTTP as JSON then create a JAVA object then compare the price fluctuations and if its advisable to buy Bitscoin It will send an email using SMTP with the info and It will save the info in a MYSQL database and finally publuc on Twitter. Else It will public on Twitter Bitcoin price info.

## How to use
You need to create sdbitcoin/src/main/app/mule-app.properties with the following information:

mail.user= "..."
mail.subject= "..."
mail.to= "..."
mail.from= "..."
mail.host= "..."
mail.password= "..."

mysql.port= "..."
mysql.user= "..."
mysql.database= "..."
mysql.password= "..."
mysql.host= "..."

You need create the following mysql struct:



+-----------+-------------+------+-----+-------------------+
| Field     | Type        | Null | Key | Default           | 
+-----------+-------------+------+-----+-------------------+
| nombre    | varchar(14) | NO   |     | NULL              |       
| precio    | float       | NO   |     | NULL              |  
| cambio1h  | float       | NO   |     | NULL              |       
| cambio24h | float       | NO   |     | NULL              |       
| cambio7d  | float       | NO   |     | NULL              |       
| fecha     | timestamp   | NO   |     | CURRENT_TIMESTAMP |       
+-----------+-------------+------+-----+-------------------+
