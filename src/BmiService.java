public class BmiService {

    public String calculate(int weight, int height){
        String bodyMassIndex;
        if(weight <= 0 | weight > 300){
            bodyMassIndex = "Неверный вес";
        }
        else if(height <= 30 | height > 230){
            bodyMassIndex = "Неверный рост";
        }
        else{
            double bodyMassIndexDouble = weight * 10_000 / Math.pow(height, 2);
            bodyMassIndexDouble = (double) ((int) (bodyMassIndexDouble * 100)) / 100;
            bodyMassIndex = String.valueOf(bodyMassIndexDouble);
            if(bodyMassIndexDouble <= 17){
                if(bodyMassIndexDouble <= 16){
                    bodyMassIndex = "Ваш Индекс Массы Тела составляет " + bodyMassIndex + ". У вас выраженный дефицит массы тела.";
                }
                else{
                    bodyMassIndex = "Ваш Индекс Массы Тела составляет " + bodyMassIndex + ". У вас недостаточный (Дефицит) массы тела";
                }
            }
            else if(bodyMassIndexDouble > 17 & bodyMassIndexDouble <= 30){
                if(bodyMassIndexDouble <= 25){
                    bodyMassIndex = "Ваш Индекс Массы Тела составляет " + bodyMassIndex + ". Ваш вес в норме ";
                }
                else{
                    bodyMassIndex = "Ваш Индекс Массы Тела составляет " + bodyMassIndex + ". У вас избыточная масса тела (Предожирение).";
                }
            }
            else{
                if(bodyMassIndexDouble <= 36){
                    bodyMassIndex = "Ваш Индекс Массы Тела составляет " + bodyMassIndex + ". У вас ожирение 1 степени.";
                }
                else if(bodyMassIndexDouble <= 41){
                    bodyMassIndex = "Ваш Индекс Массы Тела составляет " + bodyMassIndex + ". У вас ожирение 2 степени.";
                }
                else{
                    bodyMassIndex = "Ваш Индекс Массы Тела составляет " + bodyMassIndex + ". У вас ожирение 3 степени.";
                }
            }
        }

        return bodyMassIndex;
    }
}