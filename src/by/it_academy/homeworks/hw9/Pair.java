package by.it_academy.homeworks.hw9;

public class Pair <T, F>{
    private T firstElem;
    private F lastElem;

    public Pair(T firstElem, F lastElem) {
        this.firstElem = firstElem;
        this.lastElem = lastElem;
    }

    public T first(){
        return this.firstElem;
    }

    public F last(){
        return this.lastElem;
    }

    public Pair<F,T> swap(){

        return new Pair<>(this.lastElem,this.firstElem);
    }

    public void replaceFirst(T newEl){
        this.firstElem = newEl;
    }
    public void replaceLast(F newEl){
        this.lastElem = newEl;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstElem = " + firstElem +
                ", secondElem = " + lastElem +
                '}';
    }
}
