package Logic

import Logic.Calculator.showExpr

import scala.math.{cos, sin}

object Calculator {

  def eval(e: Expr)(x: Double): Double = e match {
    case Number(l) =>  l
    case Add(l, r) => eval(l)(x) + eval(r)(x)
    case Mul(l, r) => eval(l)(x) * eval(r)(x)
    case Sin(o) => sin(eval(o)(x))
    case Cos(o) => cos(eval(o)(x))
  }

  def showExpr(e: Expr): String = e match {
    case Add(l, r) => showExpr(l)+"+"+showExpr (r)
    case Mul(l, r) => showExpr(l)+"*"+showExpr (r)
    case Sin(o) => "Sin(" + showExpr(o) + ")"
    case Cos(o) => "Cos(" + showExpr(o) + ")"
  }

}





