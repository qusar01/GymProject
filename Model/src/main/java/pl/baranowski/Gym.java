package pl.baranowski;

public class Gym {
    private String name;
    private Address address;
    private boolean isOpen;

    public Gym(String name, Address address, boolean isOpen) {
        this.name = name;
        this.address = address;
        this.isOpen = isOpen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
