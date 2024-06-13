public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Mustafa", "Çetindağ", "123", "Patika.dev", 85);
        Student st2 = new Student("Mert", "Acu", "321", "Java 101", 85);
        Student st3 = new Student("Kodluyoruz", "Java102", "12312", "asdf", 85);


        Course mat = new Course("MAT101", "MAT");
        Student[] stu = {st1, st2, st3};

        System.out.println("Ortalama : " + mat.calcAverage(stu));
    }
}
