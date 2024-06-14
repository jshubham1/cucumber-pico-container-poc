Feature: Calculate the rate for perishable goods
  Scenario Outline: Calculate the rate for the international shipment of perishable goods
    Given Shipment is to the international destination <destination>
    And the type of merchandise is <typeOfMerchandise>
    When calculating the rate of the shipment for perishable goods
    Then the calculated rate is <expectedRate>

    Examples:
      | destination | typeOfMerchandise | expectedRate |
      | DXB         | Seafood           | 70           |
      | DXB         | Chemicals         | 80           |

  Scenario Outline: Calculate the rate for the local shipment of perishable goods
    Given Shipment is to the local destination <destination>
    And the type of merchandise is <typeOfMerchandise>
    When calculating the rate of the shipment for perishable goods
    Then the calculated rate is <expectedRate>

    Examples:
      | destination | typeOfMerchandise | expectedRate |
      | NY          | Seafood           | 15           |
      | LA          | Chemicals         | 25           |