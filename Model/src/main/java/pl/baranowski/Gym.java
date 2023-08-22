package pl.baranowski;

public class Gym {
    private String name;
    private String address;
    private boolean isOpen;

    public Gym(String name, String address, boolean isOpen) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
