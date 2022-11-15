package P4_First_And_Reserve_Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name) {
        this.setName(name);
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(this.firstTeam);
    }

    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(this.reserveTeam);
    }

    public void addPlayer (Person person) {
       if (person.getAge() < 40) {
           this.firstTeam.add(person);
       } else {
           this.reserveTeam.add(person);
       }
    }
    //Create a Team class. Add to this team all person you read.
    // All person younger than 40 go in first team, others go in reverse team.
    // At the end print first and reserve team sizes.
    //The class should have private fields for:
    //•	name: String
    //•	firstTeam: List<Person>
    //•	reserveTeam: List<Person>
    //The class should have constructors:
    //•	Team(String name)
    //The class should also have private method for setName and public methods for:
    //•	getName(): String
    //•	addPlayer(Person person): void
    //•	getFirstTeam(): List<Person> (Collections.unmodifiableList)
    //•	getReserveTeam(): List<Person> (Collections.unmodifiableList)
}
