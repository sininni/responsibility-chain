package atm;

import static org.junit.Assert.*;
import org.junit.Test;

public class ATMTest {

    @Test(expected = IllegalArgumentException.class)
    public void process() {
        ATM atm = new ATM();
        atm.process(126);
    }
}