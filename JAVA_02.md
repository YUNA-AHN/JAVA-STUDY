# JAVA_제어문

작성 일시: 2023년 9월 18일 오후 11:37

## 04-01 IF문

> if 문과 else 문의 기본구조
비교 연산자
and / or / not 연산자
contains
else if
> 

### if 문과 else 문의 기본 구조

조건문은 참과 거짓을 판단하는 문장

```java
if (조건문) {
    <수행할 문장1>;
    <수행할 문장2>;
    ...
} else {
    <수행할 문장A>;
    <수행할 문장B>;
    ...
}
```

![Untitled](JAVA_%E1%84%8C%E1%85%A6%E1%84%8B%E1%85%A5%E1%84%86%E1%85%AE%E1%86%AB%20106151f24345406eb0788deb6d1ead60/Untitled.png)

### 비교 연산자

조건 / 판단에 사용

| 비교 연산자 | 설명 |
| --- | --- |
| x < y | x가 y보다 작다 |
| x > y | x가 y보다 크다 |
| x == y | x와 y가 같다 |
| x ≠ y | x와 y가 같지 않다 |
| x ≥ y | x가 y보다 크거나 같다 |
| x ≤ y | x가 y보다 작거나 같다 |

```java
int x = 3;
int y = 2;
System.out.println(x > y);
// true 출력
```

```java
// "만약 3000원 이상의 돈을 가지고 있으면 택시를 타고 그렇지 않으면 걸어가라"

int money = 2000;
if (money >= 3000) {
    System.out.println("택시를 타고 가라");
}else {
    System.out.println("걸어가라");
}

// 걸어가라 출력
```

### and / or / not 연산자

조건 /  판단에 사용

| 연산자 | 설명 |
| --- | --- |
| x && y | x와 y 모두 참이어야 참이다 |
| x || y | x와 y 둘 중 하나가 참이면 참이다 |
| !x | x가 거짓이면 참이다 |

```java
// "돈이 3000원 이상 있거나 카드가 있다면 택시를 타고 그렇지 않으면 걸어가라"

int money = 2000;
boolean hasCard = true;

if (money>=3000 || hasCard) {
    System.out.println("택시를 타고 가라");
} else {
    System.out.println("걸어가라");
}

// 택시를 타고 가라 출력
```

### contains

List 자료형에 해당 아이템이 있는지 조사하는 메서드

*조건문에 특히 많이 활용*

```java
// "만약 주머니에 돈이 있으면 택시를 타고, 없으면 걸어가라“

ArrayList<String> pocket = new ArrayList<String>();
pocket.add("paper");
pocket.add("handphone");
pocket.add("money");

if (pocket.contains("money")) {
    System.out.println("택시를 타고 가라");
}else {
    System.out.println("걸어가라");
}

// 택시를 타고 가라 출력
```

*>> pocket.contains(”money”)가 참이되어 ‘택시를 타고 가라’가 출력*

### else if

if와 else만으로는 다양한 조건 / 판단을 하기 어려움

여러 조건을 판단할 수 있게 하는 else if 문 존재

```java
// "지갑에 돈이 있으면 택시를 타고, 지갑엔 돈이 없지만 카드가 있으면 택시를 타고, 돈도 없고 카드도 없으면 걸어가라“

boolean hasCard = true;
ArrayList<String> pocket = new ArrayList<String>();
pocket.add("paper");
pocket.add("handphone");

if (pocket.contains("money")) {
    System.out.println("택시를 타고 가라");
}else if(hasCard) {
    System.out.println("택시를 타고 가라");
}else {         
    System.out.println("걸어가라");
}

// 택시를 타고 가라 출력
```

else if 는 이전 조건문이 거짓일 때 수행

*>> pocket.contains(”money”) 조건이 거짓이므로 else if문 수행,  hasCard 조건은 true*

![Untitled](JAVA_%E1%84%8C%E1%85%A6%E1%84%8B%E1%85%A5%E1%84%86%E1%85%AE%E1%86%AB%20106151f24345406eb0788deb6d1ead60/Untitled%201.png)

*else if 는 갯수에 제한 없이 사용 가능 !!*

![Untitled](JAVA_%E1%84%8C%E1%85%A6%E1%84%8B%E1%85%A5%E1%84%86%E1%85%AE%E1%86%AB%20106151f24345406eb0788deb6d1ead60/Untitled%202.png)

## 04-02 SWITCH / CASE 문

**if 문과 비슷하지만 좀 더 일정한 형식이 있는 조건 /  판단문**

switch / case 문의 구조

```java
switch(입력변수) {
    case 입력값1: ...
         break;
    case 입력값2: ...
         break;
    ...
    default: ...
         break;
}
```

*입력 변수의 값과 일치하는 case 입력값 ( 입력값1 , 입력값2, .. )이 있다면, 해당 case 문에 속한 문장들이 실행*

*case 문마다 break라는 문장이 있는데 해당 case 문을 실행한 뒤 switch 문을 빠져나가기 위함*

*만약 break 문이 빠져있다면 그 다음의 case 문에 속한 문장들이 실행*

```java
public class Sample {
    public static void main(String[] args) {
        int month = 8;
        String monthString = "";
        switch (month) {  // 입력 변수의 자료형은 byte, short, char, int, enum, String만 가능하다.
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);
    }
}

// August  출력
```

>> switch문의 입력이 1이면 January라는 문자열이, 12면 December라는 문자열 출력

>> 위 예제의 경우 month가 8로 고정되어 있기 때문에 August가 출력

>> **switch문은 month의 값이 1이면 case 1: 문장이 실행… 이런식으로 수행**

>> 만약 month에 1에서 12 사이의 숫자가 아닌 다른 값이 저장되어 있다면 default: 문장이 수행

***입력값이 정형화되어 있는 경우 if 문보다는 switch / case 문을 쓰는 것이 코드 가독성을 높임***

## 04-03 while 문

> while 문의 기본 구조
무한 루프란?
while 문 빠져나가기 - break
while 문으로 돌아가기 - continue
> 

### while 문의 기본 구조

조건문이 참인 동안 while 문이 수행할 문장들을 반복하여 수행

```java
while (조건문) {
    <수행할 문장1>;
    <수행할 문장2>;
    <수행할 문장3>;
    ...
}
```

![Untitled](JAVA_%E1%84%8C%E1%85%A6%E1%84%8B%E1%85%A5%E1%84%86%E1%85%AE%E1%86%AB%20106151f24345406eb0788deb6d1ead60/Untitled%203.png)

```java
// 열번 찍어 안 넘어가는 나무 없다 코드

int treeHit = 0;
while (treeHit < 10) {
    treeHit++;  // treeHit += 1 로도 표현 가능
    System.out.println("나무를  " + treeHit + "번 찍었습니다.");
    if (treeHit == 10) {
        System.out.println("나무 넘어갑니다.");
    }
}

/*
나무를  1번 찍었습니다.
나무를  2번 찍었습니다.
나무를  3번 찍었습니다.
나무를  4번 찍었습니다.
나무를  5번 찍었습니다.
나무를  6번 찍었습니다.
나무를  7번 찍었습니다.
나무를  8번 찍었습니다.
나무를  9번 찍었습니다.
나무를  10번 찍었습니다.
나무 넘어갑니다.
*/
```

while 문의 조건문 : treeHit < 10

*( treeHit++과 같이 변수와 ++의 조합은 자주 등장 !! treeHit의 값을 1만큼씩 증가시킨다는 의미 )*

### 무한루프란?

**무한 루프 ( loop ) : 무한히 반복**

*자바에서 무한 루프는 while 문으로 구현할 수 있음 ! ( 상당히 자주 사용되는 개념 )*

```java
while (true) {    
    <수행할 문장1>;
    <수행할 문장2>;
    ...
}
```

>> 조건 자체가 true이므로 조건문은 항상 참이 된당

### while 문 빠져나가기 - break

while 문 안의 내용을 반복하여 수행할 때, 강제로 while 문을 빠져나가야 할 때도 있음

```java
int coffee = 10;
int money = 300;

while (money > 0) {
    System.out.println("돈을 받았으니 커피를 줍니다.");
    coffee--;
    System.out.println("남은 커피의 양은 " + coffee + "입니다.");
    if (coffee == 0) {
        System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
        break;
    }
}
```

>> money가 300으로 고정되어 있으므로 while 조건문이 항상 참 ( 무한 루프 )

>> if (coffee == 0) 조건문의 문장이 참이 되면 break가 호출되어 while문을 빠져나감

### while 문으로 돌아가기 - continue

while 문의 맨 처음, 즉 조건문으로 돌아가게 하고 싶은 경우도 있음

```java
int a = 0;
while (a < 10) {
    a++;
    if (a % 2 == 0) {
        continue;  // 짝수인 경우 조건문으로 돌아간다.
    }
    System.out.println(a);  // 홀수만 출력된다.
}

// 1 3 5 7 9 출력
```

*>> a가 짝수인 경우 continue 문장이 수행 ( while 문의 맨 처음 조건문인 a < 10으로 돌아가게 함 )*

## 04-04 FOR문

> for 문의 기본 구조
for 문으로 돌아가기 - continue
이중 for 문
> 

### for 문의 기본 구조

*for 문은 세미콜론 ;을 구분자로 나눔*

예) numbers 배열의 첫 번째 요소부터 마지막 요소까지 출력

```java
String[] numbers = {"one", "two", "three"};
for(int i=0; i<numbers.length; i++) {
    System.out.println(numbers[i]);
}

// one two three
```

학생들의 합/불을 알려주는 for문 코드 작성해보기

```java
// “총 5명의 학생이 시험을 보았는데 시험점수가 60점이 넘으면 합격이고 그렇지 않으면 불합격이다. 합격, 불합격을 판단하여 출력하시오.”

int[] marks = {90, 25, 67, 45, 80};
for(int i=0; i<marks.length; i++) {
    if (marks[i] >= 60) {
        System.out.println((i+1)+"번 학생은 합격입니다.");
    }else {
        System.out.println((i+1)+"번 학생은 불합격입니다.");
    }
}

/*
1번 학생은 합격입니다.
2번 학생은 불합격입니다.
3번 학생은 합격입니다.
4번 학생은 불합격입니다.
5번 학생은 합격입니다.
*/
```

### for 문으로 돌아가기 - continue

while 문에서 살펴본 continue는 for 문에서도 동일하게 적용

for 문 안의 문장을 수행하는 도중에 continue 문을 만나면 for 문의 처음으로 돌아감

```java
int[] marks = {90, 25, 67, 45, 80};
for(int i=0; i<marks.length; i++) {
    if (marks[i] < 60) {
        continue;  // 조건문으로 돌아간다.
    }
    System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
}

/*
1번 학생 축하합니다. 합격입니다.
3번 학생 축하합니다. 합격입니다.
5번 학생 축하합니다. 합격입니다.
*/
```

*>> 점수가 60 미만인 학생은 marks[i] < 60이 참이 되어 continue문이 수행*

**마찬가지로, for 문 안에서 break를 만나면 for 문을 벗어남**

### 이중 for 문

for 문을 두 번 사용하여 간단한 구구단 출력하기

```java
for(int i=2; i<10; i++) {
    for(int j=1; j<10; j++) {
        System.out.print(i*j+" ");
    }
    System.out.println("");  // 줄을 바꾸어 출력하는 역할을 한다.
}
```

추가 ) System.out.print와 System.out.printIn 구분
System.out.print : 줄바꿈 문자 \n을 포함하지 않고 출력
System.out.printIn : 마지막에 줄바꿈 문자 \n을 포함하여 출력

## 04-05 FOR EACH문

for 문을 이용한 추가된 문법임 ( 조건문의 문법이 기존과 좀 다름 )

```java
for (type 변수명: iterate) {
    body-of-loop
}
```

위의 for 문 예시 코드를 for each 코드로 수정할 수 있음

```java
String[] numbers = {"one", "two", "three"};
for(String number: numbers) {
    System.out.println(number);
}

// one two three
```

- iterate는 루프를 돌릴 객체,  iterate 객체에서 **한 개씩 순차적**으로 변수명에 대입되어 for문 수행
- iterate에 사용할 수 있는 자료형은 **루프를 돌릴 수 있는 자료형( 배열 /  ArrayList 등 )만 가능**
- 변수명의 type(자료형)은 iterate 객체에 포함된 자료형과 일치해야 함
- for each 문은 따로 반복 횟수를 명시적으로 주는 것이 불가능하고,
**한 단계씩 순차적으로 반복할 때만 사용이 가능하다는 제약**이 있음

```java
// ArrayList로 구현 > for문 사용법은 String[] 배열 사용할 때와 동일

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one", "two", "three"));
        for (String number : numbers) {
            System.out.println(number);
        }
    }
} 

// one two three
```