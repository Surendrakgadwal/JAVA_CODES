class Boxx {

    double width;
    double height;
    double depth;

    void volumn(){
        System.out.println("The volumn is = ");
        System.out.println(width*height*depth);
    }
}

class BoxDemo3{
    public static void main(String args[]){

        Boxx mybox1=new Boxx();
        Boxx mybox2=new Boxx();

        mybox1.width=10;
        mybox1.height=20;
        mybox1.depth=15;

        mybox2.width=3;
        mybox2.height=6;
        mybox2.depth=9;

        mybox1.volumn();
        mybox2.volumn();

    }
}