package by.osinin.classwork.lesson9.doctor;

import java.util.Random;

public class Ambulance {
    public static void main(String[] args) {

//        Patient knowPatient = new Patient("Vasya Pupkin", "23");
//        Patient unknowPatient = new Patient();
        //1- создать пациентов
        Patient[] patients = getPatient();
        for (Patient patient : patients) {
            //2- прописать им план лечения
            setMedicalPlan(patient);
            //3 - выделить доктора
            Doctor Doctor = getDoctorToPatient(patient);
            //4 - вылечить
            Doctor.heal();
        }

//        //2- прописать им план лечения
//        setMedicalPlan(knowPatient);
//        setMedicalPlan(unknowPatient);
//
//        Doctor secondDoctor = getDoctorToPatient(unknowPatient);
//
//        secondDoctor.heal();

//        String p = "0";
//        increment(p);
//        System.out.println(p);


    }

    /**
     * We give a doctor to Patient,
     * if medicalPlan = 1 - we give Terapist,
     * if medicalPlan = 2 - we give Dentist
     * else - we give Surgeon
     *
     * @param patient - current Patient
     * @return - needed type of Doctor
     */
    private static Doctor getDoctorToPatient(Patient patient) {
        if (patient.getMedicalPlan() == 1) return new Terapist();
        if (patient.getMedicalPlan() == 2) return new Dentist();
        return new Surgeon();
    }

    /**
     * set different medical plans to patient
     *
     * @param patient - current patient
     */
    private static void setMedicalPlan(Patient patient) {
        if (patient.getName() == null) {
            patient.setMedicalPlan(1);
        } else {
            Random random = new Random();
            patient.setMedicalPlan(random.nextInt(3));
        }

    }

    private static Patient[] getPatient() {
        Patient[] patients = new Patient[2];
        patients[0]  = new Patient("Vasya Pupkin", "23");
        patients[1] = new Patient();
        return patients;
    }

//    private static void increment(String param){
//        param = param +1;
//    }
}
