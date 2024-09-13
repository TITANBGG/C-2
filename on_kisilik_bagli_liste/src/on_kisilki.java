  class on_kisilki {
    String ad,soyad,no;
    int veri;
    on_kisilki next;

    on_kisilki yedek;
    on_kisilki bir= new on_kisilki();
    yedek bir;

    bir.next=null;

    for(int i=0;i<9;,i++){
        bir.next=new on_kisilki();
        bir.next.next=null;
        bir=bir.next;
    }
bir=yedek;

}
