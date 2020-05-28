# Vending Machine

## 0.개요

이 프로젝트는 대학교 중간고사 대체 과제로써 Vending Machine(자판기)를 TDD로 구현하는 과정을 나타낸다.구현하려는 자판기는 현실 세계에서도 흔히 볼 수 있는 커피 자판기이다.



## 1. nothing()

테스트 작성을 위한 설정이 제대로 되어있는지 확인하기 위해 아무것도 없는 nothing이라는 테스트로 시작



## 2. canCreateVendingMachine

가장 쉽고(간단하고) 흥미로운 테스트부터 작성하도록 한다.

### 2.1 add failing test

```java
    @Test
    public void canCreateVendingMachine() {
        VendingMachine machine = new VendingMachine();
    }
```

### 2.2 make it pass

src/main/java 밑에 VendingMachine 클래스를 생성



## 3. Terminate VendingMachine

terminateMachine(String text) 호출하면 Vending Machine이 종료될 수 있도록 한다.

### 3.1 add failing test

```java
 @Test
    public void 자판기_종료() {
        machine.terminateMachine("0");
    }
```

### 3.2 make it pass



## 4. insertMoney

insertMoney(int money) 호출하면 Vending Machine에 돈이 입력될 수 있도록 한다.

### 4.1 add failing test

```java
@Test
    public void 돈을_투입() {
        machine.insertMoney(2);
    }
```

### 4.2 make it pass



## 5. getMoney

