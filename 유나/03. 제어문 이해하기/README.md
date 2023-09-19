# 03.제어문
# 03-01 if문
조건을 판단하여 해당 조건에 맞는 상황을 수행하는데 쓰이는 것  

ex) 돈이 있다
- yes : 택시를 탄다
- no : 걸어간다.
```java
public class sample0401 {
	public static void main(String[] args) {
		boolean money = true;
		if (money) {
			System.out.println("택시를 타고 가라");
		} else {
			System.out.println("걸어가라");
		}
	}
}
```
## if문과 else문의 기본 구조
조건문ㅇ 참이면 if 문에 속한 문장들을 수행하고, 조건문이 거짓이면 else문에 속한 문장을 수행한다.
- 즉, 조건문은 참과 거짓을 찬단하는 문장!
```java
if (조건문) {
    <수행할 문장1>;
    <수행할 문장2>;
} else{
    <수행할 문장A>;
    ...
}
```

## 비교 연산자
|비교 연산자|설명|
|:---|:---|
|x < y|x가 y보다 작다|
|x > y|x가 y보다 크다|
|x == y|x가 y보다 같다|
|x != y|x가 y보다 같지 않다|
|x >= y|x가 y보다 크거나 같다|
|x <=> y|x가 y보다 작거나 같다|

ex)
```java
public class sample0402 {
	public static void main(String[] args) {
		int x = 3;
		int y = 2;
		System.out.println(x > y); // true
		System.out.println(x < y); // false
		System.out.println(x == y); // true
		System.out.println(x != y); // false
	}
}
```
```java
public class sample0401 {
	public static void main(String[] args) {
		int money = 2000;
		if (money >= 3000) {
			System.out.println("택시를 타고 가라");
		} else {
			System.out.println("걸어가라");
		}
	}
}
```
```
걸어가라
```

## and, or, not 연산자
|연산자|설명|
|:---|:---|
|x && y|x와 y 모두 참이어야 참이다|
|x || y|x와 y 둘 중 적어도 하나가 참이면 참이다|
|!x|x가 거짓이면 참이다|


"돈이 3000원 이상 있거나 카드가 있다면 택시를 타고 그렇지 않으면 걸어가라"
```java
public class sample0403 {
	public static void main(String[] args) {
		int money = 2000;
		boolean hashCard = true;
		if (money >= 3000 || hashCard) {
			System.out.println("택시를 타고 가라");
		} else {
			System.out.println("걸어 가라");
		}
	}
}
```
```
택시를 타고 가라
```

## contains
List 자료형에 해당 아이템이 있는지 조사하는 메서드
- contains 메서드는 조건문에 많이 활용된다 !

"만약 주머니에 돈이 있으면 택시를 타고, 없으면 걸어가라“
```java
import java.util.ArrayList;
public class sample0404 {
	public static void main(String[] args) {
		ArrayList<String> pocket = new ArrayList<>();
		pocket.add("paper");
		pocket.add("phone");
		pocket.add("money");
		
		if (pocket.contains("money")) {
			System.out.println("택시를 타고 가라");
		} else {
			System.out.println("걸어 가라");
		}
	}
}
```

## else if
if, else, 그리고 else if
- 이전 조건문이 거짓일 때 수행된다.

"지갑에 돈이 있으면 택시를 타고, 지갑엔 돈이 없지만 카드가 있으면 택시를 타고, 돈도 없고 카드도 없으면 걸어가라“

```java
import java.util.ArrayList;

public class smaple0405 {
	public static void main(String[] args) {
		boolean hasCard = true;
		ArrayList<String> pocket = new ArrayList<>();
		pocket.add("paper");
		pocket.add("phone");
		
		if (pocket.contains("money")) {
			System.out.println("택시를 타고 가라");
		} else if (hasCard) {
			System.out.println("택시를 타고 가라");
		} else {
			System.out.println("걸어 가라");
		}
	}
}
```
```
택시를 타고 가라
```

# 03-02 switch/case문
일정한 형식이 있는 조건.판단문

입력 변수의 값과 일치하는 case 입력값이 있다면 해당 case 문에 속한 문장들이 실행된다.  
case문마다 break 문장 -> case문 실행 뒤 빠져나가기 위함
```java
switch(입력변수) {
    case 입력값1 : ...
        break;
    case 입력값2 : ...
        break;
    ...
    default: ...
        break;
}
```

### switch문 예시
입력이 1인 경우부터 12인 경우 가지 해당 월에 해당하는 단어 출력  
만약 이외의 값이 입력되었다면 deafult 문장 수행
- 입력값이 정형화되어 있는 경우 switch/case
> switch/case문은 if문으로 변경이 가능하지만 if문으로 작성된 모든 코드를 switch문으로 변경할 수는 없다.

```java
public class smaple0406 {
	public static void main(String[] args) {
		int month = 8;
		String monthString = "";
		switch (month) {
//		입력 변수의 자료형은 byte, short, char, int, enum, String 만 가능
		case 1: monthString = "January";
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
```
```
August
```

# 03-03 while문
while문은 문장을 반복해서 수행해야할 경우에 사용한다.

## while문의 기본 구조
```java
while (조건문) {
    <수행할 문장 1>;
    <수행할 문장 2>;
    <수행할 문장 3>;
    ...
}
```

나무 10번 찍기
- treeHit이 10보다 작은 동안에 문자 수행
- treeHit이 1씩 증가하여 조건문이 거짓이 되면 while문을 빠져 나온다.
```java
public class sample0407 {
	public static void main(String[] args) {
		int treeHit = 0;
		while (treeHit < 10) {
			treeHit++; // treeHit += 1로도 표현 가능
			System.out.println("나무를 "+ treeHit +"번 찍었습니다.");
			if (treeHit == 10) {
				System.out.println("나무 넘어갑니다.");
			}
		}
	}
}
```
```
나무를 1번 찍었습니다.
나무를 2번 찍었습니다.
나무를 3번 찍었습니다.
나무를 4번 찍었습니다.
나무를 5번 찍었습니다.
나무를 6번 찍었습니다.
나무를 7번 찍었습니다.
나무를 8번 찍었습니다.
나무를 9번 찍었습니다.
나무를 10번 찍었습니다.
나무 넘어갑니다.
```

## 무한 루프란?
무한히 반복한다는 의미!  

무한 루프의 기본적인 형태
- 조건문 자체가 true 이므로 조건문은 항상 참
- 무한하게 while문 내의 문장들을 수행한다.
- 실행 종료하려면 Ctrl-c
```java
while (true) {
    <수행할 문장1>;
    <수행할 문장2>;
}
```

## while문 빠져나가기 - break
while문을 강제로 멈춰야할 때 사용하는 것

자판기 커피가 다 떨어지면 판매중지하는 코드
```java
public class smaple0407 {
	public static void main(String[] args) {
		int coffee = 10;
		int money = 300;
		
		while (money > 0) {
			System.out.println("돈을 받았으니, 커피를 줍니다.");
			coffee--; // 1씩 감소
			System.out.println("남은 커피의 양은 "+ coffee +"입니다.");
			if (coffee == 0) {
				System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
				break;
			}
		}
	}
}
```
```
돈을 받았으니, 커피를 줍니다.
남은 커피의 양은 9입니다.
돈을 받았으니, 커피를 줍니다.
남은 커피의 양은 8입니다.
돈을 받았으니, 커피를 줍니다.
남은 커피의 양은 7입니다.
...
돈을 받았으니, 커피를 줍니다.
남은 커피의 양은 1입니다.
돈을 받았으니, 커피를 줍니다.
남은 커피의 양은 0입니다.
커피가 다 떨어졌습니다. 판매를 중지합니다.
```

## while문으로 돌아가기 - contine
while문 안의 문장을 수행할 때 어떤 조건을 검사해서 참이 아닌 경우 빠져나가지 않고, while의 맨 처음, 즉 조선문으로 돌아가게 하고 싶은 경우

1부터 10까지의 수 중에서 홀수만 출력
```java
public class sample0408 {
	public static void main(String[] args) {
		int a = 0;
		while (a < 10) {
			a++;
			if (a % 2 == 0) {
				continue; // 짝수라면, 조건문으로 돌아간다
			}
			System.out.println(a); // 홀수만 출력
		}
	}
}
```
```
1
3
5
7
9
```

# 03-04 for문
while문과 마찬가지로 문장을 반복해서 수행해야하는 경우

## for문의 기본 구조
세미콜론을 구분자로 세 부분으로 나누어진다.
```java
for (초기치; 조건문; 증가치;) {

}
```

- 초기값 : int i = 0
- 조건문 : i < numbers.length
- 중가값 : i++

> i값이 numbers의 개수보다 작은 동안 계속 i값을 1씩 증가시키면 for문 문장을 수행
```java
public class sample0409 {
	public static void main(String[] args) {
		String[] numbers = {"one", "two", "three"};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
```
```
one
two
three
```

“총 5명의 학생이 시험을 보았는데 시험점수가 60점이 넘으면 합격이고 그렇지 않으면 불합격이다. 합격, 불합격을 판단하여 출력하시오.”
- i 값이 0부터 시작하여 1씩 증가하며 for문 안의 문장들이 수행된다.
- 60점 미만이면 불합격, 60점 이상이면 합격 메시지 출력
- i가 marks 개수인 5보다 크게되면 중지
```java
public class sample0410 {
	public static void main(String[] args) {
		int[] marks = {90, 25, 67, 45, 80};
		for (int i=0; i<marks.length; i++) {
			if (marks[i] >= 60) {
				System.out.println((i+1)+"번 학생은 합격입니다.");
			} else {
				System.out.println((i+1)+"번 학생은 불합격입니다.");
			}
		}
	}
}
```
```
1번 학생은 합격입니다.
2번 학생은 불합격입니다.
3번 학생은 합격입니다.
4번 학생은 불합격입니다.
5번 학생은 합격입니다.
```

## for문으로 돌아가기 - continue
for문 안의 문장을 수행하는 도중에 contine 만나면 for문의 처음으로 돌아간다.
- 60점 이하면 메시지 출력 x하는 코드
```java
public class sample0410 {
	public static void main(String[] args) {
		int[] marks = {90, 25, 67, 45, 80};
		for (int i=0; i<marks.length; i++) {
			if (marks[i] < 60) {
				continue; // 조건문으로 돌아갑니다.
			} else {
				System.out.println((i+1)+"번 학생은 합격입니다.");
			}
		}
	}
}
```
```
1번 학생은 합격입니다.
3번 학생은 합격입니다.
5번 학생은 합격입니다.
```

+) for문도 while문과 마찬가지로 break를 만나면 벗어난다.

## 이중 for문
for문을 두번 사용하여 구구단 출력하기
- for문 내에 for문을 한 번 더 작성하여 사용
```java
public class sample0411 {
	public static void main(String[] args) {
		for (int i=2; i<10; i++) {
			for (int j=1; j<10; j++) {
				System.out.print(i*j + " ");
			}
			System.out.println(""); // 줄바꿈을 위한 출
		}
	}
}
```
```
2 4 6 8 10 12 14 16 18 
3 6 9 12 15 18 21 24 27 
4 8 12 16 20 24 28 32 36 
5 10 15 20 25 30 35 40 45 
6 12 18 24 30 36 42 48 54 
7 14 21 28 35 42 49 56 63 
8 16 24 32 40 48 56 64 72 
9 18 27 36 45 54 63 72 81
```

# 03-05. for each문
## for each문의 구조
iterate는 돌릴 객체이고, iterate 객체에서 한 개씩 순차적으로 변수명에 대입되어 for문 수행
- iterate에 사용할 수 있는 자료형은 루프를 돌릴 수 있는 자료형(배열이나 ArrayList)만 가능
- 변수명의 type은 iterate객체에 포함된 자료형과 일치해야한다.
```java
for (type 변수명:iterate){
    body-of-loop
}
```

```java
import java.util.ArrayList;
import java.util.Arrays;
public class sample0412 {
	public static void main(String[] args) {
		ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one","two","three"));
		for (String number : numbers) {
			System.out.println(number);
		}
	}
}
```
```
one
two
three
```

단! for each문은 따로 반복 횟수를 명시적으로 주는 것이 불가능하고, 한 단계씩 순차적으로 반복할 때만 사용이 가능하다는 제약이 있다!