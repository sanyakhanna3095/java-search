public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        int iterations = 1_000_000; // 1 million iterations
        String text = "hello";

        // Measure time for StringBuffer
        long startTime1 = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for(int i = 0; i < iterations; i++) {
            sbf.append(text);
        }
        long endTime1 = System.nanoTime();
        long stringBufferTime = endTime1 - startTime1;

        // Measure time for StringBuilder
        long startTime2 = System.nanoTime();
        StringBuilder sbd = new StringBuilder();
        for(int i = 0; i < iterations; i++) {
            sbd.append(text);
        }
        long endTime2 = System.nanoTime();
        long stringBuilderTime = endTime2 - startTime2;

        // Print execution times
        System.out.println("Time taken by StringBuffer: " + stringBufferTime / 1_000_000.0 + " ms");
        System.out.println("Time taken by StringBuilder: " + stringBuilderTime / 1_000_000.0 + " ms");

        // Compare performance
        if(stringBufferTime > stringBuilderTime) {
            System.out.println("StringBuilder is faster!");
        }
        else {
            System.out.println("StringBuffer is faster!");
        }
    }
}
