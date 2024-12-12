package racing;

import java.util.Random;
import java.util.Scanner;

public class OldApplication {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();
        // "a,b,c"
        // .split(",")
        // ["a", "b", "c"]
//        List<String> 자동차이름들 = List.of(name.split(","));
//        System.out.println(자동차이름들);

        // 시행 횟수 입력
//        System.out.print("시행 횟수: ");
//        int 시행횟수 = Integer.parseInt(scanner.nextLine());

        // 입력 받았다고 가정
        String 자동차이름 = "tesla";
        int 이동거리 = 0;
        int 시행횟수 = 5;

        // 게임 진행
        // 숫자가 랜덤으로 나와야 한다
        Random random = new Random();
        int 주사위값 = random.nextInt(6) + 1; // 1 ~ 6

        System.out.println("이동하세요" + 주사위값);
        //자동차 이름을 입력하면 랜덤으로 숫자를 뽑고 그만큼 전진해야함

        // 주사ㅊㅁ위값이 3 이상이면
        //     이동거리 1 증가


        for (int i = 0; i < 시행횟수; i++) {
            if(주사위값 > 3){
                이동거리 = 이동거리 +1;
            }
        }




        //자동차 마다 각자  이동하는 횟수가 저장되려면 클라스에 만들고 작동이 되는지 여기에 시험해봐야해
        for (int i = 0; i < 시행횟수 ; i++) {
            System.out.println("시행 횟수: " + (i + 1));


        }

            if(주사위값 >= 1 && 주사위값 <= 6 ){
                System.out.println("시행횟수:"+시행횟수);

                //저 랜덤한 주사위 값 만큼 - 기호가 늘어났으면 좋겠는데 뭐더라
                //그게 되면 가장 큰 값이 나왔을때 종료하는 작동이 멈추는 방법이있을까
                //최대값을 쓸대 사용하는 함수 max를 활용해야 되는거겠지..?



            }


        }





        //레이스에 참가할 자동차들의 이름을 쉼표(,)로 구분하여 입력하세요.

        //: Hyundai,Porsche,Toyota 몇 회 시행할까요?: 5

//        length가 10자 이내로
//        if(){
//            throw IllegalArgumentException("10자 이내로 입력하십시오")
//
//
//        }


//        1)글자수가 10를 넘어가면 저놈의 Illega.. 어쩌구 하는거 작동하게 하는 조건 만들고 싶음
//                2)횟수제한 그거 어떻게 하는건데 게임횟수 4번만 진행할수 있게 하고 싶음
//                3)자동차가 랜덤한 숫자를 뽑아서 그만큼 전진하게 하려면 어떤 코드를 활용해야될까?
//                4)가장 많이 전진한 횟수가 나오면 게임이 멈췄으면 좋겠어






    }


