> **자료형**(data type)?  
>   
> 데이터의 종류와 크기를 결정하는 기본 구성 요소로 숫자, 문자열처럼 자료 형태로 사용하는 모든 것

**1) 숫자**

**정수** : int, long(많이 사용함...) / byte, short(잘 사용 안함)

| 자료형 | 표현 범위 |
| --- | --- |
| int | \-2147483648 ~ 2147483647 |
| long | \-9223372036854775808 ~ 9223372036854775807 |
| byte | \-128 ~ 127 |
| short | \-32768 ~ 32767 |

```
int age = 10;
long countingstar = 8764827384923849L; 
// int 자료형의 최댓값인 2147483647보다 크면 L;붙여줘야 한다!! => 없으면 컴파일 오류 발생
```

**실수** : float, double

| 자료형 | 표현 범위 |
| --- | --- |
| float | \-3.4 \* 10의 38승 ~ 3.4 \* 10의 38승 |
| double | \-1.7 \* 10의 308승 ~ 1.7 \* 10의 308승 |

```
float pi = 3.14F;
double morePi = 3.14159265358979323846;
// 자바 실수 기본값은 double이므로 float 변수에 값을 대입할 때는 접미사로 F자를 꼭 붙여준다..
// 이것 또한 누락하면 컴파일 오류 발생!!
```

**8진수와 16진수** : int 자료향을 사용

\- 8진수 : 숫자 0으로 시작, 0~7까지를 사용하여 숫자를 표현한다

\- 16진수 : 숫자 0과 알파벳 x로 시작..., 0~9까지의 숫자와 A부터 F까지의 알파벳을 사용하여 숫자를  표현한다

```
int octal = 023; // 십진수 : 19 (2 * 8의 1승 + 3* 8의 0승)
int hex = 0xC3; // 십진수 : 195 (12 * 16의 1승 + 3 * 16의 0승)
```

**숫자 연산** : 사칙연산과 동일

```
// 나머지 연산자 : %
public class practice {
	public static void main(String[] args) {
		System.out.println(7%3); // 1
		System.out.println(3%7); // 3
	}
}
```

**증감 연산** : ++, -- 기호를 이용하여 값을 증가 또는 감소 (++, -- 기호를 증감 연산자라고 한다)

```
int i = 0;
int j = 10;
i ++;
j --;

System.out.println(i); // 1
System.out.println(j); // 9
```

증감 연산자의 **위치에 따른 변화..**

\- i++ : 값을 참조한 후에 증가

\- ++i : 값을 참조하기 전에 증가 

```
// 후치 증감 연산자...
int i = 0;
System.out.println(i++); // 0
System.out.println(i);   // 1

// 전치 증감 연산자...
int i = 0;
System.out.println(++i); // 1
System.out.println(i); // 1
```

---

**2) bool** : 참 또는 거짓의 값을 갖는 자료형

불 연산 : 불 자료형에는 불 연산의 결괏값을 대입할 수 있다.

```
2 > 1 // 참
1 == 2 // 거짓
3 % 2 == 1 // 참
"3".equals("2") // 거짓
```

불 연산의 결과는 참 또는 거짓이므로 **if 문과 같은 조건문에서 사용**하거나 불자료형에 대입할 수 있다.

```
int i = 3;
boolean isOdd = i % 2 == 1;
System.out.println(isOdd); // true
```

---

**3) 문자** : char 자료형을 사용한다(많이 사용하지는 않지만 문잣값을 표현하는 방식은 다양하다)

```
char a1 = 'a';   // 문자로 표현
char a2 = 97;	// 아스키코드로 표현
char a3 = '\u0061'; // 유니코드로 표현

System.out.println(a1); // a
System.out.println(a2); // a
System.out.println(a3); // a
```

---

4) 문자열: String을 사용한다

```
// 리터럴 표기 방식 : 객체를 생성하지 않고 고정된 값을 그대로 대입하는 방법
String a = "Happy Java";
String b = "a";
String c = "123";

// new 키워드 : 새로운 객체를 만들 떄 사용 
String a = new String("Happy Java")
String b = new String("a")
String c = new String("123")
```

**원시 자료형** : int, long, double, float, boolean, char 자료형을 원시 자료형이라 한다.. 이러한 자료형들은 new 키워드로 값을 생성할 수 없다.. !!!!! **String은 리터럴 표기방식을 사용할 수 있지만 원시 자료형에 포함 되지 않는다!!!! 특별 대우ㅡㅡ**

```
boolean result = true;
char a = 'A';
int i = 100000;
// String만 둘다 가능... 특별 대우 화나요...
String a = "JAVA"
String b = new String("Python")
```

**Wrapper 클래스** : 원시 자료형에 대응하는 Wrapper 클래스가 있는데 이는 **원시 자료형을 대신하여 사용**할 수 있는 자료형으로, **객체 지향 프로그래밍의 모든 기능을 활용**할 수 있게 해준다.

| **원시 자료형** | **Wrapper 클래스** |
| --- | --- |
| int | integer |
| long | Long |
| double | Double |
| float | Float |
| boolean | Boolean |
| char | Char |

앞으로 공부할 ArrayList, HashMap, HashSet 등은 데이터를 생성할 때 원시 자료형 대신 그에 대응하는 Wrapper 클래스를 사용해야 한다....

\=> 값 대신 객체를 주고 받아 코드를 객체 중심으로 작성하는 데 유리!!

\=> 멀티 스레드 환경에서 동기화를 지원하기 위해서도 Wrapper 클래스는 반드시 필요!!

**문자열 내장 메서드** (내장 메서드: 문자열 객체에 속한 함수...)

\- **equals**: 문자열 2개가 **같은지를 비교**하여 결괏값을 리턴

```
// equals
String a = "hello";
String b = "java";
String c = "hello";

System.out.println(a.equals(b)); // false
System.out.println(a.equals(c)); // true

// equals 메서드와 == 연산자 비교...
String a = "hello";
String b = new String("hello");
System.out.println(a.equals(b)); // true
System.out.println(a == b)l // false

// 값은 같지만 ==은 2개의 자료형이 같은 객체인지를 판별할 떄 사용하는 
연산자이지만 서로 다른 객체아므로 false를 리턴한다...
```

\- **IndexOf**: 문자열에서 **특정 문자열이 시작**되는 위치(인덱스 값)를 리턴

```
String a = "Hello Java";
System.out.println(a.indexOf("Java"); // 6
```

\- **contains** : 문자열에서 **특정 문자열이 포함**되어 있는지 여부를 리턴

```
String a = "Hello Java"
System.out.println(a.contains("Java")); // true
```

\- **charAt** : 문자열에서 **특정 위치의 문자**를 리턴

```
String a = "Hello Java;
System.out.println(a.charAt(6)); // J
```

\- **replaceAll** : 문자열에서 **특정 문자열을 다른 문자열로 바꿀때** 사용

```
String a = "Hello Java;
System.out.println(a.replaceAll("Java", "World")); // "Hello World"
```

\- **substring** : 문자열에서 **특정 문자열을 뽑아낼 떄** 사용

```
String a = "Hello Java;
System.out.println(a.substring(0, 4)); // "Hell
```

\- **toUpperCase**: 문자열을 **모두 대문자로 변경**할 때 사용

```
String a = "Hello Java;
System.out.println(a.toUpperCase()); // "HELLO JAVA"
```

\- **split** : 문자열을 **특정한 구분자로 나누어** 문자열 배열로 리턴

```
String a = "a:b:c:d";
String[] result = a.split(":"); // result는 {"a", "b", "c", "d"}
```

**문자열 포매팅** : 문자열 안에 어떤 값을 삽입하는 방법 (String.format 메서드를 사용)

\- 숫자 바로 대입하기(%d)

```
System.out.println(String.format("I eat %d apples.", 3)); // "I eat 3 apples."
// 숫자를 넣고 싶은 자리에 %d를 입력, 삽입할 숫자를 두번째 파라미터로 전달
// %d : 문자열 포맷 코드..
```

\- 문자열 바로 대입하기(%s)

```
System.out.println(String.format("I eat %s apples.", "five")); // "I eat five apples."
// %s : 문자열을 넣고 싶은 자리에 사용
```

\- **문자열 포맷 코드의 종류**

| **종류** | **설명** |
| --- | --- |
| **%s** | 문자열(String) |
| %c |  문자 1개(Character) |
| %d | 정수(Integer) |
| %f | 부동 소수(floating-point) |
| %o | 8진수 |
| %x | 16진수 |
| %% | 특수 문자 % |

%s는 어떤 형태의 값이든 변환하여 넣을 수 있음 ;;

\- **%%** : 특수 문자 %

```
System.out.println(String.format("Error if %d%%.", 98));
Error is 98%.
```

\- 정렬과 공백 표현하기

```
System.out.println(String.format("%10s", "hi.")); // "           hi."
// %10s : 전체 길이가 10인 문자열 공간에서 대입되는 값(hi)을 가장 오른쪽으로 정렬하고 나머지는 공백으로 남겨두라는 의미
```

\- 소수점 표현하기

```
System.out.println(String.format("%.4f", 3.42134234);; // 3.4213
// %.4f : 소수점 넷째 자리까지만 나타내고 싶어할 때 사용... 
// 길이가 10이고 소수점 넷째 자리까지 표시하고 싶다면... %10.4f
```

\- System.out.printf

```
System.out.printf("I eat %d apples.", 3); // I eat 3 apples.
// System.out.printf 메서드를 사용하면 String.format 메서드가 없어도 사용 가능!!
```

---

**5) StringBuffer** 

: 문자열을 추가하거나 변경할 때 주로 사용하는 자료형

**append** : StringBuffer 객체를 생성하고 문자열을 생성

```
StringBuffer sb = new StringBuffer(); // StringBuffer 객체 sb 생성
sb.append("hello");
sb.append(" ");
sb.append("jump to java");
String result = sb.toString();
System.out.println(result); // "hello jump to java"
```

++) toString() 메서드 사용하기

```
String result = "";
result += "hello";
result += " ";
result += "jump to java";
System.out.println(result); // "hello jump to java"
```

\=> 첫번째 두번쨰 결과는 같지만 내부적으로 객체를 생성하고 메모리를 사용하는 과정은 다르다..

첫번째는 StringBuffer 객체를 한번만 생성하지만... 두번째는 String 자료형에 + 연산이 있을 떄마다 새로운 String 객체를 생성하므로 총 4개의 String 자료향 객체가 만들어 진다... 

\=> 무조건 StringBuffer를 사용하는 것이 좋을까? 

XX 상황에 따라 다르다... StringBuffer 자료형은 String 자료형보다 무거운 편에 속한다...

new StringBuffer()로 객체를 생성하면 String 을 사용할 때보다 메모리 사용량도 많고 속도도 느리기 때문에 **문자열을 추가하거나 변경하는 작업이 많으면 StringBuffer**를, 적으면 String을 사용하는 것이 유리하다

**insert** : **특정 위치에 원하는 문자열을 삽입**

```
StringBuffer sb = new StringBuffer();
sb.append("jump to java");
sb.insert(0, "hello");
System.out.println(sb. toString()); // hello jump to java
```

\- 문제 답-

1\. ((a+b+c)/3), 70

2.

```
public class sol2 {
	public static void main(String[] args) {
		System.out.println(13 % 2);
    }
}
```

3\. pin.substring(0, 6);

4\. pin.charAt(7)); 

5\. a.replaceAll(":", "#")
