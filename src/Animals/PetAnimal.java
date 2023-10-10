package Animals;

public class PetAnimal extends Animal{


    public PetAnimal(int id, String name, String date, String typeAnimal) {
        super(id, name, date, typeAnimal);
    }

    @Override
    public String toString() {
        return "Pet {" +
                "id = '" + super.getId() + '\'' +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}
