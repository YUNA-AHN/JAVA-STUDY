# 02. 자바의 기초 - 자료형
# 자료형 (date type)
데이터의 종류와 크기를 결정하는 기본 구성요소  
프로그램에서 가장 기본적이면서 핵심 단위가 되는 것
- 숫자, 문자열 등

# 02-01. 숫자
숫자 형태로 이루어진 자료형
- 123, 12.34, 8진수, 16진수 등

## 정수
표현할 수 있는 수자의 범위에 따라 int, long  
byte와 short도 존재하지만 잘 사용하지 않음

|자료형|표현 범위|
|:------:|:---:|
|int|2147483648 ~ 2147483647|
|long|-9223372036854775808 ~ 9223372036854775807|

int와 long 사용 예시
```java
int age = 10;
long count0fstar = 8764827384923849L;
```
long 변수에 값을 대입할 때 int 자료형 최댓값보다 크다면 접미사 L을 붙여주어야 한다.  
누락시 컴파일 오류

## 실수
표현할 수 있는 숫자의 범위에 따라 float, double

|자료형|표현 범위|
|:------:|:---:|
|float|-3.4*10^38 ~ 3.4*10^38|
|double|-1.7*10^308 ~ 1.7*10^308|

float와 double 사용 예시
```java
float pi = 3.14F;
double morePi = 3.14159265358979323846
```
자바에서 실수형의 기본값은 double 이므로 float 변수 사용시 접미사 F 붙여주어야 한다.
마찬가지로 누락시 컴파일 오류발생

지수 표현식으로도 사용 가능
```java
double d1 = 123.4;
double d2 = 1.234e2;
```

## 8진수와 16진수
int 자료형 사용  
- 8진수 : 0으로 시작
- 16진수 : 0x로 시작

```java
int octal = 023; // 19
int hex = 0xC; // 12
```

## 숫자 연산
사칙연산과 동일하다 +, -, *, /
/ : 몫을 반환 % : 나머지 반환

```java
package jumptojava.ch03;

public class Sample0301 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		System.out.println(a+b); // 15
		System.out.println(a-b); // 5
		System.out.println(a*b); // 50
		System.out.println(a/b); // 2
		System.out.println(7/3); // 2
		System.out.println(7%3); // 1
	}
}
```
## 증감연산
++, -- 기호를 이용하여 값을 증가 또는 감소시킬 수 있음  
해당 기호를 증감 연산자라고 한다.
- ++ -- 는 1씩 증가시키거나 감소시킨다!

```java
public class Sample0302 {
	public static void main(String[] args) {
		int i = 0;
		int j = 10;
		i++;
		j--;
		System.out.println(i); // 1
		System.out.println(j); // 9
	}
}
```

```java
public class Sample0302 {
	public static void main(String[] args) {
		int k = 0;
        int l = 0;
		System.out.println(k++);  // 0
		System.out.println(k);  // 1

        System.out.println(++l);  // 1
		System.out.println(l);  // 1
	}
}
```
- 연산자의 위치에 따라 출력 시 값이 달라질 수 있음
- k++ 의 경우 코드가 실행된 이후에 값이 증가하기 때문에 k가 출력된다.
- ++k 의 경우 코드가 실행되기 이전에 값이 증가하므로 1 증가한 값이 출력 된다.

# 02-02 불(boolean)
참(true) 또는 거짓(false)의 값을 갖는 자료형  
참 또는 거짓만 대입 가능하다
```java
boolean isSuccess =  true;
boolean ifTest = fasle;
```

## 불 연산
불 자료형에는 불 연산의 결과값을 대입할 수 있다. 
- 불 연산: 참 또는 거짓으로 판단하는 연산

```java
public class Sample0303 {
	public static void main(String[] args) {
		System.out.println(2 > 1); // true
		System.out.println(1 == 2); //false
		System.out.println(3 % 2 == 1); //true
		System.out.println("3".equals("2")); // false
	}
}
```

사용 예시 - 조건문
- 조건문의 판단 기준으로 많이 사용한다.

isTall에 저장된 값이 참이라면 (height > base) '키가 큽니다.'를 출력하는 코드
``` java
public class Sample0304 {
	public static void main(String[] args) {
		int base = 180;
		int height = 185;
		boolean isTall = height > base;
		
		if (isTall) {
			System.out.println("키가 큽니다.");
		}
	}
}
```
```
키가 큽니다.
```

i를 2로 나누었을 때 나머지가 1인지를 묻는 조건문
```java
package jumptojava.ch03;

public class Sample0305 {
	public static void main(String[] args) {
		int i = 3;
		boolean isOdd = i % 2 == 1;
		System.out.println(isOdd); // true
	}
}
```

# 02-03. 문자
문자 자료형은 char를 이용한다.
많이 사용하는 편이 아니라 활용성이 적지만, 알아두자!
```java
public class Sample0306 {
	public static void main(String[] args) {
		char a1 = 'a'; // 문자로 표현
		char a2 = 97; // 아스키 코드로 표현
		char a3 = '\u0061'; // 유키코드로 표현
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}
}
```
모두 a를 출력하는 코드

# 03-04 문자열
## 문자열
문자열이란 문자로 구성된 문자
- JAVA에서 문자열을 나타내는 자료형은 String

```java
public class Sample0307 {
	public static void main(String[] args) {
		// 리터럴(literal) 방식
		String a = "Happy Java"; // 문자열은 쌍따옴표로 감싸야 한
		String b = "a";
		String c = "123";
		
		// new 키워드를 활용하여 객체를 만드는 방식
		String d = new String("Happy Java");
		String e = new String("a");
		String f = new String("123");
	}
}
```
문자열을 표현할 때는 리터럴 표기 방식을 사용하는 것이 좋다.  
리터럴 방식 
- 객체를 생성하지 않고 고정된 값을 그대로 대입하는 방법
- 가독성이 좋음
- 컴파일할 때 최적화에 도움을 준다.

+) 리터럴 방식과 new 키워드를 활용한 방식은 같은 문자열을 갖게 되지만 완전히 동일하지는 않음!  

## 원시 자료형
원시 자료형(primitive)은 new 키워드로 값을 생성할 수 없다. 리터럴 표기 방식으로만 값 세팅 가능
- int, long, double, float, boolean, char
- **String은 원시자료형에 포함되지 않지만 리터럴 표기 방식 사용 가능**


++) Wrapper 클래스
래퍼 클래스는 기본 타입에 해당하는 데이터를 객체로 포장해주는 클래스  
멀티 스레드 환경에서 동기화를 지원하려면 원시 자료형 대신 Wrapper 클래스를 사용해야한다.

|원시 자료형|Wrapper 클래스|
|:------:|:---:|
|int|Integer|
|long|Long|
|double|Double|
|float|Float|
|boolean|Boolean|
|char|Char|

## 문자열 내장 메서드
String 자료형의 내장 메서드 : 문자열 객체에 속한 함수

### equals
문자열 2개가 같은지를 비교하여 결과값을 리턴(결과를 호출한 곳으로 반환)한다.
- 문자열의 **값**비교하는 메서드
```java
public class Sample0308 {
	public static void main(String[] args) {
		String a = "hello";
		String b = "java";
		String c = "hello";
		
		System.out.println(a.equals(b)); // false
		System.out.println(a.equals(c)); // true
	}
}
```

equals와 ==의 차이
```java
public class Sample0309 {
	public static void main(String[] args) {
		String a = "hello";
		String b = new String("hello");
		
		System.out.println(a.equals(b)); // true
		System.out.println(a ==b); // false
	}
}
```
- 문자열 a와 b는 모두 hello라는 값을 가지므로 값을 비교하는 equals에서는 true를 반환
- 서로 다른 객체이기 때문에, 2개의 자료형이 같은 객체인지 판별하는 연산인 ==에서는 false를 반환

### indexOf
문자열에서 특정 문자열이 시작되는 위치(인덱스값)을 리턴한다.

문자열 a에서 Java가 시작되는 위치를 리턴하는 코드
- 자바는 숫자를 0부터 세기 때문에 6 출력
```java
public class Sample0309 {
	public static void main(String[] args) {
		String a = "Hello Java";
		
		System.out.println(a.indexOf("Java")); // 6
	}
}
```

### contains
문자열에서 특정 문자열이 포함되어 있는지 여부를 리턴한다.
```java
public class Sample0309 {
	public static void main(String[] args) {
		String a = "Hello Java";
		
		System.out.println(a.contains("Java")); // true
	}
}
```

### charAt
문자열에서 특정 위치의 문자를 리턴한다.  
Hello Java 문자열에서 6번째 인덱스에 위치한 문자를 리턴하는 코드
```java
public class Sample0309 {
	public static void main(String[] args) {
		String a = "Hello Java";
		
		System.out.println(a.charAt(6)); // J
	}
}
```

### replaceALL
문자열에서 특정 문자열을 다른 문자열로 바꿀 때 사용한다.  
Hello Java문자열에서 Java를 World로 바꾸는 코드
```java
public class Sample0309 {
	public static void main(String[] args) {
		String a = "Hello Java";
		
		System.out.println(a.replaceAll("Java", "world")); // Hello world
	}
}
```

### substring
문자열에서 특정 문자열을 뽑아낼때 사용
```java
public class Sample0309 {
	public static void main(String[] args) {
		String a = "Hello Java";
		
		System.out.println(a.substring(0,4)); // Hell
	}
}
```
- substring(시작위치, 끝위치)를 입력하면 시작위치부터 끝 위치까지 뽑아내게 된다.
- 단, 끝 위치의 문자는 포함되지 않음!
- 시작위치 <= a < 끝위치

### toUpperCase / toLowerCase
- toUpperCase : 문자열을 모두 대문자로 변경하는 메서드
- toLowerCase : 문자열을 모두 소문자로 변경하는 메서드
```java
public class Sample0309 {
	public static void main(String[] args) {
		String a = "Hello Java";
		
		System.out.println(a.toUpperCase()); // HELLO JAVA
		System.out.println(a.toUpperCase()); // hello java
	}
}
```

### split
문자열을 특정한 구분자로 나누어 문자열 배열로 리턴한다.
```java
import java.util.Arrays;

public class Sample0309 {
	public static void main(String[] args) {
		String a = "a:b:c:d";
		String[] result = a.split(":");
		
		System.out.println(Arrays.toString(result));
	}
}
```
```
[a, b, c, d]
```

## 문자열 포메팅(formatting)
문자열 안에 어떤 값을 삽입하는 방법
- 문자열 안의 특정한 값을 바꿀 수 있게 해주는 것
String.format
```java
public class Sample0310 {
	public static void main(String[] args) {
		// 숫자 바로 대입하기 : %d
		System.out.println(String.format("I eat %d apples.", 3));
		
		// 문자열 바로 대입하기 : %s
		System.out.println(String.format("I eat %s apples.", "five"));
		
		// 숫자값을 나타내는 변수 대입하기 : %d
		int number = 3;
		System.out.println(String.format("I eat %d apples.", number));
		
		// 값을 2개 이상 넣기 : 파라미터를 순서대로 전달
		int number1 = 10;
		String day = "three";
		System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number, day));
	}
}
```
```
I eat 3 apples.
I eat five apples.
I eat 3 apples.
I ate 3 apples. so I was sick for three days.
```

## 문자열 포맷 코드
### 문자열 포맷 코드의 종류
|코드|설명|
|:------:|:---:|
|%s|문자열 (String)|
|%c|문자 1개 (character)|
|%d|정수 (Integer)|
|%f|부동소수 (floating-point)|
|%o|8진수|
|%x|16진수|
|%%|Literal % (문자 % 자체)

%s에는 어떤 혀애틔 값이든 변환해 넣을 수 있다!
- %s는 자동으로 전달되는 파라미터 값을 문자열로 바꾸어 사용하기 때문
```java
public class Sample0311 {
	public static void main(String[] args) {
		System.out.println(String.format("I have %s apples", 3));
		System.out.println(String.format("rate is %s", 3.234));
	}
}
```
```
I have 3 apples
rate is 3.234
```

+) 문자열 포맷 코드 %%의 쓰임
- 문자열 안에 포멧코드가 존재하지 않는다면 %가 홀로 쓰일 수 있으나, 존재하는 경우 %%로 작성해야함
```java
public class Sample0311 {
	public static void main(String[] args) {
		System.out.println(String.format("Error is %d%%", 98));
		// Error is 98%
	}
}
```

### 문자열 포멧 코드 응용하기
1. 정렬과 공백 표현하기
```java
public class Sample0311 {
	public static void main(String[] args) {
		System.out.println(String.format("%10s", "hi"));
		//         hi
	}
}
```
- 10%s는 전체 길이가 10인 문자열 공간에서 대입되는 값을 가장 오른쪽으로 정렬하고 나머지는 공백으로 남겨두라는 의미이다.

```java
public class Sample0311 {
	public static void main(String[] args) {
		System.out.println(String.format("%-10sjane", "hi"));
		// hi        jane
	}
}
```
- %-10s 사용하면 왼쪽 정렬 가능

2. 소수점 표현하기
- 원하는 소수점 자릿수 지정 가능
```java
public class Sample0311 {
	public static void main(String[] args) {
		System.out.println(String.format("%10.4f", 3.4213234));
		System.out.println(String.format("%.4f", 3.4213234));
	}
}
```
```
    3.4213 // 전체 길이가 10인 공간에서 오른쪽 정렬한 소수 출력
3.4213
```

## System.out.printf
String.format 메서드 없어도 같은 형식으로 간단히 포메팅된 문자열 출력 가능
- String.format은 문자열을 리턴하는 메서드 VS System.out.printf는 문자열을 출력하는 메서드
```java
public class Sample0311 {
	public static void main(String[] args) {
		System.out.printf("I eat %d apples.", 3);
		// I eat 3 apples.
	}
}
```
# 03-05. StringBuffer
문자열을 추가하거나 변경할 때 사용하는 자료형

## append
StringBuffer 자료형은 append 메서드를 사용하여 문자열을 계속해서 추가해나갈 수 있음  
toString 사용시 StringBuffer를 String 자료형으로 변경 가능
```java
public class Sample0311 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); // STringBuffer 객체 sb생성
		sb.append("hello");
		sb.append(" ");
		sb.append("jump to java");
		String result = sb.toString();
		System.out.println(result);
		// hello jump to java
	}
}
```

String 자료형으로도 동일한 결과를 낼 수 있음
```java
public class Sample0312 {
	public static void main(String[] args) {
		String result = "";
		result += "hello";
		result += " ";
		result += "jump to java";
		System.out.println(result);
		// hello jump to java
	}
}

```
- 내부적으로 객체를 생성하고, 메모리를 사용하는 과정에 차이가 존재
- 첫 번째 예제에서는 StringBuffer 객체를 한 번만 생성함
- 두 번째 예제에서는 String 자료형에 + 연산이 있을때마다 새로운 String객체를 생성하여 총 4개의 String 자료형 객체 생성
	- ** String 자료형은 값이 한 번 생성되면 변경할 수 없음**
	- toUpperCase 메서드 -> 문자열 변경이 아닌 다른 String 객체 생성하여 리턴

String vs StringBuffer
- String : 비교적 가벼움. 속도가 빠르고 메모리 사용량이 적음. 값 변경이 불가하여 새로운 객체 생성함
- StringBuffer : 비교적 무거움. 속도가 느리고 메모리 사용량이 많음. 문자열을 추가하거나 변경하는 작업이 많은 경우 용이함. 멀티 스레드 환경에서 안전함

+) StringBuilder  
StringBuffer와 비슷한 자료형
- 동기화를 고려할 필요가 없는 상황에서는 StringBuilder가 유리
```java
public class Sample0312 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.append(" ");
		sb.append("jump to java");
		String result = sb.toString();
		System.out.println(result);
	}
}
```

## insert
특정 위치에 원하는 문자열을 삽입  
0번 위치에 hello라는 문자열 삽입하는 코드
```java
public class Sample0314 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("jump to java");
		sb.insert(0, "hello ");
		System.out.println(sb.toString());
		// hello jump to java
	}
}
```

## substring
String 자료형의 substring메서드와 동일하게 동작  
substring(시작 위치, 끝 위치) -> 객체의 시작위치에서 끝 위치까지의 문자를 뽑아 낸다.
```java
public class Sample0313 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Hello jump to java");
		System.out.println(sb.substring(0, 4)); //Hell
	}
}
```

# 03-06. 배열
자료형의 집합
- 1차원 배열, 2차원 3차원 등의 다차원 배열도 가능

int 자료형의 배열
```java
import java.util.Arrays;

public class Sample0315 {
	public static void main(String[] args) {
		int[] odds = {1, 3, 5, 7, 9};
		System.out.println(Arrays.toString(odds));
		// [1, 3, 5, 7, 9]
	}
}
```

String 자료형의 집합
```java
import java.util.Arrays;
public class Sample0315 {
	public static void main(String[] args) {
		String[] weeks = {"월", "화", "수", "목", "금"};
		System.out.println(Arrays.toString(weeks));
		// [월, 화, 수, 목, 금]
	}
}
```

## 배열의 길이 설정하기
배열의 길이를 먼저 설정한 뒤, 배열 변수를 생성하고 그 값을 나중에 대입하는 방법
```java
public class Sample0316 {
	public static void main(String[] args) {
		String[] weeks = new String[7];
		weeks[0] = "월";
		weeks[1] = "화";
		weeks[2] = "수";
		weeks[3] = "목";
		weeks[4] = "금";
		weeks[5] = "토";
		weeks[6] = "일";
	}
}
```
- 단, 초깃값 없이 배열 변수를 만들 때에는 7과 같은 숫자값을 넣어 길이를 정해주어야 한다.
```java
String[] weeks = new String[]
```

## 배열값에 접근하기
```java
public class Sample0317 {
	public static void main(String[] args) {
		String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
		System.out.println(weeks[3]);
	}
}
```

## 배열의 길이 구하기
length를 사용하여 구함
- 배열은 for문과 함께 사용하기 때문에 배열의 길이를 알아야 한다.
```java
public class Sample0318 {
	public static void main(String[] args) {
		String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
		for (int i  = 0; i < weeks.length; i++) {
			System.out.println(weeks[i]);
		}
	}
}
```
```
월
화
수
목
금
토
일
```

## 배열 오류
배열 사용시 가장 자중 보는 인덱스 에러...! 유의하여 사용하자
```
ArrayIndexOutOfBoundsException
```

# 03-07. 리스트(List)
배열과 비슷하지만 편리한 기능이 더 많은 자료형  
크기가 정해져 있지 않아 원하는 만큼 값을 담을 수 있음
- 리스트 자료형에는 ArrayList, Vector, LinkedList 등이 있다.

## ArrayList
리스트 자료형에서 가장 일반적으로 사용하는 ArrayList

### add
요솟값 추가  
야구 선수가 공을 총 3번 던졌는데 각각 시속 138, 129, 142인 경우
- ArrayList 사용하려면 import java.util,ArrayList와 같은 import문을 작성해야한다.
- import문은 다른 패키지나 클래스를 현재 코드에서 사용하기 위해 선언하는 문장
```java
import java.util.ArrayList;

public class Sample0319 {
	public static void main(String[] args) {
		ArrayList pitches = new ArrayList();
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		// 첫번째 위치에 133 추가하고 싶다면
		pitches.add(0, "133");
		// 두번재 위치에 144을 추가하고 싶다면
		pitches.add(1, "133");
	}
}
```
- ArrayList<String> pitches = new ArrayList<>(); 처럼 면확하게 표현하는 것을 권고

### get
특정 인덱스의 값을 추출할 수 있음
```java
public class Sample0319 {
	public static void main(String[] args) {
		ArrayList pitches = new ArrayList();
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		System.out.println(pitches.get(1)); // 두번째 위치하는 값 129 출력
	}
}
```

### size
ArrayList의 요소의 개수를 리턴
```java
import java.util.ArrayList;

public class Sample0320 {
	public static void main(String[] args) {
		ArrayList pitches = new ArrayList();
		pitches.add("130");
		pitches.add("129");
        pitches.add("142");
        System.out.println(pitches.size());
		// 3
	}
}
```

### contains
리스트 안에 해당 항목이 있는지 판별해 그 결과를 boolean으로 리턴하는 메서드
```java
import java.util.ArrayList;

public class Sample0320 {
	public static void main(String[] args) {
		ArrayList pitches = new ArrayList();
		pitches.add("130");
		pitches.add("129");
        pitches.add("142");
		System.out.println(pitches.contains("142"));
		// true
	}
}
```

### remove
2가지 방식 존재
1. remove(객체)
- 리스트에서 객체에 해당하는 항목을 삭제한 뒤, 그 결과를 true or false를 리턴
2. remove(인덱스)
- 인덱스에 해당하는 항목을 사젝한 뒤 그 항목을 리턴
```java
import java.util.ArrayList;

public class Sample0320 {
	public static void main(String[] args) {
		ArrayList pitches = new ArrayList();
		pitches.add("130");
		pitches.add("129");
        pitches.add("142");
		System.out.println(pitches.remove("129")); // true
        System.out.println(pitches.remove(0)); // 130
	}
}
```

## 제네릭스(generics)
자료형을 안전하게 사용할 수 있도록 만들어 주는 기능  
- 제네릭스를 사용하면 자료형을 강제로 바꿀 때 생길 수 있는 캐스팅 오류를 줄일 수 있다.

- 일반적인 방식: ArrayList<String> pitches = new ArrayList<String>();
- 선호되는 방식: ArrayList<String> pitched = new ArrayList<>();

제네릭스 도입 전후의 차이 : ArryList 다음에 <string> 유무 차이
- ArrayList에 담을 수 있는 자료형은 String 뿐이다! 를 좀더 명확하게 체크할 수 있다는 장점

```java
import java.util.ArrayList;
public class Sample0321 {
	public static void main(String[] args) {
		ArrayList pitches = new ArrayList();
		pitches.add("138");
		pitches.add("129");
		
		String one = (String) pitches.get(0); // gudqusghks
		String two = (String) pitches.get(1);
	}
}
```
- 제네릭스를 사용하지 않으면 ArrayList에 추가하는 객체가 Object 자료형으로 인식
- Object 자료형 : 모든 객체가 상속하고 있는 가장 기본적인 자료형
- 값을 넣을때는 문제가 없지만, 값을 **가져올 떄** 매번 Objecct -> String 자료형으로 형변환(casting)을 해야한다
- String 외 다른 객체도 넣을 수 있어서 형변황 오류 발샐 가능

제네릭스를 이용한 코드
```java
import java.util.ArrayList;
public class Sample0322 {
	public static void main(String[] args) {
		ArrayList<String> pitches = new ArrayList<>();
		pitches.add("138");
		pitches.add("129");
		
		String one = pitches.get(0); // 형변환이 필요 없다.
		String two = pitches.get(1);
	}
}
```

## 다양한 방법으로 ArrayList 만들기
add 메소드를 사용하면 ArrayList 객체에 요소를 추가할 수 있다.
```java
import java.util.ArrayList;
public class Sampel0323 {
	public static void main(String[] args) {
		ArrayList<String> pitches = new ArrayList<>();
		pitches.add("130");
		pitches.add("129");
        pitches.add("142");
        System.out.println(pitches);
	}
}
```
```
[138, 129, 142]
```

문자열 배열이 있는 경우 더 편하게 생성 가능 : asList
```java
import java.util.ArrayList;
import java.util.Arrays;

public class Sampel0324 {
	public static void main(String[] args) {
		String[] data = {"138", "129", "142"}; // 이미 투구 수 데이터 배열이 있다.
		ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
		System.out.println(pitches);
		
	}
}
```

```
[138, 129, 142]
```

String 배열 대신에 String 자료형 여러개 전달하여 생성도 가능
```java
import java.util.ArrayList;
import java.util.Arrays;

public class Sampel0324 {
	public static void main(String[] args) {
		ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138","129","142"));
		System.out.println(pitches);
		
	}
}
```

## String.join
AttauList의 각 요소를 1개의 문자열로 작성
```java
import java.util.ArrayList;
import java.util.Arrays;

public class Sample0325 {
	public static void main(String[] args) {
		ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138","129","142"));
		String result = "";
		for ( int i = 0; i < pitches.size(); i++) {
			result += pitches.get(i);
			result += ","; // 콤마를 추가한ㄷ.
		}
		result = result.substring(0, result.length()-1); // 마지막 콤마 제거
		System.out.println(result);
	}
}
```
```
138,129,142
```
- 요소 개수만큼 루프를 돌면서 뒤에 콤마를 더한 뒤, 마지막 콤마를 제거하는 방법. 까다로움

String.join("구분자", 리스트 객체)
```java
import java.util.ArrayList;
import java.util.Arrays;

public class Sample0326 {
	public static void main(String[] args) {
		ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138","129","142"));
		String result = String.join(",", pitches);
		System.out.println(result);
	}
}
```
```
138,129,142
```

문자열 배열에서도 사용할 수 있다.
```java
import java.util.ArrayList;
import java.util.Arrays;

public class Sample0327 {
	public static void main(String[] args) {
		String[] pitches = new String[]{"138","129","142"};
		String result = String.join(",", pitches);
		System.out.println(result);
	}
}
```

## 리스트 정렬하기
리스트의 sort 메서드 사용
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sample0328 {
	public static void main(String[] args) {
		ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
		pitches.sort(Comparator.naturalOrder()); // 오름차순으로 정렬
		System.out.println(pitches);
	}
}
```
```
[129, 138, 142]
```
정렬 기준
- 오름차순(순방향) 정렬 - Compartor.naturalOrder()
- 내림차순(역방향) 정렬 - Compartor.reverseOrder()

# 02-08 맵(map)
대응 관계를 쉽게 표현할 수 있게 하는 자료형
- associative array 또는 hash
- 키와 값을 한쌍으로 작는 자료형

|키(key)|값(value)|
|:------:|:---:|
|people|사람|
|baseball|야구|

## HashMap
### put
key와 value를 추가할 수 있음
```java
import java.util.HashMap;

public class Sample0329 {
	public static void main(String[] args) {
		// <key, value> string
		HashMap<String, String> map = new HashMap<>();
		map.put("people", "사람");
		map.put("baseball", "야구");
	}
}
```

### get
key에 해당하는 value를 얻을 때 사용

map객체의 key인 people에 대응하는 value인 사람이 출력
```java
import java.util.HashMap;
public class Sample0330 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("people", "사람");
		map.put("baseball", "야구");
		System.out.println(map.get("people")); // "사람" 출력
	}
}
```
```
사람
```

+) getOrDefalut
맵의 key에 해당하는 value가 없을 때 get 메서드를 사용하면 null 리턴
- null 대신 기본값(default)을 얻고 싶다면, getOrDefalut
```java
import java.util.HashMap;
public class Sample0330 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("people", "사람");
		map.put("baseball", "야구");
		System.out.println(map.get("java"));
		System.out.println(map.getOrDefault("java", "자바"));
	}
}
```
```
null
자바
```

### containsKey
맵에 해당key가 있는지를 참(true) 또는 거짓(false)으로 리턴
```java
import java.util.HashMap;
public class Sample0331 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("people", "사람");
		map.put("baseball", "야구");
		System.out.println(map.containsKey("people"));
	}
}
```
```
true
```

### remove
맵의 항목을 삭제하는 매서드. 해당 key의 항목을 삭제한 후 value 값을 리턴
```java
import java.util.HashMap;
public class Sample0331 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("people", "사람");
		map.put("baseball", "야구");
		System.out.println(map.remove("people")); // 사람
	}
}
```

### size
맵 요소의 개수를 리턴
```java
import java.util.HashMap;
public class Sample0331 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("people", "사람");
		map.put("baseball", "야구");
		System.out.println(map.remove("people"));
		System.out.println(map.size()); // 1
	}
}
```

### keySet
맵의 모든 key를 모아서 집합 자료형으로 리턴
- 집합 자료형은 리스트 자료형으로 바꾸어 사용할 수 있음
```java
import java.util.HashMap;
public class Sample0332 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("people", "사람");
		map.put("baseball", "야구");
		System.out.println(map.keySet());
	}
}
```
```
[baseball, people]
```
```java
ArrayList<String> keyList = new ArrayList<>(map.keySet());
```

+) LinkedHashMap과 TreeMap
맵의 가장 큰 특징은 수선에 의존하지 않는다는 점 !  
하지만 정렬하고 싶다면?
- LinkedHashMap: 입력된 순서대로 데이터를 저장한다.
- TreeMap: 입력된 key의 오름차순으로 데이터를 저장한다.

# 02-09 집합(Set)
집합과 관련된 것을 쉽게 처리하기 위해 만든 것
- HashSet, TreeSet, LinkedSet

```java
import java.util.Arrays;
import java.util.HashSet;

public class Sample0333 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>(Arrays.asList("H","e","l","l","o"));
		System.out.println(set);
	}
}
```
```
[e, H, l, o] 
```

## 집합 자료형을 2가지 특징
1. 중복을 허용하지 않는다.
2. 순서가 없다. (unorded)

리스트나 배열은 순서가 있기(ordered)때문에 인덱싱을 통해 자료형의 값을 얻을 수 있지만, 집합 자료형은 순서가 없기(unorderd)때문에 인덱싱으로 값을 얻을 수 없다.
> 집합 자료형은 중복을 허용하지 않기 때문에 자료형의 중복을 제거하기 위한 필터 역할로 종종 사용한다.

## 교집합, 합집합, 차집합 구하기
```java
import java.util.Arrays;
import java.util.HashSet;

public class Sample0334 {
	public static void main(String[] args) {
		HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
		HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
		HashSet<Integer> intersection = new HashSet<>(s1);
		intersection.retainAll(s2); // 교집합 수행
		System.out.println(intersection);
		
		HashSet<Integer> union = new HashSet<>(s1);
		union.addAll(s2); // 합집합 수행
		System.out.println(union);
		
		HashSet<Integer> substract = new HashSet<>(s1);
		substract.removeAll(s2); // 차집합 수행
		System.out.println(substract);
	}
}
```
```
[4, 5, 6]
[1, 2, 3, 4, 5, 6, 7, 8, 9]
[1, 2, 3]
```

## 집합 자료형과 관련된 메서드
### add 집합 자료형에 값을 추가할 때 사용
```java
import java.util.HashSet;
public class Sample0335 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("jump");
		set.add("to");
		set.add("java");
		System.out.println(set);
	}
}
```
```
[java, to, jump]
```
### addAll
값을 한꺼번에 여러 개 추가할 때 사용
```java
import java.util.Arrays;
import java.util.HashSet;
public class Sample0335 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("jump");
		set.addAll(Arrays.asList("to", "java"));
		System.out.println(set);
	}
}
```
```
[java, to, jump]
```

### remoce
특정 값을 제거할 때 사용
```java
import java.util.Arrays;
import java.util.HashSet;
public class Sample0335 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.addAll(Arrays.asList("jump","to", "java"));
		set.remove("to");
		System.out.println(set);
	}
}
```
```
[java, jump]
```

+) TreeSet과 LinkedHashSet
집합 자료형의 특징은 순서가 없다는 것이다. 이러한 집합을 입력한 순서대로 데이터를 가져오거나 오름차순으로 정렬된 데이터를 가져오고 싶은 경우
- TreeSet: 값을 오름차순으로 정렬해 저장한다.
- LinkedHashSet: 값을 입력한 순서대로 정렬한다.

# 2-10 상수 집합
enum 자료형은 서로 연관 있는 여러 개의 상수 집합을 정의할 때 사용  
ex) 카페에서 판매하는 커피의 종류
- 아메리카노
- 아이스 아메리카노
- 카페라떼

상수 집합 사용 예
```java
public class Sample0336 {
	enum CoffeeType{
		AMERICANO,
		ICE_AMERICANO,
		CAFE_LATTE
	};
	public static void main(String[] args) {
		System.out.println(CoffeeType.AMERICANO);
		System.out.println(CoffeeType.ICE_AMERICANO);
		System.out.println(CoffeeType.CAFE_LATTE);
	}
}
```
반복문
```java
public class Sample0337 {
	enum CoffeeType{
		AMERICANO,
		ICE_AMERICANO,
		CAFE_LATTE
	};
	
	public static void main(String[] args) {
		for(CoffeeType type: CoffeeType.values()) {
			System.out.println(type);
		}
	}
}
```
```
AMERICANO
ICE_AMERICANO
CAFE_LATTE
```

## enum이 필요한 이유
- 코드가 단순해지며 가독성이 좋아 명확함
- 잘못된 값을 사용해 생길 수 있는 오류를 맏을 수 있다.

# 02-11 형 변환과 final
## 형 변환
형 변환 : 자료형을 다른 자료형으로 바꾸는 것

문자열을 정수로
```java
public class Sample0338 {
	public static void main(String[] args) {
		String num = "123";
		int n = Integer.parseInt(num);
	}
}
```

정수를 문자열로
```java
public class Sample0338 {
	public static void main(String[] args) {
		int n = 123;
		String num = "" + n;
	}
}
```

String.valueOf(정수), Interger.valueOf(정수) : 정수를 문자열로 변환
```java
public class Sample0339 {
	public static void main(String[] args) {
		int n = 123;
		String num1 = String.valueOf(n);
		String num2 = Integer.toString(n);
	}
}
```

소수점 포함 숫자 형태의 문자열 형 변환 : Double.parseDouble, Float.parseFloat
```java
public class Sample0339 {
	public static void main(String[] args) {
		String num = "123.456";
		double d = Double.parseDouble(num);
	}
}
```

정수와 실수 사이의 형 변환
- 실수를 정수로 변환하면 실수의 소수점은 제거 된다.
```java
public class Sample0339 {
	public static void main(String[] args) {
		int n1 = 123;
		double d1 = n1;
		System.out.println(d1); // 123.0

		double d2 = 123.456;
		int n2 = (int) d2; // 강제로 int 형으로 변경 : 캐스팅
		System.out.println(d1); // 123
	}
}
```

+) 살수 형태의 문자열을 정수형으로 바꾸는 경우에는
1. Douvle.parseDouble() 이용해 실수로 변경 후
2. 정수로 변경  
-> NumberFormalException 발생

## final
자료형게 값을 단 한번만 설정할 수 있게 강제하는 키워드  
값을 한번 설정하면 그 값을 다시 설정할 수 없음
```java
public class Sample0340 {
	public static void main(String[] args) {
		final int n = 123;
		n = 456;
	}
}
```
```java
import java.util.ArrayList;
import java.util.Arrays;

public class Sample0340 {
    public static void main(String[] args) {
        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        a = new ArrayList<>(Arrays.asList("c", "d"));  // 컴파일 에러 발생
    }
}
```
컴파일 에러

+) Unmodifiable List
리스트의 경우 final로 선언하여도 리스트에 값을 더하거나(add) 뺄(remove) 수 있다.
**재할당**만 불가능  

만약 값을 더하거나 빼는 것도 할 수 없게 하고 싶다면 List.of를 작성하여 수정할 수 없는 리스트(Unmodifiable List)로 만들기
```java
import java.util.List;
public class Sample {
	public static void main(String[] args){
		final List<String> a = List.of("a", "b");
		a.add("c")
	}
}
```