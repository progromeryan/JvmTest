package headfirst.state.gumball;

/**
 * Created by Administrator on 2017/9/7.
 */
public class GumballMachine {

    /**
     * 糖果售罄
     */
    final static int SOLD_OUT = 0;

    /**
     * 没有投入25分钱
     */
    final static int NO_QUARTER = 1;

    /**
     * 投入25分钱
     */
    final static  int HAS_QUARTER =2;

    /**
     * 售出糖果
     */
    final static  int SOLD = 3;

    int state = SOLD_OUT;

    /**
     * 机器内的糖果数目
     */
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if(count >0)
        {
            state = NO_QUARTER;
        }
    }

    /**
     * 当有钱投入进来
     */
    public void insertQuarter()
    {
        if(state == HAS_QUARTER)
        {
            System.out.println("You can't insert another quarter");
        }
        else if(state == NO_QUARTER)
        {
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter");
        }
        else if(state == SOLD_OUT)
        {
            System.out.println("You can't insert a quarter,the machine is sold out");
        }
        else  if(state == SOLD)
        {
            System.out.println("Please wait,we're already giving you a gumball");
        }
    }

    /**
     * 退回25分钱
     */
    public void ejectQuarter()
    {
        if(state ==HAS_QUARTER)
        {
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        }
        else if(state ==NO_QUARTER)
        {
            System.out.printf("You haven't inserted a quarter");
        }
        else if(state == HAS_QUARTER)
        {
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        }
    }

    /**
     * 发放糖果
     */
    public void dispense() {
        if (state == SOLD) {
            System.out.println("A gumball comes rolling out the slot");
            count = count - 1;
            if (count == 0) {
                System.out.println("Oops, out of gumballs!");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("You need to pay first");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed");
        } else if (state == HAS_QUARTER) {
            System.out.println("No gumball dispensed");
        }
    }

    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        state = NO_QUARTER;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");
        if (state == SOLD_OUT) {
            result.append("sold out");
        } else if (state == NO_QUARTER) {
            result.append("waiting for quarter");
        } else if (state == HAS_QUARTER) {
            result.append("waiting for turn of crank");
        } else if (state == SOLD) {
            result.append("delivering a gumball");
        }
        result.append("\n");
        return result.toString();
    }
}
