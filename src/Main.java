public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 95; //Масса в кг
        int height = 180; //Рост в см

        String bodyMassIndex;

        bodyMassIndex = service.calculate(weight, height);
        System.out.println(bodyMassIndex);


    }
}