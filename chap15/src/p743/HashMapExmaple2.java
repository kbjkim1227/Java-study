package p743;

import java.util.HashMap;
import java.util.Map;

public class HashMapExmaple2 {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();

        map.put(new Student(1, "홍길동"), 95);
        map.put(new Student(1, "홍길동"), 95);//학번과 이름이 동일한 학생을 키로 저장
        
        System.out.println("총 Entry 수: " + map.size());//저장된 총 
        //System.out.println(map.get(new Student(1, "홍길동"))); 
        /* 두 Entry의 Student 객체는 동등객체인 상태이므로 나중에 처리된 90인 홍길동만 저장됨 */
    }
}