class P{
    public void property(){
        System.out.println("Cash");
    }
    public void marry(){
        System.out.println("Rosie");
    }
}

class C extends P{
    public void marry(){
        System.out.println("Elise");
    }
}

class OverridingTest1{
    public static void main(String [] args){
        P p=new P();
        p.marry();
        C c=new C();
        c.marry();
        P p1=new C();
        p1.marry();
    }
}