import java.util.*;
//System.out.printf("%-15s%03d%n",s1,x);   for output formatting
class P1Q1{
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        int A = w.nextInt();//(in meter)
        int B = w.nextInt();//(in meter)
        System.out.println(A*B);
    }
}

class P1Q2{
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int num1, num2, sum;
        
        System.out.print("Enter first number: ");
        num1 = r.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = r.nextInt();
        
        sum = (num1 * num1) + (num2 * num2 * num2);
        System.out.println(num1 + "^2 + " + num2 + "^3 = " + sum);
    }
}

class P1Q3{
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        int a,b,c,p,fx;
        
        System.out.print("Enter first number: ");
        a = g.nextInt();
        System.out.print("Enter second number: ");
        b = g.nextInt();
        System.out.print("Enter third number: ");
        c = g.nextInt();
        System.out.print("Enter fourth number: ");
        p = g.nextInt();
        fx= (a*p*p) + (b*p) + c;
        System.out.println("f(p) =" + fx);
    }
}

class P1Q4 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int x = n / 100;
        System.out.println(x);
    }
}

class P1Q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int c = n% 10;
        int b = (n / 100) % 10;
        int a = (n / 10) % 10 * 10;
        int result = (n / 1000 * 1000) + c * 100 + b + a;
        System.out.println("Result: " + result);
      }

}

class P1Q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int a = n% 10;
        int b = n-a;
        int c = (b % 100)* 2;
        int d = (n/100)*100;
        int result = d+c+a;
        System.out.println("Result: " + result);
    }
    
}

class P1Q7{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int n1= SC.nextInt();
        System.out.println("Enter 2nd number");
        int n2 = SC.nextInt();
        int a = n1%10;
        int b = n1-a;
        int c = n2%10;
        int d = n2-c;
        int result = (b+c)*(a+d);
        System.out.println("Result: " + (b+c) + "x" + (a+d) + "="  + result);
    }

}




class P2Q1{
    public static void main(String[] args) {
        for (int i=20; i<=70; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }    
}

class P2Q2{
    public static void main(String[] args) {
        System.out.println("even numbers between 20 and 40");
        for (int i=20; i<=40; i++) {
            if (i%2==0){
                
                System.out.println(i+ " ");
            }
        }
        System.out.println("  ");
        System.out.println("odd numbers between 50 and 80");
        for (int i=50; i<=80; i++){
            if(i%2!=0){
                
                System.out.println(i + " ");
            }
        }

    } 
}

class P2Q3{
    public static void main(String[] args) {
        for (int i=0; i>=0;i++) {
            if ((i%10)%3==0){
                System.out.println(i);
            }
        }
    }
}

class P2Q4{
    public static void main(String[] args) {
        for (int i=0; i<=100;i++) {
            if ((i%10)>=5 && (i%10)<=8){
                System.out.println(i);
            }
        }
    }
}

class P2Q5{
    public static void main(String[] args) {
        for (int i=0; i<=100;i++) {
            if (((i/10)+(i%10))%7==0){
                System.out.println(i);
            }
        }
    }
}

class P2Q6{
    public static void main(String[] args) {
        for(int i=10;i<100;i+=20){
          for(int a=i;a<i+10;a++){
            if((a/10)%2==1){
                System.out.print(a + " ");
            }
          }
          System.out.println();
        }
    }
}

class P2Q7{
    public static void main(String[] args) {
        for (int i=0; i<100;i++) {
            if ((i/10)%3==1){
                System.out.println(i);
            }
        }
    }
    
}

class P2Q8{
    public static void main(String[] args) {
        System.out.println("1st case: ");
        for(int i=0;i<100;i+=20){
            
            for(int a=i;a<i+10;a++){
                if(a%2!=0){
                    System.out.println(a + " ");
                }
            }
        }
        System.out.println();  
        System.out.println("2nd case: ");
        for(int j=10;j<100;j+=20){
            for(int b=j;b<j+10;b++){
                if(b%2==0){
                    System.out.println(b + " ");
                }
            } 
        }  
    }
}

class P3Q1{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the nos: ");
        int n = a.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter no " + i + ": ");
            sum += a.nextInt();
        }

        System.out.println("The sum is: " + sum);
    }
}

class P3Q2{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the nos: ");
        int n = a.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter no " + i + ": ");
            int x =i/10;
            x+= a.nextInt();
        }

        System.out.println("The sum is: " + sum);
    }
}

class P3Q2{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = input.nextInt();
            sum += arr[i] % 10;
        }

        System.out.println("sum of last digit" + sum);
    }
}

