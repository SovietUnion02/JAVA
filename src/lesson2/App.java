package lesson2;

public class App {

    public static void main(String[] args) {

            Pupil pupil = new Pupil();
            // Privat-метод нельзя вызвать, потому что он доступен только внутри класса
            pupil.setAge(15);
            pupil.setAlias("Серый");
            pupil.setLove("Маша из 6-А");
            pupil.setProgress("Отличник");

            pupil.answer();
            pupil.pause();
    }
}
