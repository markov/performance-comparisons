package org.gradle.test.performance38_3

import org.junit.Assert.*

class Test38_227 {
    private val production = Production38_227("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}