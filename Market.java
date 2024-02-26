public class Market {
    public static void main(String[] args) {
        System.out.println("number of pens is "+Quantity(85,20,0));
    }
    public static int Quantity(int budget,int pen,int count){
        if(pen > budget){
            return count;
        }
        if(budget>=6) {
                count++;
            }
        budget-=pen;
        if(pen>=9){
            pen-=3;
        }
        return Quantity(budget,pen,count);
    }
}
