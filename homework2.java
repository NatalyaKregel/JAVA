//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

public class homework2 {
    public static void main(String[] args)
    {
		int i = (int) (Math.random()*101);
        System.out.print("случайно выпавшее число = "); 
		System.out.println(i);

        System.out.print("в двоичной системе это число = "); 
        System.out.println(Integer.toBinaryString(i));

        System.out.print("номер старшего бита = "); 
        int n = (int)(Math.log(i)/Math.log(2))+1;
        System.out.println(n);
         
	}
}

/*
    public static void binar(int a){    
        int b;     
        String temp = "";    
        while(a !=0){  
            b = a % 2;  
            temp = b + temp;  
            a = a/2;  
        } 
        System.out.print(temp);  
    }  
    /*   
    public static void main(String [] args) {  
        binar(8);  
    }  
*/

