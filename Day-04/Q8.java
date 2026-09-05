class Q8 {

    public static void main(String[] args) {

        int numbers[] = {10,23,34,56,78,90,67};

        int maximum = numbers[0];

        for(int i=0; i<numbers.length; i++) {

            if(numbers[i] > maximum) {

                maximum = numbers[i];

            }

        }

        System.out.println("maximum =" + maximum);
    }
}