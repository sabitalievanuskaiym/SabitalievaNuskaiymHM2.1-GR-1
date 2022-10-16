public class Main {
    public static void main(String[] args) {
        createObject("Redmi");
        System.out.println("-------------------------");
        createObject("Samsung");
        System.out.println("-------------------------");

        createObject("Iphone");
    }

    public static String createObject(String className) {
        switch (className) {
            case "Samsung":
                Samsung samsung = new Samsung();
                samsung.name = "Samsung";
                samsung.model = "SM_44";
                System.out.println(samsung.print());
                break;
            case "Redmi":
                Redmi redmi = new Redmi();
                redmi.name = "Redmi";
                redmi.CPU = "Octa-core";
                System.out.println(redmi.print());
                break;
            case "Iphone":
                Iphone iphone = new Iphone();
                iphone.name = "Iphone";
                iphone.storage = "128GB";
                System.out.println(iphone.print());
                break;
        }
        return className;

    }
}