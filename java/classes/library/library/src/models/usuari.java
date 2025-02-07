package models;

public class usuari {
    private String DNI;
    private String birthday;
    private String home;
    private int books_overdue;
    private int books_rented;

    // Constructor
    public usuari(String DNI, String birthday, String home, int books_overdue, int books_rented) {
        this.DNI = DNI;
        this.birthday = birthday;
        this.home = home;
        this.books_overdue = books_overdue;
        this.books_rented = books_rented;
    }

    // Getters
    public String getDNI() {
        return DNI;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getHome() {
        return home;
    }

    public int getBooksOverdue() {
        return books_overdue;
    }

    public int getBooksRented() {
        return books_rented;
    }

    // Setters
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void setBooksOverdue(int books_overdue) {
        this.books_overdue = books_overdue;
    }

    public void setBooksRented(int books_rented) {
        this.books_rented = books_rented;
    }
}
