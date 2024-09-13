import com.sun.jdi.OpaqueFrameException;

public class Ogrenci {
    Ogrenci el;

    Ogrenci ali = new Ogrenci();
    ali.el=null;

    Ogrenci osman=new Ogrenci();
    osman.el=null;

    Ogrenci veli=new Ogrenci();
    veli.el=null;

    Ogrenci serdar=new Ogrenci();
    serdar.el=null;

    ali.el=osman;
    osman.el=veli;
    veli.el=serdar;



}
