// Native methods


class NativeClass {
    static{
        System.loadLibrary("nativepath");
    }

    public native void m1();
}

class Client{
    public static void main(String [] args){
     NativeClass n=new NativeClass(); 
     n.m1(); //Invoke native method
    }
}
