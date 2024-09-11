package shop.domoin;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Customer {
    private long id;
    private String name;
    private boolean isActive;
    private List<Produkt> Produkts = new ArrayList<Produkt>();

    public Customer(long id, boolean isActive, String name) {
        this.id = id;
        this.isActive = isActive;
        this.name = name;
    }

    public Customer() {
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Produkt> getProdukts() {
        return Produkts;
    }

    public void setProdukts(List<Produkt> produkts) {
        this.Produkts = produkts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && isActive == customer.isActive && Objects.equals(name, customer.name) && Objects.equals(, customer.produkts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, isActive, produkts);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Customer: id - ");
        builder
                .append(id)
                .append(", name - ")
                .append(name)
                .append(", active - ")
                .append(isActive ? "yes" : "no")
                .append("\n")
                .append("Products list:\n");

        for (Product product : products) {
            builder.append(product).append("\n");
        }

        return builder.toString();
    }
