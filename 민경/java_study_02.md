# JAVA_자료형_02

작성 일시: 2023년 9월 9일 오후 2:06

## 03-06 배열

> 배열의 길이 설정하기
배열값에 접근하기
배열의 길이 구하기
배열 오류
> 

### 배열의 길이 설정하기

배열의 길이를 먼저 설정한 뒤, 배열 변수를 생성하고 그 값을 나중에 대입하는 방법

*초깃값 없이 배열 변수를 만들 때 숫자를 넣지 않으면 컴파일 오류가 발생 !!!*

```java
String[] weeks = new String[7];  // []에 숫자를 안 넣으면 컴파일 오류
weeks[0] = "월";
weeks[1] = "화";
weeks[2] = "수";
weeks[3] = "목";
weeks[4] = "금";
weeks[5] = "토";
weeks[6] = "일";
```

![Untitled](JAVA_%E1%84%8C%E1%85%A1%E1%84%85%E1%85%AD%E1%84%92%E1%85%A7%E1%86%BC_02%20a6ec7b8bc6fb43378c2d7cab30e5855e/Untitled.png)

### 배열 값에 접근하기

인덱스를 이용하여 얻으려는 값을 얻는다

*순서는 0부터 셉니다 !!!*

```java
String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
System.out.println(weeks[3]);
// weeks[3]은 weeks 배열의 네 번째 항목 ( python과 동일 )
```

### 배열의 길이 구하기

lenght 사용

배열은 보통 *for문*과 함께 사용

*( 배열의 길이만큼 for문을 반복하기 때문에 배열의 길이를 알아야함 )*

```java
String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
for (int i = 0; i < weeks.length; i++) {
    System.out.println(weeks[i]);
}
```

### 배열 오류

```java
ArrayIndexOutOfBoundsException
```

*자바 코드에서 가장 많이 보이는 오류 !!!*

>> python의 indexerror 같은 느낌…??

## 03-07 리스트

> ArrayList
제네릭스
다양한 방법으로 ArrayList 만들기
String.join
리스트 정렬하기
> 

### ArrayList

*ArrayList 자료형에는 ArrayList / Vector / LinkedList 등이 있음*

1. **add**

ArrayList의 add 메서드를 통해 요소 값을 추가

```java
import java.util.ArrayList;

public class Sample {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
    }
}
```

*ArrayList를 사용하려면 import java.util.ArrayList 문을 작성해야함*

```java
pitches.add(0, "133");    // 첫번째 위치에 133 삽입.
pitches.add(1, "133");    // 두번째 위치에 133 삽입.
```

1. **get**

ArrayList의 get 메서드를 통해 특정 인덱스 값을 추출

```java
import java.util.ArrayList;

public class Sample {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        System.out.println(pitches.get(1));    // 129
    }
}
```

1. **size**

ArrayList의 요소 갯수를 리턴

```java
(... 생략 ...)
System.out.println(pitches.size());
```

1. **contains**

리스트 안에 해당 항목이 있는지를 판별해 boolean으로 리턴

```java
(... 생략 ...)
System.out.println(pitches.contains("142"));    // True
```

1. **remove**
    - remove(객체)
        
        *리스트에서 객체에 해당하는 항목을 삭제한 뒤, 그 결과로 true 또는 false를 리턴*
        
    - remove(인덱스)
        
        *인덱스에 해당하는 항목을 삭제한 뒤, 그 항목을 리턴*
        

```java
(... 생략 ...)
System.out.println(pitches.remove("129"));  // 129를 리스트에서 삭제, true 리턴
```

```java
(... 생략 ...)
System.out.println(pitches.remove(0));  // pitches의 첫 번째 항목 138이므로, 138 삭제 138을 리턴
```

### 제네릭스

자료형을 안전하게 사용할 수 있도록 만들어 주는 기능

*제네릭스를 사용하면 자료형을 강제로 바꿀 때 생길 수 있는 캐스팅 오류응 줄일 수 있음*

```java
// 일반적인 방식
ArrayList<String> pitches = new ArrayList<String>();

// 선호되는 방식
ArrayList<String> pitches = new ArrayList<>();
```

제네릭스를 사용하지 않은 예

```java
ArrayList pitches = new ArrayList();
pitches.add("138");
pitches.add("129");

String one = (String) pitches.get(0);    // Object 자료형을 String 자료형으로 형 변환
String two = (String) pitches.get(1);
```

*주의할 점은 pitches에는 String 외의 다른 객체도 넣을 수 있어서 형 변환 오류가 발생할 수 있다는 것*

제네릭스 사용 버전

```java
ArrayList<String> pitches = new ArrayList<>();
pitches.add("138");
pitches.add("129");

String one = pitches.get(0);  // 형 변환이 필요없다.
String two = pitches.get(1);  // 형 변환이 필요없다.
```

*제네릭스로 자료형을 선언만 하면 그 이후로는 자료형을 형 변환하는 과정이 필요 없다. pitches에는 반드시 String 자료형만 추가되어야 한다는 것을 컴파일러가 이미 알기 때문 !!!*

### 다양한 방법으로 ArrayList 만들기

add 메서드를 사용하면 ArrayList 객체에 요소를 추가할 수 있음

```java
import java.util.ArrayList;

public class Sample {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>();  // 제네릭스를 사용한 표현
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        System.out.println(pitches);  // [138, 129, 142] 출력
    }
}
```

But, 이미 문자열 배열이 있으면 AraayList 좀 더 편하게 생성 가능

```java
import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        String[] data = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches);  // [138, 129, 142] 출력
    }
}
```

Or, String 배열 대신 String 자료형을 여러 개 전달하여 생성할 수 있음

```java
import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        System.out.println(pitches);
    }
}
```

### String.join

ArrayList 각 요소를 ‘,’로 구분해서 1개ㅐ의 문자열로 만들기

```java
import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result = String.join(",", pitches);
        System.out.println(result);  // 138,129,142 출력
    }
}
```

*String.join은 문자열 배열에서도 사용 가능 !!!*

```java
public class Sample {
    public static void main(String[] args) {
        String[] pitches = new String[]{"138", "129", "142"};
        String result = String.join(",", pitches);
        System.out.println(result);  // 138,129,142 출력
    }
}
```

### 리스트 정렬하기

ArrayList를 순서대로 정리하기 위해 sort 메서드 사용

- 오름차순(순방향) 정렬 - Comparator.naturalOrder()
- 내림차순(역방향) 정렬 - Comparator.reverseOrder()

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sample {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        pitches.sort(Comparator.naturalOrder());  // 오름차순으로 정렬
        System.out.println(pitches);  // [129, 138, 142] 출력
    }
}
```

## 03-08 맵

> HashMap
> 

맵(Map)은 대응관계를 쉽게 표현할 수 있게 해주는 자료형

*키(key)와 값(value)을 한 쌍으로 갖는 자료형*

>> 맵 자료형에는 *HashMap / LinkedHashMap / TreeMap* 등이 있음

### HashMap

1. **put**

put 메서드는 key와 value를 추가할 수 있음

```java
// key와 value가 String인 HashMap을 만들기

import java.util.HashMap;

public class Sample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
    }
}
```

1. **get**

key에 해당하는 value을 얻을 때 사용

```java
import java.util.HashMap;

public class Sample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.get("people")); // "사람" 출력
    }
}
```

1. **containsKey**

맵에 해당 key가 있는지를 boolean 값으로 리턴

```java
(... 생략 ...)
HashMap<String, String> map = new HashMap<>();
map.put("people", "사람");
map.put("baseball", "야구");
System.out.println(map.containsKey("people"));  // true 출력
```

1. **remove**

맵의 항목을 삭제하는 메서드로, 해당 key 항목을 삭제한 후 value 값을 리턴

```java
(... 생략 ...)
HashMap<String, String> map = new HashMap<>();
map.put("people", "사람");
map.put("baseball", "야구");
System.out.println(map.remove("people"));  // "사람" 출력
```

1. **key**

맵 요소의 갯수를 리턴

```java
(... 생략 ...)
HashMap<String, String> map = new HashMap<>();
map.put("people", "사람");
map.put("baseball", "야구");
System.out .println(map.remove(“people”)); // 사람 출력
System.out.println(map.size());    // 1
```

1. **keySet**

맵의 모든 key를 모아서 리턴

```java
import java.util.HashMap;

public class Sample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.keySet());  // [baseball, people] 출력
    }
}
```

집합 자료형은 리스트 자료형으로 바꾸어 사용 가능

```java
ArrayList<String> keyList = new ArrayList<>(map.keySet());
```

## 03-09 집합

> 집합 자료형의 2가지 특징
교집합, 합집합, 차집합 구하기
집합 자료형과 관련된 메서드 = add / addAll / remove
> 

집합(Set) 자료형은 집합과 관련된 것을 쉽게 처리하기 위해

*HashSet / TreeSet / LinkedHashSet 등이 있음*

### 집합 자료형의 2가지 특징

- 중복을 허용하지 않음
- 순서가 없음 ( unordered ) >> *인덱싱으로 값을 얻을 수 없음*

### 교집합, 합집합, 차집합 구하기

```java
// 집합 자료형 2개 우선 만든다

import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
    }
}
```

1. **교집합 구하기**

retainAll 메서드 이용

![Untitled](JAVA_%E1%84%8C%E1%85%A1%E1%84%85%E1%85%AD%E1%84%92%E1%85%A7%E1%86%BC_02%20a6ec7b8bc6fb43378c2d7cab30e5855e/Untitled%201.png)

```java
import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> intersection = new HashSet<>(s1);  // s1으로 intersection 생성
        intersection.retainAll(s2);  // 교집합 수행
        System.out.println(intersection);  // [4, 5, 6] 출력
    }
}
```

1. **합집합 구하기**

addAll 메서드 사용  >>  *중복 값은 하나만 포함*

![Untitled](JAVA_%E1%84%8C%E1%85%A1%E1%84%85%E1%85%AD%E1%84%92%E1%85%A7%E1%86%BC_02%20a6ec7b8bc6fb43378c2d7cab30e5855e/Untitled%202.png)

```java
import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> union = new HashSet<>(s1);  // s1으로 union 생성
        union.addAll(s2); // 합집합 수행
        System.out.println(union);  // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력
    }
}
```

1. **차집합 구하기**

removeAll 메서드 사용

![Untitled](JAVA_%E1%84%8C%E1%85%A1%E1%84%85%E1%85%AD%E1%84%92%E1%85%A7%E1%86%BC_02%20a6ec7b8bc6fb43378c2d7cab30e5855e/Untitled%203.png)

```java
import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> substract = new HashSet<>(s1);  // s1으로 substract 생성
        substract.removeAll(s2); // 차집합 수행
        System.out.println(substract);  // [1, 2, 3] 출력
    }
}
```

### 집합 자료형과 관련된 메서드 - add / addAll / remove

1. **add**

집합 자료형에 값을 추가할 때 사용

```java
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Jump");
        set.add("To");
        set.add("Java");
        System.out.println(set);  // [Java, To, Jump] 출력
    }
}
```

1. **addAll**

값을 한꺼번에 여러 개 추가할 때 사용

```java
import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Jump");
        set.addAll(Arrays.asList("To", "Java"));
        System.out.println(set);  // [Java, To, Jump] 출력
    }
}
```

1. **remove**

특정 값을 제거할 때 사용

```java
import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("Jump", "To", "Java"));
        set.remove("To");
        System.out.println(set);  // [Java, Jump] 출력
    }
}
```

## 03-10 상수 집합

![Untitled](JAVA_%E1%84%8C%E1%85%A1%E1%84%85%E1%85%AD%E1%84%92%E1%85%A7%E1%86%BC_02%20a6ec7b8bc6fb43378c2d7cab30e5855e/Untitled%204.png)

```java
public class Sample {
    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };

    public static void main(String[] args) {
        System.out.println(CoffeeType.AMERICANO);  // AMERICANO 출력
        System.out.println(CoffeeType.ICE_AMERICANO);  // ICE_AMERICANO 출력
        System.out.println(CoffeeType.CAFE_LATTE);  // CAFE_LATTE 출력
    }
}
```

## 03-11 형 변환과 final

> 형 변환
final
> 

### 형 변환

문자열을 정수로 바꾸려면 Integer 클래스 사용

```java
public class Sample {
    public static void main(String[] args) {
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n);  // 123 출력
    }
}
```

정수를 문자열로 바꾸는 방법  >>  *정수 앞에 빈 문자열 “”을 더해주는 것*

```java
public class Sample {
    public static void main(String[] args) {
        int n = 123;
        String num = "" + n;
        System.out.println(num);  // 123 출력
    }
}
```

>>   `*String.valueOf(정수)`, `Integer.toString(정수)`*

```java
public class Sample {
    public static void main(String[] args) {
        int n = 123;
        String num1 = String.valueOf(n);
        String num2 = Integer.toString(n);
        System.out.println(num1);  // 123 출력
        System.out.println(num2);  // 123 출력
    }
}
```

소수점 형태의 문자열 형 변환   >>   *`Double.parseDouble` , `Float.parseFloat`*

```java
public class Sample {
    public static void main(String[] args) {
        String num = "123.456";
        double d = Double.parseDouble(num);
        System.out.println(d);
    }
}
```

### final

자료형에 값을 단 한 번만 설정할 수 있게 강제하는 키워드

*값을 한 번 설정하면 그 값을 다시 설정할 수 없음*

```java
public class Sample {
    public static void main(String[] args) {
        final int n = 123;  // final로 설정하면 값을 바꿀 수 없다.
        n = 456;  // 컴파일 오류 발생
    }
}
```

리스트의 경우도 final 선언하면 재할당 불가능

```java
import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        a = new ArrayList<>(Arrays.asList("c", "d"));  // 컴파일 에러 발생
    }
}
```