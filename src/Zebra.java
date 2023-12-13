class Zebra implements Animal {
    private String name;

    public Zebra(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "Травоядное";
    }

    @Override
    public String getSpecies() {
        return "Зебра";
    }

    @Override
    public String getSound() {
        return "Игого...";
    }
}
