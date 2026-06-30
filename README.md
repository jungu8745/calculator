# Calculator

## 과제 소개

Java를 활용하여 만든 계산기 프로그램입니다.

기본 사칙연산 기능부터 원 넓이 연산 기능까지 구현하였고 클래스 분리, 캡슐화, 상속, 책임 분리(SRP), 개방 폐쇄 원칙(OCP)을 적용하며 계산기 구조를 구현했습니다.



## 사용 기술

- Java
- IntelliJ IDEA
- Git / GitHub


## 주요 기능

### Level 1
- Scanner를 활용한 사용자 입력
- 사칙연산 계산
- 반복 계산 기능
- `exit` 입력 시 종료
- 계산 결과 저장
- 결과 삭제 (`remove`)
- 결과 조회 (`inquiry`)


### Level 2

#### Calculator 클래스 분리
- 계산 기능과 결과 저장 기능 분리
- 예외 처리 적용

#### 캡슐화
- 결과 저장 컬렉션 private 처리
- Getter / Setter 구현

#### 생성자 활용
- 객체 생성 시 결과 저장 컬렉션 초기화

#### 원 넓이 계산 기능
- 반지름 입력 후 원의 넓이 계산
- 원 넓이 결과 저장 및 조회

#### 상속 구조 적용

Calculator | Arithmetic Circle / Calculator Calculator


## 객체지향 적용

### SRP (단일 책임 원칙)

사칙연산 각각의 역할을 분리했습니다.

- AddOperator
- SubtractOperator
- MultiplyOperator
- DivideOperator
- ModOperator


### OCP (개방 폐쇄 원칙)

새로운 연산 기능 추가 시 기존 계산기 코드를 수정하지 않고
새로운 Operator 클래스를 추가하는 방식으로 확장 가능하도록 구현했습니다.


## 예외 처리

- 0으로 나누는 경우 예외 발생
- 잘못된 연산자 입력 시 예외 처리