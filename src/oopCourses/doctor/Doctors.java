package oopCourses.doctor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Doctors implements Printable {

    private List <Doctor> allDoctors=new ArrayList<>();

    public Doctors() {}

    public List<Doctor> getAllDoctors() {
        return allDoctors;
    }

    public List<Doctor> addDoctor(Doctor doctor){
        allDoctors.add(doctor);
        return allDoctors;
    }

    public Doctors addToAllDoctors(Doctor... doctor) {
        for (Doctor d : doctor) {
            allDoctors.add(d);
        }
        return this;
    }

    public List <Doctor> filter(CityDistrict cityDistrict) {
        List<Doctor> result = new ArrayList<>();

        for(Doctor eachDoctor : allDoctors){
            if(eachDoctor.getClinic().getAddress().getCityDistrict().equals(cityDistrict)){
                result.add(eachDoctor);
            }
        }
        if(result.isEmpty()){
            System.out.println("No any doctors in this citydictrict: " + cityDistrict);
        }
        return  result;
    }

    @Override
    public String toString() {
        return "Doctors{" + "allDoctors=" + allDoctors + '}';
    }

    @Override
    public List<?>  print(List list) {
        return null;
    }

    @Override
    public List<Doctor> print() {
        Iterator<Doctor> iter =allDoctors.iterator();
        System.out.println();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
        return null;
    }



}
