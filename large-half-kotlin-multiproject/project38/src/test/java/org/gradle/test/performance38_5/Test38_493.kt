package org.gradle.test.performance38_5

import org.junit.Assert.*

class Test38_493 {
    private val production = Production38_493("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}