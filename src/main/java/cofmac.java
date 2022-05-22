public class cofmac
{
    flooos f = new flooos();
    stock s = new stock();
    public void coffee(int s){
        this.s.addToStock(s);
    }
    void despence(int x){
        while(x>0 && s.isEmpty()){
            System.out.println("coffee");
            f.addOnePound();
            s.takeFromStock();
            x--;
        }
        if (x!=0)
            System.out.println("machine empty");
    }
    void status(){
        System.out.println("there are "+ f.isEmpty()+ " coins \n there are"
                +s.isEmpty()+" coffees in stock\n");
    }
    public static void main(String args[]){
    }
}