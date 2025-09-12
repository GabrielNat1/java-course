package academy.devdojo.maratona.javacore.Ycolections.domain;

import java.util.Objects;

public class SmartPhone {
    private String serialNumber;
    private String brand;

    public SmartPhone(String serialNumber, String brand) {
        this.serialNumber = serialNumber;
        this.brand = brand;
    }

    // Reflexive: x.equals(x) must be true for everything that is not null
    // Symmetric: for x and y different from null, if x.equals(y) == true then y.equals(x) == true
    // Transitivity: for x, y, z different from null, if x.equals(y) == true, and x.equals(z) == true then y.equals(z) == true
    // Consistent: x.equals(x) always returns true if x is not null// for x not null, x.equals(null) must return false.
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        SmartPhone smartPhone = (SmartPhone) obj;
        return serialNumber != null && serialNumber.equals(smartPhone.serialNumber);
    }

    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
