public class Product {
    int p,q,bill;
    void setData(int p, int q){
        this.p=p;
        this.q=q;
    }
    void billing(){
        bill=p *q;
        System.out.println(bill);
    }
}
class Mall{
    Product pro=new Product();
    void doBilling(){
        pro.billing();
    }
}
class Customer{
    public static void main(String []args){
        Product refP=new Product();
        refP.setData(70, 45);
        refP.billing();
        Mall m=new Mall();
        m.pro.p=20;
        m.pro.q=2;
        m.pro.billing();
        m.doBilling();
    }
}
