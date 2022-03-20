Feature: Mathematical Calculation
	
  Background: Given calculation test
	
  Scenario Outline: Adding two numbers
  	Given Create two numbers for addition
    When the user call addition with value "<num1>" and "<num2>"
    Then The output of addition is 30
	
    Examples:
    | num1 | num2 |
    | 10   | 20   |

  Scenario Outline: Subtraction two numbers
    Given Create two numbers for subtraction
    When the user call subtract with value "<num1>" and "<num2>"
    Then The output of subtract is 10

    Examples:
    | num1 | num2 |
    | 20   | 10   |

  Scenario Outline: Multiply two numbers
    Given Create two numbers for Multiplication
    When the user call multiply with value "<num1>" and "<num2>"
    Then The output of multiply is 200
	
    Examples:
      | num1 | num2 |
      | 10   | 20   |

  Scenario Outline: Divide two numbers
    Given Create two numbers for division
    When the user call division with value "<num1>" and "<num2>"
    Then The output of division is 2
		
    Examples:
      | num1 | num2 |
      | 20   | 10   |