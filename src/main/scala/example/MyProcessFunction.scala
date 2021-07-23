package example

import avro.shaded.com.google.common.collect.BiMap
import org.apache.beam.sdk.transforms.ProcessFunction

trait MyProcessFunction[T, V] extends ProcessFunction[T, V]

trait MyBiMap[K, V] extends BiMap[K, V]
