import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Information information=new Information("Diana Ahsanova","international certificate",
       "Back-End , Front-End","Osh, Shakirova/122",559444510 );
        Java java =new Java(information,"Java");
        System.out.println("Hi! Are you ready to receive information about the course?");
        java.setDirections(Boolean.parseBoolean(scanner.next()));
        System.out.println(java+ " ");
        java.coursePluses();
        java.javistaSalaries();
        java.javaFeatures();


    }
}