
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class cofmacTest {
        cofmac x;
        stock k;
        flooos m;
        String s;
        @BeforeEach
        public void init() {
            x = new cofmac();
            k = new stock();
            m = new flooos();
        }
        class coinInsert{
            int insert(int x){
                if(x>0)
                    return x;
                else
                    return 0;
            }
        }
        @Test
        public void coffeeStub(){
            coinInsert y = new coinInsert();
            x.despence(y.insert(5));
            assertEquals(x.s.stock,5);
        }
        class doubleCoffee{
            String check(int x){
                if(x%2==0)
                    return "you can make double coffees";
                else
                    return "you can't make double coffees";
            }
        }
        @Test
        public void stockDriver(){
            doubleCoffee y = new doubleCoffee();
            s = y.check(k.showAvailableStock());
            assertEquals(s,"you can make double coffees");
            k.takeFromStock();
            s = y.check(k.showAvailableStock());
            assertEquals(s,"you can't make double coffees");
        }
        @AfterEach
        public void clean(){
            x=null ;
        }
}

