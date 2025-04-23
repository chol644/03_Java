package ch12.sec03.exam02;

public class Student {
    private int no;
    private String name;

    public Student(int no, String name) { //멤버 필드 초기화 생성자
        this.no = no;
        this.name = name;
    }
    public int getNo() { return no; } //getter
    public String getName() { return name; } //getter

    @Override
    public int hashCode() {
        int hashCode = no + name.hashCode();
        return hashCode;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student target) {
            if(no == target.getNo() && name.equals(target.getName())) {
                return true;
            }
        }
        return false;
    }
}