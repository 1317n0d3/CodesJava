package start;

abstract class Bird{
    abstract void sing();

    public int randomNum(int a, int b){
        return (int)(Math.random() * (b - a)) + a;
    }
}