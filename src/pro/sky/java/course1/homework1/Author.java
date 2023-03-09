package pro.sky.java.course1.homework1;

import java.util.Objects;

public class Author {
    private final String firstName;
    private final String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String toString(){
        return firstName + " " + secondName;
    }

    public boolean equals(Object o){
        if(o==null || getClass() != o.getClass()){
            return false;
        }
        if(this == o){
            return true;
        }
        Author author = (Author) o;
        return firstName.equals(author.firstName) && secondName.equals(author.secondName);

    }
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }
}

