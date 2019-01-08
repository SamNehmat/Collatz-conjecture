// Part 1 about the 3n+1 conceture
//=================================


//(1) Complete the collatz function below. It should
//    recursively calculate the number of steps needed 
//    until the collatz series reaches the number 1.
//    If needed you can use an auxilary function that
//    performs the recursion. The function should expect
//    arguments in the range of 1 to 1 Million.

  def collatz(n: Long, a: Long = 0): Long = {
    if (n == 1) {
      return a + 1;
    } else{
      if ((n % 2) == 0) collatz(n / 2, a + 1)
      else collatz(n * 3 + 1, a + 1)
    }
  }

//(2)  Complete the collatz bound function below. It should
//     calculuate how many steps are needed for each number 
//     from 1 upto a bound and returns the maximum number of
//     steps and the corresponding number that needs that many 
//     steps. You should expect bounds in the range of 1
//     upto 1 million. The first component of the pair is
//     the maximum number of steps and the second is the 
//     corresponding number.

def collatz_max(bnd: Int): (Int, Int) ={
  var num = 0
  var maxHigh = 0
  var index = 0
  for(a <- 1 until bnd){
    num = collatz(a).toInt
    if(num > maxHigh){
      maxHigh = num
      index = a
    }
  }
  return (num, index.toInt)
}

