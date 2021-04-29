You are implementing the business logic for your teams web application.
You develop using TDD, but most of the code in your business logic has to call another
part of your code that just isn't finished yet. Moreover where it is complete it already has tests
and you don't want to have to retest all of your teammates code. It'll make the test suite messy,
and your tests will take longer. 

The answer to these problems? Mockito! 
Using Mockito you can pretend to make calls to interfaces 

Couple of notes: 
- In a real application we would have a person class and one function to get an instance
of them with all of their data
- Depending on the application we would have more than one service class and a better name for it

Already implemented:
- Insert a sale
- Return the top selling car ID

Here are the challenges. You will need to make the function and test it:  
- Given the ID of a person, get their bday and if it is their birthday return true, otherwise false
- personDb stores all names uppercase. You know the names are always uppercase
Return the name gotten from personDb as lowercase. People can have 0 to N middle names 
- Determine if a sale is refundable (was made < 3 months ago) 
- Modify inset sale function to check inventory of cars. If no inventory is left 
make the car inactive 
- Find if the users city matches the location of any of our dealership. If so return the dealership
otherwise return an empty string
