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
        System.out.println();
    }
    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " по номеру телефона " + number);
        System.out.println();
    }
    public void sendMessage(String...numbers){
        int length = numbers.length;
        for(String number : numbers){
            System.out.println(number);
        }
        System.out.println();
    }
    public void printInfo(){
        System.out.println("Phone model: " + this.model);
        System.out.println("Phone weight: " + this.weight);
        System.out.println("Phone number: " + this.number);
        System.out.println();
    }

}
