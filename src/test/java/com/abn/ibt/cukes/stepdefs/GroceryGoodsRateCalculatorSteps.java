package com.abn.ibt.cukes.stepdefs;

import com.abn.ibt.cukes.shared.SharedState;
import io.cucumber.java.en.When;

public class GroceryGoodsRateCalculatorSteps {
  private final CommonStepDef commonSteps;
  private final SharedState sharedState;

  public GroceryGoodsRateCalculatorSteps(CommonStepDef commonSteps, SharedState state) {
    this.commonSteps = commonSteps;
    this.sharedState = state;
  }

  @When("calculating the rate of the shipment for perishable goods")
  public void calculatePerishableGoods() {
    System.out.println("Inside : GroceryGoodsRateCalculatorSteps: calculateFragileGoods: share state variables: " + sharedState.toString());
    sharedState.setActualRate("30");

  }
}
