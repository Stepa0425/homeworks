package by.it_academy.homeworks.lesson21.builder;

public class Pizza {
    private String size;
    private String crustType;
    private String toppings;

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.crustType = builder.crustType;
        this.toppings = builder.toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", crustType='" + crustType + '\'' +
                ", toppings='" + toppings + '\'' +
                '}';
    }

    public static class Builder {
        private String size;
        private String crustType;
        private String toppings;

        public Builder() {
            this.size = "Medium";
            this.crustType = "Thin crust";
            this.toppings = null;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder crustType(String crustType) {
            this.crustType = crustType;
            return this;
        }

        public Builder toppings(String toppings) {
            this.toppings = toppings;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
