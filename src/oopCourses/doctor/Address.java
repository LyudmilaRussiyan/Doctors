package oopCourses.doctor;

public class Address {
    private String street;
    private int number;
    private CityDistrict cityDistrict;

    public Address(String street, int number, CityDistrict cityDistrict) {
        this.street = street;
        this.number = number;
        this.cityDistrict = cityDistrict;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public CityDistrict getCityDistrict() {
        return cityDistrict;
    }

    public void setCityDistrict(CityDistrict cityDistrict) {
        this.cityDistrict = cityDistrict;
    }

    @Override
    public String toString() {
        return "Address{" + "street='" + street + '\'' + ", number=" + number + ", cityDistrict=" + cityDistrict + '}';
    }
}

