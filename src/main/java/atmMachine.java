public class atmMachine {
    public float Balance = 0;
    public boolean authentic = false;
    public boolean valid_card = true;
    public boolean password_valid = true;
    public String Card(){
        if(valid_card){
            return "Valid card";
        }
        else{
            return "Card not valid";
        }
    }
    public String Password(){
        if(valid_card){
            System.out.println("Enter Password");
            if(password_valid){
                authentic = true;
                return "Successful login";
            }
            else{
                return "Wrong password";
            }
        }
        else{
            return "Enter card first";
        }
    }
    public String deposit(float money){
        if(authentic){
            if(money >= 50 && money <=50000){
                Balance += money;
                return "Successful deposit";
            }
            else{
                return "Enter valid amount";
            }
        }
        else{
            return "Not allowed";
        }
    }
    public String withdraw(float amount){
        if(authentic){
            if(amount <= Balance){
                Balance -= amount;
                return "Successful withdraw";
            }
            else{
                return "Not enough balance";
            }
        }
        else{
            return "Not allowed";
        }
    }
    public String removeCard(){
        if(valid_card){
            return "Card removed";
        }
        else{
            return "Not allowed";
        }
    }
}