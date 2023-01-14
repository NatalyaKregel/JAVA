public class homeworktry {
    public static void main(String[] args){
		int[] array;
        array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * Short.MAX_VALUE) ;
            System.out.print(array[i] + ", ");
        }
	}
}
