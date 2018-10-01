
import java.util.Date;

public class Human {
    String name;
    Date birth;
    int age;
    String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Human(String name, Date birth, int age, String hometown) {
        this.name = name;
        this.birth = birth;
        this.age = age;
        this.country = country;
    }
    
}
