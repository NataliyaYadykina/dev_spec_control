package Animals;

public class Camel extends PackAnimal{
    public Camel(int id, String name, String date, String typeAnimal) {
        super(id, name, date, typeAnimal);
    }

    @Override
    public String toString() {
        return "Camel {" +
                "id = '" + super.getId() + '\'' +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}
