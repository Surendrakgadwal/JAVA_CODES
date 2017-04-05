/**
 * Created by GADWAL on 4/3/2017.
 */
class  Boxz {

    double width;
    double height;
    double depth;

    Boxz() {
        System.out.println("constructing box");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volumn() {
        return width * height * depth;
    }

}


class BoxDemo6{
    public static void main(String args[]){

        Boxz mybox1=new Boxz();
        Boxz mybox2=new Boxz();
        double vol;


        vol=mybox1.volumn();
        System.out.println("volumn is  = " + vol);


        vol= mybox2.volumn();
        System.out.println("volumn is  = " + vol);

    }
}

