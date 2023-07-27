package src;

public class AndoridApp extends App {

    public AndoridApp(String name) {
        super(name);
    }

    public static void main(String[] args) {
        AndoridApp an = new AndoridApp("Andorid");
        an.AppInfo("Android");
    }

    public void AppInfo(String name){
        System.out.println("Nazwa po nadpisaniu");
    }
}

