package TNS_Java_Package;
class Person {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class GetSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person pr = new Person();
        pr.setAge(45);
        pr.setName("Ram");
        System.out.println(pr.getName() + " : " + pr.getAge());
	}

}
