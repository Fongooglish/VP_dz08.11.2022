import java.io.IOException;
import java.util.ArrayList;

public class Main  implements TxtWriter  {
    public static void main(String[] args) throws IOException {
        Dogs dog1 = new Dogs();
        dog1.setName("Spike");
        dog1.setAge(6);
        dog1.setWeight(15);

        dog1.voice();
        System.out.println(dog1);
        ArrayList<Dogs> dogsList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Dogs tempDog = new Dogs();
            tempDog.setName("DOG" + i);
            dogsList.add(i, tempDog);
        }
        for (Dogs x: dogsList) {
            System.out.println(x);
        }
        System.out.println("создание экземпляров объектов закончено!");

       TxtWriter.writeTxt(dogsList);
        System.out.println("объекты записаны в файл!");

    }
}