//19001942
//SCS2204-Recurssive-Activty

def gcd(x:Int, y:Int):Int=y match{
  case 0 => x;
  case m if m>x => gcd(m,x);
  case _ => gcd(y, x%y);
}


//Question-01

def prime(a:Int, n:Int=2):Boolean =n match{
  case n if(n==a) => true
  case n if(gcd(a,n)>1) => false
  case n => prime(a, n+1)
}

//Checking whether 5 is prime
println(prime(5));

//Checking whether 8 is prime
println(prime(8));



//Question-02

def primeSeq(a:Int) : Unit={
        if(a>1){
          primeSeq(a-1);
          if (prime(a) == true) println(a);
        }
}

//Prime numbers below 10
primeSeq(10);



//Question-03

var x:Int = 0;

def sum(a:Int): Unit={
  x = x + a;
  if(a>0) sum(a - 1);
  else print(x); 
  
}
//Sum of all the numbers from 1-to 5
sum(5)


//Question-04

def isEven(a:Int): Boolean = a match{
  case 0 => true
  case _ => isOdd(a-1)
}

def isOdd(a:Int): Boolean =  !(isEven(a))

//Checking whether a number is odd or even
println(isEven(7));



//Question-05

var y:Int = 0;

def evenSum(a:Int): Unit={
  y = y + a;
  if((a>0)&&(a%2==0)){
       evenSum(a-2);
  }
  else println(y);
}

// Sum of even numbers below 10
evenSum(10);

//Question-06
def fibonacci(i:Int):Int= i match{
  case t if t==0 => 0
  case t if t==1 => 1 
  case t => fibonacci(i-1) + fibonacci(i-2)
}

// Sum of fibonacci numbers below 10
println(fibonacci(5));