package by.it_academy.homeworks.hw6;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(){}
    public Phone(String number, String model, int weight){
        this.model = model;
        this.number = number;
        this.weight = weight;
    }
    public String getNumber(){
        return this.number;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " по номеру телефона " + number);
    }

}
