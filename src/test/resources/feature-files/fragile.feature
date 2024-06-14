Feature: Calculate the rate for fragile goods
  Scenario Outline: Calculate the rate of international shipment for fragile goods
    Given Shipment is to the international destination <destination>
    And the type of merchandise is <typeOfMerchandise>
    When calculating the rate of the shipment for fragile goods
    Then the calculated rate is <expectedRate>

    Examples:
      | destination | typeOfMerchandise | expectedRate |
      | DXB         | Glass             | 30           |
      | DXB         | Ceramic           | 50           |

  Scenario Outline: Calculate the rate of local shipment for fragile goods
    Given Shipment is to the local destination <destination>
    And the type of merchandise is <typeOfMerchandise>
    When calculating the rate of the shipment for fragile goods
    Then the calculated rate is <expectedRate>

    Examples:
      | destination | typeOfMerchandise | expectedRate |
      | NY          | Glass             | 10           |
      | LA          | Ceramic           | 15           |