package Exam.Part3.Phone;

public class PhoneFunc
{
    private int number;
    private String model;
    private double weight;

    public PhoneFunc(int number, String model, double weight) {
        this.number=number;
        this.model=model;
        this.weight=weight;
    }
    public PhoneFunc(int number, String model){
        this.number=number;
        this.model=model;
    }
    public PhoneFunc() {
    }

    public int  getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number=number;
    }

    public double  getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight=weight;
    }

    public String  getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model=model;
    }
    public void  receiveCall()
    {
        System.out.println("Телефонує"+' '+getNumber());
    }
}
