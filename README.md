# Kata
 
 Here in MercadonaTech, we like to push the boundaries about how our Jefes find their favorite
 products or how they discover new ones.
 
 Sadly, our cloud in CloudG doesn't have enough RAM to handle the data science projects and
 perform all the calculations needed to obtain relations between products. Following our
 culture about creating things AdHoc and following the mantra "Our house, our rules" the maximum
 dirigent organ in MercadonaText (aka CMON) has disposed to go ahead to the next level and create our
 own computer: the *Hacendador* which could perform the calculations quickest and using less resources
 to satisfy:
 
 - "El Jefe": Discovering better products
 - "El trabajador": We gonna have a lot of fun
 - "El proveeder": Because we can design a new computer
 - "La sociedad": Better carbon footprint
 - "El Capital": Improved costs
 
 Before to start we need to take into account that here in MercadonaTech we don't believe in
 BigBangs. We strongly beleave in creating the maximum value with less effor, so instead of start
 a phisical device we are going to emulate our "Hacendador" to perform some tests and analyze the data.
 
 ## The Emulator instruction set
 
 Our emulator will compute a set of instructions as an input and should return the resultant set
 of computations. Each instruction is defined by 4 parameters represented as integers and separated by coma `1,0,2,1`. The first componen represents the operation code, the second is the left value address, third the right value address and in fourth position the destination address.
 
 Each operation code represents an arithmetic operation:
  - 1 -> Addition
  - 2 -> Substraction
  - 3 -> Product
  - 99 -> End of program
 
 For example, por the next input `1,0,2,1,99` the result will be `1,3,2,1,99`. First integer is the
 operation code (1 -> addition), second the reference to left operator (value at index 0 -> 1), third
 the reference to right value 2 -> 2, fourth the reference to destination (were we are going to store
 the result -> 1), and finally the end of program opcode to halt the execution.
 
 More examples of inputs and outputs:
 
 - `1,5,1,6,99,5,0` => `1,5,1,6,99,5,6`
 - `1,6,1,10,3,10,3,0,99,5,0` => `30,6,1,10,3,10,3,0,99,5,7`
 - `1,17,18,17,2,17,0,18,3,18,17,0,99,543,135,34,17,18,0,9843` => `306,17,18,17,2,17,0,18,3,18,17,0,99,543,135,34,17,35,17,9843`
 
