package com.abn.ibt.cukes.stepdefs;

import com.abn.ibt.cukes.shared.SharedState;
import io.cucumber.java.en.When;

public class FragileGoodsRateCalculatorSteps {
  private final CommonStepDef commonSteps;
  private final SharedState sharedState;

  public FragileGoodsRateCalculatorSteps(CommonStepDef commonSteps, SharedState state) {
    System.out.println("Inside : FragileGoodsRateCalculatorSteps constructor");
    System.out.println(
        "Inside : FragileGoodsRateCalculatorSteps constructor: shared state variable :" + state.toString());
    this.commonSteps = commonSteps;
    this.sharedState = state;
  }

  @When("calculating the rate of the shipment for fragile goods")
  public void calculateFragileGoods() {
    System.out.println("Inside : FragileGoodsRateCalculatorSteps: calculateFragileGoods: shared state variables: " + sharedState.toString());
    //Some logic to calculate the rate
    sharedState.setActualRate("30");
  }
}
