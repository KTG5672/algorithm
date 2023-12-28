# Algorithm
## Array
<details>
  <summary>개념</summary>
  
  ### Array

  연관된 data를 메모리 상에 **연속적이며 순차적**으로 **미리 할당된 크기**만큼 저장하는 자료구조
  
  **연산 시간 복잡도**
  
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
  
  **연산 시간 복잡도**
  
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
</details>

