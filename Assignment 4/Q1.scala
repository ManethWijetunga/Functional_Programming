//19001942
object Q1{
    def main(args:Array[String]):Unit = {
      val x = new Rational(5, 3)
      println(x.neg)

    }

}

class Rational(a: Int, b: Int) {
  def numer = a
  def denom = b

  def +(r: Rational) = new Rational(this.numer * r.denom + r.numer * this.denom, denom * r.denom)
  def neg = new Rational(-this.numer,this.denom)
  def -(r:Rational) = this+r.neg

  override def toString = this.numer.toString + "\\" + this.denom.toString
}
