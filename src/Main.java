

public class Main {
    public static void main(String[] args) {
        basicStructure audi =new basicStructure();

        audi.color="black";
        audi.model="A3";
        audi.power="5000cc";

        Engine x =new Engine();
        x.cylinders="8";
        x.size="A3";
        x.weigh="6453k";

        lights neon = new lights();
        neon.color="red";
        neon.size="15cm";
        neon.intensity="7675lumin";
        
    }
}