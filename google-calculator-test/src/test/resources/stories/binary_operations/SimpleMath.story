Simple math
Narrative:
In order to calculate result of simple mathematical operations
As user
I want to use google online calculator

Scenario: Simple binary mathematical operations using web buttons
Given The user is on the calculator page
When The user enters arguments <argument1> and <argument2> with operation <operation> using web buttons
And The user presses equals web button
Then The user sees <result>
Examples:
|argument1|argument2|operation|result|
|123|45|+|168|
|67|89|-|-22|
|-10.0|5|*|-50|
|15|3|÷|5|
|1|3|÷|0.33333333333|
|1|0|÷|Infinity|
|0|0|÷|Error|

Scenario: Simple binary mathematical operations using keyboard
Given The user is on the calculator page
When The user enters arguments <argument1> and <argument2> with operation <operation> using keyboard
And The user presses enter keyboard button
Then The user sees <result>
Examples:
|argument1|argument2|operation|result|
|123|45|+|168|
|67|89|-|-22|
|-10.0|5|*|-50|
|15|3|÷|5|
|1|3|÷|0.33333333333|
|1|0|÷|Infinity|
|0|0|÷|Error|