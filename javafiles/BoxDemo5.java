class Boxy {

    double width;
    double height;
    double depth;

    double volumn(){
        return width*height*depth;
    }

    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}

class BoxDemo5{
    public static void main(String args[]){

        Boxy mybox1=new Boxy();
        Boxy mybox2=new Boxy();
        double vol;

        mybox1.setDim(10,20,15);
        mybox2.setDim(3,6,9);

        vol=mybox1.volumn();
        System.out.println("volumn is  = " + vol);


        vol= mybox2.volumn();
        System.out.println("volumn is  = " + vol);

    }
}