package oopCourses.doctor;

public enum Specialization {
    THERAPIST           ("Therapist",           100),
    DERMATOLOGIST       ("Dermatologist",       101),
    CARDIOLOGIST        ("Cardiologist",        102),
    NEUROLOGIST         ("Neurologist",         103),
    GYNECOLOGIST        ("Gynecologist",        104),
    OPHTHALMOLOGIST     ("Ophtalmologist",      105),
    OTOLARYNGOLOGIST    ("Otolaryngologist",    106),
    PEDIATRICIAN        ("Pediatrician",        107),
    IMMUNOLOGIST        ("Immunologist",        108),
    GASTROENTEROLOGIST  ("Gastroenterologist",  109),
    SURGEON             ("Surgeon",             110),
    ;

    private final String specialization;
    private final int specializationCode;

    Specialization(String specialization, int specializationCode) {
        this.specialization = specialization;
        this.specializationCode = specializationCode;
    }

    public String getSpecialization(){
        return specialization;
    }

    public int getSpecializationCode(){
        return specializationCode;
    }

    public static Specialization getSpecializationByCode(int searchCode){
        Specialization result = null;
        for(Specialization specialization : Specialization.values()){
            if(specialization.getSpecializationCode() == searchCode){
                result = specialization;
            }
        }
        if(result == null){
            System.out.println("DEBUG. Not exist Specialization with code: " + searchCode);
        }
        return result;
    }

}
