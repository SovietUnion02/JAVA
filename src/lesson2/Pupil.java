package lesson2;

public class Pupil {

    protected int age;
    String progress;
    private String love;
    public String alias;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("О дурак!!");
            age = 3;
        }
        this.age = age;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public static void answer() {
        prepAnswer();
        System.out.println("Где Украина?! Она тут - *Указывает на сердце");
    }

    public static void pause() {
        eat();
    }

    private static void eat() {
        System.out.println("\nПеременна\n*Кушает сосисочки");
    }

    private static void prepAnswer() {
        System.out.println("*(мысли) Хоть бы Зойка не вызвала...\n*молится");
    }
}
