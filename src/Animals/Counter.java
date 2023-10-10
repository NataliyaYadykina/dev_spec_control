package Animals;

public class Counter {

    static int sum;
    {
        sum = 0;
    }

    public int add() {
        return sum++;
    }

}
