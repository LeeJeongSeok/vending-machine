# Vending Machine

## 0. 개요

이 프로젝트는 대학교 중간고사 대체 과제로써 Vending Machine(자판기)를 TDD로 구현하는 과정을 나타낸다.구현하려는 자판기는 현실 세계에서도 흔히 볼 수 있는 커피 자판기이다.

## 1. 내용

### 주제 

- 커피 자판기

### 조건

- 콘솔창에서 실행
- 제품목록과 금액을 Display함
- 돈을 투입하고 제품을 선택하면 제품과 잔돈이 반환됨

## 2. 정의

- 자판기(VendingMachine), 사용자(User), 안내문(Comment) 클래스를 기능에 맞게 설계한 후 Main 클래스에서 순서대로 호출해 작성하는 방식이다.

### 2-1 VendingMachine

- selectDrink()
- currentAmount()
- pay()
- returnChange()

### 2-2 User

- insertCoinToMachine()
- orderBeverageToMachine();
- payment()
- makingBeverage()
- returnChange()

### 2-3 Comment

- 콘솔창에서 실행하는 프로그램이다 보니 System.out.println()호출 하는 부분이 상당히 많기에 그 부분만 따로 빼서 만들어 놓은 클래스이다.

### 2-4 프로젝트 구조

```
.
├── main
│   ├── java
│   │   └── com
│   │       └── lee
│   │           └── practice
│   │               ├── Comment.java
│   │               ├── Main.java
│   │               ├── User.java
│   │               └── VendingMachine.java
│   └── resources
└── test
    ├── java
    │   └── com
    │       └── lee
    │           └── practice
    │               ├── UserTest.java
    │               └── VendingMachineTest.java
    └── resources
```



## 3. 주요기능

- 사용자 입력을 위한 Scanner 사용
- 현실세계처럼 음료를 주문하면 그에 걸맞는 시간이 걸리듯이 프로그램상에서 길지는 않지만 나름 짧게라도 구현하기 위해 Timer, TimerTask 사용



## 4.테스트 코드 작성

- [백명석님의 CleanCode 강의](https://www.youtube.com/watch?v=wmHV6L0e1sU&t=13s) 를 참고하여 TDD를 작성해봤지만 역시나 쉽지 않았다. VendingMachine은 테스트 코드를 어느 정도 작성했지만, UserTest 테스트 코드는 작성하지 못했다.

  

