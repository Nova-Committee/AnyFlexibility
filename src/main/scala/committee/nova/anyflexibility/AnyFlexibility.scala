package committee.nova.anyflexibility

object AnyFlexibility {
  implicit class AnyImplicit[Q <: Any](val any: Q) {
    @inline def $let[T](fun: Q => T): T = fun.apply(any)

    @inline def $also(fun: Q => Any): Q = {
      fun.apply(any)
      any
    }
  }
}
