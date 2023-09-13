#### **6) 배열**

**배읠의 길이 설정하기**

\- 배열은 바로 옆에 \[\]기호를 붙인다

\- 배열의 길이를 먼저 설정한 뒤, 배열 변수를 생성하고 그 값을 나중에 대입

```
String[] weeks = new String[7];
weeks[0] = "월";
weeks[1] = "화";
weeks[2] = "수";
weeks[3] = "목";
weeks[4] = "금";
weeks[5] = "토";
weeks[6] = "일";
// 초깃값 없이 배열 변수를 만들 때에는 7과 같은 숫잣값을 넣어 길이를 정해 줘야 한다...
// 그렇지 않으면 오류가 발생한다...
```

**배열값에 접근하기**

\- 해당하는 값을 얻으려면 인덱스를 이용하여야 한다

```
String[] weeks = {"월", "화", "수", "목", "금", "토", "일"}
System.out.println(week[3]); // 목

// weeks[3] => weeks배열의 네번째 항목을 의미(0부터 숫자를 세준다)
```

**배열의 길이 구하기**

\- 배열은 보통 for 문과 함께 사용

\- 배열의 길이는 length를 사용

```
String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
// weeks.length = 7
for (int i = 0; i < weeks.length; i++) { 
	System.out.println(weeks[i])
} 
// 월
// 화
// 수
// 목
// 금
// 토
// 일
```

**배열 오류**

\- **ArrayIndexOutOfBoundsException** : 길이와 인덱스 사이에서생기는 오류...

   (파이썬의 인덱스아웃오브레인지 같은 느낌..)

```
System.out.println(weeks[7]); 
// 여덟 번째 배열값이 없으므로 ArrayIndexOutOfBoundsException 오류 발생
```

#### **7) 리스트**

: 배열과 비슷하지만 편리한 기능이 더 많음...

배열의 크기는 정해져 있지만 리스트는 변한다 => **저장할 값의 크기가 명확하지 않은 경우** 리스트를 사용해야 한다!!

**ArrayList**

\- 리스트 자료형에서 가장 일반적으로 사용하는 것(리스트 자료형에는 ArrayList, Vector, LinkedList 등이 있다)

1\. **add** 메서드: 요솟값 추가

```
// 야구공의 시속을 리스트에 추가하는 코드 작성하기
import java.util.ArrayList;

public class Sample {
	public static void main(String[] args) {
    	ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
    }
}
// import 문 : 다른 패키지나 클래스를 현재 코드에서 사용하기 위해 선언하는 문장
// ArrayList를 사용하려면 import java.util.ArrayList와 같은 import 문을 작성해야 한다
// Java.util 패키지는 자바가 기본적으로 제공하는 패키지이다


// 원하는 위치에 넣고 싶다면....
pitches.add(0, "133");  -> 첫번째 위치에 133 삽입
pitches.add(1, "133");  -> 두번째 위치에 133 삽입
```

2\. **get** 메서드 : 특정 인덱스의 값을 추출

```
import java.util.ArrayList;

public class Sample {
	public static void main(String[] args) {
    	ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        # 선수의 특정 투구 속도를 출력하고 싶다면!!!
        System.out.println(pitches.get(1));   // 129
    }
}
```

3\. **size** 메서드 : 요소의 개수를 리턴

```
System.out.println(pitches.size()); // 3
```

4\. **contains** 메서드 : 리스트 안에 해당 항목이 있는지 판별해 그 결과를 boolean으로 리턴한다...

```
System.out.println(pitches.contains("142")); // true
```

5\. **remove** 메서드 : 2가지 방식이 있는데... 1. remove(객체), 2. remove(인덱스)

```
// remove(객체)를 사용하면 리스트에서 객체에 해당하는 항목을 삭제 , 그 결과로 true 또는 false를 반환
System.out.println(pitches.remove("129")); // true

// remove(인덱스)를 사용하면 인덱스에 해당하는 항목을 삭제한 뒤, 그 항목을 리턴
System.out.println(pitches.remove(0)); // 138
```

**제네릭스(generics)**

: 자료형을 안전하게 사용할 수 있도록 만들어 주는 기능(자료형을 강제로 바꿀 때 생길 수 있는 캐스팅 오류를 줄인다)

\- 일반적인 방식 : ArrayList<String> pitches = new ArrayList<String>();

\- **선호되는 방식** : ArrayList<String> pirches = new ArrayList**<>**();  

\=>  <>에 해당하는 부분의 자료형은 명확하므로 굳이 적지 않아도 된다... (오히려 적으면 인텔리제이에서는 경고 메세지..)

\- 제네릭스를 사용하지 않는다면... 값을 가져올 때 매번 Object 자료형(모든 객체가 상속하고 있는 가장 기본적인 자료형)에서 String 자료형으로 변환해야한다.... 

```
// 제네릭스를 사용하지 않은 예시
ArrayList pitches = new ArrayList();
pitches.add("138");
pitches.add("129");

// 형 변환이 필요함
String one = (String) pitches.get(0);
String two = (String) pirches.get(1);

// 제네릭스를 사용한 예시
ArrayList<String> pitches = new ArrayList<>();
pitches.add("138");
pitches.add("129");

// 형변환이 필요없음
String one = pitches.get(0)
String two = pitches.get(1)
```

**다양한 방법으로 ArrayList 만들기**

1\. ArrayList의 **add 메서드** 사용 : ArrayList 객체에 요소 추가

```
import java.util.AttayList;

public class Sample {
	public staatic void main(String[] args) {
    	ArrayList<String> pitches = new ArrayList<>(); // 제네릭스를 사용한 표현
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        System.out.println(pitches); // [138, 129, 142]
```

2\. 이미 **문자열 배열**이 있다면...(java.util.Arrays 클래스의 asList 메서드를 사용)

```
import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
	public static void main(String[] args) {
    	String[] data = {"138", "129", "142"}; // 이미 투구 수 데이터 배열이 있다
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches);  // [138, 129, 142]
    }
}
```

3\. 문자열 배열 대신 **문자열 자료형**을 여러개 전달하여 생성할 수도 ....

```
import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
	public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        System.out.println(pitches);  // [138, 129, 142]
    }
}
```

**String.join("구분자", 리스트 객체)**

: ArrayList의 각 요소를 무언가로(콤마(,))로 구분하여 1개의 문자열로 만들기...

1) join이 없다면... 콤마를 하나하나 추가하여 마지막에 콤마는 제거한 후 출력

2) join을 사용한다면 간단하게 처리할수 있다!!

```
import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
	public static void main(String[] args) {
    	ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result = String.join(",", pirches);
        System.out.println(result); // "138, 129, 142"
    }
}
```

**리스트 정렬하기**

: 순서대로 정렬하기 위해서는 리스트의 **sort 메서드** 사용하기

```
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sample {
	public static void main(String[] args) {
    	ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        pitches.sort(Comparator.naturalOrder()); // 오름차순 정렬
        System.out.println(pitches); // [129, 138, 142]
    }
}
```

\- 오름차순 정렬 : Comparator.naturalOrder()

\- 내림차순 정렬 : Comparator.reverseOrder()

---

#### **8) 맵**

\- 딕셔너리와 유사하고  키와 값을 한 쌍으로 갖는 자료형

\- 배열처럼 순차적으로 요솟값을 구하지 않고 키를 이용해 값을 얻는다

\- HashMap, LinkedHashMap, TreeMap 등이 있다...

**HashMap** : 맵 자료형의 가장 기본

1\. **put** 메서드 : key와 value를 추가

```
import java.util.HashMap;
public class Sample {
	public static void main(String[] args) {
    	HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
    }
}
// key, value에 String 이외의 자료형은 사용할 수 없다
```

2\. **get** 메서드 : key에 해당하는 value를 얻음

```
import java.util.HashMap;
public class Sample {
	public static void main(String[] args) {
    	HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.get("people")); // 사람
    }
}

// 맵의 key에 해당하는 value가 없을 떄 get 메서드를 사용하면 null이 리턴
System.out.println(map.get("java")); // null

// null 대신 기본값을 얻고 싶다면 getOrDefault 메서드를 사용하면 된다
System.out.println(map.getOrDefault("java", "자바")); //자바
```

3\. **containsKey** 메서드 : 맵에 해당 key가 있는지를 true 또는 false로 리턴

```
HashMap<String, String> map = new HashMap<>();
map.put("people", "사람");
map.put("baseball", "야구");
System.out.println(map.containsKey("people")); // true
```

4\. **remove** 메서드 : 맵의 항목을 삭제하는 메서드로, 해당 key의 항목을 삭제한 후 value 값을 리턴

```
HashMap<String, String> map = new HashMap<>();
map.put("people", "사람");
map.put("baseball", "야구");
System.out.println(map.remove("people")); // 사람
```

5\. **size** 메서드 : 맵 요소의 개수를 리턴

```
HashMap<String, String> map = new HashMap<>();
map.put("people", "사람");
map.put("baseball", "야구");
System.out.println(map.containsKey("people")); 
System.out.println(map.size()); // 1
```

6\. keySet 메서드 : 맵의 모든 key를 모아서 리턴

```
import java.util.HashMap;

public class Sample {
	public static void main(String[] args) {
    	HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.our.println(map.keySet()); // [baseball, people]
    }
}
```

++ ) 맵의 가장 큰 특징은 순서에 의존하지 않고 key로 value 값을 가져오는것이지만... 가끔 map에 입력된 순서대로 데이터를 가져오거나 입력한 key에 의해 정렬하도록 저장하고 싶을 수 있다...

\- LinkedHashMap : 입력된 순서대로 데이터를 저장

\- TreeMap : 입력된 key의 오름차순으로 데이터를 저장

---

#### **9) 집합**

: **집합과 관련된 것을 쉽게 처리**하기 위해 만든것으로... **HashSet**, TreeSet, LinkedHashSet 등이 있다...

\- 특징 2가지...

1\. **중복을 허용하지 않는다**

2, **순서가 없다**(리스트와 배열은 순서가 있죠..., 순서가 없는 자료형이라 인덱싱을 지원하지 않는다)

**교집합, 합집합, 차집합 구하기**

1\. 집합 자료형 2개 만들기

2\. 교집합 구하기

3\. 합집합 구하기

4\. 차집합 구하기

```
import java.util.Arrays;
import java.util.HashSet;
 
 public class Sample {
 	public static void main(Stirng[] args) {
    	// 집합 자료형 두개 만들기 
    	HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        
        // (교집합) = retainAll 메서드 이용
        HashSet<Integer> intersection = new HashSet<>(s1); // s1으로 intersection 이라는 HashSet 객체를 복사해 생성
        intersection.retainAll(s2); // 교집합 수행
        System.out.println(intersection); // [4, 5, 6]
        
        // (합집합) = addAll 메서드 이용
        HashSet<Integer> union = new HashSet<>(s1); // s1으로 union 생성
        union.addAll(s2); // 합집합 수행
        System.out.println(union);  // [1, 2, 3, 4, 5, 6, 7, 8, 9]
        
        // (차집합) = removeAll 메서드 이용
        HashSet<Integer> substract = new HashSet<>(s1); // s1으로 substract 생성
        substract.removeAll(s2); // 차집합 수행
        System.out.println(substract); // [1, 2, 3]
    }
}
```

**집합 자료형과 관련된 메서드** - add, addAll, remove

1\. **add**: 집합 자료형에 **값을 추가**

```
import java.util.HashSet;

public class Sample {
	public static void main(String[] args) {
    	HashSet<Stirng> set = new HashSet<>();
        set.add("Jump");
        set.add("To");
        set.add("Java");
        System.our.println(set); // [Java, To, Jump]
    }
}
```

2\. **addAll** : 한꺼번에 **여러개 값을 추가**

```
import java.util.HashSet;

public class Sample {
	public static void main(String[] args) {
    	HashSet<Stirng> set = new HashSet<>();
        set.add("Jump");
        set.add("To");
        set.addAll(Arrays.asList("To", "Java"));
        System.our.println(set); // [Java, To, Jump]
    }
}
```

3. **remove** : 특정 값을 **제거**할 떄 사용

```
import java.util.HashSet;

public class Sample {
	public static void main(String[] args) {
    	HashSet<Stirng> set = new HashSet<>(Arrays.asList("Jump", "To", "Java"));
        set.add("To");
        System.our.println(set); // [Java, Jump]
    }
}
```

---

**10) 상수 집합**

 : **enum 자료형**은 서로 **연관 있는** **여러 개의 상수 집합을 정의**할 때 사용

```
public class Sample {
	enum CoffesType {
    	AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };
    
    public static void main(String[] args) {
    	System.out.println(CoffeeType.AMERICANO);  // AMERICANO
        System.out.println(CoffeeType.ICE_AMERICANO);  // ICE_AMERICANO
        System.out.println(CoffeeType.CAGE_LATTE);   // CAFE_LATTE
    }
}


// 반복문에서도 사용 가능
public class Sample {
	enum CoffesType {
    	AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };
    
     public static void main(String[] args) {
     	for(CoffeeType type: CoffeeType.values()) {
        	System.out.println(type);  // 순서대로 AMERICANO, ICE_AMERICANO, CAFE_LATTE 출력
        }
    }
}
```

\- enum 사용의 장점

1\. 매직 넘버를 사용할 때보다 코드가 명확하다

2\. 잘못된 값을 사용해 생길 수 있는 오류를 막을 수 있다

---

#### **11) 형 변환과 final**

: 형 변환이란 자료형을 다른 자료형으로 바꾸는 것 ("123"과 같은 문자열을 123과 같은 숫자형으로)

**형변환** 

1.  문자열을 정수로

```
String num = "123";
//문자열을 정수로 바꾸기 위해서는 Integer 클래스를 사용해야 한다

public class Sample {
	public static void main(String[] args) {
    	String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n); 			// 123
    }
}
```

2\. 정수를 문자열로 : 정수 앞에 빈 문자열을 더해 주기 

```
public class Sample {
	public static void main(String[] args) {
    	int n = 123;
        String num = "" + n;
        System.out.println(num);  // 123
    }
}
```

 ++)  String.valueOf(정수), Integer.toString(정수) 모두 정수를 문자열로 바꾼다....

```
public class Sample {
	public static void main(String[] args) {
    	int n = 123;
        String num1 = String.valueOf(n);
        String num2 = Integer.toString(n);
        System.out.println(num1);   // 123
        System.out.println(num2);   // 123
    }
}
```

3\. 소수점이 포함되어 있는 숫자 형태의 문자열의 변환

```
public class Sample {
	public static void main(String[] args) {
    	String num = "123.456";
        double d = Double.parseDouble(num);
        System.out.println(d);    // 123.456
    }
}
```

4\. 정수와 실수 사이의 형 변환

```
public class Sample {
	public static void main(String[] args) {
    	int n1 = 123;
        double d1 = n1;
        System.out.println(d1);  // 123.0
        
        double d2 = 123.456;
        int n2 = (int) d2;
        System.out.println(n2);  // 123
    }
}
```

5\. 실수 형태의 문자열을 정수로 바꿀 때

```
public class Sample {
	public static void main(String[] args) {
    	String num = "123.456";
        int n = Integer.parseInt(num);  // 실수 형태의 문자열을 정수로 변환할 경우 numberformatException이 발생
    }
}

// 실수 형태의 문자열을 숫자형으로 바꾸려면... Double.parseDouble()을 이용해 실수로 변환 후 사용
```

**final**

: 자료형에서 값을 단 한 번만 설정할 수 있게 강제하는 키워드 (다시 설정 안됩니다)

```
public class Sample {
	public static void main(String[] args) {
    	final int n = 123;   // final로 설정하면 값을 바꿀 수 없다
        n = 456;
    }
}
```

리스트의 경우도 final로 선언하면 재할당은 불가능...(더하거나 뺴기는 가능)

```
import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
	public static void main(String[] args) {
    	final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        a = new ArrayList<>(Arrays,asList("c", "d")); // 컴파일 오류 발생
    }
}

// 그러므로 final은 프로그램을 수행하면서 그 값이 바뀌면 안 될 때 사용한다
```

리스트의 재할당 뿐만아니라 더하거나 빼는 것도 할 수 없게 하고 싶다면... **List.of**를 작성하여 수정할 수 없는 리스트로 만들 수 있다!!!

```
import java.util.List;

public class Sample {
	public static void main(String[] args) {
    	final List<String> a = List.of("a", "b");
        a.add("c"); // UnsupportedOperationException 발생
    }
}
```

++) 문제 풀이

6\. myList.sort(Comparator,reverseOrder());

7\. String result = String.join(" ", myList);

8\. int result = grade.remove("B")

9\. ArrayList<Integer> result = new ArratList<>(temp);

```
10. 
public class Sample{
	enum CoffeeType {
    	AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };
    
 ...
 
 printCoffeePrice(CoffeeType,AMERICANO);
```