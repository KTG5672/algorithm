# 자료구조
## Array
<details>
  <summary>개념</summary>
  
  ### Array

  연관된 data를 메모리 상에 **연속적이며 순차적**으로 **미리 할당된 크기**만큼 저장하는 자료구조
  
  ### 연산 시간 복잡도
  
  - 조회 : O(1) - random access 주소 값을 미리 알고 있음! 순차적 접근 필요 X
  - 마지막 인덱스에 추가/삭제 : O(1)
  - 중간 인덱스에 삽입/삭제 : O(n) - 데이터의 인덱스를 밀거나 떙겨야하므로
  - 탐색: O(n) - 순차적으로 탐색
  
  조회에서 사용 유리, Fixed Size 이므로 메모리 낭비나 overhead가 발생


  
  **Array 사용 시 size를 넘게 되었을 경우?**
  
  1. 기존 size 보다 큰 Array를 선언 후 데이터를 옮겨 할당한다 (Dynamic Array)
  2. Linked List를 사용하여 데이터 추가 시 메모리 할당을 하는 방식을 사용
  
  Java ArrayList → Dynamic Array?

---
  ### Dynamic Array

  Array의 경우 size가 고정 되었기 때문에 설정한 size 보다 데이터의 개수가 넘으면 저장할 수 없지만
  
  Dynamic Array 같은 경우 저장 공간이 가득 차게되면 **resize하여 유동적으로 데이터를 저장**하는 방식
  
  **resize 하는 방식**
  
  size를 늘린 Array를 생성하고 데이터를 옮겨주고, 기존 Array는 메모리 해제
  
  대표적으로 2배 size를 할당하는 방법 (doubling)

  
  ### 연산 시간 복잡도
  
  - 조회 : O(1) - random access 주소 값을 미리 알고 있음! 순차적 접근 필요 X
  - 마지막 인덱스 데이터 추가 : O(1) → resize 시 O(n)지만 가끔 발생 하므로 O(1)
  - 마지막 인덱스 데이터 삭제 : O(1)
  - 중간 인덱스에 삽입/삭제 : O(n) - 데이터의 인덱스를 밀거나 떙겨야하므로
  - 탐색: O(n) - 순차적으로 탐색
  
  **vs Linked List**
  
  장점
  
  - 데이터 접근과 할당이 O(1)으로 빠르다. → 단 Index 로 접근 시
  - 마지막 인덱스 추가/삭제가 빠르다 O(1)
  
  단점
  
  - resize 시 overhead가 발생
  - 미리 메모리를 할당 받으므로 메모리 공간 낭비가 발생
</details>
<details>
  <summary>문제</summary>
  
  * [BOJ_10808](https://github.com/KTG5672/algorithm/blob/cd9a39e5151169ec7555133a6f555bef71441f87/src/array/practice/BOJ_10808.java)
  * [배열에서 특정 합이 있는지 찾기](https://github.com/KTG5672/algorithm/blob/cd9a39e5151169ec7555133a6f555bef71441f87/src/array/practice/FindSumByArray.java)
</details>

## Linked List
<details>
  <summary>개념</summary>
  
  ### Linked List

  Node 라는 구조체로 이루어진 자료구조, **Node는 데이터 값과 다음 Node의 address를 저장** 하는데,

  **물리적으로는 비 연속적**으로 저장이 되지만 Node가 다음 Node의 address를 가르킴으로써 
  
  **논리적인 연속성**을 가진다.

  
  ### 논리적 연속성
  
  각 Node들은 next address 정보를 가지고 있기 떄문에 논리적으로 연속성을 유지하면서 연결
  
  Array에서는 물리적 메모리 상에 연속적으로 저장하는 방법에 비해 메모리 연속성을 유지 하지
  
  않아도 되기에 **메모리 사용이 좀 더 자유롭다.**
  
  대신 하나의 데이터 저장 시 next address를 저장해야 하기 때문에 **하나의 값에 대한 메모리 양이**
  
  **미세하게 증가한다.**

  
  ### 연산 시간 복잡도
  
  - 탐색 : O(n) - index n에 대한 탐색
  
  - 중간 인덱스 데이터 추가/삭제 : O(1) - next address의 주소 값만 변경하면 되기 때문
  
  - 검색 : O(n) - 값에 대한 검색
  
</details>
<details>
  <summary>문제</summary>
  
  * [BOJ_1406](https://github.com/KTG5672/algorithm/blob/main/src/linkedlist/practice/BOJ_1406.java)
  * [BOJ_1158](https://github.com/KTG5672/algorithm/blob/main/src/linkedlist/practice/BOJ_1158.java)
  * [BOJ_5397](https://github.com/KTG5672/algorithm/blob/main/src/linkedlist/practice/BOJ_5397.java)
  * 손 코딩 문제
    - 문제 1
      원형 연결리스트 에서 임의의 노드 하나가 주어 졌을때, 리스트의 길이를 구하는 방법
      답) 동일 노드를 저장 후 같은 노드가 나올 때 까지 탐색 O(N)
    
    - 문제 2
      중간에서 만나는 두 연결 리스트의 시작점들이 주어졌을 때, 만나는 지점
      답) 두 연결리스트의 각 길이를 구한 뒤 길이가 각 길이의 차이를 긴 리스트에서 먼저 이동하고 그 다음 각자 하나씩 이동하며 비교
    
    - 문제 3
      어떤 연결리스트에 사이클이 있는지 판단 하는 방법
      답) Floyd's Cycle-finding Algorithm : 한칸 이동하는 커서와 두칸 이동하는 커서가 각각 이동 시 만나면 사이클이 있는 것
</details>

## Stack
<details>
  <summary>개념</summary>
  
  ### Stack
  쌓아놓은 더미 라는 뜻으로 책상에 쌓인 책, 접시 더미 등을 연상
  **후입 선출 (LIFO)** 의 자료구조
  제일 상단의 데이터를 넣고 빼는 구조
  
  ### LIFO (Last In First Out)
  가장 최근에 넣은 데이터가 가장 먼저 나오는 자료구조 (Last In First Out)
  
  ### 시간 복잡도
  - top : O(1) - 제일 상단의 데이터를 조회
  - push : O(1) - 제일 상단의 데이터를 추가
  - pop : O(1) - 제일 상단의 데이터를 반환하고 삭제
  
  ### 활용 예시
  Function Call Stack, 후위 표기법 연산, 괄호 유효성 검사, 웹 브라우저 방문 기록 (뒤로가기)

</details>
<details>
  <summary>문제</summary>
  
  * [BOJ_10828](https://github.com/KTG5672/algorithm/blob/main/src/stack/practice/BOJ_10828.java)
</details>

