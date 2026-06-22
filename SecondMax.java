class SecondMax {
    public static void main(String[] args) {
        int[] arr={5,10,15,20,25,30};
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        
        for(int num : arr) {
            if(num > max) {
                secondmax=max;
                max=num;  
            } else if (num > secondmax && num != max) {
                secondmax=num;
            }
        }
        System.out.println("Second Maximum Element: "+secondmax);
    }
}
