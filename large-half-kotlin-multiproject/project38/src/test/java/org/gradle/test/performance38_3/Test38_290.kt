package org.gradle.test.performance38_3

import org.junit.Assert.*

class Test38_290 {
    private val production = Production38_290("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}