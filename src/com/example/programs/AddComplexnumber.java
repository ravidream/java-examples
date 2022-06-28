package com.example.programs;

class AddComplexnumber
{
  
      double real;
      double imag;
      public void complex(double real,double imag)
        {
            this.real=real;
            this.imag=imag;
           {
           public static void main(String args[])
           {
            Complex n1=new Complex(2.3,3.5),
                    n2=new Complex(3.5,4.5),
                    temp;
            temp=add(n1,n2);
            System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
           }        
        }
        public static Complex add(Complex n1,complex n2)
        {
            Complex temp=new Complex(0.0 , 0.0);
            temp.real=n1.real+n2.real;
            temp.imag=n1.imag+n2.imag;
        }
        return(temp);
  
}