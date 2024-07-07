public class polyTest1 {
    public static void main(String [] args){
        polyTest1 t1=new polyTest1();
        t1.m1();
        t1.m1(10);
        t1.m1(10.5);
    }

    public void m1(){
        System.out.println("no-args method");
    }
    public void m1(int i){
        System.out.println("int-args method");
    }
    public void m1(double d){
        System.out.println("double-args method");
    }
}
