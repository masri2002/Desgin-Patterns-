package org.digitnary.traning.singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler instance;
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
    public static ChocolateBoiler getInstance() {
        if(instance==null){
            instance = new ChocolateBoiler();
        }
        return instance;
    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
    public void fill() {
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }
    public void drain() {
        if(!isEmpty()&&isBoiled()){
            empty = true;
        }
    }
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }


}
