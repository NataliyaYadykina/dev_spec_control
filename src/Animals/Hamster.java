package Animals;

public class Hamster extends PetAnimal{
    public Hamster(int id, String name, String date, String typeAnimal) {
        super(id, name, date, typeAnimal);
    }

    @Override
    public String toString() {
        return "Hamster {" +
                "id = '" + super.getId() + '\'' +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}
