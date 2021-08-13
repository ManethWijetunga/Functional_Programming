def +(r: Rational) = new Rational(this.numer * r.denom + r.numer * this.denom, denom * r.denom)
// def neg = new Rational(-this.numer,this.denom)
// def -(r:Rational) = this+r.neg