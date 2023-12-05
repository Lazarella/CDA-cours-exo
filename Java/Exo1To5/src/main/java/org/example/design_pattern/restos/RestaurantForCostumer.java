package org.example.design_pattern.restos;

public class RestaurantForCostumer {
    private JaponResto japonResto;
    private MexicanResto mexicanResto;

    private RestaurantForCostumer(Builder builder) {
        this.japonResto = builder.japonResto;
        this.mexicanResto = builder.mexicanResto;
    }

    public static class Builder {
        private JaponResto japonResto;
        private MexicanResto mexicanResto;

        public Builder japonResto(JaponResto japonResto) {
            this.japonResto = japonResto;
            return this;
        }

        public Builder mexicanResto(MexicanResto mexicanResto) {
            this.mexicanResto = mexicanResto;
            return this;
        }

        public RestaurantForCostumer build() {
            return new RestaurantForCostumer(this);
        }
    }
}
