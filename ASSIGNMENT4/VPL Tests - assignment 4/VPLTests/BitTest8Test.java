public class BitTest8Test {

    public static void main(String[] args) {
        try{
            Bit one = Bit.ONE;
            Bit zero = Bit.ZERO;
            
            boolean testSucceeded = Bit.fullAdderSum(zero, zero, one ).equals(one );
            
            assertTrue("Bit.fullAdderSum(zero, zero, one ).equals(one ): expected - true, got - false",testSucceeded);
        }

        catch (Exception e) {
        	System.out.println("  runtime error in Bit.fullAdderSum(zero, zero, zero).equals(zero).");
        } catch (StackOverflowError e) {
        	System.out.println("StackOverflowError");
        }
    }
}
