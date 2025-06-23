// FILECHECK_STAGE: CStubs

// CHECK-LABEL: define zeroext i1 @"kfun:A#equals(kotlin.Any?){}kotlin.Boolean"
// CHECK: call zeroext i1 @IsSubtype
// CHECK-NOT: call zeroext i1 @IsSubtype
// CHECK-LABEL: epilogue:
// ^ Kotlin/Native check
data class A(val arg: Any? = null)

fun box() : String {
  val a = A()
  val b = a
  return if(b == a) "OK" else "fail"
}
