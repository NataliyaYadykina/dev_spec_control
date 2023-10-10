package Animals;

public class Horse extends PackAnimal{
    public Horse(int id, String name, String date, String typeAnimal) {
        super(id, name, date, typeAnimal);
    }

    @Override
    public String toString() {
        return "Horse {" +
                "id = '" + super.getId() + '\'' +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}
