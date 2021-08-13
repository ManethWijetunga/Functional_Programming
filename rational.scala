Object MyApp extends App{
  val r1 = new Rational(5, 3)
  println (r1)
}

class Rational(a: Int, b: Int) {
  def numer = a
  def denom = b
  override def toString = numer+”/”+denom 
}
// def +(r: Rational) = new Rational(this.numer * r.denom + r.numer * this.denom, denom * r.denom)
// def neg = new Rational(-this.numer,this.denom)
// def -(r:Rational) = this+r.neg

