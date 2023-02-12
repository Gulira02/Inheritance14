public class CourseOnline {
    private Information information;

    public CourseOnline(Information information) {
        this.information = information;
    }

    public CourseOnline() {
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }



    public void coursePluses(){
        System.out.println("Онлайн курсы плюсы: \n"+"1. Обучение проходит в любое время. Не секрет," +
                " что онлайн-образование отличается гибкостью. \n " +
                "2. Для обучения подходит любое место." +
                "\n 3. Более доступная стоимость обучения. В большинстве случаев " +
                "при онлайн-образовании вы заплатите меньше, чем при обучении традиционным способом." );


    }
    @Override
    public String toString() {
        return "CourseOnline{" +
                "information:  " + information +
                '}';
    }
}
