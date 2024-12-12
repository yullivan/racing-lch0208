package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {
    public static void main(String[] args) {

        List<String> 이름목록 = List.of("현대", "포르쉐");
        이름목록.add("포르쉐");
        이름목록.add("현대");
        // -> List<Car>
        // new Car("현대", 0);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("포르쉐",0));
        cars.add(new Car("현대",0));

        Random random = new Random();
        int 주사위값 = random.nextInt(6) + 1;

        int 시행횟수 = 5;
        for (int i = 0; i < 시행횟수 ; i++) {
            if(주사위값 >3){
                cars.equals();
            }

        }



        //리스트에 자동차들의 이름과 이동거리를 한번에 포함시키고 싶은거잖아


    }
}
