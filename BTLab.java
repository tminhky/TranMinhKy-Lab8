package Buoi8VD;
abstract class Xemay {
    abstract void brake();
}
class Xemaythethao extends Xemay {
    public void brake(){
        System.out.println("Dung xe");
    }
}
class Xemayleonui extends Xemay {
    public void brake(){
        System.out.println("Dung xe");
    }
}
 class Main {
    public static void main(String[] args) {
    Xemaythethao xe = new Xemaythethao();{
    xe.brake();
    }
    }
}


