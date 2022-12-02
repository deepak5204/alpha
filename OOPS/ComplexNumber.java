package OOPS;

public class ComplexNumber {
    public static void main(String[] args) {
        ComplexNum cn1 = new ComplexNum(8, 6);
        ComplexNum cn2 = new ComplexNum(3, 2);
        cn1.print();
        cn2.print();
        // cn1.add(cn2);

        // add first complex number and second complex number and return in new complex number
        ComplexNum cn3 = ComplexNum.add(cn1, cn2);
        cn3.print();

        // subtract of first complex number and second complex number and return in new complex number
        cn3 = ComplexNum.subtract(cn1, cn2);
        cn3.print();

        // product of first complex number and second complex number and return in new complex number
        cn3 = ComplexNum.prod(cn1, cn2);
        cn3.print();
       
 
    }
    
}

class ComplexNum{
    int realNo;
    int imaginaryNo;

    //constructor
    public ComplexNum(int realNo, int imaginaryNo){
        this.realNo = realNo;
        this.imaginaryNo = imaginaryNo;
    }

    //print complex number
    void print(){
        System.out.println(realNo+" + "+ imaginaryNo+"i");
    }

    //add two complex number and update in first complex number
 void add(ComplexNum x){
    this.realNo = this.realNo + x.realNo;
    this.imaginaryNo = this.imaginaryNo + x.imaginaryNo;
    print();
}  

    //add two complex number and return new complex number
    public static ComplexNum add(ComplexNum cn1, ComplexNum cn2){
        int cn3rn = cn1.realNo + cn2.realNo;
        int cn3in = cn1.imaginaryNo + cn2.imaginaryNo;
        ComplexNum cn3 = new ComplexNum(cn3rn, cn3in);
        return cn3;
    }

    //add two complex number and return new complex number
    public static ComplexNum subtract(ComplexNum cn1, ComplexNum cn2){
        int cn3rn = cn1.realNo - cn2.realNo;
        int cn3in = cn1.imaginaryNo - cn2.imaginaryNo;
        ComplexNum cn3 = new ComplexNum(cn3rn, cn3in);
        return cn3;
    }

     //product of  two complex number and return new complex number
     public static ComplexNum prod(ComplexNum cn1, ComplexNum cn2){
        int cn3rn = (cn1.realNo * cn2.realNo) - (cn1.imaginaryNo * cn2.imaginaryNo);
        int cn3in = (cn1.imaginaryNo * cn2.realNo) + (cn2.imaginaryNo * cn1.realNo);
        ComplexNum cn3 = new ComplexNum(cn3rn, cn3in);
        return cn3;
    }

}