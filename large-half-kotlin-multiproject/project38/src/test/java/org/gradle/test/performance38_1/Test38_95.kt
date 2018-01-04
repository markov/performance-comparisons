package org.gradle.test.performance38_1

import org.junit.Assert.*

class Test38_95 {
    private val production = Production38_95("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}