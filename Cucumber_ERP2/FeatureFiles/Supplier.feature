@tag
Feature:
As Admin user I want user ERP module
@Supplier
Scenario Outline:
I want to add Suppliers with Multiple Data
Given Launch browser as
When launch url
When wait for username with "name" and "username" and "10"
When Enter username with "name" and "username" and "admin"
When Enter password with "xpath" and "//input[@id='password']" and "master"
When click login button with "xpath" and "//button[@id='btnsubmit']"
When wait for Supplierlink with "xpath" and "(//a[contains(text(),'Suppliers')])[2]" and "10"
When click Supplierlink with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
When wait for AddIcon with "xpath" and "(//span[@data-caption='Add'])[1]" and "10"
When click AddIcon button with "xpath" and "(//span[@data-caption='Add'])[1]"
When wait for supplier number with "name" and "x_Supplier_Number" and "10"
When capture Supplier number with "name" and "x_Supplier_Number" 
When Enter in "<Suppliername>" with "name" and "x_Supplier_Name"
When Enter in "<address>" with "xpath" and "//*[@id='x_Address']"
When Enter in "<city>" with "xpath" and "//input[@id='x_City']"
When Enter in "<country>" with "xpath" and "//input[@id='x_Country']"
When Enter in "<cperson>" with "xpath" and "//input[@id='x_Contact_Person']"
When Enter in "<pnumber>" with "xpath" and "//input[@id='x_Phone_Number']"
When Enter in "<mail>" with "xpath" and "//input[@id='x__Email']" 
When Enter in "<mnumber>" with "xpath" and "//input[@id='x_Mobile_Number']"
When Enter in "<notes>" with "xpath" and "//*[@id='x_Notes']"
When click Add button with "id" and "btnAction"
When wait for confirm Ok button with "xpath" and "//button[normalize-space()='OK!']" and "10"
When click confirm Ok button  with "xpath" and "//button[normalize-space()='OK!']"
When wait for Alert Ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]" and "10"
When click Alert Ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
When verify Suppliernumber 
When click logout link with "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
When close browser 
Examples:
|Suppliername|address|city|country|cperson|pnumber|mail|mnumber|notes|
|Mani|Ameerpet1|Hyderabad|India|Qedgetech1|7780439535|test@gmail.com|7780439535|Iam a new Supplier|
|Sharan|Ameerpet2|Hyderabad|India|Qedgetech2|9955863258|test@gmail.com|9955863258|Iam a new Supplier|
|Divya|Ameerpet3|Hyderabad|India|Qedgetech12|7780258963|test@gmail.com|7780258963|Iam a new Supplier|
|Akhila|Ameerpet4|Hyderabad|India|Qedgetech3|9963558496|test@gmail.com|9963558496|Iam a new Supplier| 

@Customer
Scenario Outline:
I want to validate Customer with multiple data 
Given Launch browser as
When launch url 
When wait for username with "name" and "username" and "10"
When Enter username with "name" and "username" and "admin"
When Enter password with "xpath" and "//input[@id='password']" and "master"
When Click login button with "xpath" and "//button[@id='btnsubmit']"
When wait for customerlink with "xpath" and "(//a[contains(normalize-space(),'Customers')])[2]" and "10"
When click customerlink with "xpath" and "(//a[contains(normalize-space(),'Customers')])[2]"
When wait for AddIcon with "xpath" and "(//span[@data-caption='Add'])[1]" and "10"
When click AddIcon button with "xpath" and "(//span[@data-caption='Add'])[1]"
When wait for customer number with "name" and "x_Customer_Number" and "10"
When capture customer number with "name" and "x_Customer_Number" 
When Enter in "<Customername>" with "name" and "x_Customer_Name"
When Enter in "<address>" with "xpath" and "//textarea[@id='x_Address']"
When Enter in "<city>" with "xpath" and "//*[@id='x_City']"
When Enter in "<country>" with "xpath" and "//*[@id='x_Country']"
When Enter in "<cperson>" with "xpath" and "//*[@id='x_Contact_Person']"
When Enter in "<pnumber>" with "xpath" and "//*[@id='x_Phone_Number']"
When Enter in "<mail>" with "xpath" and "//*[@id='x__Email']" 
When Enter in "<mnumber>" with "xpath" and "//*[@id='x_Mobile_Number']"
When Enter in "<notes>" with "xpath" and "//*[@id='x_Notes']"
When click Add button with "id" and "btnAction"
When wait for confirm Ok button with "xpath" and "//button[normalize-space()='OK!']" and "10"
When click confirm Ok button  with "xpath" and "//button[normalize-space()='OK!']"
When wait for Alert Ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]" and "10"
When click Alert Ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
When verify customernumber 
When click logout link with "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
When close browser
Examples:
|Customername|address|city|country|cperson|pnumber|mail|mnumber|notes| 
|ramu1|ameerpet1|Hyderabad|India|Qedge1|7780439535|Test@gmail.com|7780439535|iam new customer|
|ramu2|ameerpet2|Hyderabad|India|Qedge2|7780439535|Test@gmail.com|7780439535|iam new customer|
|ramu3|ameerpet3|Hyderabad|India|Qedge3|7780439535|Test@gmail.com|7780439535|iam new customer|
|ramu4|ameerpet4|Hyderabad|India|Qedge4|7780439535|Test@gmail.com|7780439535|iam new customer|