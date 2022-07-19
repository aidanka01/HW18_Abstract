public class Sheep extends Animal{

    public Sheep(int weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }



    @Override
    public String toString() {
        return "Sheep{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
