package oopCourses.doctor;

import java.util.ArrayList;
import java.util.List;

public class Clinic implements Printable {
    private String name;
    private Address address;
    private List <Doctor> doctors = new ArrayList<>();

    public Clinic(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Clinic(String name, Address address, List<Doctor> doctors) {
        this.name = name;
        this.address = address;
        this.doctors = doctors;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Clinic addDoctor(Doctor doctor){
       doctors.add(doctor);
       return this;
    }

    public Clinic addDoctors(Doctor... doctor) {
        for (Doctor d : doctor) {
            doctors.add(d);
        }
        return this;
    }

    public List<Doctor> filter(Specialization bySpec){
        List<Doctor> result = new ArrayList<>();
        List<Doctor> actualDoctors = getDoctors();
        for(Doctor eachDoc : actualDoctors){
            if(eachDoc.getSpecialization().equals(bySpec)){
                result.add(eachDoc);
            }
        }
        if(result.isEmpty()){
            System.out.println("No any: " + bySpec.getSpecialization() + " at the Clinic: " + getName());
        }
        return  result;
    }

    @Override
    public String toString() {
        return "Clinic{" + "name='" + name + '\'' + ", address=" + address + ", doctors=" + doctors + '}';
    }

    @Override
    public List<Doctor> print(List list) {
        System.out.println(list.toString());
        return null;
    }

    @Override
    public List print() {
        return null;
    }


}


