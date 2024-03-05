package lecturedemos;

import java.util.Random;

/**
 *
 * @author xxg8089
 */
public class MoneyMover implements Runnable {

    private Account accountA;
    private Account accountB;
    private boolean correct = true;

    static final int SUM = 10;
    private Random generator;

    public MoneyMover(Account accountA, Account accountB) {
        this.accountA = accountA;
        this.accountB = accountB;

        accountA.balance = 5;
        accountB.balance = 5;
        generator = new Random();

    }

    @Override
    public void run() {
        while (correct) {
            if (generator.nextInt(2) == 0) {
                transferAToB();
            } else {
                transferBToA();
            }

            correct = isSumCorrect();
        }
        System.out.println("Problem: account A = " + accountA.balance + ", account B = " + accountB.balance);
    }

    private void transferAToB()
    {
        if(accountA.balance>0)
        { accountA.balance--;
          accountB.balance++;
        }
    }
    
    private void transferBToA()
    {
        if(accountB.balance>0)
        { accountB.balance--;
          accountA.balance++;
        }
    }
    
    private boolean isSumCorrect(){
        return(accountA.balance+accountB.balance==SUM);
    }
    
    
}
