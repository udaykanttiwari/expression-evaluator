expression-evaluator
====================

**Expression-Evaluator** utility helps you to evaluate a Mathematical Expression.



####How to  Use the expression-evaluator
You have to  run the build file and download extract zip file

unzip the zip file and go to folder where file has extracted and set the current Path as
> **EVALUATOR_HOME**

####HOW TO RUN?
in the PATH environment > put the following stirng 
    *%EVALUATOR_HOME%/bin

Now you are ready to run these commands
####RUN COMMANDS

`run.sh "2 + 3"
#### VERSION 0.83  (IN this version our program is able to solve power of minus values)
    * example is ->(2 ^ -3)
#### VERSION 0.82   (in this version our program is able  to solve values is Preceded by any operator)
    * example is ->"5-"

#### VERSION 0.81( in this version our program is able to solve negative values problems)
    * example is -> "5--3"

#### VERSION 0.8( its take multiple operators with multiple operands with nested bracket and able to handle userInput
if user give expression without space and if number of brackets not same and also able to handle decimal point number )
      * Example -> "(5+4)"  or "(5+4"
   Our Program will accept a string expression which would not  have space between operands and operators .
    * it will support operator '+','-','*','/','^'


#### VERSION 0.7( its take multiple operators with multiple operands with nested bracket and able to handle userInput
if user give expression without space and if number of brackets not same )
      * Example -> "(5+4)"  or "(5+4"
   Our Program will accept a string expression which would not  have space between operands and operators .
    * it will support operator '+','-','*','/','^'
    * It should not contain decimal point numbers, only integers are allowed.

##### known Bugs
      *  It should not contain decimal point numbers, only integers are allowed.


#### VERSION 0.6(take multiple operators with multiple operands with nested bracket with Negative values)
    * Example - "5 + (-3)"
   Our Program will accept a string expression which would not  have space between operands and operators .
    * it will support operator '+','-','*','/','^'
    * It should not contain decimal point numbers, only integers are allowed.
##### known Bugs
        * It should not contain decimal point numbers, only integers are allowed.


#### VERSION 0.5(take multiple operators with multiple operands with nested bracket)
   * example -> "((5 + 3))"
   Our Program will accept a string expression which would have  space between operands and operators .
    * it will support operator '+','-','*','/','^'
    * It should not contain negative numbers.

    ##### known Bugs
        * It should not contain decimal point numbers, only integers are allowed.


#### VERSION 0.4(take multiple operators with two multiple operands with multipair bracket)
   * Example ->"(3 + 3) + ( 4 - 3)"
   Our Program will accept a string expression which would have  space between operands and operators .
    * it will support operator '+','-','*','/','^'
    * It should not have nested Brackets.
    * It should not contain negative numbers.
    * It should not contain decimal point numbers, only integers are allowed.

##### known Bugs

    * it don't take expression which  dont have space between two operands like "1+4"
    * it can't take single expression like "1"


#### VERSION 0.3(take one operator with two operand with single pair bracket)
   * Example -> "(3 + 4)"
   Our Program will accept a string expression which would have  space between operands and operators .
    * it will support operator '+','-','*','/','^'
    * It should not have multiple Brackets.
    * It should not contain negative numbers.
    * It should not contain decimal point numbers, only integers are allowed.

##### known Bugs

   * it don't take expression which  dont have space between two operands like "1+4"
   * it can't take single expression like "1"


#### VERSION 0.2(take multiple operator and multiple operands)
    * Example -> "(5 + 3 * 4)"
   
   Our Program will accept a string expression which would have  space between operands and operators .
    it will support operator '+','-','*','/','^'
    It should not have Brackets.
    It should not contain negative numbers.
    It should not contain decimal point numbers, only integers are allowed.

##### known Bugs

* it don't take expression which  don't have space between two operands like "1+4"
* it can't take single expression like "1"

#### VERSION 0.1 (take only one operator with two operands)

    Our Program will accept a string expression which would have  space between operands and operators .
    * it will support operator '+','-','*','/','^'
    * It should not have Brackets.
    * It should not contain negative numbers.
    * It should not contain decimal point numbers, only integers are allowed.


   Example - "2 + 4"



##### known Bugs

it don't take expression which  dont have space between two operands like "1+4"
it can't take single expression like "1"