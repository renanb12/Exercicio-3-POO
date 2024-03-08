
public class Menager extends User {

    private String sector;

    public Menager(String sector, String name, String email, String password) {
        super(name, email, password);
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

}
