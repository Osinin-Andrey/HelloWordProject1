package by.osinin.classwork.lesson9.doctor;

public class Patient {
    private String name;
    private String age;


    //это то, к какому врачу собираемся отправить пациента
    private int medicalPlan;



    public Patient(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Patient() {
    }

    public int getMedicalPlan() {
        return medicalPlan;
    }

    public void setMedicalPlan(int medicalPlan) {
        this.medicalPlan = medicalPlan;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
        //для вывода инфы о пациенте
    }
}
