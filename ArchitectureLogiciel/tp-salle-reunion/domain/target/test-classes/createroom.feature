Feature: create room
  Scenario: create room
    Given the user is an administrator with verification status set to true
    When the user  creates a room with the name "Lillenium" and capacity 10 and id 1
    Then list with room 1 should be returned