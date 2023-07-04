package me.whiteship.refactoring._17_message_chain._37_hide_delegate;

public class Person {

    private String name;

    private Department department;

    private Person manager;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
//        setManager(department);
    }

//    public void setManager(Department department) {
//        this.manager = department.getManager();
//    }

    Person getManager() {
//        return this.department.getManager();
        // department의 manager에서 manager로 코드를 변경해도 client쪽에 영향 없음
        return this.manager;
    }
}
