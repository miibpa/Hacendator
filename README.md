# Kata
 
 Here in MercadonaTech, we like to push the boundaries about how our Jefes find their favorite
 products or discover new ones.
 
 Sadly, our cloud in CloudG doesn't have enough RAM to handle the data science projects and
 perform all the calculations needed to obtain relations between products. Based on our
 culture about creating things AdHoc and following the mantra "Our house, our rules" the maximum
 dirigent organ in MercadonaTech (aka CMON) has disposed to go ahead to the next level and create our
 own computer: the *Hacendator* which could perform the calculations quicker and using less resources
 to satisfy:
 
 - "El Jefe": Discovering better products
 - "El trabajador": We gonna have a lot of fun
 - "El proveedor": Because we can design a new computer
 - "La sociedad": Better carbon footprint
 - "El Capital": Improved costs
 
 Before start, we need to take into account that here in MercadonaTech we don't believe in
 BigBangs. We strongly believe in creating the maximum value with less effort, so instead of start
 a physical device we are going to emulate our "Hacendator" to perform some tests and analyze the data.
 
 ## The Emulator instruction set
 
 Our emulator will compute a set of instructions as an input and should return the resultant set
 of data. Each instruction is defined by 4 parameters represented as integers and separated by coma `1,0,2,1`. The first component represents the operation code, the second is the left value address, third the right value address and in fourth position the destination address.
 
 Each operation code represents an arithmetic operation:
  - 1 -> Addition
  - 2 -> Substraction
  - 99 -> End of program
 
 For example, for the next input `1,0,2,1,99` the result will be `1,3,2,1,99`. First integer is the
 operation code (1 -> addition), second the reference to left operator (value at index 0 -> 1), third
 the reference to right value 2 -> 2, fourth the reference to destination (were we are going to store
 the result -> 1) so `1 + 2 = 3` and store at index `1`. Finally the end of program opcode to halt the execution.
 
 More examples of inputs and outputs:
 
 - `1,5,1,6,99,5,0` => `1,5,1,6,99,5,10`
 - `1,6,1,10,3,10,2,0,99,5,0` => `8,6,1,10,3,10,2,0,99,5,8`
 -`1,17,18,17,2,17,0,18,2,18,17,0,99,543,135,34,17,18,0,9843` => `-1,17,18,17,2,17,0,18,2,18,17,0,99,543,135,34,17,18,17,9843`
 
