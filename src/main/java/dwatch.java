public class dwatch {
    public boolean open = false;
    public boolean timerState = false;
    public float timer = 0;
    public String turnOn(){
        if(!open){
            open = true;
            return " On!";
        }
        else{
            return "Already on";
        }
    }
    public String setTimer(float time){
        if(open){
            timer = time;
            timerState = true;
            return "Timer set";
        }
        else{
            return "Watch os closed";
        }
    }
    public String doSomething(){
        if(timerState){
            return "Wait for timer to end";
        }
        else{
            return "Accepted";
        }
    }
    public String turnOff(){
        if(open){
            open = false;
            return "Turned off";
        }
        else{
            return "Error";
        }
    }}