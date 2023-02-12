import java.util.Scanner;

public class Java extends CourseOnline {
    Scanner scanner=new Scanner(System.in);

    private String name;
    private boolean directions;

    public Java(Information information, String name) {
        super(information);
        this.name = name;
        this.directions = Boolean.parseBoolean(String.valueOf(directions));
    }
    public Java(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getDirections() {
        return directions;
    }

    public void setDirections(boolean directions) {
        System.out.println("Choose a direction? (w/m)");
        char answer = scanner.next().charAt(0);
        this.directions = directions;
        if (answer == 'w'){
            System.out.println("web development");
        } else if (answer=='m'){
            System.out.println("mobile development");
        }

         else{
            System.out.println("error");
        }

    }
    public void javistaSalaries(){
        System.out.println("Заработная плата джависта:\n"+"новичок — джуниор — 25 000-60 000 руб.\n " +
                "специалист с опытом — мидл — от 60 000 до 130 000 руб\n" +
                "руководитель команды — тимлид — от 130 000 руб. до 400 000-500 000 руб.");
    }
    public void javaFeatures(){
        System.out.println("Особенности Java \n"+"Сообщество\nКроссплатформенность.\nНадёжность.\nПростота изучения.");
    }

    @Override
    public String toString() {
        return "Java{" +
                "name='" + name + '\'' +
                ", directions:  " + getDirections() +"\ninformation:  "+super.toString()+
                '}';
    }


}
