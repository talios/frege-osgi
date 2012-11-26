/*
  Source code is in UTF-8 encoding. The following symbols may appear, among others:
  α β γ δ ε ζ η θ ι κ λ μ ν ξ ο π ρ ς σ τ υ φ χ ψ ω « • ¦ »  ﬁ ﬂ ƒ
  If you can't read this, you're out of luck.
  This code was generated with the frege compiler version 3.19.161 from
  /Users/amrk/Dropbox/IdeaProjects/frege-osgi/fregecalculator/src/main/frege/com/talios/frege/osgi/calculator/Calculator.fr
  Do not edit this file! Instead, edit the source file and recompile.
*/


package com.talios.frege.osgi.calculator;

import frege.MD;
import frege.RT;
import frege.rt.*;
import frege.prelude.PreludeBase;
import frege.prelude.PreludeNative;
import frege.prelude.PreludeList;
import frege.prelude.PreludeText;
import frege.prelude.PreludeMonad;

@MD.FregePackage(
  source="/Users/amrk/Dropbox/IdeaProjects/frege-osgi/fregecalculator/src/main/frege/com/talios/frege/osgi/calculator/Calculator.fr",
  time=1345033055779L,
  ops={
    @MD.Operator(name="<$>", kind=0, prec=13), @MD.Operator(name="**", kind=1, prec=2),
    @MD.Operator(name="$!", kind=1, prec=16), @MD.Operator(name="!~", kind=2, prec=2),
    @MD.Operator(name="!=", kind=2, prec=10), @MD.Operator(name="!!", kind=0, prec=1),
    @MD.Operator(name="!==", kind=2, prec=10), @MD.Operator(name="$", kind=1, prec=16),
    @MD.Operator(name="&&", kind=1, prec=11), @MD.Operator(name="%", kind=0, prec=3),
    @MD.Operator(name="*", kind=0, prec=3), @MD.Operator(name="/~", kind=2, prec=2),
    @MD.Operator(name="+", kind=0, prec=4), @MD.Operator(name="*>", kind=0, prec=13),
    @MD.Operator(name="++", kind=1, prec=4), @MD.Operator(name="/", kind=0, prec=3),
    @MD.Operator(name="..", kind=2, prec=13), @MD.Operator(name="/=", kind=2, prec=10),
    @MD.Operator(name=":", kind=1, prec=13), @MD.Operator(name="<", kind=2, prec=8),
    @MD.Operator(name=":=", kind=1, prec=15), @MD.Operator(name="band", kind=0, prec=6),
    @MD.Operator(name="<=>", kind=2, prec=9), @MD.Operator(name="<*>", kind=0, prec=13),
    @MD.Operator(name="<*", kind=0, prec=13), @MD.Operator(name="<=", kind=2, prec=8),
    @MD.Operator(name="<<", kind=0, prec=5), @MD.Operator(name="<=<", kind=1, prec=14),
    @MD.Operator(name="=<<", kind=1, prec=15), @MD.Operator(name="<~", kind=1, prec=1),
    @MD.Operator(name="==", kind=2, prec=10), @MD.Operator(name="===", kind=2, prec=10),
    @MD.Operator(name=">>", kind=0, prec=14), @MD.Operator(name=">=", kind=2, prec=8),
    @MD.Operator(name=">", kind=2, prec=8), @MD.Operator(name="=~", kind=2, prec=2),
    @MD.Operator(name=">=>", kind=1, prec=14), @MD.Operator(name="?~", kind=2, prec=2),
    @MD.Operator(name=">>=", kind=0, prec=14), @MD.Operator(name="??", kind=1, prec=2),
    @MD.Operator(name="\\\\", kind=2, prec=3), @MD.Operator(name="@", kind=1, prec=15),
    @MD.Operator(name="^^", kind=1, prec=12), @MD.Operator(name="notElem", kind=2, prec=8),
    @MD.Operator(name="div", kind=0, prec=3), @MD.Operator(name="bxor", kind=0, prec=7),
    @MD.Operator(name="bshl", kind=0, prec=5), @MD.Operator(name="bor", kind=0, prec=7),
    @MD.Operator(name="bshr", kind=0, prec=5), @MD.Operator(name="compare", kind=2, prec=9),
    @MD.Operator(name="mod", kind=0, prec=3), @MD.Operator(name="elem", kind=2, prec=8),
    @MD.Operator(name="fmap", kind=0, prec=13), @MD.Operator(name="mplus", kind=1, prec=4),
    @MD.Operator(name="~", kind=2, prec=2), @MD.Operator(name="seq", kind=1, prec=15),
    @MD.Operator(name="quot", kind=0, prec=3), @MD.Operator(name="oder", kind=1, prec=12),
    @MD.Operator(name="rem", kind=0, prec=3), @MD.Operator(name="ushr", kind=0, prec=5),
    @MD.Operator(name="und", kind=1, prec=11), @MD.Operator(name="||", kind=1, prec=12),
    @MD.Operator(name="•", kind=1, prec=1), @MD.Operator(name="~~", kind=2, prec=2),
    @MD.Operator(name="~>", kind=0, prec=1), @MD.Operator(name="~~~", kind=2, prec=2)
  },
  imps={
    "frege.prelude.PreludeList", "frege.Prelude", "com.talios.frege.osgi.billing.Billing",
    "com.talios.frege.osgi.billing.CustomerBilling", "frege.prelude.PreludeBase",
    "frege.prelude.PreludeNative", "frege.prelude.PreludeMonad", "frege.prelude.PreludeText"
  },
  nmss={
    "PreludeList", "Prelude", "Billing", "CustomerBilling", "PreludeBase", "PreludeNative",
    "PreludeMonad", "PreludeText"
  },
  symas={}, symcs={}, symis={}, symts={},
  symvs={
    @MD.SymV(
      offset=157,
      name=@MD.QName(pack="com.talios.frege.osgi.calculator.Calculator", base="main"),
      stri="s(u)", sig=1, depth=1, rkind=49
    )
  },
  symls={},
  taus={
    @MD.Tau(kind=2, tcon={@MD.QName(kind=0, pack="frege.prelude.PreludeBase", base="[]")}),
    @MD.Tau(kind=2, tcon={@MD.QName(kind=0, pack="frege.prelude.PreludeBase", base="StringJ")}),
    @MD.Tau(kind=2, tcon={@MD.QName(kind=0, pack="frege.prelude.PreludeBase", base="Char")}),
    @MD.Tau(kind=0, suba=1, subb=2), @MD.Tau(kind=0, suba=0, subb=3),
    @MD.Tau(kind=2, tcon={@MD.QName(kind=0, pack="frege.prelude.PreludeBase", base="ST")}),
    @MD.Tau(
      kind=2, tcon={@MD.QName(kind=0, pack="frege.prelude.PreludeBase", base="RealWorld")}
    ),
    @MD.Tau(kind=0, suba=5, subb=6),
    @MD.Tau(kind=2, tcon={@MD.QName(kind=0, pack="frege.prelude.PreludeBase", base="()")}),
    @MD.Tau(kind=0, suba=7, subb=8)
  },
  rhos={
    @MD.Rho(rhofun=false, rhotau=4), @MD.Rho(rhofun=false, rhotau=9), @MD.Rho(sigma=0, rhotau=1)
  },
  sigmas={@MD.Sigma(rho=0), @MD.Sigma(rho=2)}, exprs={@MD.Expr()}
)

final public class Calculator {
final public static Consts ĳ = new Consts();
// function `anon$9`  s(ss)  55
// Double -> Bill -> Double
// λa -> λb -> a+amount b
final public static double anon$9(final double arg$1, final double arg$2) {
  // bind strict var a{2865}  to  Bind {RNative, Double, double, arg$1}
  // bind strict var b{2866}  to  Bind {RNative, Billing.Bill, double, arg$2}
  // return RNative  a+amount b
  // Bind {RNative, Double, double, complicated java expression}
  return arg$1 + com.talios.frege.osgi.billing.Billing.TBill.amount(arg$2);
}
// function `main`  s(u)  49
// [String] -> IO ()
// λ_ -> let bills=[ (Bill 30.0) ([ (Bill 30.0) ([ (Bill 30.0) ([ (Bill 30.0) ([ (Bill 30.0) ([ (Bill 30.0) ]))))) in ...
final public static Lambda _main(final Lazy<FV> arg$1) {
  // bind lazy var _1{2859}  to  Bind {RLazy, [StringJ Char], Lazy<PreludeBase.TList>, arg$1}
  // let bills=[ (Bill 30.0) ([ (Bill 30.0) ([ (Bill 30.0) ([ (Bill 30.0) ([ (Bill 30.0) ([ (Bill 30.0) ]))))) in ...
  // value `bills{2860}`  u  48
  // [Bill]
  // [ (Bill 30.0) ([ (Bill 30.0) ([ (Bill 30.0) ([ (Bill 30.0) ([ (Bill 30.0) ([ (Bill 30.0) ])))))
  final Lazy<FV> bills_2860 = 
    PreludeBase.TList.DCons.mk(
          ĳ.dbl2905,
          PreludeBase.TList.DCons.mk(
                ĳ.dbl2905,
                PreludeBase.TList.DCons.mk(
                      ĳ.dbl2905,
                      PreludeBase.TList.DCons.mk(
                            ĳ.dbl2905,
                            PreludeBase.TList.DCons.mk(
                                  ĳ.dbl2905,
                                  PreludeBase.TList.DCons.mk(
                                        ĳ.dbl2905, PreludeBase.TList.DList.mk()
                                      )
                                )
                          )
                    )
              )
        )
  ;
  // let cust=Customer "Mark" "mark@talios.com" bills in ...
  // value `cust{2861}`  u  48
  // Customer
  // Customer "Mark" "mark@talios.com" bills
  final Lazy<FV> cust_2861 = 
    com.talios.frege.osgi.billing.CustomerBilling.TCustomer.mk(ĳ.str2906, ĳ.str2907, bills_2860)
  ;
  // let totalBill=foldl anon$9 0.0 (bills cust) in ...
  // value `totalBill{2862}`  u  48
  // Double
  // foldl anon$9 0.0 (bills cust)
  final Lazy<FV> totalBill_2862 = 
    PreludeList.Consts.foldlƒ.apply(
          Consts.anon$9ƒ, ĳ.dbl2908,
          com.talios.frege.osgi.billing.CustomerBilling.Consts.m$2773561191bills.apply(
                cust_2861
              )
        )
  ;
  // return RBoxed  println ("The invoice for "++name cust++" is "++show (discountFor cust)++" of "++show totalBill++" with a final amount of "++show (calculateDiscountedAmount cust totalBill))
  // Bind {RBoxed, ST RealWorld (), Lambda, complicated java expression}
  return frege.Prelude.println(
            new PreludeText.IShow_String(),
            PreludeBase.Consts.m$1691916420_plus_plus.apply(
                  ĳ.str2909,
                  PreludeBase.Consts.m$1691916420_plus_plus.apply(
                        com.talios.frege.osgi.billing.CustomerBilling.Consts.m$377408966name
                        .apply(cust_2861),
                        PreludeBase.Consts.m$1691916420_plus_plus.apply(
                              ĳ.str2910,
                              PreludeBase.Consts.m$1691916420_plus_plus.apply(
                                    com.talios.frege.osgi.billing.Billing.Consts.m$2143340289show.apply(
                                          com.talios.frege.osgi.billing.CustomerBilling.Consts.m$1280004827discountFor.apply(cust_2861)
                                        ),
                                    PreludeBase.Consts.m$1691916420_plus_plus.apply(
                                          ĳ.str2911,
                                          PreludeBase.Consts.m$1691916420_plus_plus.apply(
                                                PreludeText.Consts.m$2476458633show.apply(totalBill_2862),
                                                PreludeBase.Consts.m$1691916420_plus_plus.apply(
                                                      ĳ.str2912,
                                                      PreludeText.Consts.m$2476458633show.apply(
                                                            com.talios.frege.osgi.billing.CustomerBilling.Consts.m$1969745413calculateDiscountedAmount.apply(cust_2861, totalBill_2862)
                                                          )
                                                    )
                                              )
                                        )
                                  )
                            )
                      )
                )
          );
}
public static class Consts  {
  public Consts() {}
  final public static frege.rt.Lam2 anon$9ƒ = new Calculator.Lambda2a(0);
  final public static frege.rt.Lam1 _mainƒ = new Calculator.Lambda1a(0);
  final public Box<java.lang.String> str2907 = Box.<java.lang.String>mk("mark@talios.com");
  final public Box<java.lang.String> str2906 = Box.<java.lang.String>mk("Mark");
  final public Box<java.lang.String> str2911 = Box.<java.lang.String>mk(" of ");
  final public Box<java.lang.String> str2910 = Box.<java.lang.String>mk(" is ");
  final public Box<java.lang.String> str2912 = 
    Box.<java.lang.String>mk(" with a final amount of ")
  ;
  final public Box<java.lang.String> str2909 = Box.<java.lang.String>mk("The invoice for ");
  final public Box.Double dbl2905 = Box.Double.mk(30.0);
  final public Box.Double dbl2908 = Box.Double.mk(0.0);
}
final private static class Lambda2a extends frege.rt.Lam2  {
  final int index ;
  public Lambda2a(final int arg$1) {
    index = arg$1;
  }
  final public Lazy<FV> eval(final Lazy<FV> arg$2, final Lazy<FV> arg$1) {
    switch (index) {
      case 0: {
        return Box.Double.mk(
                  Calculator.anon$9(((Box.Double)arg$1._e()).j, ((Box.Double)arg$2._e()).j)
                );
      }
    }
    throw new java.lang.Error("bad function number " + index);
  }
}
final private static class Lambda1a extends frege.rt.Lam1  {
  final int index ;
  public Lambda1a(final int arg$1) {
    index = arg$1;
  }
  final public Lazy<FV> eval(final Lazy<FV> arg$1) {
    switch (index) {
      case 0: {
        return Calculator._main(arg$1);
      }
    }
    throw new java.lang.Error("bad function number " + index);
  }
}
public static void main(final java.lang.String[] argv) {
  final long t1 = java.lang.System.nanoTime();
  frege.RT.fjMain(
        PreludeBase.TST.performUnsafe(
              (Lambda)Calculator._main(frege.prelude.Arrays.TStringArray.toList(argv))._e()
            )
      );
  final long t2 = java.lang.System.nanoTime();
  java.lang.System.err.println(
        "runtime " + (((((t2 - t1) + 500000) / 1000000) / 1e3) + " wallclock seconds.")
      );
}
}
