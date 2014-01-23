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

`run.sh "2 + 3"`
#### VERSION 0.1 (take only one operator with two operands)

    Our Program will accept a string expression which would have  space between operands and operators .
    it will support operator '+','-','*','/','^'
    It should not have Brackets.
    It should not contain negative numbers.
    It should not contain decimal point numbers, only integers are allowed.


   Example - "2 + 4"



##### Possible BUGs

it don't take expression which  dont hape space between two operands like "1+4"
it can't take single expression like "1"