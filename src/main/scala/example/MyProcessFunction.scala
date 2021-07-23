package example

import org.apache.beam.sdk.transforms.ProcessFunction

trait MyProcessFunction[T, V] extends ProcessFunction[T, V]
