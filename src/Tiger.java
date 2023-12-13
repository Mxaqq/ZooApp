class Tiger implements Animal {
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "Хищник";
    }

    @Override
    public String getSpecies() {
        return "Тигр";
    }

    @Override
    public String getSound() {
        return "Мяу...";
    }
}
