class Lion implements Animal {
    private String name;

    public Lion(String name) {
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
        return "Лев";
    }

    @Override
    public String getSound() {
        return "Ррррррааааа...";
    }
}
