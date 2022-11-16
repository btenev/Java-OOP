package P6_Animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender){
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public void setName(String name) {
        verifyParam(name);
        this.name = name;
    }

    public void setAge(int age) {
        if(age < 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    public void setGender(String gender) {
        verifyParam(gender);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSimpleName() {
        return this.getClass().getSimpleName();
    }



//    public String produceSound() {
//        String sound = null;
//        switch (getName()) {
//            case "Dog":
//                sound = "Woof!";
//                break;
//            case "Cat":
//                sound = "Meow meow";
//                break;
//            case "Frog":
//                sound = "Ribbit";
//                break;
//            case "Kitten":
//                sound = "Meow";
//                break;
//            case "Tomcat":
//                sound = "MEOW";
//                break;
//        }
//        return sound;
//    }

    public String produceSound() {
        return null;
    }

    public static void verifyParam (String param) {
        if (param.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getSimpleName()).append(System.lineSeparator());
        sb.append(this.name).append(" ").append(this.age).append(" ").append(this.gender).append(System.lineSeparator());
        sb.append(produceSound());
        return sb.toString();
    }
}
