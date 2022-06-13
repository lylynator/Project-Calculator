package Logic

sealed trait Expr

case class Add(l:Expr, x:Expr) extends Expr
case class Mul(l:Expr, x:Expr) extends Expr
case class Sin(l:Expr) extends Expr
case class Cos(l:Expr) extends Expr
case class Number(d:Double) extends Expr

