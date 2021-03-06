package com.johnsnowlabs.nlp

import com.johnsnowlabs.nlp.serialization.{ArrayFeature, Feature, MapFeature, StructFeature}

import scala.collection.mutable.ArrayBuffer

trait HasFeatures {

  val features: ArrayBuffer[Feature[_, _, _]] = ArrayBuffer.empty

  protected def set[T](feature: ArrayFeature[T], value: Array[T]): this.type = {feature.setValue(Some(value)); this}

  protected def set[K, V](feature: MapFeature[K, V], value: Map[K, V]): this.type = {feature.setValue(Some(value)); this}

  protected def set[T](feature: StructFeature[T], value: T): this.type = {feature.setValue(Some(value)); this}

  protected def setDefault[T](feature: ArrayFeature[T], value: Array[T]): this.type = {feature.setValue(Some(value)); this}

  protected def setDefault[K, V](feature: MapFeature[K, V], value: Map[K, V]): this.type = {feature.setValue(Some(value)); this}

  protected def setDefault[T](feature: StructFeature[T], value: T): this.type = {feature.setValue(Some(value)); this}

  protected def get[T](feature: ArrayFeature[T]): Option[Array[T]] = feature.get

  protected def get[K, V](feature: MapFeature[K, V]): Option[Map[K, V]] = feature.get

  protected def get[T](feature: StructFeature[T]): Option[T] = feature.get

  protected def $$[T](feature: ArrayFeature[T]): Array[T] = feature.getValue

  protected def $$[K, V](feature: MapFeature[K, V]): Map[K, V] = feature.getValue

  protected def $$[T](feature: StructFeature[T]): T = feature.getValue

}
