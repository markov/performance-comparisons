package org.gradle.test.performance38_4

import org.junit.Assert.*

class Test38_305 {
    private val production = Production38_305("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}