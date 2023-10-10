package Animals;

import java.util.ArrayList;

public class Animal {
    private int id;
    private String name;
    private ArrayList commands = new ArrayList<String>();
    private String dateOfBirth;
    private String typeAnimal;

    public Animal(int id, String name, String date, String typeAnimal){
        this.id = id;
        setName(name);
        setDateOfBirth(date);
        setTypeAnimal(typeAnimal);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getCommands() {
        return commands.toString();
    }

    public void setCommands(String command) {
        this.commands.add(command);
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    private void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    @Override
    public String toString() {
        return "Animal {" +
                "id = '" + id + '\'' +
                "name = '" + name + '\'' +
                ", commands = " + commands.toString() +
                ", dateOfBirth = '" + dateOfBirth + '\'' +
                '}';
    }
}
