package oopCourses.doctor;

public class Doctor {
    private String name;
    private String surname;
    private Specialization specialization;
    private Clinic clinic;

    public Doctor(String name, String surname, Specialization specialization) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
    }

    public Doctor(String name, String surname, Specialization specialization, Clinic clinic) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.clinic = clinic;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;

    }

    @Override
    public String toString() {
        return "Doctor{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", specialization=" + specialization + ", clinic=" + clinic + '}';
    }
}
