package org.gradle.test.performance38_3

import org.junit.Assert.*

class Test38_296 {
    private val production = Production38_296("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}