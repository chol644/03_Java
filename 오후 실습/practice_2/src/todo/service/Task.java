package todo.service;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task implements Comparable<Task> {
    private int priority; // 할 일 우선순위(1~5, 1이 높음)
    private String content;

    public String toString(){
        return "[우선순위: " + priority + "]"+content;
    }

    @Override
    public int compareTo(Task other) {
        // 현재 우선순위와 전달받은 우선순위 비교
        // 양수가 나오는 경우 자리 변경
        int priorityCompare = this.priority - other.priority;

        //양수(자리바꿈), 음수(유지)
        if (priorityCompare != 0) return priorityCompare;

        //우선순위가 같으면 content 오름 차순으로 정렬
        return this.content.compareTo(other.content);


    }
}
