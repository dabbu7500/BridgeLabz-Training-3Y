public class HospitalSystem{

    public static void main(String[] args) {
        Patient p1=new InPatient("dabbu",20,105);
        Patient p2 =new OutPatient("naveen",22 , "20-05-2025");
        p1.getPatientInfo();
        p2.getPatientInfo();

        
        Doctor d1 = new Doctor("Dr. Smith", "Cardiology");
        d1.displayInfo();

        
        Bill bill = new Bill(5000, 10, 5); 
        System.out.println("Final Bill: " + bill.calculatePayment());
    }
}



class Patient{
    private String name;
    private int age;
    private String medicalHistroy;
    private boolean emergency;
    
    Patient(String name ,int age){
        this.name=name;
        this.age=age;
        this.emergency=false;
    }
    Patient(String name ,int age ,boolean emergency )
    {
        this.name=name;
        this.age=age;
        this.emergency=emergency;
    }

    public String getMedicialHistory(){
            return medicalHistroy;
        
    }
    public void setMedicalHistory(String medicalString)
    {
        this.medicalHistroy=medicalHistroy;
    }

    public String getSummry()
    {
        return "patient ="+name+" age = "+age+(emergency?"Emergency":"");
    }
    public void getPatientInfo()
    {
        System.out.println(getSummry());
    }
}

class InPatient extends Patient{
    private int roomNo;
    InPatient(String name,int age ,int roomNo)
    {
        super(name,age);

        this.roomNo=roomNo;
    }
    @Override
    public void getPatientInfo()
    {
        System.out.println(getSummry()+"roomNo ="+roomNo);
    }
}

class OutPatient extends Patient{
    private String AppointmentDate;
    OutPatient(String name,int age,String AppointmentDate) 
    {
        super(name,age);
        this.AppointmentDate=AppointmentDate;
    }
    @Override
    public void getPatientInfo()
    {
        System.out.println(getSummry()+"AppointmentDate = "+AppointmentDate);
    }
}   

class Doctor{
    private String name;
    private String specialization;
    Doctor(String name,String specialization)
    {
        this.name=name;
        this.specialization = specialization;
    }

    public void displayInfo(){
        System.out.println("Docter = "+name+"specialization = "+specialization );
    }
}

interface Payable{
    public double calculatePayment();
}
class Bill implements Payable{
    private double amt;
    private double discount;
    private double tax;
    Bill(double amt,double discount,double tax)
    {
        this.tax=tax;
        this.amt=amt;
        this.discount=discount;
    }
    @Override
    public double calculatePayment()
    {
        double discountedAmt=amt-(amt*discount/100);
        double finalAmt=discountedAmt+(discountedAmt*tax/100);
        return finalAmt;
    }

}