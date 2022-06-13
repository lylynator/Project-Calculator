package Logic

sealed trait Expr

case class Add(l:Expr, x:Expr) extends Expr
case class Mul(l:Expr, x:Expr) extends Expr

