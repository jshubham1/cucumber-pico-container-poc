# Read Me First

### Example copied from [here](https://asyncstream.com/tutorials/inheritance-in-cucumber-stepdef)

#### how to run?

```
mvn clean test
```

## Why can’t I inherit the step definition class ?
A step definition class is the place where you write the implementation code to test the behaviour of the system in response to an action or change in state. In a complex system, multiple (input) variables affect the end result of a software API. This could lead to the creation of multiple feature files though we have to duplicate the same steps in these feature files.

Let us take an example of a Rating Engine which calculates the rate of shipment for different types of articles.

#### Please open the Feature files and read the steps there.

In the above example, we could see that the steps 1,2, 4 could be considered as common steps and the 3rd step is unique to the feature file. In this situation naturally an automation tester is tempted to move the common steps to a base step definition class, RateCalculatorBase StepDef.class and creates a specialized class for each feature file by extending the base class. 

Here we could name those classes PerishableGoodsRateCalculatorSetps.class and FragileGoodsRateCalculatorSteps.class 

##### But, this is not allowed in cucumber. Cucumber creates a new instance of all classes defining stepdefs before each scenario. It then invokes stepdef methods on one of those instances whenever it needs to run a step.

Cucumber create instances for the above three classes to execute each scenario. When it tries to execute the step the calculated rate is, it could see the implementation in 3 instances and exit the execution. We can’t blame cucumber as it is expecting only one instance responsible for a step definition.


## How could I move the common steps to a common class and use it in actual step definition classes ?
Inheritance is not the soultion. We have to use composition to resolve this problem. We could achieve this with dependency injection. I have used PicoContainer to achieve dependency injection. Let us try to implement the StepDef classes for the above feature files using compostion
