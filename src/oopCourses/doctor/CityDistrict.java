package oopCourses.doctor;

import java.util.ArrayList;

public class CityDistrict {
    private String name;
    private ArrayList <Address> addresses;


    public CityDistrict(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAddress(Address address){
        addresses.add(address);
      }

    public void addAdresses(Address... address) {
        for(Address a: address) {
            this.addresses.add(a);
        }
    }

    @Override
    public String toString() {
        return "CityDistricts "  + name + '\'';
    }
}




