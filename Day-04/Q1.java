class Q1 {
    public static void main(String[] args) {
        int[] marks = {10,20,34,55,66};
        int target=56;
        boolean isfound= false;

        for(int i=0; i< marks.length; i++) {
            // System.out.println(marks[i]);

            if(marks[i] == target){
                // System.out.println("s present");
                isfound = true;
            }
        
        }

        if(isfound == true){
            System.out.println("S present");
        }
        else{
            System.out.println("not found");
        }


    }
}
