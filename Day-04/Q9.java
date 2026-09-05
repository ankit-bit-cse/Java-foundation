class Q9 {

    public static void main(String[] args) {

        int numbers[] = {10,20,23,34,56,67,77};

        int count = 0;

        for(int i=0; i<numbers.length; i++) {

            if(numbers[i] > 15) {
                count++;
            }
        }

        System.out.println("count =" + count);
    }
}