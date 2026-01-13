package org.example;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"가위", "바위", "보"};

        System.out.println("0,1,2중 하나를 고르시오");
        int userChoice = scanner.nextInt();

        // 컴퓨터의 선택 (0~2 사이의 랜덤 숫자)
        int computerChoice = random.nextInt(3);

        System.out.println("나의 선택: " + options[userChoice]);
        System.out.println("컴퓨터의 선택: " + options[computerChoice]);

//        // 승패 로직
//        if (userChoice == computerChoice) {
//            System.out.println("결과: 비겼습니다!");
//        } else if ((userChoice == 0 && computerChoice == 2) ||
//                (userChoice == 1 && computerChoice == 0) ||
//                (userChoice == 2 && computerChoice == 1)) {
//            System.out.println("결과: 당신이 이겼습니다! 축하합니다.");
//        } else {
//            System.out.println("결과: 컴퓨터가 이겼습니다. 아쉽네요!");
//        }

        int result = userChoice - computerChoice;
        switch (result) {
            case 0:
                System.out.println("결과: 비겼습니다!");
                break;
            case -2:
                System.out.println("결과: 당신이 이겼습니다! 축하합니다.");
                break;
            case 1:
                System.out.println("결과: 당신이 이겼습니다! 축하합니다.");
                break;
            default:
                System.out.println("결과: 컴퓨터가 이겼습니다. 아쉽네요!");
        }

        scanner.close();
        // switch 문으로도 바꿀 수 있는데 해볼사람
    }
    }