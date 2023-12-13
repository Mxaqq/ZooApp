import java.util.List;
public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Cell cell1 = new Cell();
        Cell cell2 = new Cell();
        Cell cell3 = new Cell();
        Cell cell4 = new Cell();
        Cell cell5 = new Cell();


        Animal lion = Factory.CreateLion("Лев");
        Animal tiger = Factory.CreateTiger("Тигр");
        Animal zebra = Factory.CreateZebra("Зебра");
        Animal gazelle = Factory.CreateGazelle("Газель");

        try {
            cell1.addAnimal(zebra);
            cell1.addAnimal(zebra);

            cell2.addAnimal(lion);
            cell2.addAnimal(lion);

            cell3.addAnimal(tiger);
            cell3.addAnimal(tiger);

            cell4.addAnimal(gazelle);
            cell4.addAnimal(gazelle);

            cell5.addAnimal(lion);
            cell5.addAnimal(tiger);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }


        zoo.addCell(cell1);
        zoo.addCell(cell2);
        zoo.addCell(cell3);
        zoo.addCell(cell4);
        zoo.addCell(cell5);


        System.out.println("Состояние клеток:");
        zoo.displayCells();
        System.out.println();


        zoo.displayUniqueAnimalTypes();
        System.out.println();


        int predatorCount = zoo.countPredators();
        int herbivoreCount = zoo.countHerbivores();
        System.out.println("Количество хищников: " + predatorCount);
        System.out.println("Количество травоядных: " + herbivoreCount);
        System.out.println();


        System.out.println("Звуки животных в зоопарке:");
        for (Cell cell : zoo.getCells())
        {
            List<Animal> animals = cell.getAnimals();
            for (Animal animal : animals)
            {
                System.out.println(animal.getName() + ": " + animal.getSound());
            }
        }
        System.out.println();

        System.out.println("Количество животных каждого вида в зоопарке:");
        zoo.printAnimalCountsOrderedByQuantity();
    }
}