// !DIAGNOSTICS: -UNUSED_PARAMETER

class A<T>

operator fun <T> T.invoke(a: A<T>) {}

fun foo(s: String, ai: A<Int>) {
    1(ai)

    <!TYPE_INFERENCE_CONFLICTING_SUBSTITUTIONS!>s<!>(ai)

    <!TYPE_INFERENCE_CONFLICTING_SUBSTITUTIONS!>""<!>(ai)
}
