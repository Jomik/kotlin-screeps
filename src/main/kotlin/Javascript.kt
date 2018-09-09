@file:Suppress("unused")

package screeps

fun <T> jsObject(init: dynamic.() -> Unit): T =
  js("{}").unsafeCast<T>().also(init)

external interface JsPair<out F, out S>

operator fun <F, S> JsPair<F, S>.component1(): F = asDynamic()[0].unsafeCast<F>()
operator fun <F, S> JsPair<F, S>.component2(): S = asDynamic()[1].unsafeCast<S>()

external interface Record<in K, out V> {
  operator fun get(key: K): V?
}

external interface MutableRecord<in K, V> : Record<K, V> {
  operator fun set(key: K, value: V)
}

val <K, V>Record<K, V>.values: Array<V> get () = js("Object").values(this).unsafeCast<Array<V>>()
val <K, V>Record<K, V>.keys: Array<K> get () = js("Object").keys(this).unsafeCast<Array<K>>()
val <K, V>Record<K, V>.entries: Array<JsPair<K, V>> get() = js("Object").entries(this).unsafeCast<Array<JsPair<K, V>>>()

fun <K, V> Record<K, V>.iterator() = this.entries.iterator()
fun <K, V> Record<K, V>.asIterable() = this.entries.asIterable()

fun <K, V> recordOf(vararg pairs: Pair<K, V>): Record<K, V> = mutableRecordOf(*pairs)
fun <K, V> mutableRecordOf(vararg pairs: Pair<K, V>): MutableRecord<K, V> =
  js("{}").unsafeCast<MutableRecord<K, V>>().also { result ->
    pairs.forEach { (k, v) ->
      result[k] = v
    }
  }
