package com.abn.ibt.cukes.stepdefs;

import com.abn.ibt.cukes.shared.SharedState;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

public class CommonStepDef {
  private final SharedState sharedState;

  public CommonStepDef(SharedState state) {
    System.out.println("Inside : CommonStepDef constructor");
    this.sharedState = state;
  }

  @Given("Shipment is to the international destination {}")
  public void internationalShipment(String destination) {
    // implementation
    System.out.println("Inside : CommonStepDef: internationalShipment step: destination: " + destination);
    sharedState.setDestination(destination);
  }

  @Given("Shipment is to the local destination {}")
  public void localShipment(String destination) {
    // implementation
    System.out.println("Inside : CommonStepDef: localShipment: destination: " + destination);
    sharedState.setDestination(destination);

  }

  @And("the type of merchandise is {}")
  public void merchandiseType(String type) {
    System.out.println("Inside : CommonStepDef: merchandiseType: type: " + type);
    sharedState.setTypeOfMerchandise(type);
    // implementation
  }

  @Then("the calculated rate is {}")
  public void assertCalculatedRate( String expectedRate){
    System.out.println("Inside : CommonStepDef: assertCalculatedRate: expectedRate: " + expectedRate);
    sharedState.setExpectedRate(expectedRate);
    // implementation
    System.out.println("Actual rate: "+sharedState.getActualRate()+" vs expected rate: " + sharedState.getExpectedRate());
  }
}
