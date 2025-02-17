package animal;

public class Main {
    public static void main(String[] args) {

        //Animal pedro =new Animal("pedro",500,300,20);
        volador ave = new volador("fenix",432,543,5432);
        terrestre lagarto = new terrestre("supercalifragilisticoespialidoso",543,432,543);
        System.out.println(ave.tostring());
        System.out.println(lagarto.tostring());
    }
}