
public class Main {

    public static void main(String[] args) {
	Rybka rybka=new Rybka();
    rybka.setName("Bob");
    rybka.setAge(2);
    rybka.setColor("golden");
    rybka.setWhatCanDo("swim");
    rybka.setWeigh(1);
    rybka.setPlaceOfResidence("on the water");
        System.out.println(rybka.getName());
        System.out.println(rybka.getAge());
        System.out.println(rybka.getColor());
        System.out.println(rybka.getWhatCanDo());
        System.out.println(rybka.getPlaceOfResidence());

        Popugai popugai=new Popugai();
        popugai.setName("Karl");
        popugai.setAge(5);
        popugai.setColor("blue");
        popugai.setWhatCanDo("razgovarivaet");
        popugai.setWeigh(1);
        popugai.setPlaceOfResidence("doma ili v lesu");
        System.out.println(popugai.getName());
        System.out.println(popugai.getAge());
        System.out.println(popugai.getColor());
        System.out.println(popugai.getWhatCanDo());
        System.out.println(popugai.getPlaceOfResidence());


        Koshka koshka=new Koshka();
        koshka.setName("Mumusya");
        koshka.setAge(2);
        koshka.setColor("black");
        koshka.setWeight(2);
        System.out.println(koshka.getName());
        System.out.println(koshka.getAge());
        System.out.println(koshka.getColor());
        System.out.println(koshka.getWeight());


        Sobaka sobaka=new Sobaka();
        sobaka.setName("Sharik");
        sobaka.setAge(8);
        sobaka.setColor("black-green");
        sobaka.setChtoUmeet("gavkaet, ohranyaet dom, igraetsya");
        System.out.println(sobaka.getName());
        System.out.println(sobaka.getAge());
        System.out.println(sobaka.getColor());
        System.out.println(sobaka.getChtoUmeet());



    }
}
