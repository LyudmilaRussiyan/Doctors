package oopCourses.doctor;

import static oopCourses.doctor.Specialization.CARDIOLOGIST;
import static oopCourses.doctor.Specialization.DERMATOLOGIST;

public class DoctorRunner {

    public static void main(String[] args) {
        Doctors allDoctors=new Doctors();

        CityDistrict pechersky = new CityDistrict("Pechersky");
        CityDistrict goloseevsky = new CityDistrict("Goloseevsky");
        CityDistrict solomensky = new CityDistrict("Solomensky");

        Clinic clinic1 = new Clinic("Doctor#1", new Address("Mechnikova", 2, pechersky));
        Clinic clinic2 = new Clinic("Ne boleite",new Address("Vasilkovskaya", 15, goloseevsky));
        Clinic clinic3 = new Clinic("Doctor lor", new Address("Lomonosova", 56, goloseevsky));

        Doctor doctor1 = new Doctor("Ekaterina", "Belaya", DERMATOLOGIST);
        Doctor doctor2 = new Doctor("Elena", "Seraya", DERMATOLOGIST);

        clinic1.addDoctor(new Doctor("Irina", "Zelyonaya", CARDIOLOGIST));
        clinic1.addDoctors(doctor1, doctor2);
        allDoctors.addToAllDoctors(doctor1, doctor2);
        //System.out.println(clinic1.getDoctors());

       // clinic1.print();
       clinic1.print(clinic1.filter(DERMATOLOGIST ));


       // allDoctors.print();
        //allDoctors.print(allDoctors.filter(pechersky));




    }
}
