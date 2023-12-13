import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
    class Zoo
    {
    private List<Cell> cells;

    public Zoo()
    {
        cells = new ArrayList<>();
    }

    public void addCell(Cell cell)
    {
        cells.add(cell);
    }
    public List<Cell> getCells()
    {
        return cells;
    }

    public void displayCells()
    {
        for (int i = 0; i < cells.size(); i++)
        {
            Cell cell = cells.get(i);
            System.out.print("Клетка " + (i + 1) + ": ");
            if (cell.isEmpty())
            {
                System.out.println("пуста");
            } else {
                List<Animal> animals = cell.getAnimals();
                for (Animal animal : animals)
                {
                    System.out.print(animal.getName() + " (" + animal.getType() + "), ");
                }
                System.out.println();
            }
        }
    }

    public void displayUniqueAnimalTypes()
    {
        Map<String, Integer> uniqueAnimalTypes = new HashMap<>();
        for (Cell cell : cells)
        {
            List<Animal> animals = cell.getAnimals();
            for (Animal animal : animals)
            {
                String animalType = animal.getType();
                uniqueAnimalTypes.put(animalType, uniqueAnimalTypes.getOrDefault(animalType, 0) + 1);
            }
        }
        System.out.println("Уникальные типы животных в зоопарке:");
        for (String animalType : uniqueAnimalTypes.keySet())
        {
            System.out.println(animalType);
        }
    }

    public int countPredators()
    {
        int count = 0;
        for (Cell cell : cells)
        {
            List<Animal> animals = cell.getAnimals();
            for (Animal animal : animals)
            {
                if (animal.getType().equals("Хищник"))
                {
                    count++;
                }
            }
        }
        return count;
    }

    public int countHerbivores()
    {
        int count = 0;
        for (Cell cell : cells)
        {
            List<Animal> animals = cell.getAnimals();
            for (Animal animal : animals)
            {
                if (animal.getType().equals("Травоядное"))
                {
                    count++;
                }
            }
        }
        return count;
    }

    public void printAnimalCountsOrderedByQuantity()
    {
        Map<String, Integer> animalCounts = new HashMap<>();
        for (Cell cell : cells)
        {
            List<Animal> animals = cell.getAnimals();
            for (Animal animal : animals)
            {
                String species = animal.getSpecies();
                animalCounts.put(species, animalCounts.getOrDefault(species, 0) + 1);
            }
        }
        animalCounts.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
