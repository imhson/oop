
import java.util.Date;

public class Vietnamese extends Human {
    
    public Vietnamese(String name, Date birth, int age, String country) {
        super(name, birth, age, country);
    }
    String hometown;

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}
