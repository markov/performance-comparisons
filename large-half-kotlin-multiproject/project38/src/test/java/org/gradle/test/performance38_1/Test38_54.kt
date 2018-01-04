package org.gradle.test.performance38_1

import org.junit.Assert.*

class Test38_54 {
    private val production = Production38_54("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}