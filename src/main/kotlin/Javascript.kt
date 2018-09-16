package screeps

inline fun <T> jsObject(init: dynamic.() -> Unit): T =
  js("{}").unsafeCast<T>().also(init)

external interface JsPair<out F, out S>
external interface Record<in K, out V>
external interface MutableRecord<in K, V> : Record<K, V>

inline operator fun <F, S> JsPair<F, S>.component1(): F = asDynamic()[0].unsafeCast<F>()
inline operator fun <F, S> JsPair<F, S>.component2(): S = asDynamic()[1].unsafeCast<S>()

inline operator fun <K, V> Record<K, V>.get(key: K): V? = this.asDynamic()[key].unsafeCast<V?>()
inline operator fun <K, V> MutableRecord<K, V>.set(key: K, value: V) {
  this.asDynamic()[key] = value
}

inline val <K, V>Record<K, V>.values: Array<V> get () = js("Object").values(this).unsafeCast<Array<V>>()
inline val <K, V>Record<K, V>.keys: Array<K> get () = js("Object").keys(this).unsafeCast<Array<K>>()
inline val <K, V>Record<K, V>.entries: Array<JsPair<K, V>> get() = js("Object").entries(this).unsafeCast<Array<JsPair<K, V>>>()

inline fun <K, V> Record<K, V>.iterator() = this.entries.iterator()
inline fun <K, V> Record<K, V>.asIterable() = this.entries.asIterable()

@Suppress("unused")
fun <K, V> recordOf(vararg pairs: Pair<K, V>): Record<K, V> = mutableRecordOf(*pairs)

fun <K, V> mutableRecordOf(vararg pairs: Pair<K, V>): MutableRecord<K, V> =
  jsObject {
    pairs.forEach { (k, v) ->
      this[k] = v
    }
  }
