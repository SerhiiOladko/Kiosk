package shop.domoin;

import java.util.Objects;

public class Produkt {

    public long id;
    private String title;
    private double price;

    public Produkt() {
    }

    private boolean isActive;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return id == produkt.id && Double.compare(price, produkt.price) == 0 && isActive == produkt.isActive && Objects.equals(title, produkt.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, price, isActive);
    }

    public Produkt(long id, String title, double price, boolean isActive) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return String.format("Produkt : ID - %d, Title - %s, Price - %.2f, active - %s", id, title,
                price,isActive ? "yes" : "no");
    }
}
