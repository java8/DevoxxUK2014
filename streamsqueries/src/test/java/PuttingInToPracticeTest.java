/**
 * Created by raoul-gabrielurma on 14/01/2014.
 */


import java.util.*;
import java.util.function.BinaryOperator;

import static java.util.Comparator.comparing;
import org.junit.*;

import static java.util.stream.Collectors.*;
import static org.junit.Assert.*;

public class PuttingInToPracticeTest {

    List<Transaction> transactions = new ArrayList<>();

    @Before
    public void setUp() throws Exception {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
    }

    /*

1000
{Trader:Brian in Cambridge, year: 2011, value:300}
{Trader:Raoul in Cambridge, year: 2012, value:1000}
     */

    @Test
    public void testStream1(){
        //TODO: Find all transactions from year 2011 and sort them by value (small to high).
        List<Transaction> transactionsYear2011 = new ArrayList<>();



        assertEquals(300, transactionsYear2011.get(0).getValue());
        assertEquals(2011, transactionsYear2011.get(0).getYear());

        assertEquals(400, transactionsYear2011.get(1).getValue());
        assertEquals(2011, transactionsYear2011.get(1).getYear());

        assertEquals(2, transactionsYear2011.size());
    }

    @Test
    public void testStream2(){
        //TODO: What are all the unique cities where the traders work?
        List<String> cities = new ArrayList<>();



        assertEquals(2, cities.size());
        assertTrue(cities.contains("Cambridge"));
        assertTrue(cities.contains("Milan"));

    }

    @Test
    public void testStream3(){
        //TODO: Find all traders from Cambridge and sort them by name.
        List<Trader> traders = new ArrayList<>();



        assertEquals(3, traders.size());
        assertEquals("Alan",traders.get(0).getName());
        assertEquals("Brian",traders.get(1).getName());
        assertEquals("Raoul", traders.get(2).getName());
    }

    @Test
    public void testStream4(){
        //TODO: Return a string of all traders’ names sorted alphabetically.
        String result = "";




        assertEquals("AlanBrianMarioRaoul", result);
    }

    @Test
    public void testStream5(){
        //TODO: Are there any trader based in Milan?
        boolean milan = false;



        assertEquals(true, milan);
    }

    @Test
    public void testStream6(){
        //TODO: Update all transactions so that the traders from Milan are set to Cambridge.



        assertTrue(transactions.stream().allMatch(t -> "Cambridge".equals(t.getTrader().getCity())));

    }

    @Test
    public void testStream7(){
        //TODO: What's the highest value in all the transactions?
        int highestValue = 0;



        assertEquals(1000, highestValue);

    }

    @Test
    public void testStream8(){
        //TODO: What's the transaction with smallest value?
        Transaction smallestTransaction = null;


        assertEquals(transactions.get(0), smallestTransaction);
    }

    @Test
    public void testStream9(){
        //TODO: Group all Traders by City
        Map<String, List<Trader>> tradersByCity = new HashMap<>();


        assertEquals(3, tradersByCity.get("Cambridge").size());
        assertEquals(1, tradersByCity.get("Milan").size());


    }

    @Test
    public void testStream10(){
        //TODO: Create a Map<String, Integer> that maps each Trader's name with its highest Transaction value
        Map<String, Integer> mapNameToHighestValue = new HashMap<>();



        assertEquals(1000, (int) mapNameToHighestValue.get("Raoul"));
        assertEquals(300, (int) mapNameToHighestValue.get("Brian"));
        assertEquals(950, (int) mapNameToHighestValue.get("Alan"));
        assertEquals(710, (int) mapNameToHighestValue.get("Mario"));

    }

    @Test
    public void testStream11(){
        //TODO: Create a Map<String, Integer> that maps each Trader's name with the sum of all its Transactions’ values
        Map<String, Integer> mapNameToSumValue = new HashMap<>();




        assertEquals(1400, (int) mapNameToSumValue.get("Raoul"));
        assertEquals(300, (int) mapNameToSumValue.get("Brian"));
        assertEquals(950, (int) mapNameToSumValue.get("Alan"));
        assertEquals(1410, (int) mapNameToSumValue.get("Mario"));
    }

    @Test
    public void testStream12(){
        //TODO: Create a Map<Integer, Integer> that maps each year with the highest transaction value of that year
        Map<Integer, Integer> yearToHighestValue = new HashMap<>();



        assertEquals(1000, (int) yearToHighestValue.get(2012));
        assertEquals(400, (int) yearToHighestValue.get(2011));

    }

    @Test
    public void testStream13(){
        //TODO: What's the transaction with highest value? (using Collectors.maxBy)
        Transaction highestTransaction = null;


        assertEquals(transactions.get(1), highestTransaction);
    }


}
