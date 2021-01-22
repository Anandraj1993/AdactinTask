Feature: Checking Adactin Hotel App 
Scenario Outline: Checking Hotel page Login with valid id 
	Given  Im in the login page 
	When  Im going to enter "<userName>" and "<password>" 
	And  Im going to click login button 
	Then  Im going to verify the message 
	And Im going to Select "<location>" "<hotels>" "<roomType>" "<noOfRooms>" "<checkInDate>" "<checkOutDate>" "<adultsPerRoom>" and "<childPerRoom>"
	And Im going to click Search button
	And Im going to Click Radio button
	And Im going to click Continue
	And Im going to enter "<firstName>" "<lastName>" "<address>" "<cardNo>" "<cardType>" "<expiryMonth>" "<expiryYear>" "<cvvNo>"
	And Im going to click Book Now
	And Im going to get Order No
	Examples: 
		|userName|password|location|hotels|roomType|noOfRooms|checkInDate|checkOutDate|adultsPerRoom|childPerRoom|firstName|lastName|address|cardNo|cardType|expiryMonth|expiryYear|cvvNo|
		|karthi007|Karthi@1989|Sydney|Hotel Creek|Double|1 - One|25/01/2021|26/01/2021|2 - Two|2 - Two|Anand|Raj|98 sfasf|1234567890098765|VISA|July|2022|123|
		|karthi007|Karthi@1989|Brisbane|Hotel Sunshine|Deluxe|3 - Three|23/02/2021|24/02/2021|1 - One|1 - One|Ashwin|Ravi|98 sfvdxddasf|1234567890098765|Master Card|January|2022|456|
		|karthi007|Karthi@1989|London|Hotel Hervey|Super Deluxe|2 - Two|24/03/2021|25/03/2021|1 - One|1 - One|jadeja|Sir|98 sfasfdfd|1234567890098765|American Express|April|2021|179|
		|karthi007|Karthi@1989|Adelaide|Hotel Creek|Double|3 - Three|21/04/2021|22/04/2021|2 - Two|1 - One|Rohit|Sharma|98 sfasffdf|1234567890098765|American Express|January|2022|479|
		|karthi007|Karthi@1989|Paris|Hotel Sunshine|Super Deluxe|1 - One|12/02/2021|13/02/2021|1 - One|1 - One|Virat|Kohli|98 sfasfdser|1234567890098765|Master Card|April|2021|457|
		|karthi007|Karthi@1989|Los Angeles|Hotel Creek|Double|3 - Three|26/01/2021|27/01/2021|1 - One|1 - One|Viru|Sehwag|98 sfasffsa|1234567890098765|VISA|June|2021|417|
		|karthi007|Karthi@1989|New York|Hotel Sunshine|Standard|1 - One|12/03/2021|13/03/2021|2 - Two|3 - Three|Sourav|Ganguly|98 sfadffdsf|1234567890098765|American Express|January|2022|452|
		|karthi007|Karthi@1989|Melbourne|Hotel Hervey|Deluxe|3 - Three|02/04/2021|03/04/2021|1 - One|2 - Two|Sachin|Tendulkar|98 sfasffdss|1234567890098765|Master Card|July|2022|145|
		|karthi007|Karthi@1989|Sydney|Hotel Creek|Double|1 - One|07/04/2021|08/04/2021|2 - Two|1 - One|MS|Dhoni|98 sfasfsas|1234567890098765|Master Card|June|2022|420|
		|karthi007|Karthi@1989|Brisbane|Hotel Hervey|Deluxe|3 - Three|12/07/2021|13/07/2021|1 - One|2 - Two|sam|curran|98 sfdfdfasf|1234567890098765|VISA|March|2022|654|