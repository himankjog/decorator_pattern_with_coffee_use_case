package models.beverage;

import models.enums.Size;

public interface Beverage {
    String getDescription();
    Double getCost();
    Size getSize();
}
