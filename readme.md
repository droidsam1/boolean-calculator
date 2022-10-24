# Boolean calculator by Alessandro Di Gioia
* This is part of my practice of exercises provided by the book _Agile Technical Practices Distilled_

Implement a Boolean calculator that gets a string as input and evaluates it to the Boolean result.

These are the specifications:

Supports single values:

``"TRUE" -> true``\
``"FALSE" -> false``

Supports the __NOT__ operator:\
``"NOT TRUE" -> false``

Supports the __AND__ operator:\
``"TRUE AND FALSE" -> false``\
``"TRUE AND TRUE" -> true``

Supports the __OR__ operator:\
``"TRUE OR FALSE" -> true``\
``"FALSE OR FALSE" -> false``

Supports any number of __AND__ and __OR__, giving precedence to __NOT__ then __AND__ and, eventually, the __OR__ operation:\
``"TRUE OR TRUE OR TRUE AND FALSE" -> true``\
``"TRUE OR FALSE AND NOT FALSE" -> true``

Supports parentheses:\
``"(TRUE OR TRUE OR TRUE) AND FALSE" -> false``\
``"NOT(TRUE AND TRUE)" -> false``