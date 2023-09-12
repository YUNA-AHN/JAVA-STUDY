# JAVA_자료형_01

작성 일시: 2023년 9월 8일 오전 12:08

## 03-01 숫자

> 정수
실수
8진수와 16진수
숫자 연산
증감 연산
> 

### 정수

java에서 정수를 표현하는 자료형은 *int / long* >> 표현할 수 있는 숫자 범위에서 차이가 있음

![Untitled](JAVA_%E1%84%8C%E1%85%A1%E1%84%85%E1%85%AD%E1%84%92%E1%85%A7%E1%86%BC_01%2099318e92f1c146b18ec5275790a13bde/Untitled.png)

```java
int age = 10;
long countOfStar = 8764827384923849L;
```

### 실수

java에서 실수를 표현하는 자료형은 *float / double* >> 표현할 수 있는 숫자 범위에서 차이가 있음

![Untitled](JAVA_%E1%84%8C%E1%85%A1%E1%84%85%E1%85%AD%E1%84%92%E1%85%A7%E1%86%BC_01%2099318e92f1c146b18ec5275790a13bde/Untitled%201.png)

```java
float pi = 3.14F;
double morePi = 3.14159265358979323846;
```

실수의 지수 표현식

```java
double d1 = 123.4;
double d2 = 1.234e2;
```

### 8진수와 16진수

```java
int octal = 023;    // 십진수: 19
int hex = 0xC;     // 십진수: 12
```

### 숫자 연산

```java
public class Sample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
```

### 증감 연산

증감 연산자 : ++ / —

java에서는 ++, — 기호를 이용하여 값을 증가 또는 감소시킬 수 있음

```java
int i = 0;
int j = 10;
i++;
j--;

System.out.println(i);  // 1 출력
System.out.println(j);  // 9 출력
```

```java
int i = 0;
System.out.println(i++);  // 0 출력
System.out.println(i);  // 1 출력
```

*i++처럼 ++ 연산자가 변수명 뒤에 붙으면 해당 코드가 실행되는 순간에는 i값이 변경되지 않는다. 다만 i++ 문장이 실행된 이후에 i값이 증가한다. 이와 반대로 i++ 대신 ++i를 사용하면 i값이 먼저 증가된 후에 해당 코드가 실행된다.*

```java
int i = 0;
System.out.println(++i);  // 1 출력
System.out.println(i);  // 1 출력
```

- `i++` : 값을 참조한 후에 증가
- `++i` : 값을 참조하기 전에 증가

## 03-02 불리언

if문과 같은 조건문에 사용하거나 불 자료형에 대입할 수 있음

```java
2 > 1             // 참
1 == 2            // 거짓
3 % 2 == 1        // 참 (3을 2로 나눈 나머지는 1이므로 참이다.)
"3".equals("2")   // 거짓
```

예시)

```java
int base = 180;
int height = 185;
boolean isTall = height > base;

if (isTall) {
    System.out.println("키가 큽니다."); // 출력 : 키가 큽니다.
}
```

```java
int i = 3;
boolean isOdd = i % 2 == 1;
System.out.println(isOdd);  // true 출력
```

## 03-03 문자

문자 자료형은 *char* 를 이용

```java
char a1 = 'a';  // 문잣값 앞뒤를 단일 인용 부호 ''로 감싸 주어야 한다.
```

```java
char a1 = 'a';  // 문자로 표현
char a2 = 97;  // 아스키코드로 표현
char a3 = '\u0061';  // 유니코드로 표현

System.out.println(a1);  // a 출력
System.out.println(a2);  // a 출력
System.out.println(a3);  // a 출력
```

## 03-04 문자열

> 문자열
원시 자료형
문자열 내장 메서드
문자열 포매팅
문자열 포맷 코드
> 

### 문자열

문자열을 나타내는 자료형은 *String*

```java
String a = "Happy Java";  // 문자열의 앞과 뒤는 쌍따옴표("")로 감싸야 한다.
String b = "a";
String c = "123";
```

### 원시 자료형

원시 ( primitive ) 자료형 : int, long, double, float, boolean, char 자료형

![Untitled](JAVA_%E1%84%8C%E1%85%A1%E1%84%85%E1%85%AD%E1%84%92%E1%85%A7%E1%86%BC_01%2099318e92f1c146b18ec5275790a13bde/Untitled%202.png)

### 문자열 내장 메서드

**String 자료형의 내장 메스드 중 자주 사용하는 것**

1. **equals**

: 문자열 2개가 같은지를 비교하여 결과값을 리턴

```java
String a = "hello";
String b = "java";
String c = "hello";
System.out.println(a.equals(b)); // false 출력
System.out.println(a.equals(c)); // true 출력
```

```java
String a = "hello";
String b = new String("hello");
System.out.println(a.equals(b));  // true
System.out.println(a == b);  // false
```

1. **indexOF**

: 문자열에서 특정 문자열이 시작되는 위치 인덱스 값을 리턴

```java
String a = "Hello Java";
System.out.println(a.indexOf("Java"));  // 6 출력
```

1. **contains**

: 특정 문자열이 포함되어 있는지 여부를 리턴

```java
String a = "Hello Java";
System.out.println(a.contains("Java"));  // true 출력
```

1. **charAt**

: 문자열에서 특정 위치의 문자를 리턴

```java
String a = "Hello Java";
System.out.println(a.charAt(6));  // "J" 출력
```

1. **replaceAll**

: 문자열에서 특정 문자열을 다른 문자열로 바꿀 때 사용

```java
String a = "Hello Java";
System.out.println(a.replaceAll("Java", "World"));  // Hello World 출력
```

1. **substring**

: 문자열에서 특정 문자열을 뽑아낼 때 사용

*시작위치 ≤ a < 끝위치*

```java
String a = "Hello Java";
System.out.println(a.substring(0, 4));  // Hell 출력
```

1. **toUpperCase**

: 문자열을 모두 대문자로 변경

```java
String a = "Hello Java";
System.out.println(a.toUpperCase());  // HELLO JAVA 출력
```

*(소문자의 경우) toLowerCase 사용*

1. **split**

: 문자열을 특정한 구분자로 나누어 문자열 배열로 리턴

```java
String a = "a:b:c:d";
String[] result = a.split(":");  // result는 {"a", "b", "c", "d"}
```

### 문자열 포매팅

**문자열 안에 어떤 값을 삽입하는 방법**

**String.format** 메서드 

1. **숫자 바로 대입하기**

```java
System.out.println(String.format("I eat %d apples.", 3));  // "I eat 3 apples." 출력
```

1. **문자열 바로 대입하기**

```java
System.out.println(String.format("I eat %s apples.", "five"));  
// "I eat five apples." 출력
```

1. **숫자값을 나타내는 변수 대입하기**

```java
int number = 3;
System.out.println(String.format("I eat %d apples.", number));  
// "I eat 3 apples." 출력
```

1. **값을 두개이상 넣기**

```java
int number = 10;
String day = "three";
System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number, day));
// I ate 10 apples. so I was sick for three days.
```

### 문자열 포맷 코드

![Untitled](JAVA_%E1%84%8C%E1%85%A1%E1%84%85%E1%85%AD%E1%84%92%E1%85%A7%E1%86%BC_01%2099318e92f1c146b18ec5275790a13bde/Untitled%203.png)

```java
System.out.println(String.format("I have %s apples",  3));  // "I have 3 apples" 출력
System.out.println(String.format("rate is %s", 3.234));  // "rate is 3.234" 출력
```

```java
System.out.println(String.format("Error is %d%%.", 98));  // "Error is 98%." 출력
```

1. **정렬과 공백 표현하기**

```java
System.out.println(String.format("%10s", "hi"));  // "        hi" 출력
```

![Untitled](JAVA_%E1%84%8C%E1%85%A1%E1%84%85%E1%85%AD%E1%84%92%E1%85%A7%E1%86%BC_01%2099318e92f1c146b18ec5275790a13bde/Untitled%204.png)

```java
System.out.println(String.format("%-10sjane.", "hi"));  // "hi        jane." 출력
```

![Untitled](JAVA_%E1%84%8C%E1%85%A1%E1%84%85%E1%85%AD%E1%84%92%E1%85%A7%E1%86%BC_01%2099318e92f1c146b18ec5275790a13bde/Untitled%205.png)

1. **소수점 표현하기**

```java
System.out.println(String.format("%.4f", 3.42134234));  // 3.4213 출력
```

( 응용 )

```java
System.out.println(String.format("%10.4f", 3.42134234));  // '    3.4213' 출력
```

![Untitled](JAVA_%E1%84%8C%E1%85%A1%E1%84%85%E1%85%AD%E1%84%92%E1%85%A7%E1%86%BC_01%2099318e92f1c146b18ec5275790a13bde/Untitled%206.png)

1. ****System.out.printf****

`String.format` 메서드는 포매팅된 문자열을 리턴

하지만 `System.out.printf` 메서드를 사용하면 String.format 메서드가 없어도 같은 형식으로 문자열을 출력

```java
System.out.printf("I eat %d apples.", 3);  // "I eat 3 apples." 출력
```

## 03-05 StringBuffer

> append
insert
substring
> 

### append

StringBuffer 자료형은 append 메서드를 사용하여 문자열을 계속해서 추가 가능

그리고 toString() 메서드를 사용하면 StringBuffer를 String 자료형으로 변경 가능

```java
String result = "";
result += "hello";
result += " ";
result += "jump to java";
System.out.println(result);  // "hello jump to java" 출력
```

### insert

insert 메서드는 특정 위치에 원하는 문자열을 삽입

```java
StringBuffer sb = new StringBuffer();
sb.append("jump to java");
sb.insert(0, "hello ");
System.out.println(sb.toString());
```

### substring

substring(시작 위치, 끝 위치)와 같이 사용하면 StringBuffer 객체의 시작 위치에서 끝 위치까지의 문자 리턴

```java
StringBuffer sb = new StringBuffer();
sb.append("Hello jump to java");
System.out.println(sb.substring(0, 4)); // Hell 출력 
```