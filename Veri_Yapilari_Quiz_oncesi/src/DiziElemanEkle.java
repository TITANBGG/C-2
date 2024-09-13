public class DiziElemanEkle extends Applet
{
    String strDizi[];
    int elemanSayac = 0;
    public void int()
    {
        strDizi = new String[10];
        elemanEkle("Ali");
        elemanEkle("Cemil");
        listele();
    }
    public void elemanEkle(String yeniEleman)
    {
        strDizi[elemanSayac]=yeniEleman;
        elemanSayac++;
    }
    public void listele()
    {  for(int i=0; i<strDizi.length; ++i)

    System.out.println(strDizi[i]);
    } }