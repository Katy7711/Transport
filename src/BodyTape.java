public enum BodyTape

{SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private final String name;

    BodyTape(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BodyTape{" +
                "name='" + name + '\'' +
                '}';
    }
};

