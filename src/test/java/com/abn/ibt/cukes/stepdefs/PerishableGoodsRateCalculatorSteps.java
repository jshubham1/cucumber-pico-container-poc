package com.abn.ibt.cukes.stepdefs;

import com.abn.ibt.cukes.shared.SharedState;
import io.cucumber.java.en.When;

public class PerishableGoodsRateCalculatorSteps {
  private final CommonStepDef commonSteps;
  private final SharedState sharedState;

  public PerishableGoodsRateCalculatorSteps(CommonStepDef commonSteps, SharedState state) {
    System.out.println("Inside : PerishableGoodsRateCalculatorSteps constructor");
    System.out.println("Inside : PerishableGoodsRateCalculatorSteps constructor: shared state variable :" + state.toString());
    this.commonSteps = commonSteps;
    this.sharedState = state;
  }

  @When("calculating the rate of the shipment for perishable goods")
  public void calculatePerishableGoods() {
    System.out.println("Inside : PerishableGoodsRateCalculatorSteps: calculateFragileGoods: Setting Actual Rate: 50");
    sharedState.setActualRate("50");

  }
}
