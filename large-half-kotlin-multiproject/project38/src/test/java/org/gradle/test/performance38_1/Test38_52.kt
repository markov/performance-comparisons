package org.gradle.test.performance38_1

import org.junit.Assert.*

class Test38_52 {
    private val production = Production38_52("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}