class Q11 {

    public static void main(String[] args) {

        String name = "BANANA" ;
         int count = 0;
           
        for(int i=0;i<name.length(); i++) {

            if(name.charAt(i) == 'A') {
              count++;
            }
        }

       System.out.println("A count = " + count);
    }
}