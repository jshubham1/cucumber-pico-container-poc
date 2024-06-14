package com.abn.ibt.cukes.shared;

import lombok.Data;

@Data
public class SharedState {
  String destination;
  String typeOfMerchandise;
  String actualRate;
  String expectedRate;
}
