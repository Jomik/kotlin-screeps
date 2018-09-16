package screeps

fun <T> jsObject(init: dynamic.() -> Unit): T =
  js("{}").unsafeCast<T>().also(init)

external interface JsPair<out F, out S>
external interface Record<in K, out V>
external interface MutableRecord<in K, V> : Record<K, V>

operator fun <F, S> JsPair<F, S>.component1(): F = asDynamic()[0].unsafeCast<F>()
operator fun <F, S> JsPair<F, S>.component2(): S = asDynamic()[1].unsafeCast<S>()

operator fun <K, V> Record<K, V>.get(key: K): V? = this.asDynamic()[key].unsafeCast<V?>()
operator fun <K, V> MutableRecord<K, V>.set(key: K, value: V) {
  this.asDynamic()[key] = value
}

val <K, V>Record<K, V>.values: Array<V> get () = js("Object").values(this).unsafeCast<Array<V>>()
val <K, V>Record<K, V>.keys: Array<K> get () = js("Object").keys(this).unsafeCast<Array<K>>()
val <K, V>Record<K, V>.entries: Array<JsPair<K, V>> get() = js("Object").entries(this).unsafeCast<Array<JsPair<K, V>>>()

fun <K, V> Record<K, V>.iterator() = this.entries.iterator()
fun <K, V> Record<K, V>.asIterable() = this.entries.asIterable()

@Suppress("unused")
fun <K, V> recordOf(vararg pairs: Pair<K, V>): Record<K, V> = mutableRecordOf(*pairs)

fun <K, V> mutableRecordOf(vararg pairs: Pair<K, V>): MutableRecord<K, V> =
  jsObject {
    pairs.forEach { (k, v) ->
      this[k] = v
    }
  }
