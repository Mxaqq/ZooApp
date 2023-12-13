class Gazelle implements Animal {
    private String name;

    public Gazelle(String name) {
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
        return "Газель";
    }

    @Override
    public String getSound() {
        return "Фффрр...";
    }
}
