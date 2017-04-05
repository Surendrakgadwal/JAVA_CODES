/**
 * Created by GADWAL on 4/3/2017.
 */


/**
 * Created by GADWAL on 4/3/2017.
 */
class  BoxS {

    double width;
    double height;
    double depth;

    BoxS(double w, double h, double d) {
        System.out.println("constructing box");
        width = w;
        height = h;
        depth = d;
    }

    double volumn() {
        return width * height * depth;
    }

}


public class BoxDemo7_parameterized_constructor {
    public static void main(String args[]){

        BoxS mybox1=new BoxS(10,20,15);
        BoxS mybox2=new BoxS(3,6,9);
        double vol;


        vol=mybox1.volumn();
        System.out.println("volumn is  = " + vol);


        vol= mybox2.volumn();
        System.out.println("volumn is  = " + vol);

    }
}

