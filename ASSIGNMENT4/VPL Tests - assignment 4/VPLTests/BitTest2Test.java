public class BitTest2Test {

    public static void main(String[] args) {
        try{
            Bit one = Bit.ONE;
            Bit zero = Bit.ZERO;
            
            boolean testSucceeded = Bit.fullAdderSum(one , one , zero).equals(zero);
            
            assertTrue("Bit.fullAdderSum(one , one , zero).equals(zero): expected - true, got - false",testSucceeded);
        }

        catch (Exception e) {
        	System.out.println("  runtime error in Bit.fullAdderSum(zero, zero, zero).equals(zero).");
        } catch (StackOverflowError e) {
        	System.out.println("StackOverflowError");
        }
    }
}
