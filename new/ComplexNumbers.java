import java.util.*;	
public class ComplexNumbers {
	int real, imaginary;
    ComplexNumbers(int real,int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public void print(){
        System.out.println(real+" + i"+imaginary);
    }
    public void plus(ComplexNumbers c){
        this.real+=c.real;
        this.imaginary+=c.imaginary;
    }
    public void multiply(ComplexNumbers c){
        int a=this.real*c.imaginary + this.imaginary*c.real;
        this.real=this.real*c.real - this.imaginary*c.imaginary;
        this.imaginary=a;
    }


public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}

// import java.util.*;
// public class ComplexNumbers {
//     static int real;
//     static int imaginary;
//     ComplexNumbers(int real,int imaginary){
//         this.real=real;
//         this.imaginary=imaginary;
//     }
//     public void print(){
//         System.out.println(real+" + i"+imaginary);
//     }
//     public void plus(ComplexNumbers c){
//         this.real+=c.real;
//         this.imaginary+=c.imaginary;
//     }
//     public void multiply(ComplexNumbers c){
//         int a=this.real*c.imaginary + this.imaginary*c.real;
//         this.real=this.real*c.real - this.imaginary*c.imaginary;
//         this.imaginary=a;
//     }
// 	// Complete this class
// 	public static void main(String[] args) {
// 		Scanner s = new Scanner(System.in);
// 		int real1,imaginary1,real2,imaginary2;
		
//         real1 = s.nextInt();
// 		imaginary1 = s.nextInt();
// 		real2 = s.nextInt();
// 		imaginary2 = s.nextInt();

// 		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
// 		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

// 		int choice = s.nextInt();
		 
// 		if(choice == 1) {
// 			// Add
// 			c1.plus(c2);
// 			c1.print();
// 		}
// 		else if(choice == 2) {
// 			// Multiply
// 			c1.multiply(c2);
// 			c1.print();
// 		}
// 	}
// }
}