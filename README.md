# Vending Machine

## 0. 개요

이 프로젝트는 대학교 중간고사 대체 과제로써 Vending Machine(자판기)를 TDD로 구현하는 과정을 나타낸다.구현하려는 자판기는 현실 세계에서도 흔히 볼 수 있는 커피 자판기이다.

## 1. 내용

### 주제 

- 커피 자판기

### 조건

- 콘솔창에서 실행
- 제품목록과 금액을 Display함
- 돈을 투입하고 제품을 ㅅ너택하면 제품과 잔돈이 반환됨

## 2. 주요기능

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