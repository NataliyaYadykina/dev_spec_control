package Animals;

public class PackAnimal extends Animal {
    public PackAnimal(int id, String name, String date, String typeAnimal) {
        super(id, name, date, typeAnimal);
    }

    @Override
    public String toString() {
        return "Pack Animal {" +
                "id = '" + super.getId() + '\'' +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}
