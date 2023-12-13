import java.util.ArrayList;
import java.util.List;
class Cell
{
    private List<Animal> animals;

    public Cell()
    {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) throws Exception
    {
        if (hasPredator(animal))
        {
            throw new Exception("Нельзя добавить хищника в клетку с другими животными");
        }

        if (animals.size() < 4)
        {
            animals.add(animal);
        }
    }

    public boolean isEmpty()
    {
        return animals.isEmpty();
    }

    public List<Animal> getAnimals()
    {
        return animals;
    }

    private boolean hasPredator(Animal animal)
    {
        for (Animal existingAnimal : animals)
        {
            if (existingAnimal.getType().equals("Хищник") && !existingAnimal.getSpecies().equals(animal.getSpecies()))
            {
                return true;
            }
        }
        return false;
    }
}
